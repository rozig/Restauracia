import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class AddFood extends javax.swing.JFrame {
    String filename;
    Connection conn=null;
    ResultSet rs = null;
    PreparedStatement pst= null;
    String add1;
    public AddFood() {
        conn=ConnectDB.ConnectDb();
        initComponents();
        Update_table();
    }
    private void Update_table() {
        try {
            String sql = "Select No, FoodName from Food";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            FoodsTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        class MyCustomFilter extends javax.swing.filechooser.FileFilter {
            @Override
            public boolean accept(File file) {
                return file.isDirectory() || file.getAbsolutePath().endsWith(".png");
            }
            @Override
            public String getDescription() {
                return "Зурган файл (*.png)";
            }
        }
        ImageChooser = new javax.swing.JFileChooser();
        FoodNameField = new javax.swing.JTextField();
        PriceSmallField = new javax.swing.JTextField();
        PriceBigField = new javax.swing.JTextField();
        PriceMedField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FoodsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        SmallLabel = new javax.swing.JLabel();
        MediumLabel = new javax.swing.JLabel();
        BigLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        IngredientPanel = new javax.swing.JPanel();
        Ingredient4Field = new javax.swing.JTextField();
        Ingredient3Field = new javax.swing.JTextField();
        Ingredient6Field = new javax.swing.JTextField();
        Ingredient6Price = new javax.swing.JTextField();
        Ingredient1Field = new javax.swing.JTextField();
        Ingredient4Price = new javax.swing.JTextField();
        Ingredient1Price = new javax.swing.JTextField();
        Ingredient7Field = new javax.swing.JTextField();
        Ingredient5Price = new javax.swing.JTextField();
        Ingredient7Price = new javax.swing.JTextField();
        Ingredient2Price = new javax.swing.JTextField();
        Ingredient2Field = new javax.swing.JTextField();
        Ingredient3Price = new javax.swing.JTextField();
        Ingredient5Field = new javax.swing.JTextField();
        IngNameLabel = new javax.swing.JLabel();
        IngPriceLabel = new javax.swing.JLabel();
        FileChoose = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NoField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DeleteButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();

        ImageChooser.setDialogTitle("Та зургаа оруулна уу");
        ImageChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Хоол нэмэх");
        setResizable(false);

        FoodsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        FoodsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FoodsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FoodsTable);

        jLabel1.setText("Хоолны нэр");

        SmallLabel.setText("Жижиг");

        MediumLabel.setText("Дунд");

        BigLabel.setText("Том");

        PriceLabel.setText("Үнэ");

        IngredientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Хачир"));

        IngNameLabel.setText("Нэр");

        IngPriceLabel.setText("Үнэ");

        FileChoose.setText("Сонгох ..");
        FileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooseActionPerformed(evt);
            }
        });

        Image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Зургын хэмжээ : 80 х 80");

        javax.swing.GroupLayout IngredientPanelLayout = new javax.swing.GroupLayout(IngredientPanel);
        IngredientPanel.setLayout(IngredientPanelLayout);
        IngredientPanelLayout.setHorizontalGroup(
            IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngredientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngredientPanelLayout.createSequentialGroup()
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FileChoose)
                            .addComponent(jLabel2))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(IngredientPanelLayout.createSequentialGroup()
                        .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Ingredient7Field, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ingredient1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IngredientPanelLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(IngNameLabel))
                            .addComponent(Ingredient6Field, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ingredient5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ingredient4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ingredient3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ingredient2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Ingredient4Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ingredient3Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ingredient2Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ingredient1Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Ingredient7Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ingredient6Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ingredient5Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngredientPanelLayout.createSequentialGroup()
                                .addComponent(IngPriceLabel)
                                .addGap(23, 23, 23)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        IngredientPanelLayout.setVerticalGroup(
            IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(IngredientPanelLayout.createSequentialGroup()
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngredientPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(FileChoose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngNameLabel)
                    .addComponent(IngPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingredient1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IngredientPanelLayout.createSequentialGroup()
                        .addComponent(Ingredient1Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ingredient2Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ingredient2Field))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingredient3Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingredient3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingredient4Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingredient4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingredient5Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingredient5Field))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingredient6Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingredient6Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngredientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Ingredient7Field)
                    .addComponent(Ingredient7Price))
                .addContainerGap())
        );

        jLabel8.setText("Дугаар");

        DeleteButton.setText("Устгах");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Нэмэх");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Засах");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Order/logo.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(FoodNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(SmallLabel)
                                                .addGap(33, 33, 33)
                                                .addComponent(MediumLabel)
                                                .addGap(42, 42, 42)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(NoField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BigLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(IngredientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(PriceLabel)
                                .addGap(18, 18, 18)
                                .addComponent(PriceSmallField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PriceMedField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PriceBigField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FoodNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BigLabel)
                            .addComponent(MediumLabel)
                            .addComponent(SmallLabel))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceSmallField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceBigField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceMedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngredientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        try {
            pst=conn.prepareStatement("Delete from Food where No='"+NoField.getText()+"' ");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted");
        }
        catch(Exception e) {
            System.err.println(e);
        }
        Update_table();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        try {
            String sql = "insert into Food (No, FoodName, PriceSmall , PriceMed, PriceBig, Ingredient1, Ingredient2, Ingredient3, Ingredient4, Ingredient5, Ingredient6, Ingredient7, Ing1Price, Ing2Price, Ing3Price, Ing4Price, Ing5Price, Ing6Price, Ing7Price) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,NoField.getText());
            pst.setString(2,FoodNameField.getText());
            pst.setString(3,PriceSmallField.getText());
            pst.setString(4,PriceMedField.getText());
            pst.setString(5,PriceBigField.getText());
            pst.setString(6,Ingredient1Field.getText());
            pst.setString(7,Ingredient2Field.getText());
            pst.setString(8,Ingredient3Field.getText());
            pst.setString(9,Ingredient4Field.getText());
            pst.setString(10,Ingredient5Field.getText());
            pst.setString(11,Ingredient6Field.getText());
            pst.setString(12,Ingredient7Field.getText());
            pst.setString(13,Ingredient1Price.getText());
            pst.setString(14,Ingredient2Price.getText());
            pst.setString(15,Ingredient3Price.getText());
            pst.setString(16,Ingredient4Price.getText());
            pst.setString(17,Ingredient5Price.getText());
            pst.setString(18,Ingredient6Price.getText());
            pst.setString(19,Ingredient7Price.getText());
            //pst.setBytes(20,Image);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Saved");
        }
        catch(Exception e) {
            System.err.println(e);
        }
        Update_table();
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void FoodsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodsTableMouseClicked
        try {
            int row = FoodsTable.getSelectedRow();
            String Table_click =(FoodsTable.getModel().getValueAt(row, 0).toString());
            String sql = "Select * from Food where No='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()) {
                String add1 = rs.getString("No");
                NoField.setText(add1);
                String add2 = rs.getString("FoodName");
                FoodNameField.setText(add2);
                String add3 = rs.getString("PriceSmall");
                PriceSmallField.setText(add3);
                String add4 = rs.getString("PriceMed");
                PriceMedField.setText(add4);
                String add5 = rs.getString("PriceBig");
                PriceBigField.setText(add5);
                String add6 = rs.getString("Ingredient1");
                Ingredient1Field.setText(add6);
                String add7 = rs.getString("Ingredient2");
                Ingredient2Field.setText(add7);
                String add8 = rs.getString("Ingredient3");
                Ingredient3Field.setText(add8);
                String add9 = rs.getString("Ingredient4");
                Ingredient4Field.setText(add9);
                String add10 = rs.getString("Ingredient5");
                Ingredient5Field.setText(add10);
                String add11 = rs.getString("Ingredient6");
                Ingredient6Field.setText(add11);
                String add12 = rs.getString("Ingredient7");
                Ingredient7Field.setText(add12);
                String add13 = rs.getString("Ing1Price");
                Ingredient1Price.setText(add13);
                String add14 = rs.getString("Ing2Price");
                Ingredient2Price.setText(add14);
                String add15 = rs.getString("Ing3Price");
                Ingredient3Price.setText(add15);
                String add16 = rs.getString("Ing4Price");
                Ingredient4Price.setText(add16);
                String add17 = rs.getString("Ing5Price");
                Ingredient5Price.setText(add17);
                String add18 = rs.getString("Ing6Price");
                Ingredient6Price.setText(add18);
                String add19 = rs.getString("Ing7Price");
                Ingredient7Price.setText(add19);
            }
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_FoodsTableMouseClicked

    private void FileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooseActionPerformed
        int returnVal = ImageChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ImageChooser.getSelectedFile();
            try {
                Image.setIcon(new ImageIcon(ImageIO.read(file)));
            }
            catch (IOException ex) {
                System.err.println("Problem accessing file " + file.getAbsolutePath());
            }
        }
        else {
            System.err.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_FileChooseActionPerformed
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
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFood().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BigLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton FileChoose;
    private javax.swing.JTextField FoodNameField;
    private javax.swing.JTable FoodsTable;
    private javax.swing.JLabel Image;
    private javax.swing.JFileChooser ImageChooser;
    private javax.swing.JLabel IngNameLabel;
    private javax.swing.JLabel IngPriceLabel;
    private javax.swing.JTextField Ingredient1Field;
    private javax.swing.JTextField Ingredient1Price;
    private javax.swing.JTextField Ingredient2Field;
    private javax.swing.JTextField Ingredient2Price;
    private javax.swing.JTextField Ingredient3Field;
    private javax.swing.JTextField Ingredient3Price;
    private javax.swing.JTextField Ingredient4Field;
    private javax.swing.JTextField Ingredient4Price;
    private javax.swing.JTextField Ingredient5Field;
    private javax.swing.JTextField Ingredient5Price;
    private javax.swing.JTextField Ingredient6Field;
    private javax.swing.JTextField Ingredient6Price;
    private javax.swing.JTextField Ingredient7Field;
    private javax.swing.JTextField Ingredient7Price;
    private javax.swing.JPanel IngredientPanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel MediumLabel;
    private javax.swing.JTextField NoField;
    private javax.swing.JTextField PriceBigField;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceMedField;
    private javax.swing.JTextField PriceSmallField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel SmallLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}