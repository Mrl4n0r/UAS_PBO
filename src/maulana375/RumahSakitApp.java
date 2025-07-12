package maulana375;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RumahSakitApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== SISTEM MANAJEMEN PASIEN RUMAH SAKIT ===");

        int jumlahPasien = 0;
        boolean inputBenar = false;

        // Validasi input jumlah pasien
        while (!inputBenar) {
            try {
                System.out.print("Masukkan jumlah pasien: ");
                jumlahPasien = input.nextInt();
                input.nextLine();

                if (jumlahPasien <= 0) {
                    System.out.println("Jumlah pasien tidak boleh nol atau negatif.");
                } else {
                    inputBenar = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka! Coba lagi.");
                input.nextLine();
            }
        }

        // Array untuk menyimpan semua pasien
        Pasien[] daftarPasien = new Pasien[jumlahPasien];

        // Input data pasien
        for (int i = 0; i < jumlahPasien; i++) {
            System.out.println("\n[Input Pasien ke-" + (i + 1) + "]");

            try {
                System.out.print("Nama            : ");
                String nama = input.nextLine();

                System.out.print("Usia            : ");
                int usia = input.nextInt();
                input.nextLine();

                System.out.print("Jenis Kelamin (L/P): ");
                String jk = input.nextLine();

                System.out.print("Tipe pasien (1. BPJS / 2. VIP): ");
                int tipe = input.nextInt();
                input.nextLine();

                if (tipe == 2) {
                    System.out.print("Ruang VIP       : ");
                    String ruang = input.nextLine();

                    System.out.print("Lama Inap (hari): ");
                    int lama = input.nextInt();

                    System.out.print("Biaya per Hari  : ");
                    double biaya = input.nextDouble();
                    input.nextLine();

                    daftarPasien[i] = new PasienVip(nama, usia, jk, ruang, lama, biaya);
                } else {
                    // Pasien BPJS
                    daftarPasien[i] = new Pasien(nama, usia, jk);
                }

            } catch (InputMismatchException e) {
                System.out.println("Kesalahan input! Data pasien ke-" + (i + 1) + " dilewati.");
                input.nextLine();
            }
        }

        // Tampilkan semua data
        System.out.println("\n=== DATA PASIEN ===");
        for (int i = 0; i < daftarPasien.length; i++) {
            System.out.println("\n[Pasien #" + (i + 1) + "]");
            System.out.println(daftarPasien[i].getInfoPasien());
        }

        input.close();
    }
}
