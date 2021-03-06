/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagementPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author KD
 */
public class AddItem extends javax.swing.JFrame {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
    String loggedUser;

    /**
     * Creates new form AddItem
     */
    public AddItem() {
        initComponents();
        con = SQLiteConnection.connectorDB();
        productTable();
    }

    AddItem(String user) {
        loggedUser = user;
        
        initComponents();
        con = SQLiteConnection.connectorDB();
        productTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtSearchProduct = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchProduct = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Item");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(813, 450));

        txtSearchProduct.setBackground(new java.awt.Color(0, 0, 0));
        txtSearchProduct.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtSearchProduct.setForeground(new java.awt.Color(255, 255, 255));
        txtSearchProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchProductKeyReleased(evt);
            }
        });

        tblSearchProduct.setBackground(new java.awt.Color(0, 0, 0));
        tblSearchProduct.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tblSearchProduct.setForeground(new java.awt.Color(255, 255, 255));
        tblSearchProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Product Name", "Buying Rate", "Selling Rate", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSearchProduct.setGridColor(new java.awt.Color(0, 0, 0));
        tblSearchProduct.setRowHeight(29);
        tblSearchProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSearchProduct);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementPackage/3.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementPackage/4.jpg"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Shop Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchProduct)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 227, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchProductKeyReleased
        // TODO add your handling code here:
        String query = "select id, product_name, buying_rate, selling_rate, qty from products_list where product_name like ?";
        try {
            String tsp = txtSearchProduct.getText() + '%';
            pst = con.prepareStatement(query);
            pst.setString(1, tsp);
            rs = pst.executeQuery();
            tblSearchProduct.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSearchProductKeyReleased

    private void tblSearchProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchProductMouseClicked
        // TODO add your handling code here:
        try {
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        int row = tblSearchProduct.getSelectedRow();
        String tableClick = tblSearchProduct.getModel().getValueAt(row, 0).toString();
        String query = "select * from products_list where id = '" + tableClick + "'";

        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                String pName = rs.getString("product_name");
                String Rate = rs.getString("Selling_rate");
                String qty = rs.getString("qty");

                String quantity = JOptionPane.showInputDialog("Enter Quantity");
                
                int remainQty = Integer.parseInt(qty) - Integer.parseInt(quantity);
                if(remainQty<0){
                    JOptionPane.showMessageDialog(null, "Stock Limited!");
                    
                    new ServiceEnd(loggedUser).setVisible(true);
                    dispose();
                    
                } else {
                    Float amount = Float.parseFloat(Rate) * Float.parseFloat(quantity);

                    rs.close();
                    pst.close();

                    try {
                        String query2 = "insert into temp_trans (product_name, rate, qty, amount, trans_by) values(?,?,?,?,?)";

                        pst = con.prepareStatement(query2);
                        pst.setString(1, pName);
                        pst.setString(2, Rate);
                        pst.setString(3, quantity);
                        pst.setString(4, amount.toString());
                        pst.setString(5, loggedUser);

                        pst.execute();

                        rs.close();
                        pst.close();

                        ServiceEnd se = new ServiceEnd(loggedUser);
                        se.setVisible(true);

                        dispose();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblSearchProductMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new ServiceEnd().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
    }

    public void productTable() {
        String query = "select id, product_name, buying_rate, selling_rate, qty from products_list";
        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tblSearchProduct.setModel(DbUtils.resultSetToTableModel(rs));

            rs.close();
            pst.close();

        }catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSearchProduct;
    private javax.swing.JTextField txtSearchProduct;
    // End of variables declaration//GEN-END:variables
}
