package com.example.afafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        SharedPreferences sp = getSharedPreferences("sp", 0);
        boolean key = sp.getBoolean("key", false);
        if (key){
            startActivity(new Intent(MainActivity.this,Main2Activity.class));
        }



        SharedPreferences sp1 = getSharedPreferences("sp", 0);
        if (!key){
           //
            boolean aBoolean = sp1.getBoolean("key", true);
            SharedPreferences.Editor edit1 = sp1.edit();
            edit1.putBoolean("key",true);
            edit1.commit();
        }
        Toast.makeText(this, "aaa", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this,Home.class));
    }
}
