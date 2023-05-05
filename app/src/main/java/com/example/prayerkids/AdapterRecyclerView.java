package com.example.prayerkids;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    ArrayList<item_model> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textnamaproduk;
        TextView texthargaproduk;
        ImageView poster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textnamaproduk = itemView.findViewById(R.id.nama_produk);
            texthargaproduk = itemView.findViewById(R.id.harga_produk);
            poster = itemView.findViewById(R.id.image_poster);
        }
    }

    AdapterRecyclerView(ArrayList<item_model> data) {

        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

        TextView text_nama_produk = holder.textnamaproduk;
        TextView text_harga_produk = holder.texthargaproduk;
        ImageView image_poster = holder.poster;

        text_nama_produk.setText(dataItem.get(position).getNamaproduk());
        text_harga_produk.setText(dataItem.get(position).getHargaproduk());
        image_poster.setImageResource(dataItem.get(position).getPoster());

    }

    @Override
    public int getItemCount() {

        return dataItem.size();
    }


}
