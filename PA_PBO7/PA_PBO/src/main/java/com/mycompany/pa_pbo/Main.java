
package com.mycompany.pa_pbo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        static Admin admin = new Admin("Rezky", "19", "Handil", "Admin", "admin", "admin");
        static penjual penjual = new penjual("Rezky", "19", "Handil", "Ilham", "20", "PPU", "penjual", "user", "user");
        static User1 user = new User1( "Pengguna", "12", "alat", " user",  "rezky",  "123");
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        while(true) {           
            System.out.println("Halo Bang Dan Mba");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Masukan pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                System.out.print("Masukan Username :");
                String username = br.readLine();
                System.out.print("Masukan Password :");
                String password = br.readLine();
              
                if(username.equals("admin") && password.equals("admin")){
                    System.out.println("Selamat datang Admin : " + admin.getNama_user());
                    admin.menu();
                    continue;
                }
                if(username.equals("user") && password.equals("user")){
                    System.out.println("Selamat datang Penjual : " + penjual.getNama_Penjual());
                    penjual.Menu();
                    continue;
                }
                if(username.equals("rezky") && password.equals("123")){
                    System.out.println("Selamat datang user : " + user.getNama_user());
                    user.menu();
                    continue;
                }
            } else if (pilihan == 2){
                System.out.println("Terima Kasih Telah Menggunakan Program Dari Kami");
                System.exit(1);
                break;
            } else {
                System.out.println("Pilihan Tidak Tersedia");
                continue;
            }
        }
    }
}