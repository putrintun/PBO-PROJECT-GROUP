package pbo.lelang;

import java.util.ArrayList;

public class Masyarakat implements User {

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();

    //Masyarakat terdaftar
    public Masyarakat() {
        //0
        this.namaMasyarakat.add("Anto");
        this.alamat.add("Sawojajar");
        this.telp.add("081");

        //1
        this.namaMasyarakat.add("Budi");
        this.alamat.add("Sawojajar");
        this.telp.add("082");
    }

    //Setter
    //@Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
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
        return this.namaMasyarakat.get(id);
    }

    //@Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    //@Override
    public String getTelp(int id) {
        return this.telp.get(id);
    }

    public int getJumlahMasyarakat() {
        return this.namaMasyarakat.size();
    }
}
