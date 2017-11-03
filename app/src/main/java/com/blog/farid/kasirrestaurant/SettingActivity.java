package com.blog.farid.kasirrestaurant;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Asus A455L on 03/11/2017.
 */

public class SettingActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7;
    Button b1;

    public static final String MyPREFERENCES = "MyPreferences";
    public static final String masakan1 = "masakan1";
    public static final String masakan2 = "masakan2";
    public static final String masakan3 = "masakan3";
    public static final String masakan4 = "masakan4";
    public static final String masakan5 = "masakan5";
    public static final String masakan6 = "masakan6";
    public static final String masakan7 = "masakan7";

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        et1= (EditText) findViewById(R.id.harga_1);
        et2= (EditText) findViewById(R.id.harga_2);
        et3= (EditText) findViewById(R.id.harga_3);
        et4= (EditText) findViewById(R.id.harga_4);
        et5= (EditText) findViewById(R.id.harga_5);
        et6= (EditText) findViewById(R.id.harga_6);
        et7= (EditText) findViewById(R.id.harga_7);

        b1= (Button) findViewById(R.id.simpanButton);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        DisplayText();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f1 = et1.getText().toString();
                String f2 = et2.getText().toString();
                String f3 = et3.getText().toString();
                String f4 = et4.getText().toString();
                String f5 = et5.getText().toString();
                String f6 = et6.getText().toString();
                String f7 = et7.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(masakan1,f1);
                editor.putString(masakan2,f2);
                editor.putString(masakan3,f3);
                editor.putString(masakan4,f4);
                editor.putString(masakan5,f5);
                editor.putString(masakan6,f6);
                editor.putString(masakan7,f7);
                editor.commit();
                Toast.makeText(SettingActivity.this, "Saved!", Toast.LENGTH_SHORT).show();

                DisplayText();

            }
        });
    }

    void DisplayText(){
        et1.setText(sharedpreferences.getString(masakan1,masakan1));
        et2.setText(sharedpreferences.getString(masakan2,masakan2));
        et3.setText(sharedpreferences.getString(masakan3,masakan3));
        et4.setText(sharedpreferences.getString(masakan4,masakan4));
        et5.setText(sharedpreferences.getString(masakan5,masakan5));
        et6.setText(sharedpreferences.getString(masakan6,masakan6));
        et7.setText(sharedpreferences.getString(masakan7,masakan7));
    }
}
