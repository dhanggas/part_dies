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
public class PesananPartDetail {

    private Integer id;
    private PesananPart pesananMasuk;
    private Part part;
    private Integer qty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PesananPart getPesananMasuk() {
        return pesananMasuk;
    }

    public void setPesananMasuk(PesananPart pesananMasuk) {
        this.pesananMasuk = pesananMasuk;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

}
