package com.example.a2doparcialexamenljls6tocuatri;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText ETedittextlogin1;

    EditText contrasenia;
    Button entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //proceso del shared preferences para guardar info
        ETedittextlogin1 = (EditText) findViewById(R.id.edittextlogin1);

        SharedPreferences usuariopreferences = getSharedPreferences("datosusuario", Context.MODE_PRIVATE);
        ETedittextlogin1.setText(usuariopreferences.getString("usuario",""));


        contrasenia = (EditText) findViewById(R.id.edittextlogin2);
        entrar = (Button) findViewById(R.id.buttonloguin1);



    }
//Metodo para el boton buttonloguin1

    public void Entrar(View view){

        //metodo del sharedpreferences para guardar la info con el boton
        SharedPreferences preferencias = getSharedPreferences("datosusuario", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferencias.edit();
        Obj_editor.putString("usuario", ETedittextlogin1.getText().toString());
        Obj_editor.commit();
        Intent Entrar = new Intent(this, menugeneral.class);
        startActivity(Entrar);

        //  if (ETedittextlogin1.getText().toString().equals("Luis Lopez") && contrasenia.getText().toString().equals("12345")){
        //metodo que cambia de un layer a otro
        //   Intent Entrar = new Intent(this, menucomida.class);
        //   startActivity(Entrar);}else{
        //   Toast.makeText(MainActivity.this, "Intenta con Luis Lopez y con 12345 ", Toast.LENGTH_LONG).show();
        //}
    }

}