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

    String pesanan1;
    String pesanan2;
    String pesanan3;
    String pesanan4;
    String pesanan5;
    String pesanan6;
    String pesanan7;
    TextView jumlah1,jumlah2,jumlah3,jumlah4,jumlah5,jumlah6,jumlah7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jumlah1= (TextView) findViewById(R.id.jumlahpesanan1);
        jumlah2= (TextView) findViewById(R.id.jumlahpesanan2);
        jumlah3= (TextView) findViewById(R.id.jumlahpesanan3);
        jumlah4= (TextView) findViewById(R.id.jumlahpesanan4);
        jumlah5= (TextView) findViewById(R.id.jumlahpesanan5);
        jumlah6= (TextView) findViewById(R.id.jumlahpesanan6);
        jumlah7= (TextView) findViewById(R.id.jumlahpesanan7);
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
        pesanan1=jumlah1.getText().toString();
        pesanan2=jumlah2.getText().toString();
        pesanan3=jumlah3.getText().toString();
        pesanan4=jumlah4.getText().toString();
        pesanan5=jumlah5.getText().toString();
        pesanan6=jumlah6.getText().toString();
        pesanan7=jumlah7.getText().toString();
        it.putExtra("jumlah1",pesanan1);
        it.putExtra("jumlah2",pesanan2);
        it.putExtra("jumlah3",pesanan3);
        it.putExtra("jumlah4",pesanan4);
        it.putExtra("jumlah5",pesanan5);
        it.putExtra("jumlah6",pesanan6);
        it.putExtra("jumlah7",pesanan7);
        startActivity(it);

    }
}
