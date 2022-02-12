package pbo.perustakaan.fix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Siswa siswa = new Siswa();
        Petugas petugas = new Petugas();
        Buku buku = new Buku();
        Peminjaman peminjaman = new Peminjaman();

        petugas.listPetugas();
        siswa.listSiswa();

        int idSiswa = peminjaman.Proses(siswa);

        Boolean ulang = true;
        while (ulang) {
            int menu = peminjaman.pilihMenu();
            switch (menu) {
                case 1:
                    buku.listBuku();
                    break;
                case 2:
                    peminjaman.prosesPeminjaman(idSiswa, siswa, buku);
                    break;
                case 3:
                    peminjaman.prosesPengembalian(idSiswa, siswa, buku);
                    break;
                case 4:
                    peminjaman.peminjamanSiswa(siswa, buku);
                    break;
                case 5:
                    peminjaman.statusSiswa(siswa);
                    break;
                case 99:
                    ulang = false;
                    break;
                default: {
                    System.out.println("Menu yang dipilih tidak tersedia\n");
                }
            }
        }
        in.close();
    }
    public void Ucapan() {
        System.out.println("   SELAMAT DATANG DI PERPUSTAKAAN MOKLET   ");
        System.out.println("===========================================");
    }
}
