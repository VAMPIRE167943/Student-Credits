/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javafa3;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jason
 */
public class Futa extends javax.swing.JFrame {

    /**
     * Creates new form Futa
     */
    public Futa() {
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

        cough = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        choke = new javax.swing.JButton();
        swallow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Enter Amount:");

        choke.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        choke.setForeground(new java.awt.Color(255, 0, 0));
        choke.setText("Deposit");
        choke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chokeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(swallow)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(choke)
                        .addComponent(cough, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(swallow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cough, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(choke)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chokeActionPerformed
        Integer uncensored = 0;
        Double censored = 0.00;
        try{
            Integer maidenless = Integer.parseInt(swallow.getText());
            Connection skrrt =  DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "Jason1601");
            PreparedStatement yeet = skrrt.prepareStatement("SELECT * FROM users WHERE ID = ?");
            yeet.setInt(1, maidenless);
            ResultSet nyanpasu = yeet.executeQuery();
            if(nyanpasu.next()){
                uncensored = nyanpasu.getInt("ID");
                censored = nyanpasu.getDouble("CURRENTBALANCE");
            }else{
                JOptionPane.showMessageDialog(null, "Nah fam, too much");
                }
        } catch(HeadlessException | NumberFormatException | SQLException rule34){
            JOptionPane.showMessageDialog(null, "*yawn* Nighty night");
        }               
        if(Double.parseDouble(cough.getText()) > 10000);
        try{
            Connection drip =  DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "Jason1601");
            Double thicc = (censored + Integer.parseInt(cough.getText()));
            PreparedStatement shawty = drip.prepareStatement("UPDATE users SET CURRENTBALANCE = " + thicc + "WHERE ID = " + uncensored);
            shawty.executeUpdate();
            JOptionPane.showMessageDialog(null, "*happy atm-chan noises*");
        } catch(HeadlessException | NumberFormatException | SQLException rule34){
            JOptionPane.showMessageDialog(null, "*yawn* Nighty night");
        }
    }//GEN-LAST:event_chokeActionPerformed

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
            java.util.logging.Logger.getLogger(Futa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Futa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Futa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Futa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Futa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choke;
    private javax.swing.JTextField cough;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel swallow;
    // End of variables declaration//GEN-END:variables
}
