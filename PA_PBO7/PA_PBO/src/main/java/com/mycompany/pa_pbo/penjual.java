
package com.mycompany.pa_pbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class penjual extends User implements MenuPenjual{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Toko> Toko = new ArrayList<Toko>();

    String Nama_Penjual;
    String Umur_Penjual;
    String Alamat_Penjual;
    
    final String status = "penjual";
    private String username;
    private String password;

    public penjual(String nama_user, String umur_user, String alamat_user, String Nama_Penjual, String Umur_Penjual, String Alamat_Penjual, String status, String Username, String Password) {
        super(nama_user, umur_user, alamat_user);
        this.Nama_Penjual = Nama_Penjual;
        this.Umur_Penjual = Umur_Penjual;
        this.Alamat_Penjual = Alamat_Penjual;
        this.username = username;
        this.password = password;
    }

    public String getNama_Penjual() {
        return Nama_Penjual;
    }

    public void setNama_Penjual(String Nama_Penjual) {
        this.Nama_Penjual = Nama_Penjual;
    }

    public String getUmur_Penjual() {
        return Umur_Penjual;
    }

    public void setUmur_Penjual(String Umur_Penjual) {
        this.Umur_Penjual = Umur_Penjual;
    }

    public String getAlamat_Penjual() {
        return Alamat_Penjual;
    }

    public void setAlamat_Penjual(String Alamat_Penjual) {
        this.Alamat_Penjual = Alamat_Penjual;
    }
    
    public String getStatus() {
        return status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

    @Override
    public void isAdded() {
        System.out.println("Penjual baru dengan nama " + this.Nama_Penjual);
        System.out.println("Umur " + this.Umur_Penjual);
        System.out.println("Alamat " + this.Alamat_Penjual);
        System.out.println("Berhasil ditambahkan");
    }
    
    @Override
    public void display(){
        System.out.println("Nama: " + this.nama_user);
        System.out.println("Umur: " + this.umur_user);
        System.out.println("Alamat: " + this.alamat_user);
        System.out.println("Nama Penjual " + this.Nama_Penjual);
        System.out.println("Umur Penjual " + this.Umur_Penjual);
        System.out.println("Alamat Penjual" + this.Alamat_Penjual);
        System.out.println("Status: " + this.status);
    }

    @Override
    public void BuatToko() throws IOException {
        System.out.println("Masukan ID Toko: ");
        String idToko = br.readLine();
        System.out.println("Masukan Nama Toko: ");
        String Nama_Toko = br.readLine();
        String NamaPenjual = this.Nama_Penjual;
        Toko addToko = new Toko(idToko, Nama_Toko, Nama_Penjual);
        Toko.add(addToko);
    }

    @Override
    public void TampilToko() throws IOException {
        System.out.println("Daftar Toko");
        for (int i = 0; i < Toko.size(); i++) {
            System.out.println("Id Toko: " + Toko.get(i).getIdToko());
            System.out.println("Nama Toko " + Toko.get(i).getNama_Toko());
            System.out.println("Nama Penjual: " + Toko.get(i).getNama_Penjual());
        }
    }

    @Override
    public void EditToko() throws IOException {
        System.out.println("Input Index Toko :");
        int index = Integer.parseInt(br.readLine());

        if(index <= Toko.size() || index > 0){
            System.out.println("Masukan Id Toko Terbaru :");
            String idToko = br.readLine();
            System.out.println("Masukan Nama Toko terbaru : ");
            String Nama_Toko= br.readLine();
            String NamaPenjual = this.Nama_Penjual;
            Toko EditToko= new Toko(idToko, Nama_Toko, Nama_Penjual);
            Toko.set(index, EditToko);
            System.out.println("Toko Berhasil diubah");
        } else {
            System.out.println("Toko tidak Ditemukan");
        }
    }

    @Override
    public void HapusToko() throws IOException {
        System.out.println("Inputkan Index Toko :");
        int index = Integer.parseInt(br.readLine());

        if(index <= Toko.size() || index > 0){
            Toko.remove(index);
            System.out.println("Toko Berhasil Dihapus");
        } else {
            System.out.println("Toko tidak ada");
        }
    }

     public void Logout() {
            System.out.println ("Berhasil Logout");
            return;
    }
    @Override
    public void Menu() throws IOException {
        while (true) {
            System.out.println(" Menu Penjual ");
            System.out.println("1. Buat Toko");
            System.out.println("2. Tampilkan Toko");
            System.out.println("3. Edit Toko");
            System.out.println("4. Hapus Toko");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Masukan Pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    BuatToko(); 
                    break;
                case 2:
                    TampilToko();
                    break;
                case 3:
                    EditToko();
                    break;
                case 4:
                    HapusToko();  
                    break;
                case 5:
                    return;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }
}
