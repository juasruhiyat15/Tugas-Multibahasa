package com.program.juas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnTropis,btnSubtropis,btnklik;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnTropis = findViewById(R.id.btn_buka_buah_tropis);
        btnSubtropis= findViewById(R.id.btn_buka_buah_subtropis);
        btnTropis.setOnClickListener(view -> bukaGaleri("Tropis"));
        btnSubtropis.setOnClickListener(view -> bukaGaleri("Subtropis"));
    }

    private void bukaGaleri(String jenisBuah) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarBuahActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisBuah);
        startActivity(intent);
    }

    public void kuet(View view){
        Intent intent = new Intent(this, com.program.juas.IdentitasActivity.class);
        startActivity(intent);


    }



}