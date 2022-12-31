package com.example.crimcone;

public class eskrim {
    private String namaEskrim, deskripsiEskrim;
    private Integer harga,image;

    public eskrim(String namaEskrim, String deskripsiEskrim, Integer harga, Integer image) {
        this.namaEskrim = namaEskrim;
        this.deskripsiEskrim = deskripsiEskrim;
        this.harga = harga;
        this.image = image;
    }

    public static int size() {
        return 0;
    }

    public String getnamaEskrim() {
        return namaEskrim;
    }

    public void setnamaEskrim(String namaEskrim) {
        this.namaEskrim = namaEskrim;
    }

    public String getDeskripsiEskrim() {
        return deskripsiEskrim;
    }

    public void setdeskripsiEskrim(String deskripsiEskrim) {this.deskripsiEskrim = deskripsiEskrim;}

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

}
