package com.chain.appmini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button one;
    private Button two;
    private Button three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.screen_one);
        two = findViewById(R.id.screen_two);
        three = findViewById(R.id.screen_three);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);

    }


    private void screens(){
        Intent intent = new Intent(MainActivity.this,  ScreenOne.class);
        startActivity(intent);
    }
    private void screens2(){
        Intent intent = new Intent(MainActivity.this,  ScreenTwo.class);
        startActivity(intent);
    }
    private void screens3(){
        Intent intent = new Intent(MainActivity.this,  ScreenThree.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.screen_one){
            screens();

        }

        if (id == R.id.screen_two){
            screens2();
        }
        if (id == R.id.screen_three){
            screens3();
        }

    }
}

