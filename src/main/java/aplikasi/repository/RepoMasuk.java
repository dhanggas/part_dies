/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.repository;

import aplikasi.entity.Masuk;
import aplikasi.entity.MasukDetail;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dimmaryanto
 */
public interface RepoMasuk extends BaseRepository<Masuk, Integer> {

    public Masuk save(Masuk b, List<MasukDetail> listPembelian) throws SQLException;

    public List<MasukDetail> findPembelianDetailByPembelianId(Integer idPembelian) throws SQLException;

    public List<MasukDetail> findPembelianDetailBetweenTanggal(Date awal, Date akhir) throws SQLException;

    public List<MasukDetail> findPembelianDetailByTanggalLowerThen(Date tanggal) throws SQLException;

}
