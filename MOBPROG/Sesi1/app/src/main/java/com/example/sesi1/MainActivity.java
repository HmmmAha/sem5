package com.example.sesi1;

import android.os.Bundle;
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

    //deklarasi widget
    Button btnMainLoginJava, btnMainRegisterJava;
    EditText etMainUsernameJava;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisiasi widget
        btnMainLoginJava = findViewById(R.id.btnMainLogin);
        btnMainLoginJava.setOnClickListener(this);

        btnMainRegisterJava = findViewById(R.id.btnMainRegister);
        btnMainRegisterJava.setOnClickListener(this);

        etMainUsernameJava.findViewById(R.id.etMainUsername);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnMainLogin) {
            String strUsername = etMainUsernameJava.getText().toString();
//            String strUsername = "Hans";
            Toast.makeText(this, "Tombol login ditekan oleh: " + strUsername, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Tombol register ditekan", Toast.LENGTH_LONG).show();
        }
    }
}