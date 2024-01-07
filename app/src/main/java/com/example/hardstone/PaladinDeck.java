package com.example.hardstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PaladinDeck extends AppCompatActivity {

    private final Button copy = findViewById(R.id.copy);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paladin_deck);

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Text = "code";
                ClipboardManager clipboardManager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Data", Text);
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(PaladinDeck.this, "Text Copied", Toast.LENGTH_SHORT).show();
            }
        });

    }
}