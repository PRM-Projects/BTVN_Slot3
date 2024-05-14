package com.example.btvn_slot3;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {

    EditText name, pass;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logIn();
            }
        });
    }
    private void logIn(){
        if(name.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
            Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,DisplayData.class);
            startActivity(intent);
            return;
        }
        Toast.makeText(this, "Failed Authentication", Toast.LENGTH_LONG).show();
    }
}