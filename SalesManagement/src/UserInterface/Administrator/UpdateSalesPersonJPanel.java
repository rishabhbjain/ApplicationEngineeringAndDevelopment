/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Administrator;

import Business.SalesPerson;
import UserInterface.Supplier.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class UpdateSalesPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSupplier
     */
    private JPanel userProcessContainer;
    private SalesPerson salesperson;

    UpdateSalesPersonJPanel(JPanel userProcessContainer, SalesPerson salesperson) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.salesperson =salesperson;
        displayinfo();
    }
    
    public void displayinfo() {
        txtSalesPersonID.setText(String.valueOf(salesperson.getSalesPersonId()));
        txtSalesPersonName.setText(salesperson.getSalesPersonName());
        txtSalesPersonUserName.setText(salesperson.getSalesPersonUsername());
        txtSalesPersonPassword.setText(salesperson.getSalesPersonPassword());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalesPersonUserName = new javax.swing.JTextField();
        txtSalesPersonID = new javax.swing.JTextField();
        txtSalesPersonName = new javax.swing.JTextField();
        btnUpdateSalesPerson = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSalesPersonPassword = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Update Sales Person");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Sales Person ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Sales Person Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("User Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));
        add(txtSalesPersonUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 170, -1));

        txtSalesPersonID.setEditable(false);
        txtSalesPersonID.setEnabled(false);
        add(txtSalesPersonID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 170, -1));
        add(txtSalesPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, -1));

        btnUpdateSalesPerson.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnUpdateSalesPerson.setText("Update");
        btnUpdateSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSalesPersonActionPerformed(evt);
            }
        });
        add(btnUpdateSalesPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));
        add(txtSalesPersonPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        SalespersonJPanel sp = (SalespersonJPanel) component;
        sp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSalesPersonActionPerformed
        // TODO add your handling code here:
        if(txtSalesPersonID.getText().equals("") || txtSalesPersonName.getText().equals("") || txtSalesPersonUserName.getText().equals("")|| txtSalesPersonPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please input all the content");
        }else{
            int salesPersonID = Integer.parseInt(txtSalesPersonID.getText());
            String salesPersonName = txtSalesPersonName.getText();
            String salesPersonUserName = txtSalesPersonUserName.getText();
            String salesPersonPassword = txtSalesPersonPassword.getText();
            salesperson.setSalesPersonId(salesPersonID);
            salesperson.setSalesPersonName(salesPersonName);
            salesperson.setSalesPersonUsername(salesPersonUserName);
            salesperson.setSalesPersonPassword(salesPersonPassword);



            JOptionPane.showMessageDialog(null,"Updated successufully");
        }
    }//GEN-LAST:event_btnUpdateSalesPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdateSalesPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtSalesPersonID;
    private javax.swing.JTextField txtSalesPersonName;
    private javax.swing.JTextField txtSalesPersonPassword;
    private javax.swing.JTextField txtSalesPersonUserName;
    // End of variables declaration//GEN-END:variables
}
