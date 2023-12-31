/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SistemManajemennya;
import Koneksinya.DBConnection;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author group
 */
public class Kasir extends javax.swing.JFrame {

    /**
     * Creates new form Bills
     */
    
    Integer EID, OID, PID, PQuantity;
    Double Totals, ProdSalePrice, SubTotal;
    String Pname, Ename, date;

    public Kasir() {
        initComponents();

        AutoCompleteDecorator.decorate(ProductsCombo);
        try {
            Connection con = DBConnection.connection();
            PreparedStatement ps = con.prepareStatement("select distinct(ProdName) from Products");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ProductsCombo.addItem(rs.getString("ProdName"));
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Kasir.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.ResetFields();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BillNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DateField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        PaidAmountField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BalanceField = new javax.swing.JTextField();
        Return = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Orders = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        ProductsCombo = new javax.swing.JComboBox<>();
        UpdateButton = new javax.swing.JButton();
        TotalAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel7.setFont(new java.awt.Font("Georgia Pro Cond Black", 1, 38)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("KASIR UMKM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Bill No:");

        BillNo.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nama Produk:");

        CName.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        ProdQty.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tanggal:");

        DateField.setEditable(false);
        DateField.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Cashier Name:");

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price", "Prod Qty", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BillTable);

        AddButton.setBackground(new java.awt.Color(0, 204, 204));
        AddButton.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        AddButton.setText("Tambah");
        AddButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(0, 204, 204));
        DeleteButton.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        DeleteButton.setText("Hapus");
        DeleteButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel12.setText("Jumlah:");

        PaidAmountField.setBackground(new java.awt.Color(204, 204, 204));
        PaidAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaidAmountFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Jumlah yang dibayarkan:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Kembalian");

        BalanceField.setEditable(false);

        Return.setBackground(new java.awt.Color(0, 204, 204));
        Return.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        Return.setText("Return");
        Return.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        Print.setBackground(new java.awt.Color(0, 204, 204));
        Print.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        Print.setText("Print");
        Print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        Orders.setBackground(new java.awt.Color(0, 204, 204));
        Orders.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        Orders.setText("Old Orders");
        Orders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Log Out");

        LogOut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutdown.png"))); // NOI18N
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });

        ProductsCombo.setMaximumRowCount(100);

