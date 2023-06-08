package com.example.holamundo2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btEnviar (View view)
    {
        EditText txtNombre=(EditText) findViewById(R.id.txtNombre);
        Toast.makeText(this.getApplicationContext(),"hola "+txtNombre.getText().toString(),Toast.LENGTH_LONG).show();

    }
}












