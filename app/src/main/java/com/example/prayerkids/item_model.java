package com.example.prayerkids;

public class item_model {

    String namaproduk, hargaproduk;
    int poster;

    public item_model(String namaproduk, String hargaproduk, int poster) {
        this.namaproduk = namaproduk;
        this.hargaproduk = hargaproduk;
        this.poster = poster;
    }

    public String getNamaproduk() {
        return namaproduk;
    }

    public String getHargaproduk() {
        return hargaproduk;
    }

    public int getPoster() {
        return poster;
    }
}
