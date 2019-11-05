/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.service;

import aplikasi.entity.Part;
import aplikasi.entity.Operator;
import aplikasi.entity.Keluar;
import aplikasi.entity.KeluarDetail;
import aplikasi.repository.RepoKeluar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author dimmaryanto
 */
public class ServiceKeluar implements RepoKeluar {

    private final DataSource ds;

    public ServiceKeluar(DataSource ds) {
        this.ds = ds;
    }

//    @Override
//    public Keluar save(Keluar value) throws SQLException {
//        String sql = "INSERT INTO tb_keluar_part (id_kelaur, tgl, id_operator, ket) VALUES (?,?,?,?)";
//        Connection connect = ds.getConnection();
//
//        PreparedStatement ps = connect.prepareStatement(sql);
//        ps.setInt(1, value.getId());
//        ps.setDate(2, value.getTgl());
//        ps.setInt(3, value.getOperator().getId());
//        ps.setString(4, value.getKet());
//        ps.executeUpdate();
//
//        ps.close();
//        connect.close();
//        return value;
//    }
//
//    @Override
//    public Keluar update(Keluar value) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Keluar> findAll() throws SQLException {
//        String sql = "SELECT \n"
//                + "    j.id_keluar ,\n"
//                + "    j.tgl ,\n"
//                + "    p.id_operator ,\n"
//                + "    p.nama \n"
//                + "FROM tb_keluar_part j JOIN tb_operator p ON (j.id_operator = p.id_operator)";
//        Connection connect = ds.getConnection();
//        List<Keluar> list = new ArrayList<>();
//        PreparedStatement ps = connect.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            Keluar j = new Keluar();
//            j.setId(rs.getInt("id_keluar"));
//            j.setTgl(rs.getDate("tgl"));
//
//            Operator p = new Operator();
//            p.setId(rs.getInt("id_operator"));
//            p.setNama(rs.getString("nama"));
//            list.add(j);
//        }
//
//        ps.close();
//        rs.close();
//        connect.close();
//        return list;
//    }
//
//    @Override
//    public Keluar findOne(Integer id) throws SQLException {
//        String sql = "SELECT \n"
//                + "    j.id_keluar,\n"
//                + "    j.id_sparepart,\n"
//                + "    j.ket, \n"
//                + "    p.id_operator ,\n"
//                + "    p.nama \n"
//                + "FROM tb_keluar_part j JOIN tb_operator p ON (j.id_operator = p.id_operator)\n"
//                + "WHERE j.id_keluar = ?";
//        Connection connect = ds.getConnection();
//        PreparedStatement ps = connect.prepareStatement(sql);
//        ps.setInt(1, id);
//        ResultSet rs = ps.executeQuery();
//        Keluar j = null;
//        if (rs.next()) {
//            j = new Keluar();
//            j.setId(rs.getInt("id_keluar"));
//            j.setTgl(rs.getDate("tgl"));
//
//            Operator p = new Operator();
//            p.setId(rs.getInt("id_operator"));
//            p.setNama(rs.getString("nama"));
//            j.setOperator(p);
//        }
//
//        ps.close();
//        rs.close();
//        connect.close();
//        return j;
//    }
//
//
//
//    @Override
//    public Keluar save(Keluar p, List<KeluarDetail> barangJual) throws SQLException {
////        save(p);
////
////        String sql = "INSERT INTO tb_keluar_part_detail (id_keluar, kode_barang, harga, jumlah, diskon) VALUES (?,?,?,?,?)";
////        Connection connect = ds.getConnection();
////        PreparedStatement ps = connect.prepareStatement(sql);
////        for (KeluarDetail pd : barangJual) {
////            ps.setString(1, pd.getPenjualan().getKode());
////            ps.setString(2, pd.getBarang().getKode());
////            ps.setDouble(3, pd.getHarga());
////            ps.setInt(4, pd.getJumlah());
////            ps.setDouble(5, pd.getDiskon());
////            ps.addBatch();
////        }
////
////        ps.executeBatch();
////        ps.close();
////
////        sql = "UPDATE barang SET jumlah = ? WHERE kode = ?";
////        ps = connect.prepareStatement(sql);
////        for (KeluarDetail pd : barangJual) {
////            Part brg = pd.getBarang();
////            Integer stokSekarang = brg.getJumlah() - pd.getJumlah();
////            ps.setInt(1, stokSekarang);
////            ps.setString(2, brg.getKode());
////            ps.addBatch();
////        }
////        ps.executeBatch();
////        ps.close();
////        connect.close();
//        return null;
//    }
//
//    @Override
//    public List<KeluarDetail> findPenjualanDetailByPenjualanKode(String kode) throws SQLException {
////        String sql = "SELECT \n"
////                + "    j.kode as id_keluar,\n"
////                + "    j.tgl as tgl,\n"
////                + "    p.kode as id_operator,\n"
////                + "    p.nama as nama,\n"
////                + "    p.alamat as alamat_pelanggan,\n"
////                + "    p.notlp as tlp_pelanggan,\n"
////                + "    p.agen as pelanggan_agen,\n"
////                + "    jd.id as id_keluar_detail,\n"
////                + "    jd.harga as harga_penjualan,\n"
////                + "    jd.jumlah as jumlah_penjualan,\n"
////                + "    jd.diskon as diskon_penjualan,\n"
////                + "    brg.kode as kode_barang,\n"
////                + "    brg.nama as nama_barang,\n"
////                + "    brg.harga_jual as harga_jual_barang,\n"
////                + "    brg.harga_beli as harga_beli_barang,\n"
////                + "    brg.jumlah as stok_barang,\n"
////                + "    brg.paket as barang_paketan,\n"
////                + "    kbrg.id as id_kategori_barang,\n"
////                + "    kbrg.kode as kode_kategori_barang,\n"
////                + "    kbrg.nama as nama_kategori_barang\n"
////                + "FROM penjualan j JOIN pelanggan p ON (j.id_operator = p.kode)\n"
////                + "    JOIN tb_keluar_part_detail jd ON (j.kode = jd.id_keluar)\n"
////                + "    JOIN barang brg ON (brg.kode = jd.kode_barang)\n"
////                + "    JOIN kategori_brg kbrg ON (kbrg.id = brg.id_kategori)\n"
////                + "WHERE j.kode = ?";
//        List<KeluarDetail> list = new ArrayList<>();
////        Connection connect = ds.getConnection();
////        PreparedStatement ps = connect.prepareStatement(sql);
////        ps.setString(1, kode);
////        ResultSet rs = ps.executeQuery();
////        while (rs.next()) {
////            Keluar j = new Keluar();
////            j.setId(rs.getString("id_keluar"));
////            j.setTgl(rs.getDate("tgl"));
////
////            Operator p = new Operator();
////            p.setId(rs.getString("id_operator"));
////            p.setNama(rs.getString("nama"));
////            p.setAlamat(rs.getString("alamat_pelanggan"));
////            p.setTlp(rs.getString("tlp_pelanggan"));
////            p.setAgen(rs.getBoolean("pelanggan_agen"));
////            j.setOperator(p);
////
////            Part brg = new Part();
////            brg.setId(rs.getString("kode_barang"));
////            brg.setNama(rs.getString("nama_barang"));
////            brg.setHargaBeli(rs.getDouble("harga_beli_barang"));
////            brg.setHargaJual(rs.getDouble("harga_jual_barang"));
////            brg.setJumlah(rs.getInt("stok_barang"));
////            brg.setPaket(rs.getBoolean("barang_paketan"));
////
////            KategoriBarang kb = new KategoriBarang();
////            kb.setId(rs.getInt("id_kategori_barang"));
////            kb.setId(rs.getString("kode_kategori_barang"));
////            kb.setNama(rs.getString("nama_kategori_barang"));
////
////            brg.setKategori(kb);
////
////            KeluarDetail jd = new KeluarDetail();
////            jd.setId(rs.getInt("id_keluar_detail"));
////            jd.setPenjualan(j);
////            jd.setBarang(brg);
////            jd.setHarga(rs.getDouble("harga_penjualan"));
////            jd.setJumlah(rs.getInt("jumlah_penjualan"));
////            jd.setDiskon(rs.getDouble("diskon_penjualan"));
////            list.add(jd);
////        }
////
////        ps.close();
////        rs.close();
////        connect.close();
//        return list;
//    }
//
//    @Override
//    public List<KeluarDetail> findPenjualanDetailBetweenTanggal(Date tglAwal, Date tglAkhir) throws SQLException {
////        String sql = "SELECT \n"
////                + "    j.kode as id_keluar,\n"
////                + "    j.tgl as tgl,\n"
////                + "    p.kode as id_operator,\n"
////                + "    p.nama as nama,\n"
////                + "    p.alamat as alamat_pelanggan,\n"
////                + "    p.notlp as tlp_pelanggan,\n"
////                + "    p.agen as pelanggan_agen,\n"
////                + "    jd.id as id_keluar_detail,\n"
////                + "    jd.harga as harga_penjualan,\n"
////                + "    jd.jumlah as jumlah_penjualan,\n"
////                + "    jd.diskon as diskon_penjualan,\n"
////                + "    brg.kode as kode_barang,\n"
////                + "    brg.nama as nama_barang,\n"
////                + "    brg.harga_jual as harga_jual_barang,\n"
////                + "    brg.harga_beli as harga_beli_barang,\n"
////                + "    brg.jumlah as stok_barang,\n"
////                + "    brg.paket as barang_paketan,\n"
////                + "    kbrg.id as id_kategori_barang,\n"
////                + "    kbrg.kode as kode_kategori_barang,\n"
////                + "    kbrg.nama as nama_kategori_barang\n"
////                + "FROM penjualan j JOIN pelanggan p ON (j.id_operator = p.kode)\n"
////                + "    JOIN tb_keluar_part_detail jd ON (j.kode = jd.id_keluar)\n"
////                + "    JOIN barang brg ON (brg.kode = jd.kode_barang)\n"
////                + "    JOIN kategori_brg kbrg ON (kbrg.id = brg.id_kategori)\n"
////                + "WHERE j.tgl between ? AND ?";
//        List<KeluarDetail> list = new ArrayList<>();
////        Connection connect = ds.getConnection();
////        PreparedStatement ps = connect.prepareStatement(sql);
////        ps.setDate(1, tglAwal);
////        ps.setDate(2, tglAkhir);
////        ResultSet rs = ps.executeQuery();
////        while (rs.next()) {
////            Keluar j = new Keluar();
////            j.setId(rs.getString("id_keluar"));
////            j.setTgl(rs.getDate("tgl"));
////
////            Operator p = new Operator();
////            p.setId(rs.getString("id_operator"));
////            p.setNama(rs.getString("nama"));
////            p.setAlamat(rs.getString("alamat_pelanggan"));
////            p.setTlp(rs.getString("tlp_pelanggan"));
////            p.setAgen(rs.getBoolean("pelanggan_agen"));
////            j.setOperator(p);
////
////            Part brg = new Part();
////            brg.setId(rs.getString("kode_barang"));
////            brg.setNama(rs.getString("nama_barang"));
////            brg.setHargaBeli(rs.getDouble("harga_beli_barang"));
////            brg.setHargaJual(rs.getDouble("harga_jual_barang"));
////            brg.setJumlah(rs.getInt("stok_barang"));
////            brg.setPaket(rs.getBoolean("barang_paketan"));
////
////            KategoriBarang kb = new KategoriBarang();
////            kb.setId(rs.getInt("id_kategori_barang"));
////            kb.setId(rs.getString("kode_kategori_barang"));
////            kb.setNama(rs.getString("nama_kategori_barang"));
////
////            brg.setKategori(kb);
////
////            KeluarDetail jd = new KeluarDetail();
////            jd.setId(rs.getInt("id_keluar_detail"));
////            jd.setPenjualan(j);
////            jd.setBarang(brg);
////            jd.setHarga(rs.getDouble("harga_penjualan"));
////            jd.setJumlah(rs.getInt("jumlah_penjualan"));
////            jd.setDiskon(rs.getDouble("diskon_penjualan"));
////            list.add(jd);
////        }
////        ps.close();
////        rs.close();
////        connect.close();
//        return list;
//    }
//
//    public Keluar findByOperatorOrderByTanggalAscLastTransaction(String kode) throws SQLException {
////        String sql = "SELECT \n"
////                + "    j.kode as id_keluar,\n"
////                + "    j.tgl as tgl,\n"
////                + "    p.kode as id_operator,\n"
////                + "    p.nama as nama,\n"
////                + "    p.alamat as alamat_pelanggan,\n"
////                + "    p.notlp as tlp_pelanggan,\n"
////                + "    p.agen as pelanggan_agen\n"
////                + "FROM penjualan j JOIN pelanggan p ON (j.id_operator = p.kode)\n"
////                + "WHERE p.kode = ?\n"
////                + "ORDER BY j.tgl ASC";
////        Connection connect = ds.getConnection();
////        PreparedStatement ps = connect.prepareStatement(sql);
////        ps.setString(1, kode);
////        ResultSet rs = ps.executeQuery();
////        Keluar j = null;
////        if (rs.next()) {
////            j = new Keluar();
////            j.setId(rs.getString("id_keluar"));
////            j.setTgl(rs.getDate("tgl"));
////
////            Operator p = new Operator();
////            p.setId(rs.getString("id_operator"));
////            p.setNama(rs.getString("nama"));
////            p.setAlamat(rs.getString("alamat_pelanggan"));
////            p.setTlp(rs.getString("tlp_pelanggan"));
////            p.setAgen(rs.getBoolean("pelanggan_agen"));
////            j.setOperator(p);
////        }
////
////        ps.close();
////        rs.close();
////        connect.close();
////        return j;
//        return null;
//    }
//
//    @Override
//    public List<KeluarDetail> findPenjualanDetailByTanggalLowerThen(Date tgl) throws SQLException {
////        String sql = "SELECT \n"
////                + "    j.kode as id_keluar,\n"
////                + "    j.tgl as tgl,\n"
////                + "    p.kode as id_operator,\n"
////                + "    p.nama as nama,\n"
////                + "    p.alamat as alamat_pelanggan,\n"
////                + "    p.notlp as tlp_pelanggan,\n"
////                + "    p.agen as pelanggan_agen,\n"
////                + "    jd.id as id_keluar_detail,\n"
////                + "    jd.harga as harga_penjualan,\n"
////                + "    jd.jumlah as jumlah_penjualan,\n"
////                + "    jd.diskon as diskon_penjualan,\n"
////                + "    brg.kode as kode_barang,\n"
////                + "    brg.nama as nama_barang,\n"
////                + "    brg.harga_jual as harga_jual_barang,\n"
////                + "    brg.harga_beli as harga_beli_barang,\n"
////                + "    brg.jumlah as stok_barang,\n"
////                + "    brg.paket as barang_paketan,\n"
////                + "    kbrg.id as id_kategori_barang,\n"
////                + "    kbrg.kode as kode_kategori_barang,\n"
////                + "    kbrg.nama as nama_kategori_barang\n"
////                + "FROM penjualan j JOIN pelanggan p ON (j.id_operator = p.kode)\n"
////                + "    JOIN tb_keluar_part_detail jd ON (j.kode = jd.id_keluar)\n"
////                + "    JOIN barang brg ON (brg.kode = jd.kode_barang)\n"
////                + "    JOIN kategori_brg kbrg ON (kbrg.id = brg.id_kategori)\n"
////                + "WHERE j.tgl < ?";
//        List<KeluarDetail> list = new ArrayList<>();
////        Connection connect = ds.getConnection();
////        PreparedStatement ps = connect.prepareStatement(sql);
////        ps.setDate(1, tgl);
////        ResultSet rs = ps.executeQuery();
////        while (rs.next()) {
////            Keluar j = new Keluar();
////            j.setId(rs.getString("id_keluar"));
////            j.setTgl(rs.getDate("tgl"));
////
////            Operator p = new Operator();
////            p.setId(rs.getString("id_operator"));
////            p.setNama(rs.getString("nama"));
////            p.setAlamat(rs.getString("alamat_pelanggan"));
////            p.setTlp(rs.getString("tlp_pelanggan"));
////            p.setAgen(rs.getBoolean("pelanggan_agen"));
////            j.setOperator(p);
////
////            Part brg = new Part();
////            brg.setId(rs.getString("kode_barang"));
////            brg.setNama(rs.getString("nama_barang"));
////            brg.setHargaBeli(rs.getDouble("harga_beli_barang"));
////            brg.setHargaJual(rs.getDouble("harga_jual_barang"));
////            brg.setJumlah(rs.getInt("stok_barang"));
////            brg.setPaket(rs.getBoolean("barang_paketan"));
////
////            KategoriBarang kb = new KategoriBarang();
////            kb.setId(rs.getInt("id_kategori_barang"));
////            kb.setId(rs.getString("kode_kategori_barang"));
////            kb.setNama(rs.getString("nama_kategori_barang"));
////
////            brg.setKategori(kb);
////
////            KeluarDetail jd = new KeluarDetail();
////            jd.setId(rs.getInt("id_keluar_detail"));
////            jd.setPenjualan(j);
////            jd.setBarang(brg);
////            jd.setHarga(rs.getDouble("harga_penjualan"));
////            jd.setJumlah(rs.getInt("jumlah_penjualan"));
////            jd.setDiskon(rs.getDouble("diskon_penjualan"));
////            list.add(jd);
////        }
////        ps.close();
////        rs.close();
////        connect.close();
//        return list;
//    }
//
//    public List<KeluarDetail> findPenjualanDetailByOperatorKode(String kode) throws SQLException {
//        String sql = "SELECT \n"
//                + "    j.kode as id_keluar,\n"
//                + "    j.tgl as tgl,\n"
//                + "    p.kode as id_operator,\n"
//                + "    p.nama as nama,\n"
//                + "    p.alamat as alamat_pelanggan,\n"
//                + "    p.notlp as tlp_pelanggan,\n"
//                + "    p.agen as pelanggan_agen,\n"
//                + "    jd.id as id_keluar_detail,\n"
//                + "    jd.harga as harga_penjualan,\n"
//                + "    jd.jumlah as jumlah_penjualan,\n"
//                + "    jd.diskon as diskon_penjualan,\n"
//                + "    brg.kode as kode_barang,\n"
//                + "    brg.nama as nama_barang,\n"
//                + "    brg.harga_jual as harga_jual_barang,\n"
//                + "    brg.harga_beli as harga_beli_barang,\n"
//                + "    brg.jumlah as stok_barang,\n"
//                + "    brg.paket as barang_paketan,\n"
//                + "    kbrg.id as id_kategori_barang,\n"
//                + "    kbrg.kode as kode_kategori_barang,\n"
//                + "    kbrg.nama as nama_kategori_barang\n"
//                + "FROM penjualan j JOIN pelanggan p ON (j.id_operator = p.kode)\n"
//                + "    JOIN tb_keluar_part_detail jd ON (j.kode = jd.id_keluar)\n"
//                + "    JOIN barang brg ON (brg.kode = jd.kode_barang)\n"
//                + "    JOIN kategori_brg kbrg ON (kbrg.id = brg.id_kategori)\n"
//                + "WHERE p.kode = ?";
//
//        List<KeluarDetail> list = new ArrayList<>();
//        Connection connect = ds.getConnection();
//        PreparedStatement ps = connect.prepareStatement(sql);
//        ps.setString(1, kode);
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            Keluar j = new Keluar();
//            j.setId(rs.getString("id_keluar"));
//            j.setTgl(rs.getDate("tgl"));
//
//            Operator p = new Operator();
//            p.setId(rs.getString("id_operator"));
//            p.setNama(rs.getString("nama"));
//            p.setAlamat(rs.getString("alamat_pelanggan"));
//            p.setTlp(rs.getString("tlp_pelanggan"));
//            p.setAgen(rs.getBoolean("pelanggan_agen"));
//            j.setOperator(p);
//
//            Part brg = new Part();
//            brg.setId(rs.getString("kode_barang"));
//            brg.setNama(rs.getString("nama_barang"));
//            brg.setHargaBeli(rs.getDouble("harga_beli_barang"));
//            brg.setHargaJual(rs.getDouble("harga_jual_barang"));
//            brg.setJumlah(rs.getInt("stok_barang"));
//            brg.setPaket(rs.getBoolean("barang_paketan"));
//
//            KategoriBarang kb = new KategoriBarang();
//            kb.setId(rs.getInt("id_kategori_barang"));
//            kb.setId(rs.getString("kode_kategori_barang"));
//            kb.setNama(rs.getString("nama_kategori_barang"));
//
//            brg.setKategori(kb);
//
//            KeluarDetail jd = new KeluarDetail();
//            jd.setId(rs.getInt("id_keluar_detail"));
//            jd.setPenjualan(j);
//            jd.setBarang(brg);
//            jd.setHarga(rs.getDouble("harga_penjualan"));
//            jd.setJumlah(rs.getInt("jumlah_penjualan"));
//            jd.setDiskon(rs.getDouble("diskon_penjualan"));
//            list.add(jd);
//        }
//        ps.close();
//        rs.close();
//        connect.close();
//        return list;
//    }
//
//    @Override
//    public List<Keluar> findPenjualanByTglBetween(Date awal, Date akhir) throws SQLException{
//        String sql = "SELECT \n"
//                + "    j.kode as id_keluar,\n"
//                + "    j.tgl as tgl,\n"
//                + "    p.kode as id_operator,\n"
//                + "    p.nama as nama,\n"
//                + "    p.alamat as alamat_pelanggan,\n"
//                + "    p.notlp as tlp_pelanggan,\n"
//                + "    p.agen as pelanggan_agen\n"
//                + "FROM penjualan j JOIN pelanggan p ON (j.id_operator = p.kode)"
//                + "WHERE j.tgl between ? and ?";
//        Connection connect = ds.getConnection();
//        List<Keluar> list = new ArrayList<>();
//        PreparedStatement ps = connect.prepareStatement(sql);
//        ps.setDate(1, awal);
//        ps.setDate(2, akhir);
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            Keluar j = new Keluar();
//            j.setId(rs.getString("id_keluar"));
//            j.setTgl(rs.getDate("tgl"));
//
//            Operator p = new Operator();
//            p.setId(rs.getString("id_operator"));
//            p.setNama(rs.getString("nama"));
//            p.setAlamat(rs.getString("alamat_pelanggan"));
//            p.setTlp(rs.getString("tlp_pelanggan"));
//            p.setAgen(rs.getBoolean("pelanggan_agen"));
//            j.setOperator(p);
//            list.add(j);
//        }
//
//        ps.close();
//        rs.close();
//        connect.close();
//        return list;}
//
//    @Override
//    public Keluar findByPelangganOrderByTanggalAscLastTransaction(String kode) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<KeluarDetail> findPenjualanDetailByPelangganKode(String kode) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Keluar findOne(Integer id) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Boolean exists(Integer id) throws SQLException {
//         return findOne(id) != null;
//    }
//
//    @Override
//    public void delete(Integer id) throws SQLException {
//        Connection connect = ds.getConnection();
//        PreparedStatement ps;
//        String sql;
//
//        sql = "DELETE FROM tb_keluar_part_detail WHERE id_keluar = ?";
//        ps = connect.prepareStatement(sql);
//        ps.setInt(1, id);
//        ps.executeUpdate();
//        ps.close();
//
//        sql = "DELETE FROM tb_keluar_part WHERE kode = ?";
//        ps = connect.prepareStatement(sql);
//        ps.setInt(1, id);
//        ps.executeUpdate();
//        ps.close();
//
//        connect.close();
//    }

    @Override
    public Keluar save(Keluar p, List<KeluarDetail> barangJual) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Keluar> findPenjualanByTglBetween(Date awal, Date akhir) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KeluarDetail> findPenjualanDetailByPenjualanKode(String kode) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KeluarDetail> findPenjualanDetailBetweenTanggal(Date tglAwal, Date tglAkhir) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KeluarDetail> findPenjualanDetailByTanggalLowerThen(Date tgl) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Keluar findByPelangganOrderByTanggalAscLastTransaction(String kode) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<KeluarDetail> findPenjualanDetailByPelangganKode(String kode) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Keluar save(Keluar value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Keluar update(Keluar value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Keluar> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Keluar findOne(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean exists(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
