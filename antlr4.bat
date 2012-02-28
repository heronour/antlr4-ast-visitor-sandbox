set CLASSPATH=C:/antlr4/antlr4/dist/antlr-4.0ea-complete.jar;%CLASSPATH%

java -Xmx500M org.antlr.v4.Tool -parse-listener -visitor %1
