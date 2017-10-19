/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMDUI;

import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alec Shunnarah
 */
public class ProductView extends javax.swing.JFrame {

    /**
     * Creates new form AddNewProduct
     */
    public ProductView() {
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
        txtProductID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtExpirationDate = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        txtVendor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Product ID:");

        jLabel2.setText("Price:");

        jLabel3.setText("Initial Stock:");

        jLabel4.setText("Product Name");

        txtProductName.setColumns(20);

        jLabel5.setText("Expiration Date(YYYY/MM/DD):");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtVendor.setColumns(10);
        txtVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendorActionPerformed(evt);
            }
        });

        jLabel6.setText("Vendor");

        btnCreate.setText("Save Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View Product");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(35, 35, 35)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(txtQuantity))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnView)
                    .addComponent(btnCreate))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // "Cancel" button navigates back to ManageProducts page
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        new HomeUI().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed


    private void txtVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendorActionPerformed


    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String name, vendor, expDate;
        double price, count, quantity;
        int id = Integer.parseInt(txtProductID.getText());
        price = Double.parseDouble(txtPrice.getText());
        count = Double.parseDouble(txtQuantity.getText());
        quantity = Double.parseDouble(txtQuantity.getText());
        name = txtProductName.getText();
        expDate = txtExpirationDate.getText();

        Product product = new Product();
        product.setProductID(id);
        product.setPrice(price);
        product.setCount(quantity);
        product.setName(txtProductName.getText());
        product.setVendor(txtVendor.getText());
        product.setExpirationDate(Date.valueOf(txtExpirationDate.getText()));

        if (SoftwareModelingDesignCourseProject.getInstance().getDataAdapter().saveProduct(product)) {
            JOptionPane.showMessageDialog(null, "Product saved to Database!");
        } else {
            JOptionPane.showMessageDialog(null, "Error! Product was not added!");
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int id = Integer.parseInt(txtProductID.getText());
        Product product = SoftwareModelingDesignCourseProject.getInstance().getDataAdapter().loadProduct(id);
        if (product == null) {
            JOptionPane.showMessageDialog(null, "No product with that ID!");
            return;
        }

        txtProductID.setText(String.valueOf(product.getProductID()));
        txtProductName.setText(product.getName());
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtQuantity.setText(String.valueOf(product.getCount()));
        txtVendor.setText(product.getVendor());
        txtExpirationDate.setText(String.valueOf(product.getExpirationDate()));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtExpirationDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtVendor;
    // End of variables declaration//GEN-END:variables
}
