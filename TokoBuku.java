/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penjualanbuku;
import Barang.Buku;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarah
 */
public class TokoBuku {
    private double modalAwal;
    private double modalBerjalan;
    private final List<Buku> daftarBuku;

    public TokoBuku(double modalAwal) {
        this.modalAwal = modalAwal;
        this.modalBerjalan = modalAwal;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanLaporanKeuangan() {
        System.out.println("Modal Awal: " + modalAwal);
        System.out.println("Keuntungan Berjalan: " + (modalBerjalan - modalAwal));
    }

    public void tampilkanStokBuku() {
        System.out.println("Stok Buku:");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfo();
            System.out.println();
        }
    }

    public void penjualanBuku(String judul, int jumlah) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.kurangiStok(jumlah);
                modalBerjalan += buku.getHargaJual() * jumlah;
                return;
            }
        }
        System.out.println("Buku dengan judul " + judul + " tidak ditemukan.");
    }

    public void pembelianBuku(String judul, int jumlah) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.tambahStok(jumlah);
                modalBerjalan -= buku.getHargaBeli() * jumlah;
                return;
            }
        }
        System.out.println("Buku dengan judul " + judul + " tidak ditemukan.");
    }
}

