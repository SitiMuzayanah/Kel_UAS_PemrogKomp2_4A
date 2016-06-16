/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasmongo;

import com.mongodb.BasicDBObject;
import it.sauronsoftware.feed4j.FeedIOException;
import it.sauronsoftware.feed4j.FeedXMLParseException;
import it.sauronsoftware.feed4j.UnsupportedFeedException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bakti
 */
public class FormUtama extends javax.swing.JFrame {
    private LocalSetting language = new LocalSetting();
    public ManagerData mongo = new ManagerData("UAS"); // atau new Mongo("host:port");
    private DefaultTableModel T_AlamatURL;//mengeset tabel

    /**
     * Creates new form MainForm
     */
    public FormUtama() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);//membuat ukuran layar otomatis full
        T_AlamatURL = new DefaultTableModel();
        tabel.setModel(T_AlamatURL);
        T_AlamatURL.addColumn("Alamat");
        T_AlamatURL.addColumn("TotalNews");
        Tampil();
    }
    
    public void Tampil(){ // memunculkan data mongo yg tabel alamat
        T_AlamatURL.getDataVector().removeAllElements();
        T_AlamatURL.fireTableDataChanged();
        try{
            ArrayList<BasicDBObject> list = mongo.getCollectionData("parser");
            for (BasicDBObject alamat : list){
                Object [] o = new Object[2];
                o[0] = alamat.get("Alamat");
                o[1] = alamat.get("TotalNews");
                T_AlamatURL.addRow(o);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Hilang!!","Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelgambarbg1 = new uasmongo.gambar2();
        panelgambar21 = new uasmongo.gambar1();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        fetch_All = new javax.swing.JButton();
        fetch = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Ptext = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        panelgambarbg2 = new uasmongo.gambar2();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        indonesia = new javax.swing.JMenuItem();
        ingrris = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        fetch_All.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fetch_All.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pilih.gif"))); // NOI18N
        fetch_All.setText("Fetch_All");
        fetch_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetch_AllActionPerformed(evt);
            }
        });

        fetch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fetch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Keluar2.png"))); // NOI18N
        fetch.setText("Fetch");
        fetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit.png"))); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hapus2.png"))); // NOI18N
        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("1. Arif Hidayah (14090070)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("2. Bakti Nur Wahyudin (14090020)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("3. Donny Setiaji (14090012)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("5. Syahrul adiguna kurniawan (14090018)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("4. Novriani Hernawati (14090030)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("6. Siti Muzayanah (14090003)");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/About.png"))); // NOI18N
        jLabel2.setText("Anggota Kelompok");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        simpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SAVE.PNG"))); // NOI18N
        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        text.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("URL FEED");

        Ptext.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Ptext.setText("jLabel1");

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RESET.PNG"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelgambar21Layout = new javax.swing.GroupLayout(panelgambar21);
        panelgambar21.setLayout(panelgambar21Layout);
        panelgambar21Layout.setHorizontalGroup(
            panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgambar21Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelgambar21Layout.createSequentialGroup()
                        .addGroup(panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelgambar21Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(text))
                            .addGroup(panelgambar21Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fetch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fetch_All, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelgambar21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ptext)
                .addGap(352, 352, 352))
        );
        panelgambar21Layout.setVerticalGroup(
            panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgambar21Layout.createSequentialGroup()
                .addComponent(Ptext)
                .addGap(31, 31, 31)
                .addGroup(panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelgambar21Layout.createSequentialGroup()
                        .addGroup(panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelgambar21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fetch_All, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fetch)
                            .addComponent(edit)
                            .addComponent(hapus)
                            .addComponent(simpan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelgambarbg1Layout = new javax.swing.GroupLayout(panelgambarbg1);
        panelgambarbg1.setLayout(panelgambarbg1Layout);
        panelgambarbg1Layout.setHorizontalGroup(
            panelgambarbg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelgambarbg1Layout.createSequentialGroup()
                .addComponent(panelgambar21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelgambarbg1Layout.setVerticalGroup(
            panelgambarbg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelgambarbg1Layout.createSequentialGroup()
                .addComponent(panelgambar21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelgambarbg1);
        panelgambarbg1.setBounds(0, 0, 1170, 520);

        javax.swing.GroupLayout panelgambarbg2Layout = new javax.swing.GroupLayout(panelgambarbg2);
        panelgambarbg2.setLayout(panelgambarbg2Layout);
        panelgambarbg2Layout.setHorizontalGroup(
            panelgambarbg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        panelgambarbg2Layout.setVerticalGroup(
            panelgambarbg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(panelgambarbg2);
        panelgambarbg2.setBounds(0, 0, 1150, 60);

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 255));

        menu.setText("Select Language");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        indonesia.setText("Indonesia");
        indonesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indonesiaActionPerformed(evt);
            }
        });
        menu.add(indonesia);

        ingrris.setText("English");
        ingrris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingrrisActionPerformed(evt);
            }
        });
        menu.add(ingrris);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        Crud simpan = new Crud(); // ciri" bukan static void
        simpan.disimpan(text.getText());
        Tampil();// TODO add your handling code here:
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // update
        Crud ubah = new Crud();
        ubah.update(text.getText(),Ptext.getText());
        //ubah.update(isi.getText());
        Crud a = new Crud();
        Tampil();// TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.getSelectedRow();
        int col = tabel.getSelectedColumn();
        String dataTerpilih = tabel.getValueAt(baris, col).toString();
        String col1 = tabel.getValueAt(baris, 0).toString();
        String col2 = tabel.getValueAt(baris, 1).toString();// TODO add your handling code here:
        Crud urlcol1 = new Crud();
        urlcol1.setUrl(col1); 
        text.setText(col1);
        Ptext.setText(col1);
    }//GEN-LAST:event_tabelMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        Crud hapus = new Crud();
        hapus.dihapus(text.getText());
        Tampil();// TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void indonesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indonesiaActionPerformed
        translateMenu(this.indonesia.getText());// TODO add your handling code here:
    }//GEN-LAST:event_indonesiaActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuActionPerformed

    private void ingrrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingrrisActionPerformed
        translateMenu(this.ingrris.getText());// TODO add your handling code here:
    }//GEN-LAST:event_ingrrisActionPerformed

    private void fetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchActionPerformed
        Crud get = new Crud();
        try {
            get.fetch(text.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FeedIOException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FeedXMLParseException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedFeedException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tampil();// TODO add your handling code here:
    }//GEN-LAST:event_fetchActionPerformed

    private void fetch_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetch_AllActionPerformed
        Crud getAll = new Crud();
        try {
            getAll.fetchAll();
        } catch (FeedIOException ex) {
        } catch (FeedXMLParseException ex) {
        } catch (UnsupportedFeedException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tampil();/// TODO add your handling code here:
    }//GEN-LAST:event_fetch_AllActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        text.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void translateMenu(String langText){
        String locale = "en";
        String LOCALE = "US";
        
        if ("Indonesia".equals(langText)){
            locale = "ina";
            LOCALE = "ID";
        }
        
        System.out.println(langText);
        LocalSetting language = new LocalSetting(locale, LOCALE);
        simpan.setText(language.translate("Save"));
        edit.setText(language.translate("Edit"));
        hapus.setText(language.translate("Delete"));
        fetch.setText(language.translate("Fetch"));
        fetch_All.setText(language.translate("Fetch_All"));
        menu.setText(language.translate("Language"));
        clear.setText(language.translate("Clear"));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ptext;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton fetch;
    private javax.swing.JButton fetch_All;
    private javax.swing.JButton hapus;
    private javax.swing.JMenuItem indonesia;
    private javax.swing.JMenuItem ingrris;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu;
    private uasmongo.gambar1 panelgambar21;
    private uasmongo.gambar2 panelgambarbg1;
    private uasmongo.gambar2 panelgambarbg2;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}