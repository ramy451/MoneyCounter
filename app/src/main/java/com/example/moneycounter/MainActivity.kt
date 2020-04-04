package com.example.moneycounter

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.internal.Intrinsics


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calc.setOnClickListener()
        {
            var x200 = 0
            var x100 = 0
            var x50 = 0
            var x20 = 0
            var x10 = 0
            var x1 = 0
            var x050 = 0
            var x025 = 0

            if (b200.text.toString() =="") {
                x200 = 0
            } else {
                x200 = b200.text.toString().toInt()
            }
            if (b100.text.toString() == "") {
                x100 = 0
            } else {
                x100 = b100.text.toString().toInt()
            }
            if (b50.text.toString() =="") {
                x50 = 0
            } else {
                x50 = b50.text.toString().toInt()
            }
            if (b20.text.toString() =="") {
                x20 = 0
            } else
                x20 = b20.text.toString().toInt()
            if (b10.text.toString() =="") {
                x10 = 0
            } else
                x10 = b10.text.toString().toInt()
            if (b1.text.toString() =="") {
                x1 = 0
            } else
                x1 = b1.text.toString().toInt()
            if (b0_50.text.toString() =="") {
                x050 = 0
            } else
                x050 = b0_50.text.toString().toInt()
            if (b0_25.text.toString() =="") {
                x025 = 0
            } else
                x025 = b0_25.text.toString().toInt()

            var wb =
                x200 * 20000 + x100 * 10000 + x50 * 5000 + x20 * 2000 + x10 * 1000 + x1 * 100 + x050 * 50 + x025 * 25

            var y200 = 0
            var y100 = 0
            var y50 = 0
            var y20 = 0
            var y10 = 0
            var y1 = 0
            var y050 = 0
            var y025 = 0

            if (w200.text.toString() =="") {
                y200 = 0
            } else
                y200 = w200.text.toString().toInt()
            if (w100.text.toString() =="") {
                y100 = 0
            } else
                y100 = w100.text.toString().toInt()
            if (w50.text.toString() =="") {
                y50 = 0
            } else
                y50 = w50.text.toString().toInt()
            if (w20.text.toString() =="") {
                y20 = 0
            } else
                y20 = w20.text.toString().toInt()
            if (w10.text.toString()=="") {
                y10 = 0
            } else
                y10 = w10.text.toString().toInt()
            if (w1.text.toString() =="") {
                y1 = 0
            } else
                y1 = w1.text.toString().toInt()
            if (w0_50.text.toString() =="") {
                y050 = 0
            } else
                y050 = w0_50.text.toString().toInt()
            if (w0_25.text.toString() =="") {
                y025 = 0
            } else
                y025 = w0_25.text.toString().toInt()

            var bb = y200 * 200 + y100 * 100 + y50 * 50 + y20 * 20 + y10 * 10 + y1 * 1 + y050 * 0.5 + y025 * 0.25
            var totalmoney = bb + wb

            val textView = findViewById<TextView>(R.id.total)
            total.text = totalmoney.toString()
        }
        val  edittext = listOf(b200,b100,b50,b20,b10,b1,b0_25,b0_50,w0_25,w0_50,w10,w1,w100,w20,w200,w50)
        for (ed in edittext)
            ed.addTextChangedListener(object: TextWatcher{

            override fun afterTextChanged(p0: Editable?) {

                var x200 = 0
                var x100 = 0
                var x50 = 0
                var x20 = 0
                var x10 = 0
                var x1 = 0
                var x050 = 0
                var x025 = 0

                if (b200.text.toString() =="") {
                    x200 = 0
                } else {
                    x200 = b200.text.toString().toInt()
                }
                if (b100.text.toString() == "") {
                    x100 = 0
                } else {
                    x100 = b100.text.toString().toInt()
                }
                if (b50.text.toString() =="") {
                    x50 = 0
                } else {
                    x50 = b50.text.toString().toInt()
                }
                if (b20.text.toString() =="") {
                    x20 = 0
                } else
                    x20 = b20.text.toString().toInt()
                if (b10.text.toString() =="") {
                    x10 = 0
                } else
                    x10 = b10.text.toString().toInt()
                if (b1.text.toString() =="") {
                    x1 = 0
                } else
                    x1 = b1.text.toString().toInt()
                if (b0_50.text.toString() =="") {
                    x050 = 0
                } else
                    x050 = b0_50.text.toString().toInt()
                if (b0_25.text.toString() =="") {
                    x025 = 0
                } else
                    x025 = b0_25.text.toString().toInt()

                var wb =
                    x200 * 20000 + x100 * 10000 + x50 * 5000 + x20 * 2000 + x10 * 1000 + x1 * 100 + x050 * 50 + x025 * 25

                var y200 = 0
                var y100 = 0
                var y50 = 0
                var y20 = 0
                var y10 = 0
                var y1 = 0
                var y050 = 0
                var y025 = 0

                if (w200.text.toString() =="") {
                    y200 = 0
                } else
                    y200 = w200.text.toString().toInt()
                if (w100.text.toString() =="") {
                    y100 = 0
                } else
                    y100 = w100.text.toString().toInt()
                if (w50.text.toString() =="") {
                    y50 = 0
                } else
                    y50 = w50.text.toString().toInt()
                if (w20.text.toString() =="") {
                    y20 = 0
                } else
                    y20 = w20.text.toString().toInt()
                if (w10.text.toString()=="") {
                    y10 = 0
                } else
                    y10 = w10.text.toString().toInt()
                if (w1.text.toString() =="") {
                    y1 = 0
                } else
                    y1 = w1.text.toString().toInt()
                if (w0_50.text.toString() =="") {
                    y050 = 0
                } else
                    y050 = w0_50.text.toString().toInt()
                if (w0_25.text.toString() =="") {
                    y025 = 0
                } else
                    y025 = w0_25.text.toString().toInt()

                var bb = y200 * 200 + y100 * 100 + y50 * 50 + y20 * 20 + y10 * 10 + y1 * 1 + y050 * 0.5 + y025 * 0.25
                var totalmoney = bb + wb

                val textView = findViewById<TextView>(R.id.total)
                total.text = totalmoney.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
              //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
              //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

    }
}
