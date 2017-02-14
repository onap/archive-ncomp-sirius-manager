#!/bin/bash

export JAVA_HOME=/opt/app/java/jdk/jdk170
export GROOVY_HOME=/opt/app/groovy/246

PATH=$JAVA_HOME/bin:$GROOVY_HOME/bin:$PATH

cd $(dirname $(dirname $(readlink -e $0)))

ROOT=$(pwd)
CMD=$ROOT/bin/sirius-manager-agent-server-controller


mkdir -p logs/
echo $(date) bin/agent.sh "$@" >> logs/agent.sh.log

CMD1=$1
VMTYPE=monitoring-agent

case $CMD1 in
  start) 
    JVMARGS=$(cat config/monitoring.properties | grep JVMARGS | sed 's/[^=]*=//')
    $CMD $CMD1 $JVMARGS
    ;;
  stop|console) 
    $CMD $CMD1  
    ;;
  config) 
    CONFIGDIR=/var/config/DCAE/chef
    if [ ! -e $CONFIGDIR/$VMTYPE-monitoring.properties ]; then CONFIGDIR=/tmp; fi
    mkdir -p config
    for FILE in $CONFIGDIR/$VMTYPE-*; do
      FILE2=$(echo $FILE | sed s/.*$VMTYPE-//)
      cp $FILE config/$FILE2
    done
    /opt/app/dcae-controller-core-utils/bin/setup_https.sh config/monitoring.properties
    ;;
  restore|clean) 
    ;;
  restart) 
    $0 stop
    $0 start 
    ;;
  restart2) 
    $CMD stop
    JVMARGS=$(cat config/monitoring.properties | grep JVMARGS | sed 's/[^=]*=//')
    $CMD start $JVMARGS
    ;;
   *) 
    echo unknown command: $CMD1 
    ;;  
esac

exit 0

