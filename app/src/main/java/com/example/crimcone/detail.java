package com.example.crimcone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detail extends AppCompatActivity {
    ImageView imageViewFoto;
    TextView textViewNama, textViewDeskripsi, textViewHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageViewFoto = findViewById(R.id.imgfotodtl);
        textViewNama = findViewById(R.id.txtNamadtl);
        textViewDeskripsi = findViewById(R.id.txtdeskripsidtl);
        textViewHarga = findViewById(R.id.txtHargadtl);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("harga_makanan") && getIntent().hasExtra("gambar_makanan")){
            Integer fotoEskrim = getIntent().getIntExtra("gambar_eskrim", 0);
            String deskripsiEskrim = getIntent().getStringExtra("deskripsi_eskrim");
            String namaEskrim = getIntent().getStringExtra("nama_eskrim");
            String hargaEskrim = getIntent().getStringExtra("harga_eskrim");

            setDataActivity(fotoEskrim, namaEskrim, deskripsiEskrim, hargaEskrim);
        }
    }
    @SuppressLint("SetTextI18n")
    private void setDataActivity(Integer fotoEskrim, String namaEskrim, String deskripsiEskrim, String hargaEskrim){
        imageViewFoto.setImageResource(fotoEskrim);
        textViewNama.setText(namaEskrim);
        textViewDeskripsi.setText(deskripsiEskrim);
        textViewHarga.setText("Harga : \t" +hargaEskrim);
    }
}
