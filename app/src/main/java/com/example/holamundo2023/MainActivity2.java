package com.example.holamundo2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

import WebService.Asynchtask;
import WebService.WebService;

public class MainActivity2 extends AppCompatActivity implements Asynchtask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtSalud=(TextView) findViewById(R.id.idTexto);
        Bundle b=this.getIntent().getExtras();
        txtSalud.setText("Hola, Bienvenido \n"+"Nombre: "+b.getString("Nombre")+"\n"+"contraseña"+
                b.getString("Contraseña")+"\n"+"Genero: "+
                b.getString("Genero")+"\n"+"Notificacion: "+
                b.getString("Notificaciones"));


        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService(
                "https://revistas.uteq.edu.ec/ws/login.php?usr="
                        + b.getString("Nombre") + "&pass=" + b.getString("Contraseña"),
                datos, MainActivity2.this, MainActivity2.this);
        ws.execute( "GET");

    }

    @Override
    public void processFinish(String result) throws JSONException {
        Toast.makeText(this,"Resp: "+result, Toast.LENGTH_LONG).show();
       /* TextView txthoal=(TextView) findViewById(R.id.id6);
        txthoal.setText(result);*/
    }
}