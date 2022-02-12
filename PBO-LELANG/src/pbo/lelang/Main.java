package pbo.lelang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Lelang lelang = new Lelang();

        int pilih;

        do {
            System.out.println("MENU LELANG");
            System.out.println(" 1. Lelang Barang");
            System.out.println(" 2. Tawar Barang");
            System.out.println(" 3. List Barang");
            System.out.println(" 4. List Masyarakat");
            System.out.println(" 5. Laporan Transaksi");
            System.out.println("99. Keluar");
            System.out.print("Input pilihan : ");
            pilih = in.nextInt();

            if (pilih == 1) {
                lelang.lelang(masyarakat, barang);
            } else if (pilih == 2) {
                lelang.tawar(masyarakat, barang);
            } else if (pilih == 3) {
                lelang.list(barang, masyarakat);
            } else if (pilih == 4) {
                lelang.list(masyarakat);
            } else if (pilih == 5) {
                lelang.laporan(masyarakat, barang);
            }
        } while (pilih != 99);
    }
}
