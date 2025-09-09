package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Posttest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarWarga = new ArrayList<>();
        ArrayList<String> daftarEmail = new ArrayList<>();
        
        // Data awal nama warga
        daftarWarga.add("Zidan Daffa Ramadhan");
        daftarWarga.add("Muhammad Mahardhika");
        daftarWarga.add("Adreena Khalisa Rifaya");
        daftarWarga.add("Afra Azizah Devrianri");
        daftarWarga.add("Muhammmad Arif Setiawan");
        daftarWarga.add("Ryan Risky Sulaiman");
        daftarWarga.add("Muhammad Arifansyah Ilham");
        
        // data awal email warga
        daftarEmail.add("xxerd64@gmail.com");
        daftarEmail.add("adreenakhri@gmail.com");
        daftarEmail.add("azure23@gmail.com");
        daftarEmail.add("rzidan469@gmail.com");
        daftarEmail.add("yannsky@gmail.com");
        daftarEmail.add("rifan123@gmail.com");
       
        int pilihan;
        
        do {
            System.out.println("\n=== Manajemen Pendataan Warga RT 41 ===");
            System.out.println("1. Tambah Data Warga");
            System.out.println("2. Tambah Email Warga");
            System.out.println("3. Lihat Data Warga");
            System.out.println("4. Lihat Email Warga");
            System.out.println("5. Ubah nama Warga");
            System.out.println("6. Ubah email Warga");
            System.out.println("7. Hapus Data Warga");
            System.out.println("8. Hapus Email Warga");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama warga: ");
                    String nama = input.nextLine();
                    daftarWarga.add(nama);
                    System.out.println("Data warga berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Masukkan email warga: ");
                    String email = input.nextLine();
                    daftarEmail.add(email);
                    System.out.println("Data email berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("=== Daftar Warga RT 41 ===");
                    if (daftarWarga.isEmpty()) {
                        System.out.println("Belum ada data warga.");
                    } else {
                        for (int i = 0; i < daftarWarga.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarWarga.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("=== Daftar Email RT 41 ===");
                    if (daftarEmail.isEmpty()) {
                        System.out.println("Belum ada data email.");
                    } else {
                        for (int i = 0; i < daftarEmail.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarEmail.get(i));
                        }
                    }
                    break;
                case 5:
                    System.out.println("=== Ubah nama warga ===");
                            if (daftarWarga.isEmpty()) {
                                System.out.println("Belum ada nama warga untuk di update.");
                            } else {
                                for (int i = 0; i < daftarWarga.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarWarga.get(i));}
                                System.out.println("masukkan nama warga yang ingin diubah berdasarkan nomor : ");
                                int indexUbah = input.nextInt();
                                input.nextLine();
                                
                                if (indexUbah > 0 && indexUbah <= daftarWarga.size()) {
                                System.out.println("Masukkan Nama Baru : ");
                                String namaUbah = input.nextLine();
                                daftarWarga.set(indexUbah - 1, namaUbah);
                                        System.out.println("Nama Berhasil diubah.");
                                } else {
                                    System.out.println("nomor tidak valid");
                                }
                            }
                    break;
                    
                case 6:
                    System.out.println("=== Ubah email Warga ===");
                    if (daftarEmail.isEmpty()) {
                        System.out.println("Belum ada data untuk Email warga yang bisa diubah.");
                    } else {
                        for (int i = 0; i < daftarEmail.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarEmail.get(i));}
                                System.out.println("masukkan Email warga yang ingin diubah berdasarkan nomor : ");
                                int indexUbah = input.nextInt();
                                input.nextLine();
                                
                                if (indexUbah > 0 && indexUbah <= daftarEmail.size()) {
                                System.out.println("Masukkan Email Baru : ");
                                String emailUbah = input.nextLine();
                                daftarEmail.set(indexUbah - 1, emailUbah);
                                        System.out.println("Email Berhasil diubah.");
                                } else {
                                    System.out.println("nomor tidak valid");
                                }
                            }
                    break;
                case 7:
                    System.out.println("=== Hapus Data Warga ===");
                    if (daftarWarga.isEmpty()) {
                        System.out.println("Belum ada data yang bisa dihapus.");
                    } else {
                        for (int i = 0; i < daftarWarga.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarWarga.get(i));
                        }
                        System.out.print("Masukkan nomor warga yang ingin dihapus: ");
                        int hapus = input.nextInt();
                        if (hapus > 0 && hapus <= daftarWarga.size()) {
                            daftarWarga.remove(hapus - 1);
                            System.out.println("Data berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 8:
                    System.out.println("=== Hapus Data Email ===");
                    if (daftarEmail.isEmpty()) {
                        System.out.println("Belum ada email yang bisa dihapus.");
                    } else {
                        for (int i = 0; i < daftarEmail.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarEmail.get(i));
                        }
                        System.out.print("Masukkan nomor email yang ingin dihapus: ");
                        int hapusEmail = input.nextInt();
                        if (hapusEmail > 0 && hapusEmail <= daftarEmail.size()) {
                            daftarEmail.remove(hapusEmail - 1);
                            System.out.println("Email berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 9:
                    System.out.println("Terima kasih, program akan berhenti.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 9);

        input.close();
    }
}
