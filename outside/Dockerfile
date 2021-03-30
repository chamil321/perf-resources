FROM ballerina/ballerina:swan-lake-alpha2 AS ballerina-builder
USER root
ADD . /src
WORKDIR /src
RUN bal build --offline passthrough 
RUN ls /src/passthrough/target/bin/ 
RUN pwd

FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine

LABEL maintainer="dev@ballerina.io"

RUN addgroup troupe \
    && adduser -S -s /bin/bash -g 'ballerina' -G troupe -D ballerina \
    && apk add --update --no-cache bash curl \
    && chown -R ballerina:troupe /opt/java/openjdk/bin/java \
    && rm -rf /var/cache/apk/*

WORKDIR /home/ballerina

COPY --from=ballerina-builder /src/passthrough/target/bin/passthrough-0.1.0.jar /home/ballerina
RUN chown ballerina /home/ballerina/passthrough-0.1.0.jar

EXPOSE  9090
USER ballerina

CMD java -XX:+UseContainerSupport \
    -XX:MinRAMPercentage=33.3 \
    -XX:MaxRAMPercentage=33.3 \
    -XX:TieredStopAtLevel=1 \
    -Xlog:gc:GC_LOGS_FILE.txt \
    -Xlog:gc* \
    -XX:StartFlightRecording=duration=300s,filename=flight1.jfr \
    -jar passthrough-0.1.0.jar || \
   cat ballerina-internal.log
