package com.sample.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.sample.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        var name = listOf("mg","kyaw","win");
        adapter = Adapter(name);


        //next page
        mainBinding.btn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent);
        }

    }
}