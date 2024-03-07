package Jurnal03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Buku> listBuku = new SinglyLinkedList();
        Scanner lea = new Scanner(System.in);
        int pilihan;
        String yesOrNo;
    }

    {
        System.out.println("Masukkan pilihan : ");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Hapus Buku");
        System.out.println("3. Cetak Daftar Buku");
        System.out.println("4. Keluar");

        System.out.print("Pilih Operasi");
        pilihan = lea.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Judul Buku: ");
                String judulBuku = lea.next();
                System.out.print("Masukkan Penulis: ");
                String penulis = lea.next();
                System.out.print("Masukkan Tahun Terbit: ");
                int tahunTerbit = lea.nextInt();

                System.out.println("Tambahkan data di awal list? (y/n)");
                yesOrNo = lea.next();

                if(yesOrNo.equalsIgnoreCase("y")){
                    listBuku.tambahDepan(new Buku(judulBuku, penulis, tahunTerbit));
                } else {
                    listBuku.tambahBelakang(new Buku(judulBuku, penulis, tahunTerbit));
                }
                break;
            case 2:
            System.out.println("Tambahkan data di awal list? (y/n)");
            yesOrNo = lea.next();

            if (yesOrNo.equalsIgnoreCase("y")) {
                listBuku.hapusDepan();
                System.out.println("Data buku di awal list di hapus");
            } else {
                listBuku.hapusBelakang();
                System.out.println("Data buku di akhir list di hapus");
            }
            break;
            case 3:;
            System.out.println("Data Buku: ");
            listBuku.print();
            break;   
            }

                break;
            }
    @Override
    public String toString() {
        return "Main []";
    }
        }