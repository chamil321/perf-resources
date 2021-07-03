FROM ballerina/ballerina:swan-lake-alpha5.8 AS ballerina-builder
USER root
ADD . /src
WORKDIR /src
RUN bal build --offline wbMockBackend 
RUN ls /src/wbMockBackend/target/bin/
RUN pwd

FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine

LABEL maintainer="dev@ballerina.io"

RUN addgroup troupe \
    && adduser -S -s /bin/bash -g 'ballerina' -G troupe -D ballerina \
    && apk add --update --no-cache bash curl \
    && chown -R ballerina:troupe /opt/java/openjdk/bin/java \
    && rm -rf /var/cache/apk/*

WORKDIR /home/ballerina

COPY --from=ballerina-builder /src/wbMockBackend/target/bin/wbMockBackend.jar /home/ballerina
RUN chown ballerina /home/ballerina/wbMockBackend.jar

EXPOSE  9095
USER ballerina

CMD java -XX:+UseContainerSupport \
    -XX:MinRAMPercentage=33.3 \
    -XX:MaxRAMPercentage=33.3 \
    -XX:TieredStopAtLevel=1 \
    -Xlog:gc:GC_LOGS_FILE.txt \
    -Xlog:gc* \
    # -XX:StartFlightRecording=duration=300s,filename=flight1-inside.jfr \
    -jar wbMockBackend.jar
