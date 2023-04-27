
package com.mycompany.pa_pbo;

import java.io.IOException;

public class ikan extends User implements Level1{
    private String nama_ikan;
    private String jeniskelamin;
    private int harga_ikan;
    public final String status = "Ikan";

    public ikan(String nama_user, String umur_user, String alamat_user, String nama_ikan, String jeniskelamin,int harga_ikan, String status, String user) {
        super(nama_user, umur_user, alamat_user);
        this.nama_ikan = nama_ikan;
        this.jeniskelamin = jeniskelamin;
        this.harga_ikan = harga_ikan;
    }

   

    public String getNama_ikan() {
        return nama_ikan;
    }

    public void setNama_ikan(String nama_ikan) {
        this.nama_ikan = nama_ikan;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public int getHarga_ikan() {
        return harga_ikan;
    }

    public void setHarga_ikan(int harga_ikan) {
        this.harga_ikan = harga_ikan;
    }


    @Override
    public void isAdded() {
        System.out.println("Ikan Baru dengan Jenis " + this. nama_ikan);
        System.out.println("Jenis Kelamin " + this.jeniskelamin);
        System.out.println("Dengan Harga " + this.harga_ikan);
        System.out.println("Berhasil ditambahkan");
    }

    @Override
    public void display() { 
        System.out.println("Nama   : " + this.nama_user);
        System.out.println("Umur  : " + this.umur_user);
        System.out.println("Alamat  : " + this.alamat_user);
        System.out.println("Nama Ikan : " + this.nama_ikan);
        System.out.println("Jenis Kelamin Ikan : " + this.jeniskelamin);
        System.out.println("Harga Ikan : " + this.harga_ikan);
        System.out.println(" Status Ikan : " + this.status);
        System.out.println("\n");
    }
  
    
    @Override
    public void menu() throws IOException {
    }
}
