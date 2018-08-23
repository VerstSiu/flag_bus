package sample.ijoic.flagbus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ijoic.flagbus.FlagBus
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val flagInfo = "Debug: ${FlagBus.isDebugEnabled}\nTest: ${FlagBus.isTestEnabled}"
    test_message.text = flagInfo
  }
}
