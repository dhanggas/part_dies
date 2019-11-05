/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.repository;

import aplikasi.entity.PesananPart;
import aplikasi.entity.PesananPartDetail;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author dimmaryanto
 */
public interface RepoPesananPart extends BaseRepository<PesananPart, Integer> {

    public List<PesananPartDetail> findPesananPembelianDetailByPesananKode(String kode) throws SQLException;
    
    public PesananPart save(PesananPart pesan, List<PesananPartDetail> barangPesan)throws SQLException;

}
