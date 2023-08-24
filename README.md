# MASSim 2018+: Agents in the City (RMIT Version)

[![Build Status](https://travis-ci.com/ssardina-agts/agtcity-server.svg?branch=master)](https://travis-ci.com/ssardina-agts/agtcity-server)

_MASSim_ (Multi-Agent Systems Simulation Platform), the simulation (server) software used in the [Multi-Agent Programming Contest](https://multiagentcontest.org/),
where participants program agents to compete with each other in a predefined game.

_MASSim_ simulations run in discrete steps. Agents connect remotely to the contest server, receive percepts and send their actions, which are in turn executed by _MASSim_.

<p align="center">
  <img src="https://multiagentcontest.org/2016/banner.jpg">
</p>

**Note:** This server is the 2018 server modified to include back the following features from the 2017 edition:

* Items in shops. In 2018 server, items could only be gathered in resource nodes whereas in previous servers they could also be purchased in shops. This version brings back items to shops as in 2017 server.

We upload **binary releases** to GitHub: https://github.com/ssardina-agts/agtcity-server/releases

# Building and running the server

The build requires Maven.

Run `mvn clean package` in the main directory. Maven should automatically fetch all necessary dependencies.

**UPDATE August 2023:** server does not work with Java 17 (class version 55), throws exceptions at run-time. However, it compiles and runs with Java 11:

```shell
$ sudo apt-get install openjdk-11-jdk
$ export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 
$ mvn clean package
```

Then to run it:

```shell
$ ./startServer.sh conf/SampleConfig-ManyItems.json 
```

Note the script `startServer` uses `JAVA_HOME` environment variable already that should be pointing to Java 11.

Note that even running with old Java 11 we get the warning:

```shell
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.sun.xml.bind.v2.runtime.reflect.opt.Injector (file:/home/ssardina/Insync/ssardina@gmail.com/GoogleDrive/PROJECTS/agents/mapc/agents-in-city.nosync/2018-rmit/agtcity-server.git/server/target/server-2021-1.0-jar-with-dependencies.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int)
WARNING: Please consider reporting this to the maintainers of com.sun.xml.bind.v2.runtime.reflect.opt.Injector
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
```

This is what JAVA 17 complains and does not allow anymore. :-)

# Documentation

[server.md](docs/server.md) describes how the _MASSim_ server can be configured and started.

[scenario.md](docs/scenario.md) contains the description of the current scenario.

[protocol.md](docs/protocol.md) describes the _MASSim_ protocol, i.e. XML message formats for communicating with the _MASSim_ server.

[eismassim.md](docs/eismassim.md) explains _EISMASSim_, a Java library using the Environment Interface Standard (EIS) to communicate with the _MASSim_ server, that can be used with platforms which support the EIS.

[javaagents.md](docs/javaagents.md) gives a short introduction to the java agents framework, which holds skeletons that can already communicate with the MASSim server and have basic agent capabilities.

[monitor.md](docs/monitor.md) describes how to view live matches and replays in the browser.

# License

_MASSim_ is licensed under the AGPLv3+. See COPYING.txt for the full license text.
