#!/bin/bash

export UIMA_HOME=/nlp/uima/uima-as-2.8.1/apache-uima-as
export ACTIVEMQ_BASE=/nlp/uima/uima-as-2.8.1/amq-broker

java -Xmx2048m -Xms512m -cp "config/*:lib/*:target/*:target/lib/*" gov.va.vinci.echo.Service
