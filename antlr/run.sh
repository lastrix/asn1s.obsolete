#!/bin/sh 
javac -cp /usr/share/antlr-3/lib/antlr3.jar -d ./output/classes/ ./output/*.java && java -cp ./output/classes:/usr/share/antlr-3/lib/antlr3.jar __Test__