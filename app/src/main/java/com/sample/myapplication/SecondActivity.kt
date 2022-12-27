package com.sample.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.sample.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var secondBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        setContentView(R.layout.activity_second)
        var secondBinding = ActivitySecondBinding.inflate(layoutInflater);
        setContentView(secondBinding.root)

        // to get data form previous page
        val bundle = intent.extras;

//        ?= if data is null it cause error to protect this saturation use null safely (?)
//         !! = if data is null it casue error whatever erro cause run program noon-asserted (!!)
        val name = bundle?.get("username");

        secondBinding.sname.text = name.toString();

    }
}