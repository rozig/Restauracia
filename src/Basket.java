import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Basket extends JFrame {
    Connection conn=null;
    ResultSet rs = null;
    PreparedStatement pst= null;
    Statement stmt = null;
    String add1;
    public Basket() {
        initComponents();
        conn=ConnectDB.ConnectDb();
        Update_table();
    }
    private void Update_table() {
        try {
            String sql = "Select * from Basket";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            BasketTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        BasketTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        DeleteAllButton = new javax.swing.JButton();
        LoggedUser = new javax.swing.JLabel();
        LoggedName = new javax.swing.JLabel();
        SelectedItemNo = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        ttt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Сагс");
        setResizable(false);

        BasketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BasketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BasketTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BasketTable);

        DeleteButton.setText("Устгах");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        OrderButton.setText("Захиалах");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Буцах");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DeleteAllButton.setText("Бүгдийн устгах");
        DeleteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllButtonActionPerformed(evt);
            }
        });

        LoggedUser.setText("Нэвтэрсэн :");

        SelectedItemNo.setVisible(false);

        Address.setVisible(false);

        ttt.setVisible(false);
        ttt.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LoggedUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LoggedName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SelectedItemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DeleteAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(ttt)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoggedName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoggedUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ttt)
                .addGap(34, 34, 34)
                .addComponent(DeleteButton)
                .addGap(7, 7, 7)
                .addComponent(DeleteAllButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackButton)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelectedItemNo, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                    .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BasketTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasketTableMouseClicked
        try {
            int row = BasketTable.getSelectedRow();
            String Table_click =(BasketTable.getModel().getValueAt(row, 0).toString());
            String sql = "Select * from Basket where No='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()) {
                String add1 = rs.getString("No");
                SelectedItemNo.setText(add1);
            }
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_BasketTableMouseClicked

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        Shipping ship = new Shipping();
        ship.setVisible(true);
        this.dispose();
        this.setVisible(false);
        ship.RegisteredAddress.setText(Address.getText());
        ship.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        try {
            System.out.println("No :"+SelectedItemNo.getText());
            pst=conn.prepareStatement("Delete from Basket where No='"+SelectedItemNo.getText()+"'");
            //pst.setString(1, SelectedItemNo.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Устгагдлаа");
        }
        catch(Exception e) {
            System.err.println(e);
        }
        Update_table();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        int y=Integer.parseInt(ttt.getText());
        Menu menu = new Menu(y);
        menu.setVisible(true);
        this.dispose();
        this.setVisible(false);
        menu.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllButtonActionPerformed
        try {
            stmt = conn.createStatement();
            String sql = "TRUNCATE Basket";
            stmt.executeUpdate(sql);
            sql = "DELETE FROM Basket";
            stmt.executeUpdate(sql);
        }
        catch (Exception e) {
            System.err.println(e);
        }
        Update_table();
        JOptionPane.showMessageDialog(null,"Сагс хоослогдлоо");
    }//GEN-LAST:event_DeleteAllButtonActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basket().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Address;
    private javax.swing.JButton BackButton;
    private javax.swing.JTable BasketTable;
    private javax.swing.JButton DeleteAllButton;
    private javax.swing.JButton DeleteButton;
    public javax.swing.JLabel LoggedName;
    private javax.swing.JLabel LoggedUser;
    private javax.swing.JButton OrderButton;
    public javax.swing.JLabel SelectedItemNo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel ttt;
    // End of variables declaration//GEN-END:variables
}