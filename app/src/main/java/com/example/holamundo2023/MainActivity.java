package com.example.holamundo2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btEnviar (View view)
    {
        EditText txtNombre=(EditText) findViewById(R.id.txtNombre);
        EditText TxtContra=(EditText) findViewById(R.id.TxtContra);
        RadioButton rbMac =(RadioButton) findViewById(R.id.rbMasc);
        Switch Noti=(Switch) findViewById(R.id.swNotificaciones);

        String Nombre = txtNombre.getText().toString();
        String Contraseña= TxtContra.getText().toString();
        String Genero =rbMac.isChecked()?"Masculino":"Femenino";
        String Notifi = Noti.isChecked()?"Si": "No";
        Toast.makeText(this.getApplicationContext(),
                "Nombre "+Nombre+"\n"+
                        "Contraseña"+Contraseña+"\n"+
                        "Genero"+Genero+"\n"+
                        "Notificaciones"+Notifi,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("Nombre",Nombre);
        b.putString("Contraseña",Contraseña);
        b.putString("Genero",Genero);
        b.putString("Notificaciones",Notifi);
        intent.putExtras(b);
        startActivity(intent);


    }

}












