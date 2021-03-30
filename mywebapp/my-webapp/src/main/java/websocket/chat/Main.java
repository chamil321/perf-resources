package websocket.chat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String [] args) {
        String content = "<?xml version='1.0' encoding='UTF-8'?><soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\">"
                + "<soapenv:Body>"
                + "<ns:getAllowedUIResourcesForUserResponse xmlns:ns=\"http://service.ws.um.carbon.wso2.org\" xmlns:ax2652=\"http://core.user.carbon.wso2.org/xsd\" xmlns:ax2653=\"http://api.user.carbon.wso2.org/xsd\">"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "<ns:return>/permission/admin/login</ns:return><ns:return>/permission/applications/FCH/FCH-Common</ns:return><ns:return>/permission/applications/Fraud/Fraud Client Login</ns:return><ns:return>/permission/applications/Fraud/all_data</ns:return><ns:return>/permission/applications/Fraud/gfa_data</ns:return><ns:return>/permission/applications/alm/AllData</ns:return><ns:return>/permission/applications/dch/AllData</ns:return><ns:return>/permission/applications/dch/alldata</ns:return><ns:return>/permission/applications/fraud/all_data</ns:return><ns:return>/permission/applications/jim/AllData3</ns:return><ns:return>/permission/applications/jim/AllData4</ns:return><ns:return>/permission/applications/jim/alldata3</ns:return><ns:return>/permission/applications/nrt/AllData</ns:return><ns:return>/permission/applications/nrt/alldata</ns:return><ns:return>/permission/applications/portal8/admin</ns:return>"
                + "</ns:getAllowedUIResourcesForUserResponse>"
                + "</soapenv:Body></soapenv:Envelope>";


        try {
            File f = new File("/home/shaf/Documents/payload.txt");
            FileWriter write = new FileWriter(f);
            write.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
