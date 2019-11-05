/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.entity;

/**
 *
 * @author dimmaryanto
 */
public class Part {

    private Integer id;
    private String nama_part;
    private String spek;
    private Integer qty;
    private String satuan;
    private Integer min_stok;
    private Boolean prioritas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNama_part() {
        return nama_part;
    }

    public void setNama_part(String nama_part) {
        this.nama_part = nama_part;
    }

    public String getSpek() {
        return spek;
    }

    public void setSpek(String spek) {
        this.spek = spek;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Integer getMin_stok() {
        return min_stok;
    }

    public void setMin_stok(Integer min_stok) {
        this.min_stok = min_stok;
    }


    public Boolean isPrioritas() {
        return prioritas;
    }

    public void setPrioritas(Boolean prioritas) {
        this.prioritas = prioritas;
    }
    
}
