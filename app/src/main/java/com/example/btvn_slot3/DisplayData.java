package com.example.btvn_slot3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayData extends AppCompatActivity {

    ListView list;
    Button load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        list = findViewById(R.id.list);
        load = findViewById(R.id.Load);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DisplayData.this, CalculateFunction.class);
                startActivity(intent);
            }
        });
        getDataToListview();
    }
    private void getDataToListview(){
        //1. create data source
        String[] arr=new String[]{
                "lap trinh java 1",
                "Computer science introduction",
                "Mobile programing",
                "Cross-platform with .NET",
                "Javascript introduction"
        };
        //2.Using adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<>(DisplayData.this,
                android.R.layout.simple_list_item_1,arr);
        //3. attach adapter to Listview
        list.setAdapter(adapter);
    }
}