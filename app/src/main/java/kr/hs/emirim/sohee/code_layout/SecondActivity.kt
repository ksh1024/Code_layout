package kr.hs.emirim.sohee.code_layout

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        btn4=findViewById(R.id.btn4)

        btn1.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-3333-7777"))
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(intent)
        }
        btn4.setOnClickListener{
        finish()
        }
    }
}