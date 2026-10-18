package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;

/**
 * Minggu 1, gaya PROSEDURAL: menggunakan fungsi statis.
 */
public final class HelloProsedural {

    private HelloProsedural() {
    }

    public static String sapa(String nama, String nim) {
        return "Halo " + nama
                + ", NIM " + nim
                + " dari Aset-Pinjam";
    }

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(sapa(v.nama, v.nim));
    }
}