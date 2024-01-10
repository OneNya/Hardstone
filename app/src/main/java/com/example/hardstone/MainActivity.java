package com.example.hardstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (android.widget.ImageView) findViewById(R.id.imageView7);
        image.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              openActivityPaladin();
          }
        });
    }
    public void openActivityPaladin(){
        Intent intent = new Intent(this, PaladinDeck.class);
        startActivity(intent);
    }
}