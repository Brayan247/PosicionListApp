package com.istl.posicionlistapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewPeople extends AppCompatActivity implements LocationListener, View.OnClickListener{

    private EditText txtLong, txtLat, txtNom;
    private Button btnPosicion, btnGuardar, btnVerLista;
    private static double latitud, longitud;
    public static boolean statusGPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_people);
        txtNom = (EditText) findViewById(R.id.etNombre);
        txtLong = (EditText) findViewById(R.id.etLongitud);
        txtLat = (EditText) findViewById(R.id.etLAtitud);
        btnPosicion = (Button) findViewById(R.id.btnObtenrUbicacion);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnVerLista = (Button) findViewById(R.id.btnRegresar);
        btnPosicion.setOnClickListener(this);
        btnVerLista.setOnClickListener(this);
    }




    @Override
    public void onLocationChanged(@NonNull Location location) {
        latitud = location.getLatitude();
        longitud = location.getLongitude();
    }
    public void obtenerPosicion(){
        txtLat.setText(String.valueOf(latitud));
        txtLong.setText(String.valueOf(longitud));
    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {
        statusGPS = true;
    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
        statusGPS = false;
    }

    @Override
    public void onClick(View v) {
        if(v==btnPosicion){
            obtenerPosicion();
        }
        if(v==btnGuardar){
            if(txtNom.getText().toString().isEmpty()){
                
            }
            if(txtLat.getText().toString().isEmpty()){

            }
            if(txtLong.getText().toString().isEmpty()){

            }
            Toast.makeText(NewPeople.this, "Los datos de la persona guardad son: Nombre "+txtNom+", Latitud: "+txtLong+", Longitud: "+txtLong , Toast.LENGTH_LONG).show();
        }
        if(v==btnVerLista){
            Intent i = new Intent(NewPeople.this, MainActivity.class);
            startActivity(i);
        }
    }
}