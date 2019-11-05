/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.entity;

import java.sql.Date;

/**
 *
 * @author dhiskar
 */
public class Dies {
    private String kode;
    private String nama;
    private Kategori kategoriAset;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kategori getKategoriAset() {
        return kategoriAset;
    }

    public void setKategoriAset(Kategori kategoriAset) {
        this.kategoriAset = kategoriAset;
    }

    
}
