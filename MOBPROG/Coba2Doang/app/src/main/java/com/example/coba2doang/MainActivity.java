package com.example.coba2doang;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMain;

    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain = findViewById(R.id.btnPush);
        btnMain.setOnClickListener(this);

        text = findViewById(R.id.mainText).toString();

//        System.out.println(text);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "this is: " + text, Toast.LENGTH_LONG).show();
        System.out.println(text);
    }
}