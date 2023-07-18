/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang;

/**
 *
 * @author Sarah
 */
public abstract class Buku {
    private final String judul;
    private final double hargaBeli;
    private final double hargaJual;
    private int jumlahStok;

    public Buku(String judul, double hargaBeli, double hargaJual, int jumlahStok) {
        this.judul = judul;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.jumlahStok = jumlahStok;
    }

    public String getJudul() {
        return judul;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void tambahStok(int jumlah) {
        jumlahStok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        jumlahStok -= jumlah;
        if (jumlahStok == 0) {
            System.out.println("Stok untuk buku " + judul + " sudah mencapai nol.");
        }
    }

    public abstract void tampilkanInfo();
}
