/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang;

/**
 *
 * @author Sarah
 */
public class Majalah extends Buku {
    private final int nomorEdisi;

    public Majalah(String judul, double hargaBeli, double hargaJual, int jumlahStok, int nomorEdisi) {
        super(judul, hargaBeli, hargaJual, jumlahStok);
        this.nomorEdisi = nomorEdisi;
    }

    public int getNomorEdisi() {
        return nomorEdisi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Majalah");
        System.out.println("Judul: " + getJudul());
        System.out.println("Harga Beli: " + getHargaBeli());
        System.out.println("Harga Jual: " + getHargaJual());
        System.out.println("Jumlah Stok: " + getJumlahStok());
        System.out.println("Nomor Edisi: " + getNomorEdisi());
    }
}