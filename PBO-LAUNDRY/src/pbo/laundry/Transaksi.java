package pbo.laundry;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {

    private ArrayList<Integer> idLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public Transaksi() {
        this.idClient.add(0);
        this.idLaundry.add(0);
        this.banyak.add(2);
        this.idClient.add(0);
        this.idLaundry.add(1);
        this.banyak.add(3);
        this.idClient.add(1);
        this.idLaundry.add(0);
        this.banyak.add(1);
        this.idClient.add(1);
        this.idLaundry.add(2);
        this.banyak.add(2);
    }

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Silahkan Laundry");
        System.out.print("Masukkan ID Client : ");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang " + client.getNama(idClient));
        ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan kode jenis laundry : ");
            temp = myObj.nextInt();
            if (temp != 99) {
                idJenisLaundry.add(temp);
                System.out.print("sebanyak(kg) : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println("Transaksi belanja " + client.getNama(idClient) + " sebagai berikut");
        System.out.println("Nama Barang \t \tBanyak(kg) \tHarga \tJumlah \t");

        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getJenisLaundry(idJenisLaundry.get(j)) + "\t" + banyak.get(j) + "\t" + "\t" + jenisLaundry.getHarga(idJenisLaundry.get(j)) + "/kg" + "\t" + jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j), banyak.get(j));
        }

        System.out.println("Total Laundry : " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
        System.out.println("Sisa Saldo " + client.getNama(idClient) + " = " + client.getSaldo(idClient));
    }

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
        jenisLaundry.editDurasi(idJenisLaundry, jenisLaundry.getDurasi(idJenisLaundry));
    }

    public int getIdJenisLaundry(int id) {
        return this.idLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdClient(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }

}
