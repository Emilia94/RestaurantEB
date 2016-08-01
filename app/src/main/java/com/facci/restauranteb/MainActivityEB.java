package com.facci.restauranteb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityEB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_eb);
    }
    public  void  click1(View v){
        Toast.makeText(MainActivityEB.this, "Platos a la Carta ", Toast.LENGTH_SHORT).show();

    }

    public  void  click2(View v){
        Toast.makeText(MainActivityEB.this, "Bandeja de Especialidades", Toast.LENGTH_SHORT).show();


    }

    public  void  click3(View v){
        Toast.makeText(MainActivityEB.this, "Pollo a la Parrilla", Toast.LENGTH_SHORT).show();


    }

    public  void  click4(View v){
        Toast.makeText(MainActivityEB.this, "Arroz con Menestra", Toast.LENGTH_SHORT).show();

    }

    public  void  click5(View v){
        Toast.makeText(MainActivityEB.this, "Hamburguesa Especial", Toast.LENGTH_SHORT).show();

    }

    public  void  click6(View v){
        Toast.makeText(MainActivityEB.this, "Tacos", Toast.LENGTH_SHORT).show();

    }

    public  void  click7(View v){
        Toast.makeText(MainActivityEB.this, "Alitas Picantes", Toast.LENGTH_SHORT).show();

    }
    }

