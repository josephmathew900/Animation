package com.example.joseph.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.animate().scaleX(.0001f).scaleY(.0001f).setDuration(8000);
        //ImageView imageView1 = (ImageView)findViewById(R.id.imageView4);
        //imageView1.animate().alpha(1f).setDuration(5000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ImageView imageView = (ImageView)findViewById(R.id.imageView);
        //imageView.setTranslationX(-1000f);

    }
}
