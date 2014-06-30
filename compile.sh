#!/bin/sh
mkdir -p target/classes
javac -d target/classes src/main/java/com/baldurtech/*.java
javac -d target/classes -classpath target/classes src/test/java/com/baldurtech/*.java