package com.example.bichito;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProducts;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //enlazamos activity + layouts

        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);

        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
              //  Log.i(Settings.INFO, "Products");

                //intent: sirve para cambiar de pantalla
                Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               // Log.i(Settings.INFO, "About Us");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
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
