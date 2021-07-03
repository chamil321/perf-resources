# Package Overview
Mock covid19 backend to dulicate the getStatusByCountry() API

Sample client: 
```
curl localhost:9090/v3/covid-19/countries/LK
```

Sample response:

```
< HTTP/1.1 200 OK
< access-control-allow-origin: *
< alt-svc: h3-27=":443"; ma=86400, h3-28=":443"; ma=86400, h3-29=":443"; ma=86400, h3=":443"; ma=86400
< Cache-Control: public, max-age=14400
< CF-Cache-Status: DYNAMIC
< CF-RAY: 6686ef375f687f23-CMB
< Content-Type: application/json; charset=utf-8
< etag: W/"25f-VB/B7cwRxpkTFPnufB0QcTCzHUE"
< Expect-CT: max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"
< NG-Cache-Status: MISS
< NG-Key: httpsGETdisease.sh/v3/covid-19/countries/LK
< Strict-Transport-Security: max-age=15724800; includeSubDomains
< Vary: Accept-Encoding
< x-envoy-upstream-service-time: 6
< x-powered-by: Express
< transfer-encoding: chunked
< server: ballerina
< date: Sat, 3 Jul 2021 03:18:24 GMT
< 
* Connection #0 to host localhost left intact
{"updated":1625214989362, "country":"Sri Lanka", "countryInfo":{"_id":144, "iso2":"LK", "iso3":"LKA", "lat":7, "long":81, "flag":"https://disease.sh/assets/img/flags/lk.png"}, "cases":260972, "todayCases":0, "deaths":3120, "todayDeaths":0, "recovered":227840, "todayRecovered":0, "active":30012, "critical":0, "casesPerOneMillion":12137, "deathsPerOneMillion":145, "tests":3743577, "testsPerOneMillion":174097, "population":21502881, "continent":"Asia", "oneCasePerPeople":82, "oneDeathPerPeople":6892, "oneTestPerPeople":6, "undefined":1396, "activePerOneMillion":1395.72, "recoveredPerOneMillion":10595.79, "criticalPerOneMillion":0}
```



