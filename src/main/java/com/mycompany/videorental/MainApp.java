/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.videorental;

import java.awt.Color;
import java.sql.*;
import javax.swing.table.*;
import java.util.Arrays;

/**
 *
 * @author Craig
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainTabs = new javax.swing.JTabbedPane();
        Videos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VideoTable = new javax.swing.JTable();
        Account = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WatchHistory = new javax.swing.JTextArea();
        AccountName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        AccountStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Management = new javax.swing.JButton();
        Subscribe = new javax.swing.JPanel();
        monthlySubButt = new javax.swing.JButton();
        yearlySubButt = new javax.swing.JButton();
        lifetimeSubscribeButt = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        monthlyText = new javax.swing.JLabel();
        yearlyText = new javax.swing.JLabel();
        lifetimeText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Rentals");
        setResizable(false);

        MainTabs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MainTabsFocusGained(evt);
            }
        });

        Videos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        VideoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Length", "Movie Name", "Genre", "Description", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(VideoTable);

        javax.swing.GroupLayout VideosLayout = new javax.swing.GroupLayout(Videos);
        Videos.setLayout(VideosLayout);
        VideosLayout.setHorizontalGroup(
            VideosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        VideosLayout.setVerticalGroup(
            VideosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );

        MainTabs.addTab("Videos", Videos);

        WatchHistory.setColumns(20);
        WatchHistory.setRows(5);
        jScrollPane1.setViewportView(WatchHistory);

        AccountName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AccountName.setText("Name");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Email.setText("jLabel1");

        AccountStatus.setText("jLabel2");

        jLabel1.setText("Watch History");

        Management.setBackground(new java.awt.Color(0, 204, 255));
        Management.setText("Manage");

        javax.swing.GroupLayout AccountLayout = new javax.swing.GroupLayout(Account);
        Account.setLayout(AccountLayout);
        AccountLayout.setHorizontalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addGroup(AccountLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AccountLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(AccountLayout.createSequentialGroup()
                                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AccountName, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Management, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        AccountLayout.setVerticalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountLayout.createSequentialGroup()
                        .addGroup(AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Management))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccountStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MainTabs.addTab("Account", Account);

        monthlySubButt.setText("jButton1");
        monthlySubButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlySubButtActionPerformed(evt);
            }
        });

        yearlySubButt.setText("jButton1");
        yearlySubButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlySubButtActionPerformed(evt);
            }
        });

        lifetimeSubscribeButt.setText("jButton1");
        lifetimeSubscribeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lifetimeSubscribeButtActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jButton4.setText("€4.99");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter a video name to rent it:");

        monthlyText.setText("jLabel3");

        yearlyText.setText("jLabel3");

        lifetimeText.setText("jLabel3");

        javax.swing.GroupLayout SubscribeLayout = new javax.swing.GroupLayout(Subscribe);
        Subscribe.setLayout(SubscribeLayout);
        SubscribeLayout.setHorizontalGroup(
            SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubscribeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubscribeLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SubscribeLayout.createSequentialGroup()
                        .addComponent(monthlyText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthlySubButt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SubscribeLayout.createSequentialGroup()
                        .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearlyText, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(lifetimeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lifetimeSubscribeButt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearlySubButt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        SubscribeLayout.setVerticalGroup(
            SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubscribeLayout.createSequentialGroup()
                .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubscribeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthlySubButt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthlyText))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubscribeLayout.createSequentialGroup()
                        .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearlySubButt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearlyText))
                        .addGap(18, 18, 18)))
                .addGap(9, 9, 9)
                .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lifetimeSubscribeButt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifetimeText))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SubscribeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(22, 22, 22))
        );

        MainTabs.addTab("Shop", Subscribe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainTabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainTabs)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainTabsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MainTabsFocusGained
        
    }//GEN-LAST:event_MainTabsFocusGained

    private void monthlySubButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlySubButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlySubButtActionPerformed

    private void yearlySubButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlySubButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlySubButtActionPerformed

    private void lifetimeSubscribeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lifetimeSubscribeButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lifetimeSubscribeButtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     * @param DBS Database class
     * @param MGR Manager class reference
     */
    public static void main(String args[], DBComms DBS, Manager MGR) {
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        DB = DBS;
        MG = MGR;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(false);
            }
        });
    }
    
    // User Methods
    public void setStatic(DBComms DBS, Manager MGR) {
        DB = DBS;
        MG = MGR;
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    
    public void updateInfo() {
        // Update Video Table
        String[] columns = new String[] {
          "Length",
          "Movie Name",
          "Genre",
          "Description",
          "Rating"
        };
        // getting video information
        ResultSet movies = DB.getMovies();
        int movieLength = DB.getMoviesLength();
        String[][] MovieList = new String[movieLength][];
        int counter = 0;
        System.out.println(movieLength);
        try {
            while(movies.next() && movieLength > 0) {
                MovieList[counter] = new String[] {
                    movies.getString(2),
                    movies.getString(3),
                    movies.getString(4),
                    movies.getString(5),
                    movies.getString(6),
                };
                counter++;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        DefaultTableModel table = (DefaultTableModel) VideoTable.getModel();
        for (String[] i : MovieList) {
            table.addRow(i);
        }
        table.setNumRows(MovieList.length);
        VideoTable.setModel(table);
        VideoTable.repaint();
        System.out.println("Repainting the table");
        // Update User Information
        MG.getAccountDetails(DB);
        
        AccountName.setText(MG.accountName);
        Email.setText(MG.accountEmail);
        AccountStatus.setText(MG.accountStatus);
        WatchHistory.setText(MG.moviesRented);
        System.out.println(AccountName.getText());
        
        // Update Subscription Information
        MG.getSubscriptionDetails(DB);
        
        monthlyText.setText(MG.subType[0]);
        monthlySubButt.setText(MG.subCost[0]);
        
        yearlyText.setText(MG.subType[1]);
        yearlySubButt.setText(MG.subCost[1]);
        
        lifetimeText.setText(MG.subType[2]);
        yearlySubButt.setText(MG.subCost[2]);
        
        
    }
    
    //User Variables
    static DBComms DB;
    static Manager MG;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JLabel AccountName;
    private javax.swing.JLabel AccountStatus;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Icon;
    private javax.swing.JTabbedPane MainTabs;
    private javax.swing.JButton Management;
    private javax.swing.JPanel Subscribe;
    private javax.swing.JTable VideoTable;
    private javax.swing.JPanel Videos;
    private javax.swing.JTextArea WatchHistory;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lifetimeSubscribeButt;
    private javax.swing.JLabel lifetimeText;
    private javax.swing.JButton monthlySubButt;
    private javax.swing.JLabel monthlyText;
    private javax.swing.JButton yearlySubButt;
    private javax.swing.JLabel yearlyText;
    // End of variables declaration//GEN-END:variables
}
