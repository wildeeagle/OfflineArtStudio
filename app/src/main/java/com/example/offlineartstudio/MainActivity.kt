package com.example.offlineartstudio

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.EditText
import android.widget.ScrollView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scroll = ScrollView(this)
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER_HORIZONTAL
        layout.setPadding(24, 32, 24, 32)
        layout.setBackgroundColor(Color.rgb(20, 24, 35))

        val title = TextView(this)
        title.text = "Offline Art Studio"
        title.textSize = 28f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "استوديو الرسم بالذكاء الاصطناعي"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        layout.addView(subtitle)

        val prompt = EditText(this)
        prompt.hint = "اكتب وصف الصورة التي تريد إنشاءها..."
        prompt.setTextColor(Color.WHITE)
        prompt.setHintTextColor(Color.LTGRAY)
        prompt.minLines = 3
        prompt.gravity = Gravity.TOP
        layout.addView(prompt, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 150
        ))

        val imageButton = Button(this)
        imageButton.text = "إنشاء صورة"
        layout.addView(imageButton)

        val videoButton = Button(this)
        videoButton.text = "تحويل صورة إلى فيديو"
        layout.addView(videoButton)

        val status = TextView(this)
        status.text = "محرك الذكاء الاصطناعي المحلي لم يُضف بعد."
        status.textSize = 15f
        status.setTextColor(Color.YELLOW)
        layout.addView(status)

        imageButton.setOnClickListener {
            status.text = "الواجهة جاهزة، ونحتاج إلى إضافة محرك توليد الصور المحلي."
        }

        videoButton.setOnClickListener {
            status.text = "ميزة الفيديو تحتاج إلى محرك منفصل، وسنختبر إمكانات الهاتف."
        }

        scroll.addView(layout)
        setContentView(scroll)
    }
}
