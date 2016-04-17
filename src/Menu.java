import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    Timer timer;
    Calendar calendar;
    int currentSecond;
    public Menu(int m) {
        initComponents();
        reset();
        timer = new Timer();
        timer.scheduleAtFixedRate( new TimerTask(){
            public void run() {
                SimpleDateFormat sdf  = new SimpleDateFormat("hh:mm");
                if( currentSecond == 60 ) {
                    reset();
                }
                Time.setText( String.format("%s:%02d", sdf.format(calendar.getTime()), currentSecond ));
                currentSecond++;
            }
        }, 0, 1000);
        jLabel1.setText(m+"");
        LoggedName.setVisible(true);
    }
    private void reset() {
        calendar = Calendar.getInstance();
        currentSecond = calendar.get(Calendar.SECOND);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logout = new javax.swing.JButton();
        Basket = new javax.swing.JButton();
        ItemDescription2 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        ItemDescription3 = new javax.swing.JButton();
        ItemDescription1 = new javax.swing.JButton();
        LoggedUser = new javax.swing.JLabel();
        LoggedName = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ItemDescription4 = new javax.swing.JButton();
        ItemDescription5 = new javax.swing.JButton();
        ItemDescription6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Цэс");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Logout.setText("Гарах");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Basket.setText("Сагс");
        Basket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasketActionPerformed(evt);
            }
        });

        ItemDescription2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-Side-Salad.png"))); // NOI18N
        ItemDescription2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescription2ActionPerformed(evt);
            }
        });

        Exit.setText("Унтраах");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        ItemDescription3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-Chipotle-BBQ-Snack-Wrap-Crispy.png"))); // NOI18N
        ItemDescription3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescription3ActionPerformed(evt);
            }
        });

        ItemDescription1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-Big-Mac.png"))); // NOI18N
        ItemDescription1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescription1ActionPerformed(evt);
            }
        });

        LoggedUser.setText("Нэвтэрсэн :");

        TimeLabel.setText("Цаг :");

        jLabel1.setVisible(false);

        ItemDescription4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-Vanilla-Reduced-Fat-Ice-Cream-Cone.png"))); // NOI18N
        ItemDescription4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescription4ActionPerformed(evt);
            }
        });

        ItemDescription5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-Fruit-n-Yogurt-Parfait-7-oz.png"))); // NOI18N
        ItemDescription5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescription5ActionPerformed(evt);
            }
        });

        ItemDescription6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-McCaf-Latte-Small.png"))); // NOI18N
        ItemDescription6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescription6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemDescription4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemDescription5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LoggedUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoggedName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Basket))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ItemDescription6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Basket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoggedName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Logout)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LoggedUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemDescription6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemDescription5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemDescription4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemDescription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescription1ActionPerformed
        Customize1 zahialga = new Customize1();
        zahialga.setVisible(true);
        this.dispose();
        this.setVisible(false);
        zahialga.Quantity.setText(jLabel1.getText());
        zahialga.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_ItemDescription1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_LogoutActionPerformed

    private void BasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasketActionPerformed
        Basket basket = new Basket();
        basket.setVisible(true);
        this.dispose();
        this.setVisible(false);
        basket.LoggedName.setText(LoggedName.getText());
        basket.ttt.setText(jLabel1.getText());
        conn=ConnectDB.ConnectDb();
        String sql = "Select * from Accounts where accName=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,LoggedName.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Address");
                basket.Address.setText(add1);
            }
        }
        catch (Exception e) {
            System.err.println(e);   
        }
    }//GEN-LAST:event_BasketActionPerformed

    private void ItemDescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescription2ActionPerformed
        Customize2 zahialga = new Customize2();
        zahialga.setVisible(true);
        this.dispose();
        this.setVisible(false);
        zahialga.Quantity.setText(jLabel1.getText());
        zahialga.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_ItemDescription2ActionPerformed

    private void ItemDescription3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescription3ActionPerformed
        Customize3 zahialga = new Customize3();
        zahialga.setVisible(true);
        this.dispose();
        this.setVisible(false);
        zahialga.Quantity.setText(jLabel1.getText());
        zahialga.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_ItemDescription3ActionPerformed

    private void ItemDescription4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescription4ActionPerformed
        Customize4 zahialga = new Customize4();
        zahialga.setVisible(true);
        this.dispose();
        this.setVisible(false);
        zahialga.Quantity.setText(jLabel1.getText());
        zahialga.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_ItemDescription4ActionPerformed

    private void ItemDescription5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescription5ActionPerformed
        Customize5 zahialga = new Customize5();
        zahialga.setVisible(true);
        this.dispose();
        this.setVisible(false);
        zahialga.Quantity.setText(jLabel1.getText());
        zahialga.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_ItemDescription5ActionPerformed

    private void ItemDescription6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescription6ActionPerformed
        Customize6 zahialga = new Customize6();
        zahialga.setVisible(true);
        this.dispose();
        this.setVisible(false);
        zahialga.Quantity.setText(jLabel1.getText());
        zahialga.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_ItemDescription6ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Basket;
    private javax.swing.JButton Exit;
    private javax.swing.JButton ItemDescription1;
    private javax.swing.JButton ItemDescription2;
    private javax.swing.JButton ItemDescription3;
    private javax.swing.JButton ItemDescription4;
    private javax.swing.JButton ItemDescription5;
    private javax.swing.JButton ItemDescription6;
    public javax.swing.JLabel LoggedName;
    private javax.swing.JLabel LoggedUser;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}