/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.view;

import aplikasi.view.menu.part.DaftarPartView;
import aplikasi.view.menu.part.DataPartView;
import aplikasi.view.menu.laporan.LaporanKeluarView;
import aplikasi.view.menu.laporan.LaporanSirkulasiBarangView;
import aplikasi.view.menu.operator.DaftarOperatorView;
import aplikasi.view.menu.operator.DataOperatorView;
import aplikasi.view.menu.pemasok.DaftarPemasokView;
import aplikasi.view.menu.pemasok.DataPemasokView;
import aplikasi.view.menu.masuk.DataMasukView;
import aplikasi.view.menu.pemesanan.pemasukan.DataMasukDariPemesananView;
import aplikasi.view.menu.pemesanan.pemasukan.DataPemesananPemasukanView;
import aplikasi.view.menu.keluar.DataKeluarView;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author dimmaryanto
 */
public class MainMenuView extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private void showLoginScreen() {
        LoginView login = new LoginView(this, this, true);
        login.setTitle("SIPMI - Zalfa Miracle Skin Care");
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    public void setInnerLayout(JInternalFrame internal) throws PropertyVetoException {
        this.desktop.removeAll();
        this.desktop.add(internal);
        internal.setMaximum(true);
        internal.setVisible(true);
        this.desktop.repaint();
    }

    public void setEnabledMenuPelanggan(Boolean aktif) {
        this.btnPelanggan.setEnabled(aktif);
        this.mniPelanggan.setEnabled(aktif);
    }

    public void setEnabledMenuPemasok(Boolean aktif) {
        this.btnPemasok.setEnabled(aktif);
        this.mniPemasok.setEnabled(aktif);
    }

    public void setEnabledMenuKategoriBarang(Boolean aktif) {
        this.btnKategoriBarang.setEnabled(aktif);
        this.mniKategoriBarang.setEnabled(aktif);
    }

    public void setEnabledMenuBarang(Boolean aktif) {
        this.btnPart.setEnabled(aktif);
        this.mniPart.setEnabled(aktif);
    }

    public void setEnabledMenuPenjualan(Boolean aktif) {
        this.btnPenjualan.setEnabled(aktif);
        this.mniPenjualan.setEnabled(aktif);
    }

    public void setEnabledMenuPembelian(Boolean aktif) {
        this.btnPembelian.setEnabled(aktif);
        this.mniPembelian.setEnabled(aktif);

        this.btnPesananPembelian.setEnabled(aktif);
        this.mniPesanPembelian.setEnabled(aktif);

        this.btnBayarPesananPembelian.setEnabled(aktif);
        this.mniAmbilPesanPembelian.setEnabled(aktif);
    }

    public void setEnabledMenuLaporan(Boolean aktif) {
        this.mniLaporanSirkulasiBarang.setEnabled(aktif);
        this.mniLapPenjualan.setEnabled(aktif);
    }

    public void setLoginEnabled(Boolean login) {
        if (login) {
            this.mniLogin.setEnabled(false);
            this.mniLogout.setEnabled(true);
        } else {
            this.mniLogin.setEnabled(true);
            this.mniLogout.setEnabled(false);
        }
    }

    public void enabledMenu(Boolean aktif) {
        this.btnPelanggan.setEnabled(aktif);
        this.btnPemasok.setEnabled(aktif);
        this.btnKategoriBarang.setEnabled(aktif);
        this.btnPart.setEnabled(aktif);
        this.btnPenjualan.setEnabled(aktif);
        this.btnPembelian.setEnabled(aktif);
        this.btnPesananPembelian.setEnabled(aktif);
        this.btnBayarPesananPembelian.setEnabled(aktif);

        this.mniPelanggan.setEnabled(aktif);
        this.mniPemasok.setEnabled(aktif);
        this.mniKategoriBarang.setEnabled(aktif);
        this.mniPart.setEnabled(aktif);
        this.mniPembelian.setEnabled(aktif);
        this.mniPenjualan.setEnabled(aktif);
        this.mniPesanPembelian.setEnabled(aktif);
        this.mniAmbilPesanPembelian.setEnabled(aktif);

        this.mniLapPenjualan.setEnabled(aktif);
        this.mniLaporanSirkulasiBarang.setEnabled(aktif);
    }

