package jp.techacademy.ayumi.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
val value1 = intent.getIntExtra("VALUE1",0)
val value2 = intent.getIntExtra("VALUE2",0)

textView.text = "${value1 + value2}"
  }
}