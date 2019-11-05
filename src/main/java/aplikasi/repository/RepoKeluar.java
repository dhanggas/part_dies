/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.repository;

import aplikasi.entity.Keluar;
import aplikasi.entity.KeluarDetail;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dimmaryanto
 */
public interface RepoKeluar extends BaseRepository<Keluar, Integer
        > {

    public Keluar save(Keluar p, List<KeluarDetail> barangJual) throws SQLException;
    
    public List<Keluar> findPenjualanByTglBetween(Date awal, Date akhir) throws SQLException;

    public List<KeluarDetail> findPenjualanDetailByPenjualanKode(String kode) throws SQLException;

    public List<KeluarDetail> findPenjualanDetailBetweenTanggal(Date tglAwal, Date tglAkhir) throws SQLException;
    
    public List<KeluarDetail> findPenjualanDetailByTanggalLowerThen(Date tgl) throws SQLException;

    public Keluar findByPelangganOrderByTanggalAscLastTransaction(String kode) throws SQLException;
    
    public List<KeluarDetail> findPenjualanDetailByPelangganKode(String kode) throws SQLException;

}
