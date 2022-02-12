package pbo.lelang;

import java.util.ArrayList;

public class Petugas extends Masyarakat {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();

    //Petugas terdaftar
    public Petugas() {
        //0
        this.namaPetugas.add("Yanto");
        this.alamat.add("Sawojajar");
        this.telp.add("081");

        //1
        this.namaPetugas.add("Bambang");
        this.alamat.add("Sawojajar");
        this.telp.add("082");
    }

    //Setter
    //@Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    //@Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    //@Override
    public void setTelp(String telp) {
        this.telp.add(telp);
    }

    //Getter
    //@Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    //@Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    //@Override
    public String getTelp(int id) {
        return this.telp.get(id);
    }

    public int getJumlahPetugas() {
        return this.namaPetugas.size();
    }
}
