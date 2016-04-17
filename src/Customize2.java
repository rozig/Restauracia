import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.*;
import javax.swing.*;

public class Customize2 extends javax.swing.JFrame {
    int a1=1,a2=1,a3=1,a4=1,a5=1,total=12000,orts1=0,orts2=0,orts3=0,orts4=0,orts5=0,l1=1,c1=0,c2=1,c3=0,c;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst=null;
    String m1="CRISPY CHICKEN FILLET\n",m2="SALAD MIX\n",m3="GRAPE TOMATOES\n",m4="SHREDDED CHEDDAR\n",m5="BACON BITS\n",n1="",n2="Дунд",n3="";
    public Customize2() {
        initComponents();
        conn=ConnectDB.ConnectDb();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        SizePanel = new javax.swing.JPanel();
        RadioMedium = new javax.swing.JRadioButton();
        RadioBig = new javax.swing.JRadioButton();
        RadioSmall = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        IngredientPanel = new javax.swing.JPanel();
        Ingredient1Check = new javax.swing.JCheckBox();
        Ingredient2Check = new javax.swing.JCheckBox();
        Ingredient3Check = new javax.swing.JCheckBox();
        Ingredient4Check = new javax.swing.JCheckBox();
        Ingredient5Check = new javax.swing.JCheckBox();
        AddBasketButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        PriceLabel = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JLabel();
        MinusButton = new javax.swing.JButton();
        PlusButton = new javax.swing.JButton();
        QuantityField = new javax.swing.JTextField();
        Quantity = new javax.swing.JLabel();
        LoggedUser = new javax.swing.JLabel();
        LoggedName = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bacon Ranch Salad");
        setResizable(false);

        SizePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Хэмжээ"));

        RadioMedium.setSelected(true);
        RadioMedium.setText("Дунд");
        RadioMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMediumActionPerformed(evt);
            }
        });

        RadioBig.setText("Том");
        RadioBig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBigActionPerformed(evt);
            }
        });

        RadioSmall.setText("Жижиг");
        RadioSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioSmallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SizePanelLayout = new javax.swing.GroupLayout(SizePanel);
        SizePanel.setLayout(SizePanelLayout);
        SizePanelLayout.setHorizontalGroup(
            SizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SizePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioSmall)
                .addGap(26, 26, 26)
                .addComponent(RadioMedium)
                .addGap(28, 28, 28)
                .addComponent(RadioBig)
                .addContainerGap())
        );
        SizePanelLayout.setVerticalGroup(
            SizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SizePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioSmall)
                    .addComponent(RadioMedium)
                    .addComponent(RadioBig))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-Side-Salad.png"))); // NOI18N

        IngredientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Орц"));

        Ingredient1Check.setSelected(true);
        Ingredient1Check.setText("CRISPY CHICKEN FILLET");
        Ingredient1Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient1CheckActionPerformed(evt);
            }
        });

        Ingredient2Check.setSelected(true);
        Ingredient2Check.setText("SALAD MIX");
        Ingredient2Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient2CheckActionPerformed(evt);
            }
        });

        Ingredient3Check.setSelected(true);
        Ingredient3Check.setText("GRAPE TOMATOES");
        Ingredient3Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient3CheckActionPerformed(evt);
            }
        });

        Ingredient4Check.setSelected(true);
        Ingredient4Check.setText("SHREDDED CHEDDAR");
        Ingredient4Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient4CheckActionPerformed(evt);
            }
        });

        Ingredient5Check.setSelected(true);
        Ingredient5Check.setText("BACON BITS");
        Ingredient5Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient5CheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngredientPanelLayout = new javax.swing.GroupLayout(IngredientPanel);
        IngredientPanel.setLayout(IngredientPanelLayout);
        IngredientPanelLayout.setHorizontalGroup(
            IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngredientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ingredient1Check)
                    .addComponent(Ingredient4Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ingredient5Check)
                    .addComponent(Ingredient2Check)
                    .addComponent(Ingredient3Check, 0, 0, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        IngredientPanelLayout.setVerticalGroup(
            IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngredientPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingredient1Check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingredient2Check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ingredient3Check, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ingredient4Check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ingredient5Check)
                .addGap(81, 81, 81))
        );

        AddBasketButton.setText("Сагсанд хийх");
        AddBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBasketButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Буцах");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        PriceLabel.setText("Үнэ:");

        TotalPrice.setText(total+"₮");

        MinusButton.setEnabled(false);
        MinusButton.setText("-");
        MinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusButtonActionPerformed(evt);
            }
        });

        PlusButton.setText("+");
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });

        QuantityField.setText("1");
        QuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityFieldActionPerformed(evt);
            }
        });

        Quantity.setVisible(false);

        LoggedUser.setText("Нэвтэрсэн :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddBasketButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SizePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IngredientPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(MinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoggedUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(LoggedName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoggedUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoggedName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IngredientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBasketButton)
                    .addComponent(BackButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioSmallActionPerformed
        RadioSmall.setSelected(true);
        RadioMedium.setSelected(false);
	RadioBig.setSelected(false);
        total=(10000-(orts1+orts2+orts3+orts4+orts5))*l1;
        TotalPrice.setText(total+"₮");
        n1="Жижиг";
        n2="";
        n3="";
        c1=1;
        c2=0;
        c3=0;
    }//GEN-LAST:event_RadioSmallActionPerformed

    private void AddBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBasketButtonActionPerformed
        for(int y=1;y<=l1;y++) {
            try {
                String sql = "Insert into Basket (No, FoodName, Price, Ingredients, Size) values (?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                c = Integer.parseInt(Quantity.getText());
                c++;
                Quantity.setText(c+"");
                pst.setString(1,c+"");
                pst.setString(2,"Bacon Ranch Salad");
                pst.setInt(3,(total/l1));
                pst.setString(4,m1+m2+m3+m4+m5);
                pst.setString(5,n1+n2+n3);
                pst.execute();
            }
            catch(Exception e){
                System.err.println(e);
            }
        }
        JOptionPane.showMessageDialog(null,"Сагсанд хийлээ.");
        Menu menu = new Menu(c);
        menu.setVisible(true);
        this.dispose();
        this.setVisible(false);
        menu.LoggedName.setText(LoggedName.getText());
        /*Writer writer = null;

try {
    writer = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream("filename.txt"), "utf-8"));
    writer.write("Big mac\n"+"\n"+"Нийт үнэ: "+total+"\n"+"Орц:"+m1+m2+m3+m4+m5+m6+"\n"+"Захиалсан тоо ширхэг: "+(n1+n2+n3));
} catch (IOException ex) {
  // report
} finally {
   try {writer.close();} catch (Exception ex) {}
}*/
    }//GEN-LAST:event_AddBasketButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Menu menu = new Menu(c);
        menu.setVisible(true);
        this.dispose();
        this.setVisible(false);
        menu.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_BackButtonActionPerformed

    private void RadioMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMediumActionPerformed
        RadioMedium.setSelected(true);
        RadioSmall.setSelected(false);
	RadioBig.setSelected(false);
        total=(12000-(orts1+orts2+orts3+orts4+orts5))*l1;
        TotalPrice.setText(total+"₮");
        n1="";
        n2="Дунд";
        n3="";
        c1=0;
        c2=1;
        c3=0;
    }//GEN-LAST:event_RadioMediumActionPerformed

    private void RadioBigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBigActionPerformed
        RadioBig.setSelected(true);
        RadioMedium.setSelected(false);
	RadioSmall.setSelected(false);
        total=(15000-(orts1+orts2+orts3+orts4+orts5))*l1;
        TotalPrice.setText(total+"₮");
        n1="";
        n2="";
        n3="Том";
        c1=0;
        c2=0;
        c3=1;
    }//GEN-LAST:event_RadioBigActionPerformed

    private void Ingredient3CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient3CheckActionPerformed
        if(a3==1) {
            orts3=500;
            a3=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m3="";
        }
        else {
            orts3=0;
            a3=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m3="GRAPE TOMATOES\n";
        }
    }//GEN-LAST:event_Ingredient3CheckActionPerformed

    private void Ingredient1CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient1CheckActionPerformed
        if(a1==1) {
            orts1=500;
            a1=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m1="";
        }
        else {
            orts1=0;
            a1=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m1="CRISPY CHICKEN FILLET\n";
        }
    }//GEN-LAST:event_Ingredient1CheckActionPerformed

    
    private void Ingredient2CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient2CheckActionPerformed
         if(a2==1) {
            orts2=500;
            a2=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m2="";
        }
         else {
            orts2=0;
            a2=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m2="SALAD MIX\n";
        }
       
    }//GEN-LAST:event_Ingredient2CheckActionPerformed

    private void Ingredient4CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient4CheckActionPerformed
        if(a4==1) {
            orts4=500;
            a4=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m4="";
        }
        else {
            orts4=0;
            a4=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m4="SHREDDED CHEDDAR\n";
        }
    }//GEN-LAST:event_Ingredient4CheckActionPerformed

    private void Ingredient5CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient5CheckActionPerformed
        if(a5==1) {
            orts5=500;
            a5=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m5="";
        }
        else {
            orts5=0;
            a5=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m5="BACON BITS";
        }
    }//GEN-LAST:event_Ingredient5CheckActionPerformed

    private void MinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusButtonActionPerformed
        l1--;
        if(l1==1)
        MinusButton.setEnabled(false);
        QuantityField.setText(l1+"");
        if(c1==1) {
            total=l1*(10000-(orts1+orts2+orts3+orts4+orts5));
            TotalPrice.setText(total+"");
        }
        if(c2==1) {
            total=l1*(12000-(orts1+orts2+orts3+orts4+orts5));
            TotalPrice.setText(total+"");
        }
        if(c3==1) {
            total=l1*(15000-(orts1+orts2+orts3+orts4+orts5));
            TotalPrice.setText(total+"");
        }
        PlusButton.setEnabled(true);
    }//GEN-LAST:event_MinusButtonActionPerformed

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusButtonActionPerformed
        l1++;
        if(l1==10)
        PlusButton.setEnabled(false);
        QuantityField.setText(l1+"");
        if(c1==1) {
            total=l1*(10000-(orts1+orts2+orts3+orts4+orts5));
            TotalPrice.setText(total+"");
        }
        if(c2==1) {
            total=l1*(12000-(orts1+orts2+orts3+orts4+orts5));
            TotalPrice.setText(total+"");
        }
        if(c3==1) {
            total=l1*(15000-(orts1+orts2+orts3+orts4+orts5));
            TotalPrice.setText(total+"");
        }
        MinusButton.setEnabled(true);
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void QuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityFieldActionPerformed
        QuantityField.setText("1");
    }//GEN-LAST:event_QuantityFieldActionPerformed
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
            java.util.logging.Logger.getLogger(Customize2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customize2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customize2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customize2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customize2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBasketButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JCheckBox Ingredient1Check;
    private javax.swing.JCheckBox Ingredient2Check;
    private javax.swing.JCheckBox Ingredient3Check;
    private javax.swing.JCheckBox Ingredient4Check;
    private javax.swing.JCheckBox Ingredient5Check;
    private javax.swing.JPanel IngredientPanel;
    public javax.swing.JLabel LoggedName;
    private javax.swing.JLabel LoggedUser;
    private javax.swing.JButton MinusButton;
    private javax.swing.JButton PlusButton;
    private javax.swing.JLabel PriceLabel;
    public javax.swing.JLabel Quantity;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JRadioButton RadioBig;
    private javax.swing.JRadioButton RadioMedium;
    private javax.swing.JRadioButton RadioSmall;
    private javax.swing.JPanel SizePanel;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}