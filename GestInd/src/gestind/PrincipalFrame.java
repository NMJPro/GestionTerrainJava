/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestind;

/**
 *
 * @author axel tsotie
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    public PrincipalFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCreerIndust = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCreerPar = new javax.swing.JMenuItem();
        mnuListerPar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCreerLoc = new javax.swing.JMenuItem();
        mnuListerLoc = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuCreerInvest = new javax.swing.JMenuItem();
        mnuListerInvest = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        jMenu1.setText("Industriel");

        mnuCreerIndust.setText("creation");
        jMenu1.add(mnuCreerIndust);

        jMenuItem2.setText("Lister");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Parcelle");

        mnuCreerPar.setText("Creation");
        jMenu2.add(mnuCreerPar);

        mnuListerPar.setText("Lister");
        mnuListerPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListerParActionPerformed(evt);
            }
        });
        jMenu2.add(mnuListerPar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Localisation");

        mnuCreerLoc.setText("Creation");
        mnuCreerLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreerLocActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCreerLoc);

        mnuListerLoc.setText("Lister");
        jMenu3.add(mnuListerLoc);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Investissement");

        mnuCreerInvest.setText("Creation");
        mnuCreerInvest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreerInvestActionPerformed(evt);
            }
        });
        jMenu4.add(mnuCreerInvest);

        mnuListerInvest.setText("Lister");
        jMenu4.add(mnuListerInvest);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuListerParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListerParActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuListerParActionPerformed

    private void mnuCreerLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreerLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCreerLocActionPerformed

    private void mnuCreerInvestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreerInvestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCreerInvestActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuCreerIndust;
    private javax.swing.JMenuItem mnuCreerInvest;
    private javax.swing.JMenuItem mnuCreerLoc;
    private javax.swing.JMenuItem mnuCreerPar;
    private javax.swing.JMenuItem mnuListerInvest;
    private javax.swing.JMenuItem mnuListerLoc;
    private javax.swing.JMenuItem mnuListerPar;
    // End of variables declaration//GEN-END:variables
}
