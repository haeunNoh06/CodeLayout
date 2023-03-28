package kr.hs.emirim.soeun.codelayout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)

        btn1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))
            startActivity(intent) /* 위의 주소가 열리는 화면을 만듦 */

        }
        btn2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-3333-7777"))
            startActivity(intent) /* 전화번호 */
            
        }
        btn3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(intent) /* photo앱이 열림 */
            
        }
        btn4.setOnClickListener {
            finish() /* 끝내기 */
            
        }
    }
}