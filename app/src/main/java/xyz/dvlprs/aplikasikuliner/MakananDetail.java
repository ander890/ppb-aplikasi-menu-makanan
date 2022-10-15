package xyz.dvlprs.aplikasikuliner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MakananDetail extends AppCompatActivity {

    private Makanan makanan;
    private String namaMakanan, deskripsiMakanan, hargaMakanan;
    private int idGambarMakanan;
    private TextView txtDetailNama, txtDetailHarga, txtDetailDeskripsi;
    public ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        makanan = (Makanan)getIntent().getSerializableExtra("makanan");

        if (makanan != null) {
            namaMakanan = makanan.getNamaMakanan();
            deskripsiMakanan = makanan.getDeskripsiMakanan();
            hargaMakanan = makanan.getHargaMakanan();
            idGambarMakanan = makanan.getIdGambarMakanan();

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