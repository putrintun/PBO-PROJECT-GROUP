package pbo.lelang;

import java.util.ArrayList;
import java.util.Scanner;

public class Lelang {

    Scanner in = new Scanner(System.in);

    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    private ArrayList<Integer> laba = new ArrayList<Integer>();

    //Setter
    public void setIdPenawar(int idPenawar) {
        this.idPenawar.add(idPenawar);
    }

    public void setIdBarang(int idBarang) {
        this.idBarang.add(idBarang);
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    //Getter
    public int getIdPenawar(int id) {
        return this.idPenawar.get(id);
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getHargaTawar(int id) {
        return this.hargaTawar.get(id);
    }

    public void list(Masyarakat masyarakat) {
        System.out.println("Daftar Masyarakat Terdaftar : ");
        System.out.println("ID\t|Nama\t|Alamat\t\t|Telp");
        for (int i = 0; i < masyarakat.getJumlahMasyarakat(); i++) {
            System.out.println(i + "\t|" + masyarakat.getNama(i) + "\t|"
                    + masyarakat.getAlamat(i) + "\t|"
                    + masyarakat.getTelp(i));
        }
        System.out.println("");
    }

    public void list(Petugas petugas) {
        System.out.println("Daftar Masyarakat Terdaftar : ");
        System.out.println("ID\t|Nama\t\t|Alamat\t\t|Telp");
        for (int i = 0; i < petugas.getJumlahPetugas(); i++) {
            System.out.println(i + "\t|" + petugas.getNama(i) + "\t\t|"
                    + petugas.getAlamat(i) + "\t\t|"
                    + petugas.getTelp(i));
        }
        System.out.println("");
    }

    public void list(Barang barang, Masyarakat masyarakat) {
        System.out.println("Daftar Barang : ");
        System.out.println("ID\t|Barang\t|Nama Pemilik\t|Harga Awal\t|Status");
        for (int i = 0; i < barang.getJumlahBarang(); i++) {
            System.out.println(i + "\t|" + barang.getNamaBarang(i) + "\t|" + masyarakat.getNama(barang.getIdMasyarakat(i)) + "\t\t|"
                    + barang.getHargaAwal(i) + "\t|"
                    + barang.getStatus(i));
        }
        System.out.println("");
    }

    //Tambah barang lelang
    public void lelang(Masyarakat masyarakat, Barang barang) {
        System.out.println("LELANG BARANG");
        list(masyarakat);
        System.out.print("Input ID Masyarakat\t: ");
        int idMasyarakat = in.nextInt();
        barang.setIdMasyarakat(idMasyarakat);

        System.out.print("Input Nama Barang\t: ");
        Scanner input = new Scanner(System.in);
        String namaBarang = input.nextLine();
        barang.setNamaBarang(namaBarang);

        System.out.print("Input Harga Awal\t: ");
        int hargaAwal = in.nextInt();
        barang.setHargaAwal(hargaAwal);

        barang.setStatus(true);
    }

    public void tawar(Masyarakat masyarakat, Barang barang) {
        System.out.println("TAWAR BARANG");
        list(masyarakat);
        System.out.print("Input ID Masyarakat\t: ");
        int idPenawar = in.nextInt();

        list(barang, masyarakat);
        System.out.print("Input ID Barang\t: ");
        int idBarang = in.nextInt();
        if (barang.getStatus(idBarang) != true) {
            System.out.println("Maaf produk tidak tersedia");
        } else {
            setIdPenawar(idPenawar);
            setIdBarang(idBarang);

            int hargaTawar;
            do {
                System.out.print("Input Harga Tawar\t: ");
                hargaTawar = in.nextInt();
                if (hargaTawar > barang.getHargaAwal(idBarang)) {
                    System.out.println("Anda berhasil menawar barang");
                    barang.editStatus(idBarang, false);
                    setHargaTawar(hargaTawar);
                } else {
                    System.out.println("Tawaran terlalu rendah");
                }
            } while (hargaTawar <= barang.getHargaAwal(idBarang));

            System.out.println("Detail Transaksi Anda : ");
            System.out.println("Pemilik\t\t|Penawar\t|Barang\t\t|Harga Awal\t|Harga Tawar");
            System.out.println(masyarakat.getNama(barang.getIdMasyarakat(idBarang)) + "\t\t|"
                    + masyarakat.getNama(idPenawar) + "\t\t|"
                    + barang.getNamaBarang(idBarang) + "\t\t|"
                    + barang.getHargaAwal(idBarang) + "\t\t|"
                    + hargaTawar + "\n");
        }

    }

    public void laporan(Masyarakat masyarakat, Barang barang) {
        System.out.println("Laporan Transaksi");
        System.out.println("Pemilik\t\t|Penawar\t|Barang\t\t|Harga Awal\t|Harga Tawar\t|Laba");
        for (int i = 0; i < idPenawar.size(); i++) {
            int laba = hargaTawar.get(i) - barang.getHargaAwal(idBarang.get(i));
            System.out.println(masyarakat.getNama(barang.getIdMasyarakat(idBarang.get(i))) + "\t\t|"
                    + masyarakat.getNama(idPenawar.get(i)) + "\t\t|"
                    + barang.getNamaBarang(idBarang.get(i)) + "\t\t|"
                    + barang.getHargaAwal(idBarang.get(i)) + "\t\t|"
                    + hargaTawar.get(i) + "\t\t|"
                    + laba);
        }
    }
}
