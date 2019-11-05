/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.entity.other;

import aplikasi.entity.Part;

/**
 *
 * @author dimmaryanto
 */
public class SirkulasiBarang {

    private Part barang;
    private Integer stokBarangAwal;
    private Integer stokBarangKeluar;
    private Integer stokBarangMasuk;
    private Integer stokBarangSekarang;

    public Integer getStokBarangAwal() {
        return stokBarangAwal;
    }

    public void setStokBarangAwal(Integer stokBarangAwal) {
        this.stokBarangAwal = stokBarangAwal;
    }

    public Part getBarang() {
        return barang;
    }

    public void setBarang(Part barang) {
        this.barang = barang;
    }

    public Integer getStokBarangKeluar() {
        return stokBarangKeluar;
    }

    public void setStokBarangKeluar(Integer stokBarangKeluar) {
        this.stokBarangKeluar = stokBarangKeluar;
    }

    public Integer getStokBarangMasuk() {
        return stokBarangMasuk;
    }

    public void setStokBarangMasuk(Integer stokBarangMasuk) {
        this.stokBarangMasuk = stokBarangMasuk;
    }

    public Integer getStokBarangSekarang() {
        return stokBarangSekarang;
    }

    public void setStokBarangSekarang(Integer stokBarangSekarang) {
        this.stokBarangSekarang = stokBarangSekarang;
    }

}
