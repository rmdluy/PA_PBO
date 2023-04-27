package com.mycompany.pa_pbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin extends User implements MenuAdmin{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     ArrayList<ikan> ikan = new ArrayList<ikan>();
     ArrayList<penjual> penjual = new ArrayList<penjual>();
     ArrayList<User> user = new ArrayList<User>();
    
    final String status = "Admin";
    private String username;
    private String password;

   public Admin(String nama_user, String umur_user, String alamat_user, String status, String Username, String Password) {
        super(nama_user, umur_user, alamat_user);
        this.username = username;
        this.password = password;
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
    public void isAdded(){
        System.out.println("ADMIN");
    }

    @Override
    public void display(){
        System.out.println("Nama Admin : " + this.nama_user);
    }
    @Override
    public void createData() throws IOException {
        System.out.println("Tambah Data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukan Nama User :");
                String addnama_user = br.readLine();
                System.out.print("Masukan Umur User :");
                String addumur_user = br.readLine();
                System.out.print("Masukan Alamat User :");
                String addalamat_user = br.readLine();
                System.out.print("Masukan nama Ikan :");
                String addnama_ikan = br.readLine();
                System.out.print("Masukan Jenis Kelamin :");
                String addjeniskelamin = br.readLine();
                System.out.print("Masukan Harga Ikan :");
                int addharga_ikan;
                    try {
                      addharga_ikan = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException e) {
                       System.out.println("Error: " + e.getMessage());
                       return;
                    }                
                ikan iknBaru = new ikan(addnama_user, addumur_user, addalamat_user, addnama_ikan, addjeniskelamin,addharga_ikan,"ikan", "user");
                ikan.add(iknBaru);
                iknBaru.isAdded();
                break;
            case 2:
                System.out.print("Masukan Nama user:");
                String addnama_user1 = br.readLine();
                System.out.print("Masukan Umur User:");
                String addumur_user1 = br.readLine();
                System.out.print("Masukan Alamat User :");
                String addalamat_user1 = br.readLine();
                System.out.print("Masukan Nama Penjual :");
                String addNama_Penjual = br.readLine();
                System.out.print("Masukan Umur Penjual :");
                String addUmur_Penjual= br.readLine();
                System.out.println("Masukan Alamat_Penjual :");
                String addAlamat_Penjual= br.readLine();
                penjual pjlBaru = new penjual(addnama_user1, addumur_user1, addalamat_user1, addNama_Penjual, addUmur_Penjual, addAlamat_Penjual, "penjual", "user", "user");
                penjual.add(pjlBaru);
                pjlBaru.isAdded();
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
    @Override
    public void readData() throws IOException {
        System.out.println("Tampilkan Data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.println(" Data Ikan");
                for (int i = 0; i < ikan.size(); i++){
                    System.out.println("Ikan Yang ke-" + (i+1));
                    ikan.get(i).display();
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Data Penjual");
                for (int i = 0; i < penjual.size(); i++) {
                    System.out.println("Penjual Yang ke-" + (i+1));
                    penjual.get(i).display();
                    System.out.println("\n");
                }
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
    @Override
    public void updateData() throws IOException {
        System.out.println("Update Data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Index Ikan: ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= ikan.size() || idx > 0) {
                    System.out.print("Masukan Nama User :");
                    String addnama_user = br.readLine();
                    System.out.print("Masukan Umur User :");
                    String addumur_user = br.readLine();
                    System.out.print("Masukan Alamat User :");
                    String addalamat_user = br.readLine();
                    System.out.print("Masukan Nama Ikan :");
                    String addnama_ikan = br.readLine();
                    System.out.print("Masukan Jenis Kelamin :");
                    String addjeniskelamin= br.readLine();
                    System.out.print("Masukan Harga Ikan:");
                    int addharga_ikan = Integer.parseInt(br.readLine());
                    String addPass = br.readLine();
                    ikan.get(idx-1).setNama_user(addnama_user);
                    ikan.get(idx-1).setUmur_user(addumur_user);
                    ikan.get(idx-1).setAlamat_user(addalamat_user);
                    ikan.get(idx-1).setNama_ikan(addnama_ikan);
                    ikan.get(idx-1).setJeniskelamin(addjeniskelamin);
                    ikan.get(idx-1).setHarga_ikan(addharga_ikan);                 
                    System.out.println("Data berhasil DiUbah");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 2:
                System.out.print("Masukkan index Penjual: ");
                int idx1 = Integer.parseInt(br.readLine());

                if(idx1 <= penjual.size() || idx1 > 0) {
                    System.out.print("Masukan Nama User :");
                    String addnama_user = br.readLine();
                    System.out.print("Masukan Umur User :");
                    String addumur_user = br.readLine();
                    System.out.print("Masukan Alamat User :");
                    String addalamat_user = br.readLine();
                    System.out.print("Masukan Nama Penjual:");
                    String addNama_Penjual = br.readLine();
                    System.out.print("Masukan Umur Penjual :");
                    String addUmur_Penjual = br.readLine();
                    System.out.println("Masukan Alamat Penjual :");
                    String addAlamat_Penjual= br.readLine();
                    penjual.get(idx1-1).setNama_user(addnama_user);
                    penjual.get(idx1-1).setUmur_user(addumur_user);
                    penjual.get(idx1-1).setAlamat_user(addalamat_user);
                    penjual.get(idx1-1).setNama_Penjual(addNama_Penjual);
                    penjual.get(idx1-1).setUmur_Penjual(addUmur_Penjual);
                    System.out.println("Data berhasil Diubah");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            default:
                break;
        }
    }
    @Override
    public void deleteData() throws IOException {
        System.out.println("Hapus data");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan index Ikan: ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= ikan.size() || idx > 0) {
                    ikan.remove(idx - 1);
                    
                    System.out.println("Data berhasil dihapus");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 2:
                System.out.print("Masukkan index Penjual: ");
                int idx1 = Integer.parseInt(br.readLine());

                if(idx1 <= penjual.size() || idx1 > 0) {
                    penjual.remove(idx1 - 1);
                    
                    System.out.println("Data berhasil dihapus");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            default:
                break;
        }
    }
    
    public void Logout() {
            System.out.println ("Berhasil Logout");
            return;
    }
    @Override
    public void menu() throws IOException {
        while (true) {
            System.out.println("Menu Admin");
            System.out.println("1. Buat");
            System.out.println("2. Lihat");
            System.out.println("3. Update");
            System.out.println("4. Hapus");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Masukan Pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    createData(); 
                    break;
                case 2:
                    readData();  
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();  
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