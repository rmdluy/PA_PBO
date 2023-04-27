
package com.mycompany.pa_pbo;

public class Toko {
    protected String idToko;
    protected String Nama_Toko;
    protected String Nama_Penjual;

    public Toko(String idToko, String Nama_Toko, String Nama_Penjual) {
        this.idToko = idToko;
        this.Nama_Toko = Nama_Toko;
        this.Nama_Penjual = Nama_Penjual;
    }

    public String getIdToko() {
        return idToko;
    }

    public void setIdToko(String idToko) {
        this.idToko = idToko;
    }

    public String getNama_Toko() {
        return Nama_Toko;
    }

    public void setNama_Toko(String Nama_Toko) {
        this.Nama_Toko = Nama_Toko;
    }

    public String getNama_Penjual() {
        return Nama_Penjual;
    }

    public void setNama_Penjual(String Nama_Penjual) {
        this.Nama_Penjual = Nama_Penjual;
    }
    
}

    
   