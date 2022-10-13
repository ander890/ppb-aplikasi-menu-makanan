package xyz.dvlprs.aplikasikuliner;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {

    private ArrayList<Makanan> listMakanan;

    public MakananAdapter(ArrayList<Makanan> listMakanan) {
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public MakananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.ViewHolder holder, int position) {
        Makanan makanan = listMakanan.get(position);
        holder.txtNama.setText(makanan.getNamaMakanan());
        holder.txtHarga.setText(makanan.getHargaMakanan());
        holder.imgFoto.setImageResource(makanan.getIdGambarMakanan());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MakananDetail.class);
                intent.putExtra("namaMakanan", makanan.getNamaMakanan());
                intent.putExtra("deskripsiMakanan", makanan.getDeskripsiMakanan());
                intent.putExtra("hargaMakanan", makanan.getHargaMakanan());
                intent.putExtra("idGambarMakanan", makanan.getIdGambarMakanan());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtHarga;
        public ImageView imgFoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtHarga = (TextView) itemView.findViewById(R.id.txtHarga);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
