/*
Primera aplicación realizada por los estudiantes de Aplicaciones Móviles de la Escuela Politécnica
Nacional de la Facultad de Ingeniería en Sistemas:
Integrantes:
Calo Darío
Cárdenas Hugo
Chipantasi Wilson
Padilla Lorena

Prerrequisitos
Para el uso de la aplicación se debe tener 3 imágenes:
•	buho.jpg
•	epn.jpg
•	sis.jpg
Descripción
En el siguiente código se describe una aplicación móvil en donde se utilizó botones e imágenes,
en la carpeta drawable que se crea por defecto en un proyecto vamos a poner las imágenes que tienen
los siguientes nombres: buho.jpg, epn.jpg y sis.jpg. La aplicación se realizó en Android Studio 1.2.1.1.
*/
package com.example.mundo.hola.holamundo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
    //Creamos una variable fondo que va a hacer de tipo ImageView.
private ImageView fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Con la variable fondo vamos a llamar al componente ImageView para el despliegue
        // de imágenes según el botón presionado.
        fondo=(ImageView)findViewById(R.id.fondo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
/*Vamos a crear las llamadas a las imágenes, en donde va a depender del nombre que contiene cada
botón, para poner este nombre debemos ir a las propiedades del botón OnClick
y digitamos en nombre que deseamos.*/
    public void mieventoclick(View view)
    {
        fondo.setImageResource(R.drawable.buho);
    }

    public void clickepn(View view)
    {
        fondo.setImageResource(R.drawable.epn);
    }
    public void clicksis(View view)
    {
        fondo.setImageResource(R.drawable.sis);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
