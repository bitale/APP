package com.example.testapp1.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.testapp1.R
//엑티비티를 추가하면 Android Manifest에 추가하여야 합니다.
// /menifests 참조

class HelloActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        //여기다가 엑티비티 기능을 작성합니다.
        setContentView(R.layout.activity_hello);

        var button = findViewById<Button>(R.id.btnHello);
        button.setOnClickListener() {
            //여기다가 버튼 클릭할때 할 행동을 적어야합니다.
            //Toast는 Toast 메시지를 띄워줍니다.
            Toast.makeText(this, "토스트 메시지", Toast.LENGTH_SHORT).show();
        }
    }
}