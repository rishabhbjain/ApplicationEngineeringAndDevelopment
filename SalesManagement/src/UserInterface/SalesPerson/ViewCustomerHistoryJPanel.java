/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPerson;

import Business.Market;
import Business.Order;
import Business.OrderList;
import Business.SalesPerson;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabhjain
 */
public class ViewCustomerHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomerHistoryJPanel
     */
    private JPanel userProcessContainer;
    private Market market;
    private SalesPerson salesperson;

    ViewCustomerHistoryJPanel(JPanel userProcessContainer, Market market, SalesPerson salesperson) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.market = market;
        this.salesperson = salesperson;
        populateTable3();
    }
     public void populateTable3() {
        int rowcount = tblViewCustomer.getRowCount();
       DefaultTableModel dtm = (DefaultTableModel)tblViewCustomer.getModel();
      dtm.setRowCount(0);
      for(OrderList orderlist:salesperson.getOrderlistcatalog().getOrCatalog()){
    // for(Order order:orderlist.getOrderList()){
            Object [] row = new Object[2];
       row[0]=orderlist;
       row[1]=orderlist.getOrdertotalprice();
          //  row[2]=order;
         //  row[3]=order.getAmountprice();
            dtm.addRow(row);
     //   }
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

        jLabel3 = new javax.swing.JLabel();
        lblSalesPersonName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewCustomer = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("SALES CONSOLE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 40));

        lblSalesPersonName.setText("SALES PERSON NAME");
        add(lblSalesPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 170, 40));

        tblViewCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Invoice No", "Invoice Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewCustomer);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 200));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 210, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalesPersonName;
    private javax.swing.JTable tblViewCustomer;
    // End of variables declaration//GEN-END:variables
}
