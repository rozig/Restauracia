import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.*;
import javax.swing.*;

public class Customize1 extends javax.swing.JFrame {
    int a1=1,a2=1,a3=1,a4=1,a5=1,a6=1,a7=1,total=10000,orts1=0,orts2=0,orts3=0,orts4=0,orts5=0,orts6=0,orts7=0,l1=1,c1=0,c2=1,c3=0,c,r1=720,r2=39,r3=40,r4=51,r5=1470;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst=null;
    String m1="100% BEEF PATTY\n",m2="BIG MAC BUN\n",m3="PASTEURIZED PROCESS AMERICAN CHEESE\n",m4="SHREDDED LETTUCE\n",m5="PICKLE SLICES\n",m6="ONIONS\n",m7="BIG MAC SAUCE\n",n1="",n2="Дунд",n3="";
    public Customize1() {
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
        Ingredient7Check = new javax.swing.JCheckBox();
        Ingredient4Check = new javax.swing.JCheckBox();
        Ingredient5Check = new javax.swing.JCheckBox();
        Ingredient6Check = new javax.swing.JCheckBox();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        erase = new javax.swing.JLabel();
        add = new javax.swing.JLabel();

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
        setTitle("Big Mac");
        setPreferredSize(new java.awt.Dimension(260, 650));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/s-mcdonalds-Big-Mac.png"))); // NOI18N

        IngredientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Орц"));

        Ingredient1Check.setSelected(true);
        Ingredient1Check.setText("100% BEEF PATTY");
        Ingredient1Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient1CheckActionPerformed(evt);
            }
        });

        Ingredient2Check.setSelected(true);
        Ingredient2Check.setText("BIG MAC BUN");
        Ingredient2Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient2CheckActionPerformed(evt);
            }
        });

        Ingredient3Check.setSelected(true);
        Ingredient3Check.setText("<html>PASTEURIZED PROCESS AMERICAN CHEESE</html>");
        Ingredient3Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient3CheckActionPerformed(evt);
            }
        });

        Ingredient7Check.setSelected(true);
        Ingredient7Check.setText("BIG MAC SAUCE");
        Ingredient7Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient7CheckActionPerformed(evt);
            }
        });

        Ingredient4Check.setSelected(true);
        Ingredient4Check.setText("SHREDDED LETTUCE");
        Ingredient4Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient4CheckActionPerformed(evt);
            }
        });

        Ingredient5Check.setSelected(true);
        Ingredient5Check.setText("PICKLE SLICES");
        Ingredient5Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient5CheckActionPerformed(evt);
            }
        });

        Ingredient6Check.setSelected(true);
        Ingredient6Check.setText("ONIONS");
        Ingredient6Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingredient6CheckActionPerformed(evt);
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
                    .addComponent(Ingredient6Check)
                    .addComponent(Ingredient2Check)
                    .addComponent(Ingredient7Check)
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
                .addComponent(Ingredient3Check, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingredient4Check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingredient5Check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingredient6Check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ingredient7Check))
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
        LoggedUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoggedUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoggedUserMousePressed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Тэжээл"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Protein:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Calories:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Carbs:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Fat:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Sodium:");

        jLabel8.setText(r1+"");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setText(r2+"g");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setText(r3+"g");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setText(r4+"g");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setText(r5+"mg");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        erase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/erase.png"))); // NOI18N
        erase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraseMouseClicked(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/add.png"))); // NOI18N
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackButton)
                                .addGap(65, 65, 65)
                                .addComponent(AddBasketButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SizePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, Short.MAX_VALUE)
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
                                            .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoggedUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoggedName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(add)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(erase)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoggedUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LoggedName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add)
                            .addComponent(erase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SizePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IngredientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
        total=(8000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7))*l1;
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
                pst.setString(2,"Big Mac");
                pst.setInt(3,(total/l1));
                pst.setString(4,m1+m2+m3+m4+m5+m6);
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
        total=(10000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7))*l1;
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
        total=(12000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7))*l1;
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
            m3="PASTEURIZED PROCESS AMERICAN CHEESE\n";
        }
    }//GEN-LAST:event_Ingredient3CheckActionPerformed

    private void Ingredient1CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient1CheckActionPerformed
        if(a1==1) {
            orts1=500;
            a1=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m1="";
            r1=r1-220;
            jLabel8.setText(r1+"");
            r2=r2-19;
            jLabel9.setText(r2+"g");
            r3=r3-16;
            jLabel10.setText(r3+"g");
            r4=r4-1;
            jLabel11.setText(r4+"g");
            r5=r5-180;
            jLabel12.setText(r5+"mg");
        }
        else {
            orts1=0;
            a1=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m1="100% BEEF PATTY\n";
            r1=r1+220;
            jLabel8.setText(r1+"");
            r2=r2+19;
            jLabel9.setText(r2+"g");
            r3=r3+16;
            jLabel10.setText(r3+"g");
            r4=r4+1;
            jLabel11.setText(r4+"g");
            r5=r5+180;
            jLabel12.setText(r5+"mg");
        }
    }//GEN-LAST:event_Ingredient1CheckActionPerformed

    
    private void Ingredient6CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient6CheckActionPerformed
        if(a6==1) {
            orts6=500;
            a6=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m6="";
            
        }
        else {
            orts6=0;
            a6=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m6="ONIONS\n";
        }
    }//GEN-LAST:event_Ingredient6CheckActionPerformed

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
            m2="BIG MAC BUN\n";
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
            m4="SHREDDED LETTUCE\n";
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
            m5="PICKLE SLICES ";
        }
    }//GEN-LAST:event_Ingredient5CheckActionPerformed

    private void Ingredient7CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingredient7CheckActionPerformed
        if(a7==1) {
            orts7=500;
            a7=0;
            total=total-500*l1;
            TotalPrice.setText(total+"₮");
            m7="";
        }
        else {
            orts7=0;
            a7=1;
            total=total+500*l1;
            TotalPrice.setText(total+"₮");
            m7="BIG MAC SAUCE\n";
        }
    }//GEN-LAST:event_Ingredient7CheckActionPerformed

    private void MinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusButtonActionPerformed
        l1--;
        if(l1==1)
        MinusButton.setEnabled(false);
        QuantityField.setText(l1+"");
        if(c1==1) {
            total=l1*(8000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7));
            TotalPrice.setText(total+"");
        }
        if(c2==1) {
            total=l1*(10000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7));
            TotalPrice.setText(total+"");
        }
        if(c3==1) {
            total=l1*(12000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7));
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
            total=l1*(8000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7));
            TotalPrice.setText(total+"");
        }
        if(c2==1) {
            total=l1*(10000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7));
            TotalPrice.setText(total+"");
        }
        if(c3==1) {
            total=l1*(12000-(orts1+orts2+orts3+orts4+orts5+orts6+orts7));
            TotalPrice.setText(total+"");
        }
        MinusButton.setEnabled(true);
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void QuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityFieldActionPerformed
        QuantityField.setText("1");
    }//GEN-LAST:event_QuantityFieldActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        setSize(540, 650);
        add.setVisible(false);
    }//GEN-LAST:event_addMouseClicked

    private void eraseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraseMouseClicked
        setSize(260, 650);
        add.setVisible(true);
    }//GEN-LAST:event_eraseMouseClicked

    private void LoggedUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoggedUserMousePressed
        System.out.println("Google");
    }//GEN-LAST:event_LoggedUserMousePressed

    private void LoggedUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoggedUserMouseClicked
        System.out.println("Google");
    }//GEN-LAST:event_LoggedUserMouseClicked
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
            java.util.logging.Logger.getLogger(Customize1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customize1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customize1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customize1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customize1().setVisible(true);
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
    private javax.swing.JCheckBox Ingredient6Check;
    private javax.swing.JCheckBox Ingredient7Check;
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
    private javax.swing.JLabel add;
    private javax.swing.JLabel erase;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}