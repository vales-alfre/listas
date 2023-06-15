package com.example.holamundo2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

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


        /*Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService(
                "https://revistas.uteq.edu.ec/ws/login.php?usr="
                        + b.getString("Nombre") + "&pass=" + b.getString("Contraseña"),
                datos, MainActivity2.this, MainActivity2.this);
        ws.execute( "GET");*/
        //JSON web service

       /* RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://revistas.uteq.edu.ec/ws/login.php?usr="
                + b.getString("Nombre") + "&pass=" + b.getString("Contraseña");
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        TextView txthoal=(TextView) findViewById(R.id.id6);
                        txthoal.setText("Response is: "+ response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        TextView txthoal=(TextView) findViewById(R.id.id6);
                        txthoal.setText("That didn't work!");
                    }
                });
        queue.add(stringRequest);*/
        //Andriod voley//
        //kushki



    }

    @Override
    public void processFinish(String result) throws JSONException {
        Toast.makeText(this,"Resp: "+result, Toast.LENGTH_LONG).show();
       /* TextView txthoal=(TextView) findViewById(R.id.id6);
        txthoal.setText(result);*/
    }
}