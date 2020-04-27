package com.mapbox.mapboxsdk.integration

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.mapbox.mapboxsdk.testapp.activity.maplayout.GLSurfaceRecyclerViewActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Regression test that validates if a GLSurfaceView surface can be recreated without crashing.
 */
@RunWith(AndroidJUnit4::class)
class GLSurfaceViewReuseTest : BaseIntegrationTest() {

  @get:Rule
  var activityRule: ActivityTestRule<GLSurfaceRecyclerViewActivity> = ActivityTestRule(GLSurfaceRecyclerViewActivity::class.java)

  @Test
  @LargeTest
  fun scrollRecyclerView() {
    device.waitForIdle()
    device.scrollRecyclerViewTo("Twenty-one")
    device.waitForIdle()
    device.scrollRecyclerViewTo("One")
    device.waitForIdle()
  }
}