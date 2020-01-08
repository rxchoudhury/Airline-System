/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageAirlinesInterface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.FlightSchedule;
import Business.MasterTravelSchedule;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author quanpeng
 */
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {

    private TravelAgency travelAgency;
    private Airliner airliner;
    /**
     * Creates new form CreateNewAirliners
     */
    JPanel userProcessContainer;

    CreateNewAirlinerJPanel(JPanel userProcessContainer, TravelAgency travelAgency, FlightSchedule flightschedule) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travelAgency = travelAgency;
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
        jLabel2 = new javax.swing.JLabel();
        airlinerNameTxt = new javax.swing.JTextField();
        saveNewAirlinerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Create New Airliners");

        jLabel2.setText("Airliner Name:");

        saveNewAirlinerBtn.setText("Create Airliners");
        saveNewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewAirlinerBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel2))
                            .addComponent(backBtn))
                        .addGap(15, 15, 15)
                        .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveNewAirlinerBtn)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(backBtn)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(saveNewAirlinerBtn)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        // refreshTable
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersWorkAreaJPanel manageAirlinersWorkAreaJPanel = (ManageAirlinersWorkAreaJPanel) component;
        manageAirlinersWorkAreaJPanel.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_backBtnActionPerformed

    private void saveNewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewAirlinerBtnActionPerformed
        // TODO add your handling code here:
        if (airlinerNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Airliner airliner = travelAgency.getAirlinerDir().addAirliner();
        airliner.setAirlinerName(airlinerNameTxt.getText());
        // Create new flightSchedule for the airliner
        FlightSchedule fSCatalog = new FlightSchedule();
        airliner.setFSCatalog(fSCatalog);
        fSCatalog = travelAgency.getMTS().addFlightSchedule();
        // Pass the airliner object to next card
        this.airliner = airliner;
        
        JOptionPane.showMessageDialog(null, "Airliner Successfully created.");
    }//GEN-LAST:event_saveNewAirlinerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton saveNewAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
