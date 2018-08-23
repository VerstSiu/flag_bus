package sample.ijoic.flagbus

import android.app.Application
import com.ijoic.flagbus.FlagBus

/**
 * Test application.
 *
 * @author verstsiu on 2018/8/23
 * @version 1.0
 */
class TestApplication: Application() {
  override fun onCreate() {
    super.onCreate()

    FlagBus.apply {
      isDebugEnabled = BuildConfig.DEBUG
      isTestEnabled = true
    }
  }
}