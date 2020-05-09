#!/bin/bash
#
# Starts the server with some configuration file
#
#

##### GET OPTIONS FROM COMMAND-LINE
NO_ARGS=$#   # Get the number of arguments passed in the command line

MY_NAME=${0##*/} 

#echo
#echo "# arguments called with ---->  ${@}     "
#echo "# \$1 ---------------------->  $1       "
#echo "# \$2 ---------------------->  $2       "
#echo "# path to me --------------->  ${0}     "
#echo "# parent path -------------->  ${0%/*}  "
#echo "# my name ------------------>  ${0##*s/} "
#echo
#exit

if [ "$NO_ARGS" -ge 1 ]; then
  java -jar target/server-2.0-jar-with-dependencies.jar --monitor 8001 -conf "$1"
else
  java -jar target/server-2.0-jar-with-dependencies.jar --monitor 8001
fi