    public MainMenuView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnPelanggan = new javax.swing.JButton();
        btnPemasok = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnKategoriBarang = new javax.swing.JButton();
        btnPart = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnPenjualan = new javax.swing.JButton();
        btnPembelian = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnPesananPembelian = new javax.swing.JButton();
        btnBayarPesananPembelian = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        desktop = new javax.swing.JDesktopPane();
        jSeparator7 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAplikasi = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        mnuMasterData = new javax.swing.JMenu();
        mniPelanggan = new javax.swing.JMenuItem();
        mniPemasok = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniKategoriBarang = new javax.swing.JMenuItem();
        mniPart = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniLapPenjualan = new javax.swing.JMenuItem();
        mniLaporanSirkulasiBarang = new javax.swing.JMenuItem();
        mnuTransaksi = new javax.swing.JMenu();
        mniPembelian = new javax.swing.JMenuItem();
        mniPenjualan = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniPesanPembelian = new javax.swing.JMenuItem();
        mniAmbilPesanPembelian = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setSize(new java.awt.Dimension(1024, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Menu"));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 300));

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setAutoscrolls(true);
        jToolBar1.setFocusCycleRoot(true);

        btnPelanggan.setText("Pelanggan");
        btnPelanggan.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPelanggan.setEnabled(false);
        btnPelanggan.setFocusable(false);
        btnPelanggan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPelanggan.setMaximumSize(new java.awt.Dimension(200, 35));
        btnPelanggan.setMinimumSize(new java.awt.Dimension(200, 35));
        btnPelanggan.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPelanggan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelangganActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPelanggan);

        btnPemasok.setText("Pemasok");
        btnPemasok.setEnabled(false);
        btnPemasok.setFocusable(false);
        btnPemasok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPemasok.setMaximumSize(new java.awt.Dimension(200, 35));
        btnPemasok.setMinimumSize(new java.awt.Dimension(200, 35));
        btnPemasok.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPemasok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemasokActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPemasok);
        jToolBar1.add(jSeparator1);

