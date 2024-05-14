package com.example.btvn_slot3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculateFunction extends AppCompatActivity {

    EditText a,b,c;
    Button cal;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_function);
        a=findViewById(R.id.editA);
        b=findViewById(R.id.editB);
        c=findViewById(R.id.editC);
        cal=findViewById(R.id.cal);
        result=findViewById(R.id.result);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate(Double.parseDouble(a.getText().toString()), Double.parseDouble(b.getText().toString()), Double.parseDouble(c.getText().toString()));
            }
        });
    }

    private void calculate(double a, double b, double c) {
        //delta=?
        double delta= (double) (b*b-4*a*c);
        if(delta<0){
            result.setText("PTVN");
        }
        else if(delta==0){
            result.setText("PT co nghiem kep x="+ (-b)/(2*a));
        }
        else {
            float x1= (float) ((-b+Math.sqrt(delta))/(2*a));
            float x2= (float) ((-b-Math.sqrt(delta))/(2*a));
            result.setText("PT co 2 nghiem x1="+x1+" va x2="+x2);
        }
    }
}