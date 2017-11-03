package com.blog.farid.kasirrestaurant;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Asus A455L on 03/11/2017.
 */

public class PayActivity extends AppCompatActivity {


    int totals1,totals2,totals3,totals4,totals5,totals6,totals7,totalsTot;
    String totals_1,totals_2,totals_3,totals_4,totals_5,totals_6,totals_7,totals_Tots;
    String jml_1,jml_2,jml_3,jml_4,jml_5,jml_6,jml_7;
    TextView tempat1,tempat2,tempat3,tempat4,tempat5,tempat6,tempat7,tempatTot;
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String masakan1 = "masakan1";
    public static final String masakan2 = "masakan2";
    public static final String masakan3 = "masakan3";
    public static final String masakan4 = "masakan4";
    public static final String masakan5 = "masakan5";
    public static final String masakan6 = "masakan6";
    public static final String masakan7 = "masakan7";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        Intent gin = getIntent();
        Bundle b = gin.getExtras();
        if(b!=null){
            jml_1= (String) b.get("jumlah1");
            jml_2= (String) b.get("jumlah2");
            jml_3= (String) b.get("jumlah3");
            jml_4= (String) b.get("jumlah4");
            jml_5= (String) b.get("jumlah5");
            jml_6= (String) b.get("jumlah6");
            jml_7= (String) b.get("jumlah7");
        }

        tempat1= (TextView) findViewById(R.id.struck1);
        tempat2= (TextView) findViewById(R.id.struck2);
        tempat3= (TextView) findViewById(R.id.struck3);
        tempat4= (TextView) findViewById(R.id.struck4);
        tempat5= (TextView) findViewById(R.id.struck5);
        tempat6= (TextView) findViewById(R.id.struck6);
        tempat7= (TextView) findViewById(R.id.struck7);
        tempatTot= (TextView) findViewById(R.id.totalTotal);

        totals1= Integer.parseInt(jml_1) * Integer.parseInt(sharedpreferences.getString(masakan1,masakan1));
        totals2= Integer.parseInt(jml_2) * Integer.parseInt(sharedpreferences.getString(masakan2,masakan2));
        totals3= Integer.parseInt(jml_3) * Integer.parseInt(sharedpreferences.getString(masakan3,masakan3));
        totals4= Integer.parseInt(jml_4) * Integer.parseInt(sharedpreferences.getString(masakan4,masakan4));
        totals5= Integer.parseInt(jml_5) * Integer.parseInt(sharedpreferences.getString(masakan5,masakan5));
        totals6= Integer.parseInt(jml_6) * Integer.parseInt(sharedpreferences.getString(masakan6,masakan6));
        totals7= Integer.parseInt(jml_7) * Integer.parseInt(sharedpreferences.getString(masakan7,masakan7));
        totalsTot=totals1+totals2+totals3+totals4+totals5+totals6+totals7;
        totals_1= String.valueOf(Integer.parseInt(jml_1) * Integer.parseInt(sharedpreferences.getString(masakan1,masakan1)));
        totals_2= String.valueOf(Integer.parseInt(jml_2) * Integer.parseInt(sharedpreferences.getString(masakan2,masakan2)));
        totals_3= String.valueOf(Integer.parseInt(jml_3) * Integer.parseInt(sharedpreferences.getString(masakan3,masakan3)));
        totals_4= String.valueOf(Integer.parseInt(jml_4) * Integer.parseInt(sharedpreferences.getString(masakan4,masakan4)));
        totals_5= String.valueOf(Integer.parseInt(jml_5) * Integer.parseInt(sharedpreferences.getString(masakan5,masakan5)));
        totals_6= String.valueOf(Integer.parseInt(jml_6) * Integer.parseInt(sharedpreferences.getString(masakan6,masakan6)));
        totals_7= String.valueOf(Integer.parseInt(jml_7) * Integer.parseInt(sharedpreferences.getString(masakan7,masakan7)));
        totals_Tots= String.valueOf(totalsTot);

        tempat1.setText(totals_1);
        tempat2.setText(totals_2);
        tempat3.setText(totals_3);
        tempat4.setText(totals_4);
        tempat5.setText(totals_5);
        tempat6.setText(totals_6);
        tempat7.setText(totals_7);
        tempatTot.setText(totals_Tots);

    }
}
