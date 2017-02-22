import test from 'tape-async'
import helper from 'tipsi-appium-helper'

const { driver, idFromAccessId } = helper

test('User should see dash lines', async (t) => {
  const redDashLine = idFromAccessId('dashLineRed')
  const blueDashLine = idFromAccessId('dashLineBlue')
  const blackDashLine = idFromAccessId('dashLineBlack')

  try {
    await driver.waitForVisible(redDashLine, 60000)
    t.pass('User should see red dash line')

    await driver.waitForVisible(blueDashLine, 60000)
    t.pass('User should see blue dash line')

    await driver.waitForVisible(blackDashLine, 60000)
    t.pass('User should see black dash line')

  } catch (error) {
    await helper.screenshot()
    await helper.source()

    throw error
  }
})
