package com.example.home_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = 0
        button21.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("0.")
            } else {
                var nn = textView.text.toString().plus(".")
                textView.setText(nn)
            }
        }
        button6.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("8")
            } else {
                var n8 = textView.text.toString().plus(8)
                textView.setText(n8)
            }
        }

        button5.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("7")
            } else {
                var n7 = textView.text.toString().plus(7)
                textView.setText(n7)
            }
        }
        button8.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("9")
            } else {
                var n9 = textView.text.toString().plus(9)
                textView.setText(n9)
            }
        }
        button9.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("4")
            } else {
                var n4 = textView.text.toString().plus(4)
                textView.setText(n4)
            }

        }
        button10.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("5")
            } else {
                var n5 = textView.text.toString().plus(5)
                textView.setText(n5)
            }

        }
        button11.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("6")
            } else {
                var n6 = textView.text.toString().plus(6)
                textView.setText(n6)
            }
        }
        button13.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("1")
            } else {
                var n1 = textView.text.toString().plus(1)
                textView.setText(n1)
            }
        }
        button14.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("2")
            } else {
                var n2 = textView.text.toString().plus(2)
                textView.setText(n2)
            }
        }
        button15.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("3")
            } else {
                var n3 = textView.text.toString().plus(3)
                textView.setText(n3)
            }
        }
        button20.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("0")
            } else {
                var n0 = textView.text.toString().plus(0)
                textView.setText(n0)
            }
        }
        button.setOnClickListener {
            if (textView.text.toString() >= "0") {
                textView.setText("0")
            }
        }
        button2.setOnClickListener {
            if (textView.text.toString().length <=1) {
                textView.setText("0")
            } else {
                textView.text = textView.text.dropLast(1)
            }
        }
    }
}






