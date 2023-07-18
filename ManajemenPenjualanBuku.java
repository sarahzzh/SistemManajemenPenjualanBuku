/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penjualanbuku;
import Barang.Buku;
import Barang.BukuFiksi;
import Barang.BukuNonFiksi;
import Barang.Majalah;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class ManajemenPenjualanBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TokoBuku tokoBuku = new TokoBuku(5000000);

        // Inisialisasi data awal buku
        Buku bukuFiksi1 = new BukuFiksi("Laut Bercerita", 50000, 80000, 10);
        Buku bukuFiksi2 = new BukuFiksi("Malioboro at Midnight", 60000, 95000, 15);
        Buku bukuFiksi3 = new BukuFiksi("Dikta dan Hukum", 40000, 85000, 20);
        Buku bukuNonFiksi1 = new BukuNonFiksi("Sebuah Seni Untuk Bersikap Bodo Amat", 55000, 75000, 12);
        Buku bukuNonFiksi2 = new BukuNonFiksi("Berani Tidak Disukai", 55000, 75000, 18);
        Buku bukuNonFiksi3 = new BukuNonFiksi("Sekolah Itu Candu", 40000, 60000, 2);
        Buku majalah1 = new Majalah("BoBo", 15000, 30000, 5, 1);
        Buku majalah2 = new Majalah("Gaya Hidup", 10000, 20000, 8, 2);
        Buku majalah3 = new Majalah("Remaja", 10000, 20000, 10, 3);

        // Menambahkan buku ke toko
        tokoBuku.tambahBuku(bukuFiksi1);
        tokoBuku.tambahBuku(bukuFiksi2);
        tokoBuku.tambahBuku(bukuFiksi3);
        tokoBuku.tambahBuku(bukuNonFiksi1);
        tokoBuku.tambahBuku(bukuNonFiksi2);
        tokoBuku.tambahBuku(bukuNonFiksi3);
        tokoBuku.tambahBuku(majalah1);
        tokoBuku.tambahBuku(majalah2);

        int pilihan;
        do {
            System.out.println("========== Toko Buku ==========");
            System.out.println("By. Sarah Azizah, 22201087");
            System.out.println("===============================");
            System.out.println("1. Laporan Keuangan");
            System.out.println("2. Tampilkan Stok Buku");
            System.out.println("3. Penjualan Buku");
            System.out.println("4. Pembelian Buku");
            System.out.println("0. Exit");
            System.out.println("===============================");

            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tokoBuku.tampilkanLaporanKeuangan();
                    break;
                case 2:
                    tokoBuku.tampilkanStokBuku();
                    break;
                case 3:
                    System.out.print("Judul Buku: ");
                    scanner.nextLine();
                    String judulBukuPenjualan = scanner.nextLine();
                    System.out.print("Jumlah: ");
                    int jumlahPenjualan = scanner.nextInt();
                    tokoBuku.penjualanBuku(judulBukuPenjualan, jumlahPenjualan);
                    System.out.println("Buku Berhasil Terjual!!!");
                    break;
                case 4:
                    System.out.print("Judul Buku: ");
                    scanner.nextLine();
                    String judulBukuPembelian = scanner.nextLine();
                    System.out.print("Jumlah: ");
                    int jumlahPembelian = scanner.nextInt();
                    tokoBuku.pembelianBuku(judulBukuPembelian, jumlahPembelian);
                    System.out.println("Buku Berhasil terbeli!!!");
                    break;
                case 0:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }
}