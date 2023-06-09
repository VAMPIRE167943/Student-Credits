/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javafa3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

/**
 *
 * @author jason
 */
public class Thighs extends javax.swing.JFrame {

    /**
     * Creates new form Thighs
     */
    public Thighs() {
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

        jLabel1 = new javax.swing.JLabel();
        bikini = new javax.swing.JButton();
        briefs = new javax.swing.JButton();
        cat_girls = new javax.swing.JButton();
        dog_girls = new javax.swing.JButton();
        hentie = new javax.swing.JButton();
        isekai = new javax.swing.JButton();
        gal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Main Menu");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bikini.setForeground(new java.awt.Color(255, 0, 0));
        bikini.setText("Check The balance");
        bikini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikiniActionPerformed(evt);
            }
        });

        briefs.setForeground(new java.awt.Color(255, 0, 0));
        briefs.setText("Deposit");
        briefs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                briefsActionPerformed(evt);
            }
        });

        cat_girls.setForeground(new java.awt.Color(255, 0, 0));
        cat_girls.setText("Withdraw");
        cat_girls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat_girlsActionPerformed(evt);
            }
        });

        dog_girls.setForeground(new java.awt.Color(255, 0, 0));
        dog_girls.setText("Print Statement");
        dog_girls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dog_girlsActionPerformed(evt);
            }
        });

        hentie.setForeground(new java.awt.Color(255, 0, 0));
        hentie.setText("<< Back");
        hentie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hentieActionPerformed(evt);
            }
        });

        isekai.setForeground(new java.awt.Color(255, 0, 0));
        isekai.setText("Exit");
        isekai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isekaiActionPerformed(evt);
            }
        });

        gal.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(briefs, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dog_girls, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bikini, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cat_girls, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hentie, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isekai, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(gal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(gal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bikini, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(hentie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cat_girls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dog_girls, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(isekai, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(briefs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isekaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isekaiActionPerformed
        System.exit(0);
    }//GEN-LAST:event_isekaiActionPerformed

    private void hentieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hentieActionPerformed
        Senpai baka = new Senpai();
        this.setVisible(false);
        baka.setVisible(true);
    }//GEN-LAST:event_hentieActionPerformed

    private void cat_girlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat_girlsActionPerformed
        Kinky steamy = new Kinky();
        this.setVisible(false);
        steamy.setVisible(true);
        steamy.stelthy_escort.hide();
        steamy.stelthy_escort.setText(gal.getText());
    }//GEN-LAST:event_cat_girlsActionPerformed

    private void bikiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikiniActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");           
            Integer incest = Integer.parseInt(gal.getText());
            Connection shorts = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "Jason1601");
            PreparedStatement imouto = shorts.prepareStatement("SELECT * FROM users WHERE ID = ?");
            imouto.setInt(1, incest);
            ResultSet ecchi = imouto.executeQuery();
            if(ecchi.next()){
                double spicy = ecchi.getDouble("INITIALBALANCE");
                double fishnets = ecchi.getDouble("CURRENTBALANCE");               
                JOptionPane.showMessageDialog(null, "Initial Balance: " + spicy + "\nCurrent Balance: " + fishnets);
            }
        } catch (SQLException | ClassNotFoundException | NumberFormatException  ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_bikiniActionPerformed

    private void briefsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_briefsActionPerformed
        Futa slurp = new Futa();
        slurp.setVisible(true);
        this.setVisible(false);
        slurp.swallow.hide();
        slurp.swallow.setText(gal.getText());
    }//GEN-LAST:event_briefsActionPerformed

    private void dog_girlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dog_girlsActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");           
            Integer incest = Integer.parseInt(gal.getText());
            Connection shorts = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "Jason1601");
            PreparedStatement imouto = shorts.prepareStatement("SELECT * FROM users WHERE ID = ?");
            imouto.setInt(1, incest);
            ResultSet ecchi = imouto.executeQuery();
            if(ecchi.next()){
                String spicy = ecchi.getString("USERNAME");
                double fishnets = ecchi.getDouble("CURRENTBALANCE");
                DateTimeFormatter succubus = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime simp = LocalDateTime.now();               
                JOptionPane.showMessageDialog(null, "\nCurrent Balance: " + fishnets + "\nName: " + spicy + "\nDate: " + succubus.format(simp));
            }
        } catch (SQLException | ClassNotFoundException | NumberFormatException  ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_dog_girlsActionPerformed

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
            java.util.logging.Logger.getLogger(Thighs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thighs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thighs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thighs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thighs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bikini;
    private javax.swing.JButton briefs;
    private javax.swing.JButton cat_girls;
    private javax.swing.JButton dog_girls;
    public javax.swing.JLabel gal;
    private javax.swing.JButton hentie;
    private javax.swing.JButton isekai;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
