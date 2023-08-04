package com.example.a2doparcialexamenljls6tocuatri;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menugeneral extends AppCompatActivity {

    private TextView ETedittextmenu1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menugeneral);


        ETedittextmenu1 = (TextView) findViewById(R.id.textviewmenu1);

        SharedPreferences usuariopreferences = getSharedPreferences("datosusuario", Context.MODE_PRIVATE);
        ETedittextmenu1.setText(usuariopreferences.getString("usuario",""));

        SharedPreferences preferencias = getSharedPreferences("datosusuario", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferencias.edit();
        Obj_editor.putString("usuario", ETedittextmenu1.getText().toString());
        Obj_editor.commit();
    }

    //Metodo para el boton buttonloguin1

    public void ActFinalizar(View view){
        //  Intent ActFinalizar = new Intent(this, menufinalizar.class);
        //startActivity(ActFinalizar);
    }

    public void ActTerror(View view){
        Intent ActTerror = new Intent(this, menuterror.class);
        startActivity(ActTerror);
    }

    public void ActHamburguesa(View view){
        //Intent ActHamburguesa = new Intent(this, menuhamburguesa.class);
        //startActivity(ActHamburguesa);
    }

    public void ActPizza(View view){
        //Intent ActPizza = new Intent(this, menupizza.class);
        //startActivity(ActPizza);
    }


}