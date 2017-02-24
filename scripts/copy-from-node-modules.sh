#!/bin/bash
MODULE_NAME="tipsi-dash-line"

cp -rf example/node_modules/$MODULE_NAME/{ios,src} ./
cp -rf example/node_modules/$MODULE_NAME/android/{src,build.gradle} ./android
