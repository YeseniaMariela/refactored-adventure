package com.example.bichito;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume(); // este codigo se ejecuta antes de todos.
        // En este punto la aplicacion ya cargo

        // this en un activity: es la esencia en una pantalla,el poder de controlar toda
        // la pantalla ocurre cuando es de tipo contexto

        Toast.makeText(this,
                "Aplicacion iniciada",
                Toast.LENGTH_LONG).show();
    }


    @Override
    protected  void onStop() {
        super.onStop();
        Toast.makeText(this,
                "Aplicacion en Stop",
                Toast.LENGTH_LONG).show();
    }
}
