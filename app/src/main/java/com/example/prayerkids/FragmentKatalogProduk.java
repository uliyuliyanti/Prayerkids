package com.example.prayerkids;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentKatalogProduk extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_katalog_produk, container, false);
        return view;
    }
    static int[] poster = {
            R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4,
            R.drawable.g5, R.drawable.g6, R.drawable.g7, R.drawable.g8,
            R.drawable.g9
    };

    static String[] namaproduk = {
            "Kecot OX Yellow","87's OX Black White", "Kecot OX Grey Light", "78's OX Maroon Red",
            "Kecot High Black White", "GEH Series Black White", "GEH Series Off White",
            "87's OX Pink", "Kecot OX Off Balck"
    };

    static String[] hargaproduk = {
            "Rp. 299.000", "Rp. 164.227","Rp. 146.227", "124.950", "Rp. 162.000",
            "Rp. 177.000", "Rp. 177.000", "Rp. 129.950", "Rp. 299.000"
    };
}
