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

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String food1 = "food1";
    public static final String food2 = "food2";
    public static final String food3 = "food3";
    public static final String food4 = "food4";
    public static final String food5 = "food5";
    public static final String food6 = "food6";
    public static final String food7 = "food7";

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ed1= (EditText) findViewById(R.id.hrg1);
        ed2= (EditText) findViewById(R.id.hrg2);
        ed3= (EditText) findViewById(R.id.hrg3);
        ed4= (EditText) findViewById(R.id.hrg4);
        ed5= (EditText) findViewById(R.id.hrg5);
        ed6= (EditText) findViewById(R.id.hrg6);
        ed7= (EditText) findViewById(R.id.hrg7);

        b1= (Button) findViewById(R.id.simpanButton);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        DisplayText();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String f1 = ed1.getText().toString();
                String f2 = ed2.getText().toString();
                String f3 = ed3.getText().toString();
                String f4 = ed4.getText().toString();
                String f5 = ed5.getText().toString();
                String f6 = ed6.getText().toString();
                String f7 = ed7.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(food1,f1);
                editor.putString(food2,f2);
                editor.putString(food3,f3);
                editor.putString(food4,f4);
                editor.putString(food5,f5);
                editor.putString(food6,f6);
                editor.putString(food7,f7);
                editor.commit();
                Toast.makeText(SettingActivity.this, "Saved!", Toast.LENGTH_SHORT).show();

                DisplayText();

            }
        });
    }

    void DisplayText(){
        ed1.setText(sharedpreferences.getString(food1,food1));
        ed2.setText(sharedpreferences.getString(food2,food2));
        ed3.setText(sharedpreferences.getString(food3,food3));
        ed4.setText(sharedpreferences.getString(food4,food4));
        ed5.setText(sharedpreferences.getString(food5,food5));
        ed6.setText(sharedpreferences.getString(food6,food6));
        ed7.setText(sharedpreferences.getString(food7,food7));
    }
}
