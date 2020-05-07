#!/bin/bash

##### GET OPTIONS FROM COMMAND-LINE
NO_ARGS=$#   # Get the number of arguments passed in the command lin

if [ "$NO_ARGS" -lt 1 ]; then
  echo "provide a server configuration file"
  exit
fi


java -jar target/server-2020-1.0-jar-with-dependencies.jar --monitor 8001 -conf "$1"

