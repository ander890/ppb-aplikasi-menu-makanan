package xyz.dvlprs.aplikasikuliner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MakananDetail extends AppCompatActivity {

    private String namaMakanan, deskripsiMakanan, hargaMakanan;
    private int idGambarMakanan;
    private TextView txtDetailNama, txtDetailHarga, txtDetailDeskripsi;
    public ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            namaMakanan = extras.getString("namaMakanan");
            deskripsiMakanan = extras.getString("deskripsiMakanan");
            hargaMakanan = extras.getString("hargaMakanan");
            idGambarMakanan = extras.getInt("idGambarMakanan");

            setTitle(namaMakanan);

            txtDetailNama = findViewById(R.id.txtDetailNama);
            txtDetailHarga = findViewById(R.id.txtDetailHarga);
            txtDetailDeskripsi = findViewById(R.id.txtDetailDeskripsi);
            imgFoto = findViewById(R.id.imgDetailFoto);

            txtDetailNama.setText(namaMakanan);
            txtDetailHarga.setText(hargaMakanan);
            txtDetailDeskripsi.setText(deskripsiMakanan);
            imgFoto.setImageResource(idGambarMakanan);
        }else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }


    }
}