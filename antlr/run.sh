#!/bin/sh 
javac -cp ../jars/antlr3.jar -d ./output/classes/ ./output/*.java && java -cp ./output/classes:../jars/antlr3.jar __Test__
