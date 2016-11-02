package id.sch.smktelkom_mlg.learn.recyclerview1.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Vistapram on 2016-11-02.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;
    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
