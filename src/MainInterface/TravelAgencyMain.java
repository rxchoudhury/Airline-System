package MainInterface;

import ManageAirlinesInterface.ManageAirlinersWorkAreaJPanel;
import CustomerInterface.ManageCustomersWorkAreaJPanel;
import ManageTravelAgencyInterface.ManageTravelAgencyWorkAreaJPanel;
import Business.TravelAgency;
import Business.AirlinerDirectory;
import Business.Initialize;
import java.awt.CardLayout;

public class TravelAgencyMain extends javax.swing.JFrame {
private TravelAgency travelAgency;  

    /**
     * Creates new form MainJFrame
     */
    public TravelAgencyMain() {
        initComponents();
        Initialize initialize = new Initialize();
        this.travelAgency = initialize.travelAgency;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageTravelAgency = new javax.swing.JButton();
        btnManageAirliners = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnManageTravelAgency.setText("Manage Travel Agency");
        btnManageTravelAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTravelAgencyActionPerformed(evt);
            }
        });

        btnManageAirliners.setText("Manage Airliners");
        btnManageAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinersActionPerformed(evt);
            }
        });

        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnManageTravelAgency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageAirliners, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageTravelAgency)
                .addGap(48, 48, 48)
                .addComponent(btnManageAirliners)
                .addGap(41, 41, 41)
                .addComponent(btnManageCustomers)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setPreferredSize(new java.awt.Dimension(500, 500));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTravelAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTravelAgencyActionPerformed
        ManageTravelAgencyWorkAreaJPanel panel = new ManageTravelAgencyWorkAreaJPanel(userProcessContainer, travelAgency);
        userProcessContainer.add("ManageTravelAgencyWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageTravelAgencyActionPerformed

    private void btnManageAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinersActionPerformed
        // TODO add your handling code here:
        ManageAirlinersWorkAreaJPanel panel = new ManageAirlinersWorkAreaJPanel(userProcessContainer, travelAgency);
        userProcessContainer.add("ManageAirlinersWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAirlinersActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        // TODO add your handling code here:
        ManageCustomersWorkAreaJPanel panel = new ManageCustomersWorkAreaJPanel(userProcessContainer, travelAgency);
        userProcessContainer.add("ManageCustomersWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

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
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAirliners;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageTravelAgency;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
