#!/bin/sh
mkdir -p target/classes
mkdir -p target/test_classes
javac -d target/classes src/main/java/com/baldurtech/*.java
javac -classpath "lib/reflections-0.9.9-RC2.jar;target/classes" -d target/test_classes src/test/java/com/baldurtech/*.java src/test/java/com/baldurtech/unit/*.java
