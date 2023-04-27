package com.mycompany.pa_pbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class User1 extends User implements MenuUser{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ikan> ikan = new ArrayList<ikan>();
    static ArrayList<penjual> penjual = new ArrayList<penjual>();
    static ArrayList<User> user = new ArrayList<User>();
    
    final String status = "User";
    private String username;
    private String password;

    public User1(String nama_user, String umur_user, String alamat_user, String status, String Username, String Password) {
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
        System.out.println("User");
    }

    @Override
    public void display(){
        System.out.println("Nama User : " + this.nama_user);
    }
 
    public void LihatData() throws IOException {
        System.out.println("Lihat Data Apa !!!");
        System.out.println("1. Ikan");
        System.out.println("2. Penjual");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.println(" Data Ikan");
                for (int i = 0; i < Main.admin.ikan.size(); i++){
                    System.out.println("Ikan Yang ke-" + (i+1));
                    Main.admin.ikan.get(i).display();
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Data Penjual");
                for (int i = 0; i < Main.admin.penjual.size(); i++) {
                    System.out.println("Penjual Yang ke-" + (i+1));
                    Main.admin.penjual.get(i).display();
                    System.out.println("\n");
                }
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
     public void Logout() {
            System.out.println ("Berhasil Logout");
            return;
    }
    public void menu() throws IOException {
        while (true) {
            System.out.println("Menu User");
            System.out.println("1. Lihat");
            System.out.println("2. Logout");
            System.out.println("3. Exit");
            System.out.print("Masukan Pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    LihatData();  
                    break;
                case 2:
                    return;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }
}