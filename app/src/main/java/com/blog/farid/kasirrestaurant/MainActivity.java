package com.blog.farid.kasirrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Asus A455L on 03/11/2017.
 */

public class MainActivity extends AppCompatActivity {

    String jumlah1;
    String jumlah2;
    String jumlah3;
    String jumlah4;
    String jumlah5;
    String jumlah6;
    String jumlah7;
    TextView jml1,jml2,jml3,jml4,jml5,jml6,jml7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jml1= (TextView) findViewById(R.id.jml1);
        jml2= (TextView) findViewById(R.id.jml2);
        jml3= (TextView) findViewById(R.id.jml3);
        jml4= (TextView) findViewById(R.id.jml4);
        jml5= (TextView) findViewById(R.id.jml5);
        jml6= (TextView) findViewById(R.id.jml6);
        jml7= (TextView) findViewById(R.id.jml7);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.setHarga){
            startActivity(new Intent(this, SettingActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void doPesan(View view) {
        Intent it = new Intent(this, PayActivity.class);
        jumlah1=jml1.getText().toString();
        jumlah2=jml2.getText().toString();
        jumlah3=jml3.getText().toString();
        jumlah4=jml4.getText().toString();
        jumlah5=jml5.getText().toString();
        jumlah6=jml6.getText().toString();
        jumlah7=jml7.getText().toString();
        it.putExtra("jumlah1",jumlah1);
        it.putExtra("jumlah2",jumlah2);
        it.putExtra("jumlah3",jumlah3);
        it.putExtra("jumlah4",jumlah4);
        it.putExtra("jumlah5",jumlah5);
        it.putExtra("jumlah6",jumlah6);
        it.putExtra("jumlah7",jumlah7);
        startActivity(it);

    }
}
