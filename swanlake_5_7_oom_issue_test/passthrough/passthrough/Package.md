# Package Overview
Passthroug service to call covid19 and world bank backend

Sample client: 
```
curl http://localhost:8090/stats/LK
```

Sample response:

```
< HTTP/1.1 200 OK
< content-type: application/json
< content-length: 76
< server: ballerina
< date: Sat, 3 Jul 2021 03:33:47 GMT
< 
* Connection #0 to host localhost left intact
{"country":"LK", "totalCasesPerMillion":12427.23809523809523809523809523810}
```

Run docker as 
```
docker run -p 8090:8090 -e JAVA_OPTS="-Xms50M -Xmx350M" passthrough
```


