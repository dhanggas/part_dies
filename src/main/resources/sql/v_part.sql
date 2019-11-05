CREATE VIEW v_part AS SELECT
id_sparepart AS 'id_sparepart',
nama_part AS 'nama_part',
spek AS 'spek',
qty AS 'qty',
satuan AS 'satuan',
min_stok AS 'min_stok',
prioritas AS 'prioritas',

id_aset AS 'id_aset',
nama_aset AS 'nama_aset',

id_kategori AS 'id_kategori',
nama_kategori as 'nama_kategori',

id_kepemilikan AS 'id_kepemilikan',
nama AS 'nama_kepemilikan',
tlp AS 'tlp_kepemilikan',
alamat AS 'alamat_kepemilikan',
ket AS 'ket_kepemilikan'

FROM
tb_sparepart s JOIN tb_aset ast ON(s.id_aset=ast.id_aset)
JOIN tb_kategori kast ON (kast.id_kategori = ast.id_kategori)
JOIN tb_kepemilikan c ON (c.id_kepemilikan = ast.id_kepemilikan);
