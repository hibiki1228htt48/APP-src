package jp.inc.yumemi.contributorlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class activity_second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //引数を受け取る
        val txtKey = intent.getStringExtra("KEY")
        textView.setText(txtKey)

    }
}
