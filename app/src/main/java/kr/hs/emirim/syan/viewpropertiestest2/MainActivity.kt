package kr.hs.emirim.syan.viewpropertiestest2

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t1 : TextView
        var t2 : TextView
        var t3 : TextView

        t1 = findViewById<TextView>(R.id.text1)
        t2 = findViewById<TextView>(R.id.text2)
        t3 = findViewById<TextView>(R.id.text3)
        
        t1.setText("아름다운 이 땅에 금수강산에")
        t1.setTextSize(30.0f)
        t1.setTextColor(Color.MAGENTA)

        t2.setText("단군 할아버지가 터 잡으시고")
        t2.setTextSize(30.0f)
        t2.setTextColor(Color.GREEN)
        t2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC)

        t3.setText("홍익인간 뜻으로 나라 세우니 대대손손 훌륭한 인물도 많아 고구려 세운 동명왕 백제 온조왕 알에서 나온 혁거세")
        t3.setSingleLine()

    }
}