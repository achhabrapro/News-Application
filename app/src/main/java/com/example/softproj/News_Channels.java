package com.example.softproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class News_Channels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__channels);
    }

    public void Display_news(View view){
        Intent intent=new Intent(this,Display_news.class);
        startActivity(intent);
    }
}
