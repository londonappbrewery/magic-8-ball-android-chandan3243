package com.londonappbrewery.magiceightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final   Button bt = (Button) findViewById(R.id.button);
       final ImageView main = (ImageView) findViewById(R.id.imageView);
        final TextView textView = (TextView) findViewById(R.id.textView);

       final int[] Ballarray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random RNgenerator = new Random();
                int pi = RNgenerator.nextInt(5);
                main.setImageResource(Ballarray[pi]);
            }
        });

    }
}
