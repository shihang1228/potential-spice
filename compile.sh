#!/bin/sh
mkdir -p target/classes
mkdir -p target/test_classes
javac -d target/classes src/main/java/com/baldurtech/*.java
javac -d target/test_classes -classpath target/classes src/test/java/com/baldurtech/*.java