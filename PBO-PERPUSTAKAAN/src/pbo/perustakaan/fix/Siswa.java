package pbo.perustakaan.fix;

import java.util.ArrayList;

public class Siswa implements User {

    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa() {
        this.namaSiswa.add("Syahra");
        this.alamat.add("Udanawu");
        this.telp.add("0815227718");
        this.status.add(true);

        this.namaSiswa.add("Rara");
        this.alamat.add("Blitar");
        this.telp.add("0815227718");
        this.status.add(true);

        this.namaSiswa.add("Nina");
        this.alamat.add("Malang");
        this.telp.add("0815227718");
        this.status.add(true);
    }
    
    public void listSiswa() {
        System.out.println("Siswa terdaftar : ");
        System.out.println("ID\t|Nama Siswa\t|Alamat\t\t|Telp\t|Status");
        for (int i = 0; i < this.namaSiswa.size(); i++) {
            System.out.println(i + "\t|" + this.namaSiswa.get(i) + "\t\t|"
                    + this.alamat.get(i) + "\t|"
                    + this.telp.get(i) + "\t|"
                    + this.status.get(i));
        }
        System.out.println("");
    }

    public int getJmlSiswa() {
        return this.namaSiswa.size();
    }

    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telp.add(telepon);
    }

    public void setStatus(Boolean status) {
        this.status.add(status);
    }

    public void updateStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telp.get(idSiswa);
    }

    public Boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }
}
