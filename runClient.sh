#!/bin/bash

export UIMA_HOME=/nlp/uima/uima-as-2.8.1/apache-uima-as
export ACTIVEMQ_BASE=/nlp/uima/uima-as-2.8.1/amq-broker

java -Xmx2048m -Xms516m -Dlog4j.configuration=file:config/log4j.properties -cp "lib/*:target/*:target/lib/*" gov.va.vinci.echo.EchoClient -clientConfigFile "config/ClientConfig.groovy" -readerConfigFile "config/readers/BatchDatabaseCollectionReaderConfig.groovy" -listenerConfigFile "config/listeners/DatabaseListenerConfig.groovy"
