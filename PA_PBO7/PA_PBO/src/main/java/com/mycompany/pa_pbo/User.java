
package com.mycompany.pa_pbo;

public abstract class User {
    String nama_user;
    String umur_user;
    String alamat_user;

    public User(String nama_user, String umur_user, String alamat_user) {
        this.nama_user = nama_user;
        this.umur_user = umur_user;
        this.alamat_user = alamat_user;
    }
   

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getUmur_user() {
        return umur_user;
    }

    public void setUmur_user(String umur_user) {
        this.umur_user = umur_user;
    }

    public String getAlamat_user() {
        return alamat_user;
    }

    public void setAlamat_user(String alamat_user) {
        this.alamat_user = alamat_user;
    }

    
    public abstract void isAdded();
    public abstract void display();
}
