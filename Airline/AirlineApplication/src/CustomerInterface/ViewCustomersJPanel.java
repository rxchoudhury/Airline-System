/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerInterface;


import Business.Airliner;
import Business.Flight;
import Business.FlightSchedule;
import Business.Person;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author quanpeng
 */

public class ViewCustomersJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
    private TravelAgency travelAgency;
    private Flight flight;
    private Airliner airliner;
    private FlightSchedule flightschedulel;

    /**
     * Creates new form ViewCustomersJPanel
     */
    public ViewCustomersJPanel(JPanel userProcessContainer, TravelAgency travelAgency, Airliner airliner, FlightSchedule flightschedulel) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.travelAgency = travelAgency;
         this.airliner = airliner;
        this.flightschedulel = flightschedulel;
            populateTable();
            
    }

    public void populateTable() {
    
        DefaultTableModel dtm = (DefaultTableModel) ViewCustomerstbl.getModel();
        dtm.setRowCount(0);
        for (Person person: travelAgency.getCustomerDir().getCD())
        {
            Object[] row = new Object[9];
            row[0] = "UA123";
            row[1] = "United Airlines";
            row[2] = "5:10";
            row[3] = "9:55";
            row[4] = 150;
            row[5] = person.getFirstName();
            row[6] = person.getLastName();
            row[7] = 2;
            row[8] = 1;
            
        
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        ViewCustomerstbl = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("View Customers Reservation");

        ViewCustomerstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight No.", "Airliner Name", "Dep Time", "Arr TIme", "Price", "First Name", "Last Name", "Row", "Column"
            }
        ));
        jScrollPane.setViewportView(ViewCustomerstbl);

        btnDelete.setText("Cancel Flight");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(196, 196, 196)
                                .addComponent(btnDelete)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(backBtn))
                .addContainerGap(411, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow =ViewCustomerstbl.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton =JOptionPane.YES_NO_OPTION;
            int dialogResult =JOptionPane.showConfirmDialog(null, "Would you like to delete the flight details?", "Warning", dialogButton);
            if (dialogResult ==JOptionPane.YES_OPTION){
                DefaultTableModel dm = (DefaultTableModel)ViewCustomerstbl.getModel();
        //while(dm.getRowCount() > 0){
                dm.removeRow(selectedRow);
        //}
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE );
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable ViewCustomerstbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
