#!/bin/bash

set -E

CWD=`pwd`

sbt demoNative/run
cp $CWD/demo-native/target/scala-2.11/demonative-out $CWD/demo-native/demonative-out.app/
xcrun simctl install booted $CWD/demo-native/demonative-out.app
