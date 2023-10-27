# FROM eclipse-temurin:11-jdk-alpine as base
FROM maven:3-eclipse-temurin-11 as base 


#######################
# First build the app
#######################

FROM base as builder
# RUN apk --no-cache gcompat
ENV HOME=/opt/app
WORKDIR ${HOME}

COPY pom.xml pom.xml 
COPY eismassim/pom.xml eismassim/pom.xml
COPY protocol/pom.xml protocol/pom.xml
COPY javaagents/pom.xml  javaagents/pom.xml
COPY monitor/pom.xml monitor/pom.xml
COPY server/pom.xml server/pom.xml
COPY pom.xml ./


# Get dependencies
RUN mvn -pl protocol verify --fail-never 
COPY protocol ${HOME}/protocol

RUN mvn -pl eismassim verify --fail-never 
COPY eismassim ${HOME}/eismassim

RUN mvn -pl monitor verify --fail-never 
COPY monitor ${HOME}/monitor

RUN mvn -pl server verify --fail-never 
COPY server ${HOME}/server

RUN mvn -pl javaagents verify --fail-never 
COPY javaagents ${HOME}/javaagents

RUN mvn verify --fail-never
COPY dep.xml ./
RUN mvn -pl protocol,monitor install 
RUN mvn -pl server package

# Now run it
FROM base as runner
RUN useradd -ms /bin/bash agtcity
USER agtcity
WORKDIR /opt/app
EXPOSE 8001
EXPOSE 12300
COPY server/conf/ /opt/app/conf/
COPY server/osm/ /opt/app/osm/
COPY --from=builder /opt/app/server/target/server-2021-1.0-jar-with-dependencies.jar /opt/app/target/
COPY --from=builder /opt/app/server/startServer.sh /opt/app/
# ENTRYPOINT ["./startServer.sh", "conf/SampleConfig-ManyItems.json" ]

