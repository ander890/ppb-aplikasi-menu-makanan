package xyz.dvlprs.aplikasikuliner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Pecel Lele", "Pecel Lele Mantap", "Rp 15.000", R.drawable.pecellele));
        listMakanan.add(new Makanan("Nasi Goreng Mercon", "Nasi Goreng Mercon Mantap", "Rp 14.500", R.drawable.nasgormercon));
        listMakanan.add(new Makanan("Ayam Geprek Keju", "Ayam Geprek Keju Mantap", "Rp 20.000", R.drawable.prekju));
        listMakanan.add(new Makanan("Kari Ayam", "Kari Ayam Mantap", "Rp 17.500", R.drawable.kariayam));
        listMakanan.add(new Makanan("Tahu Bulat", "Tahu Bulat Mantap", "Rp 500", R.drawable.tahubulat));
        listMakanan.add(new Makanan("Salad Buah", "Salad Buah Mantap", "Rp 12.000", R.drawable.saladbuah));

    }
}