        UpdateButton.setBackground(new java.awt.Color(0, 204, 204));
        UpdateButton.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PaidAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(TotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(BillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ProductsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(BillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(ProductsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(BalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(PaidAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_LogOutMouseClicked

    private void OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Pemesanan().setVisible(true);
    }//GEN-LAST:event_OrdersActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        
        Pname = ProductsCombo.getSelectedItem().toString();
        PQuantity = Integer.parseInt(ProdQty.getText());

        ProdSalePrice = 0.0;
        SubTotal = 0.0;
        Totals = 0.0;

        try {
            Connection con = DBConnection.connection();

            PreparedStatement ps1 = con.prepareStatement("Select PID from Products where ProdName='" + Pname + "'");
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                PID = rs1.getInt("PID");
            }

            PreparedStatement ps2 = con.prepareStatement("Select ProdSalePrice from Products where PID=" + PID);
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                ProdSalePrice = rs2.getDouble("ProdSalePrice");
            }

            DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

            SubTotal = ProdSalePrice * PQuantity;

            Object row[] = {PID, Pname, ProdSalePrice, PQuantity, SubTotal};
            model.addRow(row);

            for (int i = 0; i < BillTable.getRowCount(); i++) {
                Totals = Totals + (Double) BillTable.getValueAt(i, 4);
            }
            TotalAmount.setText("Rs. " + Totals.toString());

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ProdQty.setText(null);
        ProductsCombo.setSelectedItem(null);
        ProductsCombo.setEnabled(true);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        PQuantity = Integer.parseInt(ProdQty.getText());
        model.setValueAt(PQuantity, BillTable.getSelectedRow(), 3);

        ProdSalePrice = (Double) model.getValueAt(BillTable.getSelectedRow(), 2);
        PQuantity = (Integer) model.getValueAt(BillTable.getSelectedRow(), 3);

        SubTotal = ProdSalePrice * PQuantity;
        model.setValueAt(SubTotal, BillTable.getSelectedRow(), 4);

        Totals = 0.0;
        for (int i = 0; i < BillTable.getRowCount(); i++) {
            Totals = Totals + Double.valueOf(String.valueOf(BillTable.getValueAt(i, 4)));
        }

        TotalAmount.setText("Rs. " + Totals.toString());
        
        ProdQty.setText(null);
        ProductsCombo.setSelectedItem(null);
        ProductsCombo.setEnabled(true);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        model.removeRow(BillTable.getSelectedRow());

        Totals = 0.0;
        for (int i = 0; i < BillTable.getRowCount(); i++) {
            Totals = Totals + (Double) BillTable.getValueAt(i, 4);
        }

        TotalAmount.setText("Rs. " + Totals.toString());
        
        ProdQty.setText(null);
        ProductsCombo.setSelectedItem(null);
        ProductsCombo.setEnabled(true);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PaidAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaidAmountFieldActionPerformed
        Double PaidAmount = Double.parseDouble(PaidAmountField.getText());
        Double bal = PaidAmount - Totals;
        BalanceField.setText(bal.toString());
    }//GEN-LAST:event_PaidAmountFieldActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try {
            Connection con = DBConnection.connection();

            OID = Integer.parseInt(BillNo.getText());
            EID = Integer.parseInt(Login.usernameField.getText());

            PreparedStatement ps1 = con.prepareStatement("Insert into Orders (OID, EID, OrdDate) values (" + OID + "," + EID + ",getdate())");
            ps1.executeUpdate();

            for (int i = 0; i < BillTable.getRowCount(); i++) {
                PreparedStatement ps = con.prepareStatement("Insert into OrderProduct (OID, PID, Quantity) values (" + OID + ", " + BillTable.getValueAt(i, 0) + "," + BillTable.getValueAt(i, 3) + ")");
                ps.executeUpdate();
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        this.ResetFields();

        try {
            boolean print = BillTable.print();
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print !!");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        String name = (String) model.getValueAt(BillTable.getSelectedRow(), 1);
        Integer qty = (Integer) model.getValueAt(BillTable.getSelectedRow(), 3);

        ProductsCombo.setSelectedItem(name);
        ProdQty.setText(qty.toString());
        
        ProductsCombo.setEnabled(false);
    }//GEN-LAST:event_BillTableMouseClicked
    
    public void ResetFields() {
        try {
            Connection con = DBConnection.connection();

            OID = 0;
            Ename = "";
            EID = Integer.parseInt(Login.usernameField.getText());

            PreparedStatement ps1 = con.prepareStatement("select EmpFirstName from Employee where EID = " + EID);
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                Ename = rs1.getString("EmpFirstName");
            }

            PreparedStatement ps2 = con.prepareStatement("select top 1 OID + 1 as NewOID from Orders order by OID desc");
            ResultSet rs2 = ps2.executeQuery();
            while (rs2.next()) {
                OID = Integer.parseInt(rs2.getString("NewOID"));
            }

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            CName.setText(Ename);
            BillNo.setText(OID.toString());
            DateField.setText(dtf.format(now));

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        DefaultTableModel dm = (DefaultTableModel) BillTable.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        TotalAmount.setText("");
        PaidAmountField.setText("");
        BalanceField.setText("");
        ProdQty.setText("");
        ProductsCombo.setSelectedItem("");
        ProductsCombo.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField BalanceField;
    private javax.swing.JTextField BillNo;
    private javax.swing.JTable BillTable;
    private javax.swing.JTextField CName;
    private javax.swing.JTextField DateField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton Orders;
    private javax.swing.JTextField PaidAmountField;
    private javax.swing.JButton Print;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JComboBox<String> ProductsCombo;
    private javax.swing.JButton Return;
    private javax.swing.JLabel TotalAmount;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
