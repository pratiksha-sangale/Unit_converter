package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class weight extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioButton rb1,rb2,rb3,rb4,urb1,urb2,urb3,urb4;
    TextView textview;
    EditText edittext;
    int radioid=01,w2=1;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        getSupportActionBar().hide();
        rb1=findViewById(R.id.tonne);
        rb2=findViewById(R.id.kg);
        rb3=findViewById(R.id.gm);
        rb4=findViewById(R.id.mg);
        urb1=findViewById(R.id.tonne1);
        urb2=findViewById(R.id.kg1);
        urb3=findViewById(R.id.gm1);
        urb4=findViewById(R.id.mg1);
        radioGroup = findViewById(R.id.RadioGroup1);
        radioGroup2=findViewById(R.id.RadioGroup2);
        textview=findViewById(R.id.result);
        edittext=findViewById(R.id.no_input);
    }


    public void weight_convert(View view) {
        String input1=edittext.getText().toString();
        try {
            float input = Integer.parseInt(input1);
            if (rb1.isChecked()){radioid=01;}
            else  if (rb2.isChecked()){radioid=02;}
            else  if (rb3.isChecked()){radioid=03;}
            else  if (rb4.isChecked()){radioid=04;}

            if (urb1.isChecked()){radioid=1;}
            else  if (urb2.isChecked()){radioid=2;}
            else  if (urb3.isChecked()){radioid=3;}
            else  if (urb4.isChecked()){radioid=4;}



            double res;
            switch (radioid) {
                case (01): {
                    if (w2 == 1) {
                        textview.setText(input+"");
                        break;
                    }
                    else if (w2 == 2) {
                        res= (input*907.2);
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 3) {
                        res=input*907184.74;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 4) {
                        res=input*907184740;
                        textview.setText(res+"");
                        break;
                    }
                    break;
                }
                case (02): {
                    if (w2 == 1) {
                        res=input/907.2;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 2) {
                        textview.setText(input+"");
                        break;
                    }
                    else if (w2 == 3) {
                        res=input*1000;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 4) {
                        res=input*1000000;
                        textview.setText(res+"");
                        break;
                    }
                    break;
                }
                case (03): {
                    if (w2 == 1) {
                        res=input/907200;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 2) {
                        res=input/1000;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 3) {  textview.setText(input+"");
                        break;
                    }
                    else if (w2 == 4) {
                        res=input*1000;
                        textview.setText(res+"");
                        break;
                    }
                    break;
                }
                case (04): {
                    if (w2 == 1) {
                        res=input/907184740;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 2) {
                        res=input/1000000;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 3) {
                        res=input/1000;
                        textview.setText(res+"");
                        break;
                    }
                    else if (w2 == 4) {  textview.setText(input+"");
                        break;
                    }
                    break;
                }
                default:{
                    Toast.makeText(this, "The unit is not selected", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }
        catch(NumberFormatException ex){
            Toast.makeText(this, "Enter the Valid number", Toast.LENGTH_SHORT).show();
        }

    }



}