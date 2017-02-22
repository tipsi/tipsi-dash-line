import React, { Component, PropTypes } from 'react'
import { View, requireNativeComponent } from 'react-native'

export default class DashLine extends Component {
  static propTypes = {
    ...View.propTypes,
    dashColor: PropTypes.string,
    dashLineWidth: PropTypes.number,
    dashLineSpace: PropTypes.number,
  }

  render() {
    return (
      <DashLineComponent {...this.props} />
    )
  }
}

const DashLineComponent = requireNativeComponent('DashLineComponent', DashLine)
