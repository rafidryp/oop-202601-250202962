package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.kontrak.DapatDipinjam;

public class Aset implements DapatDipinjam {

    private String kode;
    private String nama;
    private StatusAset status = StatusAset.TERSEDIA;
    private Kondisi kondisi = Kondisi.BAIK;

    public Aset(String kode, String nama) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode aset tidak boleh kosong");
        }

        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama aset tidak boleh kosong");
        }

        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public StatusAset getStatus() {
        return status;
    }

    public Kondisi getKondisi() {
        return kondisi;
    }

    public void setStatus(StatusAset status) {
        if (status == null) {
            throw new IllegalArgumentException("Status tidak boleh null");
        }

        this.status = status;
    }

    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) {
            throw new IllegalArgumentException("Kondisi tidak boleh null");
        }

        this.kondisi = kondisi;
    }

    @Override
    public boolean bisaDipinjam() {
        return status == StatusAset.TERSEDIA
                && kondisi == Kondisi.BAIK;
    }
}
