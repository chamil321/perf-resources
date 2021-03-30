import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import com.hazelcast.config.Config;
import com.hazelcast.config.InterfacesConfig;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

/**
 * Created with IntelliJ IDEA.
 * User: shafreen
 * Date: 10/4/13
 * Time: 10:37 AM
 */
public class HelloWorld5 extends HttpServlet {

    HazelcastInstance hz;
    IMap<String, String> map;

    public void init() throws ServletException {
        Config config = new Config();
        config.getNetworkConfig().setPort(4445);
        config.getNetworkConfig().getInterfaces().setEnabled(true);
        config.getNetworkConfig().setInterfaces(new InterfacesConfig().addInterface("172.17.0.1"));
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
        config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(true);
        config.getNetworkConfig().getJoin().getTcpIpConfig().addMember("172.17.0.1:4444");
        hz = Hazelcast.newHazelcastInstance(config);
        map = hz.getMap("map");
        map.addEntryListener(new Listner(), false);
        System.out.println(HelloWorld5.class);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (map != null) {
            System.out.println("checking for contains");
            map.containsKey("3");
//            map.evict("3");
            System.out.println(map.get("40"));
            System.out.println("after checking for contains");
            Set<Map.Entry<String, String>> values = map.entrySet();
            for (Map.Entry<String, String> entry : values) {
                System.out.println("Key " + entry.getKey() + " Values " + entry.getValue());

                System.out.println("Removing map value");
                map.remove(entry.getKey());
            }
        }

        PrintWriter out = response.getWriter();
        out.println("{\"Customer\":{\"name\":\"Jack\"}}");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer content = new StringBuffer();
        int d;
        while ((d = request.getInputStream().read()) != -1) {
            content.append((char) d);
        }
        System.out.println("----> " + request.getContentType() + " - " + content);

        // Set status code
        response.setStatus(304);
        System.out.println("Sending the response with status code -> 304");
    }

    public void destroy() {
        // do nothing.
    }

    private static class Listner implements EntryListener<String, String> {
        public void entryAdded(EntryEvent<String, String> entryEvent) {
//            System.out.println("entry added " + entryEvent.getValue());
        }

        public void entryRemoved(EntryEvent<String, String> entryEvent) {
//            System.out.println("Entry removed");
        }

        public void entryUpdated(EntryEvent<String, String> entryEvent) {
//            System.out.println("Entry updated");
        }

        public void entryEvicted(EntryEvent<String, String> entryEvent) {
//            System.out.println("Entry Evicted");
        }
    }
}
