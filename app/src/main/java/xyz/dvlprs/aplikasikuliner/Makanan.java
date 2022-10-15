package xyz.dvlprs.aplikasikuliner;

import java.io.Serializable;

public class Makanan implements Serializable {

    private String namaMakanan, deskripsiMakanan, hargaMakanan;
    private int idGambarMakanan;

    public Makanan(String namaMakanan, String deskripsiMakanan, String hargaMakanan, int idGambarMakanan) {
        this.namaMakanan = namaMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
        this.hargaMakanan = hargaMakanan;
        this.idGambarMakanan = idGambarMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDeskripsiMakanan() {
        return deskripsiMakanan;
    }

    public void setDeskripsiMakanan(String deskripsiMakanan) {
        this.deskripsiMakanan = deskripsiMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public int getIdGambarMakanan() {
        return idGambarMakanan;
    }

    public void setIdGambarMakanan(int idGambarMakanan) {
        this.idGambarMakanan = idGambarMakanan;
    }
}
