# tipsi-dash-line
[![Build Status](https://travis-ci.org/tipsi/tipsi-dash-line.svg?branch=master)](https://travis-ci.org/tipsi/tipsi-dash-line)

React Native Component for drawing dashed line.

## Compatibility

This package is now built for React Native `0.40` or greater!

## Installation

Run `npm install --save tipsi-dash-line` to add the package to your app's dependencies.
Please do not forget to run `react-native link tipsi-dash-line`

## Usage

```js
import React, { Component } from 'react'
import {
  StyleSheet,  
  View,
} from 'react-native'
import { DashLine } from 'tipsi-dash-line'

export default class example extends Component {
  render() {
    return (
      <View style={styles.container}>        
        <DashLine dashColor="#ff0000" dashLineWidth={10} dashLineSpace={4}/>        
      </View>
    )
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'flex-start',
    alignItems: 'stretch',
  },
})

```

## Examples

<img src="https://raw.githubusercontent.com/tipsi/tipsi-dash-line/testing/android.png" width="375" />
<img src="https://raw.githubusercontent.com/tipsi/tipsi-dash-line/testing/ios.png" width="375" />
