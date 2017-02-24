import React, { Component } from 'react'
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
} from 'react-native'
import DashLine from 'tipsi-dash-line'

export default class Root extends Component {
  render() {
    return (
      <View style={styles.container}>
        <View style={styles.block}>
          <Text style={styles.text}>Red line with width 10 and space 4</Text>
          <DashLine testID={'dashLineRed'} accessibilityLabel={'dashLineRed'} dashColor="#ff0000" dashLineWidth={10} dashLineSpace={4} style={styles.dash}/>
        </View>
        <View style={styles.block}>
          <Text style={styles.text}>Blue line with width 4 and space 10</Text>
          <DashLine testID={'dashLineBlue'} accessibilityLabel={'dashLineBlue'} dashColor="#0000ff" dashLineWidth={4} dashLineSpace={10} style={styles.dash}/>
        </View>
        <View style={styles.block}>
          <Text style={styles.text}>Black line with width 10 and space 10</Text>
          <DashLine testID={'dashLineBlack'} accessibilityLabel={'dashLineBlack'} dashColor="#000000" dashLineWidth={10} dashLineSpace={10} style={styles.dash}/>
        </View>

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
  text: {
    marginBottom: 5,
  },
  block: {
    marginLeft: 15,
    marginRight: 15,
    marginTop: 30,
  },
  dash: {
    alignSelf: 'stretch',
    width: null,
    backgroundColor: 'rgba(0,0,0,0)',
    height: 1,
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
})
