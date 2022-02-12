package pbo.perustakaan.fix;

import java.util.ArrayList;

public class Petugas implements User {

    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();

    public Petugas() {
        //Tambah Petugas (0)
        this.nama.add("Budi");
        this.alamat.add("Sawojajar");
        this.telp.add("082");
    }

    public void listPetugas() {
        System.out.println("Petugas Terdaftar : ");
        System.out.println("ID\t|Nama Petugas\t|Alamat\t\t|Telp");
        for (int i = 0; i < this.nama.size(); i++) {
            System.out.println(i + "\t|" + this.nama.get(i) + "\t\t|"
                    + this.alamat.get(i) + "\t|"
                    + this.telp.get(i));
        }
        System.out.println("");
    }

    //Setter
    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.nama.add(alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telp.add(telp);
    }

    //Getter
    @Override
    public String getNama(int id) {
        return this.nama.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telp.get(id);
    }
}
