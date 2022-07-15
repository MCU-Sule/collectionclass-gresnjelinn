package com.example.pt02collection2072028.model;

public class DataMahasiswa {
    private int nrp;
    private String nama;

    @Override
    public String toString() {
        return nrp + " - " + nama;
    }

    public DataMahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
