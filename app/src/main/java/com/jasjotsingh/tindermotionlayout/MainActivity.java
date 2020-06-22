package com.jasjotsingh.tindermotionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.jasjotsingh.tindermotionlayout.scenes.TinderScene10Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene1Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene2Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene3Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene4Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene5Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene6Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene7Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene8Activity;
import com.jasjotsingh.tindermotionlayout.scenes.TinderScene9Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
    }
    public void init(){
        button1 = findViewById(R.id.scene_1);
        button2 = findViewById(R.id.scene_2);
        button3 = findViewById(R.id.scene_3);
        button4 = findViewById(R.id.scene_4);
        button5 = findViewById(R.id.scene_5);
        button6 = findViewById(R.id.scene_6);
        button7 = findViewById(R.id.scene_7);
        button8 = findViewById(R.id.scene_8);
        button9 = findViewById(R.id.scene_9);
        button10 = findViewById(R.id.scene_10);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.scene_1:
                Intent intent1 = new Intent(MainActivity.this, TinderScene1Activity.class);
                startActivity(intent1);
                break;
            case R.id.scene_2:
                Intent intent2 = new Intent(MainActivity.this, TinderScene2Activity.class);
                Log.d(TAG, "onClick: ");
                startActivity(intent2);
                break;
            case R.id.scene_3:
                Intent intent3 = new Intent(MainActivity.this, TinderScene3Activity.class);
                startActivity(intent3);
                break;
            case R.id.scene_4:
                Intent intent4 = new Intent(MainActivity.this, TinderScene4Activity.class);
                startActivity(intent4);
                break;
            case R.id.scene_5:
                Intent intent5 = new Intent(MainActivity.this, TinderScene5Activity.class);
                startActivity(intent5);
                break;
            case R.id.scene_6:
                Intent intent6 = new Intent(MainActivity.this, TinderScene6Activity.class);
                startActivity(intent6);
                break;
            case R.id.scene_7:
                Intent intent7 = new Intent(MainActivity.this, TinderScene7Activity.class);
                startActivity(intent7);
                break;
            case R.id.scene_8:
                Intent intent8 = new Intent(MainActivity.this, TinderScene8Activity.class);
                startActivity(intent8);
                break;
            case R.id.scene_9:
                Intent intent9 = new Intent(MainActivity.this, TinderScene9Activity.class);
                startActivity(intent9);
                break;
            case R.id.scene_10:
                Intent intent10 = new Intent(MainActivity.this, TinderScene10Activity.class);
                startActivity(intent10);
                break;


        }
    }
}