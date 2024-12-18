/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project1;



import java.sql.*;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author AMR KHALED
 */
public class project1 extends javax.swing.JFrame {

    /**
     * Creates new form project1
     */
    public project1() {
        initComponents();
        this.setLocationRelativeTo(null);
       try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amr", "root", "root");

            



            
            
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
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

        menu_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dis_btn = new javax.swing.JButton();
        serach_btn = new javax.swing.JButton();
        del_btn = new javax.swing.JButton();
        ins_btn = new javax.swing.JButton();
        book_btn = new javax.swing.JButton();
        quit_btn = new javax.swing.JButton();
        book_btn1 = new javax.swing.JButton();
        book_btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_panel.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("menu");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dis_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        dis_btn.setText("display all flights");
        dis_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dis_btnActionPerformed(evt);
            }
        });

        serach_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        serach_btn.setText("search flight");
        serach_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serach_btnActionPerformed(evt);
            }
        });

        del_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        del_btn.setText("delete flight");
        del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btnActionPerformed(evt);
            }
        });

        ins_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ins_btn.setText("insert flight");
        ins_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ins_btnActionPerformed(evt);
            }
        });

        book_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        book_btn.setText("book flight");
        book_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_btnActionPerformed(evt);
            }
        });

        quit_btn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        quit_btn.setText("quit");
        quit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btnActionPerformed(evt);
            }
        });

        book_btn1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        book_btn1.setText("cancel booking");
        book_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_btn1ActionPerformed(evt);
            }
        });

        book_btn2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        book_btn2.setText("display booked flights");
        book_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dis_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(serach_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(del_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ins_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(book_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quit_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(book_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(book_btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menu_panelLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dis_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(serach_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(book_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(book_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(book_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ins_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(del_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new delframe().setVisible(true);
    }//GEN-LAST:event_del_btnActionPerformed

    private void quit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "bye bye :)" );
        exit(0);
    }//GEN-LAST:event_quit_btnActionPerformed

    private void dis_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dis_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new disframe().setVisible(true);
    }//GEN-LAST:event_dis_btnActionPerformed

    private void serach_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serach_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new searchframe().setVisible(true);
    }//GEN-LAST:event_serach_btnActionPerformed

    private void ins_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ins_btnActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new insframe().setVisible(true);
    }//GEN-LAST:event_ins_btnActionPerformed

    private void book_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new bookframe().setVisible(true);
    }//GEN-LAST:event_book_btnActionPerformed

    private void book_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_btn1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new cancelbframe().setVisible(true);
    }//GEN-LAST:event_book_btn1ActionPerformed

    private void book_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_btn2ActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new dispbframe().setVisible(true);
    }//GEN-LAST:event_book_btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book_btn;
    private javax.swing.JButton book_btn1;
    private javax.swing.JButton book_btn2;
    private javax.swing.JButton del_btn;
    private javax.swing.JButton dis_btn;
    private javax.swing.JButton ins_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JButton quit_btn;
    private javax.swing.JButton serach_btn;
    // End of variables declaration//GEN-END:variables
}