package com.example.thepurchaseplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddItem extends AppCompatActivity {

    private Button mSaveMore, mOnlySave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        mOnlySave = findViewById(R.id.buttonSave);
        mSaveMore = findViewById(R.id.buttonAddMore);

        mOnlySave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Item Successfully Added!", Toast.LENGTH_LONG).show();
            }
        });

        mSaveMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Item Successfully Added!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(AddItem.this,OCR.class));
            }
        });
    }
}