        btnKategoriBarang.setText("Kategori Barang");
        btnKategoriBarang.setEnabled(false);
        btnKategoriBarang.setFocusable(false);
        btnKategoriBarang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKategoriBarang.setMaximumSize(new java.awt.Dimension(200, 35));
        btnKategoriBarang.setMinimumSize(new java.awt.Dimension(200, 35));
        btnKategoriBarang.setPreferredSize(new java.awt.Dimension(200, 35));
        btnKategoriBarang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKategoriBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategoriBarangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKategoriBarang);

        btnPart.setText("Spare Part");
        btnPart.setEnabled(false);
        btnPart.setFocusable(false);
        btnPart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPart.setMaximumSize(new java.awt.Dimension(200, 35));
        btnPart.setMinimumSize(new java.awt.Dimension(200, 35));
        btnPart.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPart);
        jToolBar1.add(jSeparator2);

        btnPenjualan.setText("Penjualan");
        btnPenjualan.setEnabled(false);
        btnPenjualan.setFocusable(false);
        btnPenjualan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPenjualan.setMaximumSize(new java.awt.Dimension(200, 35));
        btnPenjualan.setMinimumSize(new java.awt.Dimension(200, 35));
        btnPenjualan.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPenjualan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPenjualan);

        btnPembelian.setText("Pembelian");
        btnPembelian.setEnabled(false);
        btnPembelian.setFocusable(false);
        btnPembelian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPembelian.setMaximumSize(new java.awt.Dimension(200, 35));
        btnPembelian.setMinimumSize(new java.awt.Dimension(200, 35));
        btnPembelian.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPembelian.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembelianActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPembelian);
        jToolBar1.add(jSeparator3);

        btnPesananPembelian.setText("Pesanan Pembelian");
        btnPesananPembelian.setEnabled(false);
        btnPesananPembelian.setFocusable(false);
        btnPesananPembelian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesananPembelian.setMaximumSize(new java.awt.Dimension(200, 35));
        btnPesananPembelian.setMinimumSize(new java.awt.Dimension(200, 35));
        btnPesananPembelian.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPesananPembelian.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPesananPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesananPembelianActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPesananPembelian);

        btnBayarPesananPembelian.setText("Ambil Pesanan Pembelian");
        btnBayarPesananPembelian.setEnabled(false);
        btnBayarPesananPembelian.setFocusable(false);
        btnBayarPesananPembelian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBayarPesananPembelian.setMaximumSize(new java.awt.Dimension(200, 35));
        btnBayarPesananPembelian.setMinimumSize(new java.awt.Dimension(200, 35));
        btnBayarPesananPembelian.setPreferredSize(new java.awt.Dimension(200, 35));
        btnBayarPesananPembelian.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBayarPesananPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarPesananPembelianActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBayarPesananPembelian);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(624, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);
        getContentPane().add(jSeparator7, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setMinimumSize(new java.awt.Dimension(320, 35));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(320, 35));

        mnuAplikasi.setText("Aplikasi");

        mniLogin.setText("Login");
        mniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoginActionPerformed(evt);
            }
        });
        mnuAplikasi.add(mniLogin);

        mniLogout.setText("Logout");
        mniLogout.setEnabled(false);
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnuAplikasi.add(mniLogout);
        mnuAplikasi.add(jSeparator4);

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuAplikasi.add(mniExit);

        jMenuBar1.add(mnuAplikasi);

        mnuMasterData.setText("Master Data");

        mniPelanggan.setText("Pelanggan");
        mniPelanggan.setEnabled(false);
        mniPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPelangganActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniPelanggan);

        mniPemasok.setText("Pemasok");
        mniPemasok.setEnabled(false);
        mniPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPemasokActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniPemasok);
        mnuMasterData.add(jSeparator5);

        mniKategoriBarang.setText("Kategori Barang");
        mniKategoriBarang.setEnabled(false);
        mniKategoriBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKategoriBarangActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniKategoriBarang);

        mniPart.setText("Spare Part");
        mniPart.setEnabled(false);
        mniPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPartActionPerformed(evt);
            }
        });
        mnuMasterData.add(mniPart);

        jMenuBar1.add(mnuMasterData);

        jMenu4.setText("Laporan");

        mniLapPenjualan.setText("Penjualan");
        mniLapPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLapPenjualanActionPerformed(evt);
            }
        });
        jMenu4.add(mniLapPenjualan);

        mniLaporanSirkulasiBarang.setText("Sirkulasi Barang");
        mniLaporanSirkulasiBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLaporanSirkulasiBarangActionPerformed(evt);
            }
        });
        jMenu4.add(mniLaporanSirkulasiBarang);

        jMenuBar1.add(jMenu4);

        mnuTransaksi.setText("Transaksi");

        mniPembelian.setText("Pembelian");
        mniPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPembelianActionPerformed(evt);
            }
        });
        mnuTransaksi.add(mniPembelian);

        mniPenjualan.setText("Penjualan");
        mniPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPenjualanActionPerformed(evt);
            }
        });
        mnuTransaksi.add(mniPenjualan);
        mnuTransaksi.add(jSeparator6);

        mniPesanPembelian.setText("Pesanan Pembelian");
        mniPesanPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPesanPembelianActionPerformed(evt);
            }
        });
        mnuTransaksi.add(mniPesanPembelian);

        mniAmbilPesanPembelian.setText("Bayar Pesanan");
        mniAmbilPesanPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAmbilPesanPembelianActionPerformed(evt);
            }
        });
        mnuTransaksi.add(mniAmbilPesanPembelian);

        jMenuBar1.add(mnuTransaksi);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemasokActionPerformed
        DataPemasokView view = new DataPemasokView(this, true);
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }//GEN-LAST:event_btnPemasokActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void btnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelangganActionPerformed
        DataOperatorView pelanggan = new DataOperatorView(this, true);
        pelanggan.setLocationRelativeTo(null);
        pelanggan.setResizable(false);
        pelanggan.setVisible(true);
    }//GEN-LAST:event_btnPelangganActionPerformed

    private void mniPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPelangganActionPerformed
        try {
            DaftarOperatorView view = new DaftarOperatorView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniPelangganActionPerformed

    private void mniPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPemasokActionPerformed
        try {
            DaftarPemasokView view = new DaftarPemasokView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniPemasokActionPerformed

    private void mniPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPartActionPerformed
        try {
            DaftarPartView view = new DaftarPartView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mniPartActionPerformed

    private void mniKategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKategoriBarangActionPerformed
//        try {
//            DaftarKategoriBarangView view = new DaftarKategoriBarangView(this);
//            setInnerLayout(view);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_mniKategoriBarangActionPerformed

    private void btnKategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategoriBarangActionPerformed
//        DataKategoriBarangView view = new DataKategoriBarangView(this, true);
//        view.setResizable(false);
//        view.setLocationRelativeTo(null);
//        view.setVisible(true);
    }//GEN-LAST:event_btnKategoriBarangActionPerformed

    private void btnPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartActionPerformed
        DataPartView view = new DataPartView(this, true);
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }//GEN-LAST:event_btnPartActionPerformed

    private void mniPesanPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPesanPembelianActionPerformed
        try {
            DataPemesananPemasukanView view = new DataPemesananPemasukanView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniPesanPembelianActionPerformed

    private void btnPesananPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesananPembelianActionPerformed
        try {
            DataPemesananPemasukanView view = new DataPemesananPemasukanView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesananPembelianActionPerformed

    private void btnBayarPesananPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarPesananPembelianActionPerformed
        try {
            DataMasukDariPemesananView view = new DataMasukDariPemesananView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBayarPesananPembelianActionPerformed

    private void btnPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembelianActionPerformed
        try {
            DataMasukView view = new DataMasukView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPembelianActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
        try {
            DataKeluarView view = new DataKeluarView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void mniLaporanSirkulasiBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLaporanSirkulasiBarangActionPerformed
        try {
            LaporanSirkulasiBarangView view = new LaporanSirkulasiBarangView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniLaporanSirkulasiBarangActionPerformed

    private void mniPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPembelianActionPerformed
        try {
            DataMasukView view = new DataMasukView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniPembelianActionPerformed

    private void mniPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPenjualanActionPerformed
        try {
            DataKeluarView view = new DataKeluarView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniPenjualanActionPerformed

    private void mniAmbilPesanPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAmbilPesanPembelianActionPerformed
        try {
            DataMasukDariPemesananView view = new DataMasukDariPemesananView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniAmbilPesanPembelianActionPerformed

    private void mniLapPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLapPenjualanActionPerformed
        try {
            LaporanKeluarView view = new LaporanKeluarView(this);
            setInnerLayout(view);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniLapPenjualanActionPerformed

    private void mniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoginActionPerformed
        showLoginScreen();
    }//GEN-LAST:event_mniLoginActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        this.setLoginEnabled(false);
        this.enabledMenu(false);
        this.desktop.removeAll();
        this.desktop.repaint();
    }//GEN-LAST:event_mniLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayarPesananPembelian;
    private javax.swing.JButton btnKategoriBarang;
    private javax.swing.JButton btnPart;
    private javax.swing.JButton btnPelanggan;
    private javax.swing.JButton btnPemasok;
    private javax.swing.JButton btnPembelian;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnPesananPembelian;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mniAmbilPesanPembelian;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniKategoriBarang;
    private javax.swing.JMenuItem mniLapPenjualan;
    private javax.swing.JMenuItem mniLaporanSirkulasiBarang;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniPart;
    private javax.swing.JMenuItem mniPelanggan;
    private javax.swing.JMenuItem mniPemasok;
    private javax.swing.JMenuItem mniPembelian;
    private javax.swing.JMenuItem mniPenjualan;
    private javax.swing.JMenuItem mniPesanPembelian;
    private javax.swing.JMenu mnuAplikasi;
    private javax.swing.JMenu mnuMasterData;
    private javax.swing.JMenu mnuTransaksi;
    // End of variables declaration//GEN-END:variables
}
