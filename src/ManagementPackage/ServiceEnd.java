/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagementPackage;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author KD
 */
public class ServiceEnd extends javax.swing.JFrame {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    private float total = 0;
    private float adjustment = 0;
    private float totalPaid = 0;
    
    String TransNo;
    
    String formatedDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());;
    String formatedDateTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.S").format(new Date());;
    
    String user;

    /**
     * Creates new form ServiceEnd
     */
    public ServiceEnd() {
        initComponents();
        con = SQLiteConnection.connectorDB();

        updateTable();
    }

    ServiceEnd(String text) {
        
        user = text;
        initComponents();
        con = SQLiteConnection.connectorDB();

        updateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSellsProduct = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtDone = new javax.swing.JButton();
        txtClear = new javax.swing.JButton();
        txtAdjust = new javax.swing.JTextField();
        txtTotalPaid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Service End");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tableSellsProduct.setAutoCreateRowSorter(true);
        tableSellsProduct.setBackground(new java.awt.Color(0, 0, 0));
        tableSellsProduct.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tableSellsProduct.setForeground(new java.awt.Color(255, 255, 255));
        tableSellsProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSellsProduct.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableSellsProduct);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTotal.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adjustment");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Paid");

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(0, 0, 0));
        btnRemove.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        txtDone.setBackground(new java.awt.Color(0, 0, 0));
        txtDone.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtDone.setForeground(new java.awt.Color(255, 255, 255));
        txtDone.setText("Done");
        txtDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoneActionPerformed(evt);
            }
        });

        txtClear.setBackground(new java.awt.Color(0, 0, 0));
        txtClear.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtClear.setForeground(new java.awt.Color(255, 255, 255));
        txtClear.setText("Clear");
        txtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearActionPerformed(evt);
            }
        });

        txtAdjust.setBackground(new java.awt.Color(0, 0, 0));
        txtAdjust.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtAdjust.setForeground(new java.awt.Color(255, 255, 255));
        txtAdjust.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAdjust.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdjustKeyReleased(evt);
            }
        });

        txtTotalPaid.setEditable(false);
        txtTotalPaid.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalPaid.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtTotalPaid.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPaid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementPackage/3.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagementPackage/4.jpg"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Shop Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAdjust, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRemove)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdjust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnRemove)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDone)
                            .addComponent(txtClear))))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jMenu1.setText("Extras");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Add Item");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Change Password");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddItem ai = new AddItem(user);
        ai.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        try {
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        int row = tableSellsProduct.getSelectedRow();
        String tableClick = tableSellsProduct.getModel().getValueAt(row, 0).toString();
        String query = "delete from temp_trans where product_name = '" + tableClick + "'";
        try {
            pst = con.prepareStatement(query);
            pst.execute();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateTable();
        updateToal();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtAdjustKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdjustKeyReleased
        // TODO add your handling code here:
        adjustment = Float.parseFloat(txtAdjust.getText());
        totalPaid = total-adjustment;
        txtTotalPaid.setText(String.valueOf(totalPaid));
    }//GEN-LAST:event_txtAdjustKeyReleased

    private void txtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearActionPerformed
        // TODO add your handling code here:
        clearTempTable();
        
    }//GEN-LAST:event_txtClearActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new Login().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoneActionPerformed
        // TODO add your handling code here:
        Document doc = new Document();
        try {
            long time = new Date().getTime();
            TransNo = ""+time;
            PdfWriter.getInstance(doc, new FileOutputStream("Invoices\\Invoices" + time + ".pdf"));
            doc.open();
            
            PdfPTable table = new PdfPTable(4);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Shop Management System \n\n", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD, BaseColor.WHITE)));
            cell1.setColspan(10);
            cell1.setPadding(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setBackgroundColor(BaseColor.BLACK);
            table.addCell(cell1);
            
            PdfPCell cell21 = new PdfPCell(new Paragraph("\n\n"));
            cell21.setColspan(10);
            cell21.setBorder(2);
            cell21.setBorderColorLeft(BaseColor.WHITE);
            table.addCell(cell21);
            
            PdfPCell cell2 = new PdfPCell(new Paragraph("Invoice/Money Receipt\n"));
            cell2.setColspan(10);
            cell2.setPadding(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell2); 
           
            PdfPCell cell3 = new PdfPCell(new Paragraph("Transaction No: " + time, FontFactory.getFont(null, 10)));
            cell3.setColspan(2);
            cell3.setPaddingBottom(10);
            cell3.setPaddingTop(10);
            cell3.setBorder(2);
            cell3.setBorderColorLeft(BaseColor.WHITE);
            table.addCell(cell3);
            
            PdfPCell cell4 = new PdfPCell(new Paragraph("Date: "+formatedDateTime, FontFactory.getFont(null, 10)));
            cell4.setColspan(3);
            cell4.setPaddingBottom(10);
            cell4.setPaddingTop(10);
            cell4.setBorder(2);
            cell4.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell4.setBorderColorRight(BaseColor.WHITE);
            table.addCell(cell4);
            
            //table.addCell("Sl No");
            table.addCell("Product Name");
            table.addCell("Rate");
            table.addCell("Qty");
            table.addCell("Amount (TK)");
            
            String query = "select product_name, rate, qty, amount from temp_trans WHERE trans_by = '"+user+"'";
            try {
                pst = con.prepareStatement(query);
                rs = pst.executeQuery();
                while (rs.next()) {
                    //String sl_no = rs.getString("sl_no");
                    String product_name = rs.getString("product_name");
                    String rate = rs.getString("rate");
                    String qty = rs.getString("qty");
                    String amount = rs.getString("amount");
                    
                    //table.addCell(sl_no);
                    table.addCell(product_name);
                    table.addCell(rate);
                    table.addCell(qty);
                    
                    PdfPCell cellAmount = new PdfPCell(new Paragraph(amount));
                    cellAmount.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    table.addCell(cellAmount);
                }
                rs.close();
                pst.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            PdfPCell cellb = new PdfPCell(new Paragraph(" "));
            cellb.setColspan(10);
            cellb.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(cellb);
            
            //
            PdfPCell celltxtTotal = new PdfPCell(new Paragraph("Total"));
            celltxtTotal.setColspan(3);
            celltxtTotal.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(celltxtTotal);
            
            PdfPCell celltxtTotal1 = new PdfPCell(new Paragraph(txtTotal.getText()));
            celltxtTotal1.setColspan(2);
            celltxtTotal1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(celltxtTotal1);
            
            PdfPCell celltxtAdjust = new PdfPCell(new Paragraph("Adjustment"));
            celltxtAdjust.setColspan(3);
            celltxtAdjust.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(celltxtAdjust);
            
            PdfPCell celltxtAdjust1 = new PdfPCell(new Paragraph(txtAdjust.getText()));
            celltxtAdjust1.setColspan(2);
            celltxtAdjust1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(celltxtAdjust1);
            
            PdfPCell celltxtTotalPaid = new PdfPCell(new Paragraph("Billed By: " + user));
            celltxtTotalPaid.setColspan(2);
            //celltxtTotalPaid.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(celltxtTotalPaid);
            
            PdfPCell celltxtTotalPaid0 = new PdfPCell(new Paragraph("Total Paid"));
            celltxtTotalPaid0.setColspan(1);
            celltxtTotalPaid0.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(celltxtTotalPaid0);
            
            PdfPCell celltxtTotalPaid1 = new PdfPCell(new Paragraph(txtTotalPaid.getText()));
            celltxtTotalPaid1.setColspan(2);
            celltxtTotalPaid1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(celltxtTotalPaid1);
            
            doc.add(table);
            
            doc.close();
            
            savePermanently();
            clearTempTable();
            //JOptionPane.showMessageDialog(null, "Report Created!");
            
            // open PDF file
            File file = new File("Invoices\\Invoices" + time + ".pdf");
                if (file.toString().endsWith(".pdf")) 
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
                else {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(file);
                }
            
        } catch (DocumentException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtDoneActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        AddItem ai = new AddItem(user);
        ai.setVisible(true);

        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new ChangePassword(user).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceEnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSellsProduct;
    private javax.swing.JTextField txtAdjust;
    private javax.swing.JButton txtClear;
    private javax.swing.JButton txtDone;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalPaid;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        DefaultTableCellRenderer rightRender = new DefaultTableCellRenderer();
        rightRender.setHorizontalAlignment(SwingConstants.RIGHT);
        tableSellsProduct.getColumnModel().getColumn(3).setCellRenderer(rightRender);
        String query = "select product_name, rate, qty, amount from temp_trans WHERE trans_by = '"+user+"'";
        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            tableSellsProduct.setModel(DbUtils.resultSetToTableModel(rs));

            updateToal();
            rs.close();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateToal() {
        total = 0; adjustment = 0; totalPaid = 0;
        String query = "select sl_no, product_name, rate, qty, amount from temp_trans WHERE trans_by = '"+user+"'";
        try {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String value = rs.getString("amount");
                total = total + Float.parseFloat(value);
            }
            totalPaid = (float) Math.floor(total);
            adjustment = total - totalPaid;

            txtTotal.setText(String.valueOf(total));
            txtAdjust.setText(String.valueOf(adjustment));
            txtTotalPaid.setText(String.valueOf(totalPaid));

            rs.close();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearTempTable() {
        try {
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query = "delete from temp_trans WHERE trans_by = '"+user+"'";
        try {
            pst = con.prepareStatement(query);
            pst.execute();
            total = 0;
            adjustment = 0;
            totalPaid = 0;
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query1 = "delete from sqlite_sequence where name='temp_trans'";
        try {
            pst = con.prepareStatement(query1);
            pst.execute();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        updateTable();
    }

    private void savePermanently() {
        int rows = tableSellsProduct.getRowCount();

        for(int row = 0; row<rows; row++){
            String productName = tableSellsProduct.getValueAt(row, 0).toString();
            String rate = tableSellsProduct.getValueAt(row, 1).toString();
            String qty = tableSellsProduct.getValueAt(row, 2).toString(); 
            String amount = tableSellsProduct.getValueAt(row, 3).toString(); 
            String totalqty = null;
            
                try {
                    rs.close();
                    pst.close();
                
                    String query1 = "insert into trans_details (trans_no, date, product_name, rate, qty, amount, trans_by) values(?,?,?,?,?,?,?)";
                    
                    pst = con.prepareStatement(query1);
                    
                    pst.setString(1, TransNo);
                    pst.setString(2, formatedDate);
                    pst.setString(3, productName);
                    pst.setString(4, rate);
                    pst.setString(5, qty);
                    pst.setString(6, amount);
                    pst.setString(7, user);

                    pst.execute();

                    rs.close();
                    pst.close();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                
                // quantity
                String query3 = "select qty from products_list WHERE product_name = '"+productName+"'";
                try {
                    rs.close();
                    pst.close();
                    
                    pst = con.prepareStatement(query3);
                    rs = pst.executeQuery();
                    totalqty = rs.getString("qty");
                    
                    rs.close();
                    pst.close();

                } catch (SQLException ex) {
                    Logger.getLogger(ServiceEnd.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                // decrease quantity
                try {
                    rs.close();
                    pst.close();
                    
                    int newQty = Integer.parseInt(totalqty) - Integer.parseInt(qty);
                
                    String query4 = "UPDATE products_list SET qty = '"+newQty+"' WHERE product_name = '"+productName+"'";
                    
                    pst = con.prepareStatement(query4);
                    
                    pst.execute();

                    rs.close();
                    pst.close();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        }
        
        // paid_amount database table
        
                String adjustment = txtAdjust.getText();
                String totalPaid = txtTotalPaid.getText();

                try {
                    rs.close();
                    pst.close();
                
                    String query2 = "insert into paid_amount (trans_no, adjustment, total_paid) values(?,?,?)";
                    
                    pst = con.prepareStatement(query2);
                    
                    pst.setString(1, TransNo);
                    pst.setString(2, adjustment);
                    pst.setString(3, totalPaid);

                    pst.execute();

                    rs.close();
                    pst.close();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                
    }
}
