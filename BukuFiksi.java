/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barang;

/**
 *
 * @author Sarah
 */
public class BukuFiksi extends Buku {
    public BukuFiksi(String judul, double hargaBeli, double hargaJual, int jumlahStok) {
        super(judul, hargaBeli, hargaJual, jumlahStok);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Buku Fiksi");
        System.out.println("Judul: " + getJudul());
        System.out.println("Harga Beli: " + getHargaBeli());
        System.out.println("Harga Jual: " + getHargaJual());
        System.out.println("Jumlah Stok: " + getJumlahStok());
    }
}
