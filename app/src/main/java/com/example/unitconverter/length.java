package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class length extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioButton rb1,rb2,rb3,urb1,urb2,urb3;
    TextView textview;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        getSupportActionBar().hide();
        rb1=findViewById(R.id.tonne);
        rb2=findViewById(R.id.kg);
        rb3=findViewById(R.id.gm);
        urb1=findViewById(R.id.tonne1);
        urb2=findViewById(R.id.kg1);
        urb3=findViewById(R.id.gm1);
        radioGroup = findViewById(R.id.RadioGroup1);
        radioGroup2=findViewById(R.id.RadioGroup2);
        textview=findViewById(R.id.result);
        edittext=findViewById(R.id.no_input);
        radioGroup = findViewById(R.id.RadioGroup1);
        textview=findViewById(R.id.result);
        edittext=findViewById(R.id.no_input);
    }
    public int t=2;
    public int t2=3;



    public void weight_convert(View view) {
        String input1 = edittext.getText().toString();
        try {
            float input = Integer.parseInt(input1);
           String unit="";
            if (rb1.isChecked()){t=1;}
            else  if (rb2.isChecked()){t=2;}
            else  if (rb3.isChecked()){t=3;}

            if (urb1.isChecked()){t2=1;}
            else  if (urb2.isChecked()){t2=2;}
            else  if (urb3.isChecked()){t2=3;}


            double res;
            switch (t) {
                case (1): {
                    if (t2 == 1) {
                        textview.setText(input + "" + unit);
                        break;
                    } else if (t2 == 2) {
                        res = (input * 1000);
                        textview.setText(res + "" + unit);
                        break;
                    } else if (t2 == 3) {
                        res = input *100000;
                        textview.setText(res + "" + unit);
                        break;
                    }
                    break;
                }
                case (2): {
                    if (t2 == 1) {
                        res = (input/1000);
                        textview.setText(res + "" + unit);
                        break;
                    } else if (t2 == 2) {
                        textview.setText(input + "" + unit);
                        break;
                    } else if (t2 == 3) {
                        res = (input*100);
                        textview.setText(res + "" + unit);
                        break;
                    }
                    break;
                }
                case (3): {
                    if (t2 == 1) {
                        res = input/100000;
                        textview.setText(res + "" + unit);
                        break;
                    } else if (t2 == 2) {
                        res = (input/100);
                        textview.setText(res + "" + unit);
                        break;
                    } else if (t2 == 3) {
                        textview.setText(input + "" + unit);
                        break;
                    }
                    break;
                }
                default: {
                    Toast.makeText(this, "The unit is not selected", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        } catch (NumberFormatException ex) {
            Toast.makeText(this, "Enter the Valid number", Toast.LENGTH_SHORT).show();
        }

    }
}