package com.example.prayerkids;

import static com.example.prayerkids.R.id.bottom_navigation_nemu;
import static com.example.prayerkids.R.id.layout_frame;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;

import com.example.prayerkids.R.id;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener;

import java.util.ArrayList;

import users.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnlogout;
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    ScrollView layout_tab;

    private OnNavigationItemReselectedListener navigation = new OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.home:
                    layout_tab.setVisibility(View.VISIBLE);
                    frameLayout.setVisibility(View.GONE);
                    f = new FragmentHome();
                    break;
                case R.id.cart:
                    layout_tab.setVisibility(View.GONE);
                    frameLayout.setVisibility(View.VISIBLE);
                    f = new FragmentCart();
                    break;
                case R.id.user:
                    layout_tab.setVisibility(View.GONE);
                    frameLayout.setVisibility(View.VISIBLE);
                    f = new FragmentUser();
                    break;
                case id.produk:
                    layout_tab.setVisibility(View.GONE);
                    frameLayout.setVisibility(View.VISIBLE);
                    f = new FragmentKatalogProduk();
                case id.notif:
                    layout_tab.setVisibility(View.GONE);
                    frameLayout.setVisibility(View.VISIBLE);
                    f = new FragmentNotif();
            }
            getSupportFragmentManager().beginTransaction().replace(layout_frame, f).commit();
        }
    }
            ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage("Apakah kamu ingin keluar?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Object> data = new ArrayList<>();
        for (int i = 0; i < FragmentKatalogProduk.namaproduk.length; i++){
            data.add(new item_model(
                    FragmentKatalogProduk.namaproduk[i],
                    FragmentKatalogProduk.hargaproduk[i],
                    FragmentKatalogProduk.poster[i]
            ));
        }


        bottomNavigationView = findViewById(bottom_navigation_nemu);
        bottomNavigationView.setOnNavigationItemReselectedListener(navigation);
        layout_tab=(ScrollView)findViewById(id.layout_tab);
        frameLayout=(FrameLayout)findViewById(layout_frame);
    }

}