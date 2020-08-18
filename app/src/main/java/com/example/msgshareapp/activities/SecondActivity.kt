package com.example.msgshareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.msgshareapp.R
import com.example.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


//        Null Safety Operators
//          a.) Safe Call   ?.
//            b.) Safe Call with let    ?.let {   }

        val bundle: Bundle? = intent.extras

        bundle?.let {

            val msg = bundle.getString("user_message")

//        this part below uses the extension function
//        henxe should reduce boilerplate code. It however requires using of null exception to work.
//        i.e it brings an error.

//        showToast(msg)


//            showToast(msg)

        if (msg != null) {
            showToast(msg)
        }

//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            txvUserMessage.text = msg

        }

    }
}
