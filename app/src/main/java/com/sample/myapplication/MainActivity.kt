package com.sample.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.sample.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    this is for recycle list
//    lateinit var mainBinding: ActivityMainBinding
//    lateinit var nameAdapter: NameAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


//        this is for recycle list
//        mainBinding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(mainBinding.root)
//        var name = listOf("mg","kyaw","win");
//        nameAdapter = NameAdapter(name);
//        mainBinding.recyclerList.adapter = nameAdapter;


        //next page
//        mainBinding.btn.setOnClickListener {
//            val intent = Intent(this,SecondActivity::class.java)
////            to pass data to second page
//            intent.putExtra("username","Alice")
////            to show second page
//            startActivity(intent);
//        }

    }
}