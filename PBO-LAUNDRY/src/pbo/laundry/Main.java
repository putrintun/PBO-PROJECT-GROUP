package pbo.laundry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        JenisLaundry laundry = new JenisLaundry();
        Laporan laporan = new Laporan();
        Client client = new Client();
        Transaksi transaksi = new Transaksi();

        int pilih;

        do {
            System.out.println("MENU LAUNDRY");
            System.out.println(" 1. Jenis Laundry");
            System.out.println(" 2. Client");
            System.out.println(" 3. Transaksi");
            System.out.println("99. Keluar");
            System.out.print("Input pilihan : ");
            pilih = in.nextInt();

            if (pilih == 1) {
                laporan.laporan(laundry);
            } else if (pilih == 2) {
                laporan.laporan(client);
            } else if (pilih == 3) {
                transaksi.prosesTransaksi(client, transaksi, laundry);
            }

        } while (pilih != 99);
    }
}
