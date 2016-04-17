import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class Shipping extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Statement stmt=null;
    int a;
    public Shipping() {
        initComponents();
        conn=ConnectDB.ConnectDb();
        String sql = "Select * from Accounts where accName=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,asd.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Address");
                RegisteredAddress.setText(add1);
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisteredAddLabel = new javax.swing.JRadioButton();
        AnotherAddrLabel = new javax.swing.JRadioButton();
        MakeOrder = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        AnotherAddress = new javax.swing.JTextField();
        RegisteredAddress = new javax.swing.JLabel();
        asd = new javax.swing.JLabel();
        LoggedUser = new javax.swing.JLabel();
        LoggedName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Хүргэлт");
        setResizable(false);

        RegisteredAddLabel.setSelected(true);
        RegisteredAddLabel.setText("Бүртгүүлсэн хаяг");
        RegisteredAddLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisteredAddLabelActionPerformed(evt);
            }
        });

        AnotherAddrLabel.setText("Өөр хаягаар хүргүүлэх");
        AnotherAddrLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnotherAddrLabelActionPerformed(evt);
            }
        });

        MakeOrder.setText("Захиалга хийх");
        MakeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeOrderActionPerformed(evt);
            }
        });

        Back.setText("Буцах");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        AnotherAddress.setEnabled(false);
        AnotherAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnotherAddressActionPerformed(evt);
            }
        });

        asd.setVisible(true);

        LoggedUser.setText("Нэвтэрсэн :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(asd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RegisteredAddLabel)
                                    .addGap(34, 34, 34)
                                    .addComponent(RegisteredAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AnotherAddrLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AnotherAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(Back)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                            .addComponent(MakeOrder))))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoggedUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoggedName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoggedUser)
                    .addComponent(LoggedName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(asd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisteredAddLabel)
                    .addComponent(RegisteredAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AnotherAddrLabel)
                    .addComponent(AnotherAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MakeOrder)
                    .addComponent(Back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisteredAddLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisteredAddLabelActionPerformed
        RegisteredAddLabel.setSelected(true);
        AnotherAddrLabel.setSelected(false);
        AnotherAddress.setEnabled(false);
        RegisteredAddress.setVisible(true);
        a=1;
    }//GEN-LAST:event_RegisteredAddLabelActionPerformed

    private void AnotherAddrLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnotherAddrLabelActionPerformed
        AnotherAddrLabel.setSelected(true);
        RegisteredAddLabel.setSelected(false);
        AnotherAddress.setEnabled(true);
        RegisteredAddress.setVisible(false);
        a=2;
    }//GEN-LAST:event_AnotherAddrLabelActionPerformed

    private void AnotherAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnotherAddressActionPerformed
        
    }//GEN-LAST:event_AnotherAddressActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Menu menu = new Menu(0);
        menu.setVisible(true);
        this.dispose();
        this.setVisible(false);
        menu.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_BackActionPerformed

    private void MakeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeOrderActionPerformed
        Writer writer = null;
        String add1 = null;
        try {
            String sql = "Select * from Accounts where accName=?";
            try {
                pst=conn.prepareStatement(sql);
                pst.setString(1,AnotherAddress.getText());
                pst.execute();
            }
            catch (Exception e){
                System.err.println(e);
            }
            writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("C:\\Users\\Ганзориг\\Desktop\\filename.txt"), "utf-8"));
            writer.write("Захиалга амжилттай хийгдлээ");
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
        finally {
            try {
                writer.close();
            }
            catch (Exception ex) {
                System.err.println(ex);
            }
        }
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
        JOptionPane.showMessageDialog(null,"Таны захиалга амжилттай хийгдлээ.");
        try{
        try{
        String sql = "Select * from accounts where AccName='"+LoggedName.getText()+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){         
                add1 = rs.getString("eMail");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("restauraciamn@gmail.com", "16253649");
            }
        });

        mailSession.setDebug(true); // Enable the debug mode

        Message msg = new MimeMessage( mailSession );

        //--[ Set the FROM, TO, DATE and SUBJECT fields
        msg.setFrom( new InternetAddress( "restauraciamn@gmail.com" ) );
        msg.setRecipients( Message.RecipientType.TO,InternetAddress.parse(add1) );
        msg.setSentDate( new Date());
        msg.setSubject( "Нууц үгийн сэргээлт" );

        //--[ Create the body of the mail
        MimeBodyPart msgbp = new MimeBodyPart();
        msgbp.setText("Манайхаар үйлчлүүлсэнд баяраллаа\n" );
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(msgbp);
        msgbp = new MimeBodyPart();
        String file ="C:\\Users\\Ганзориг\\Desktop\\filename.txt";
        String fileName = "C:\\Users\\Ганзориг\\Desktop\\filename.txt";
        DataSource source = new FileDataSource(file);
        msgbp.setDataHandler(new DataHandler(source));
        msgbp.setFileName(fileName);
        mp.addBodyPart(msgbp);
        msg.setContent(mp);
        
        Transport.send( msg );
        JOptionPane.showMessageDialog(null,"Илгээлээ");
    }catch(Exception E){
        System.out.println( "Алдаа!"); 
        System.out.println( E );
    }
        Menu menu = new Menu(0);
        menu.setVisible(true);
        this.dispose();
        this.setVisible(false);
        menu.LoggedName.setText(LoggedName.getText());
    }//GEN-LAST:event_MakeOrderActionPerformed
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
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shipping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shipping().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AnotherAddrLabel;
    private javax.swing.JTextField AnotherAddress;
    private javax.swing.JButton Back;
    public javax.swing.JLabel LoggedName;
    private javax.swing.JLabel LoggedUser;
    private javax.swing.JButton MakeOrder;
    private javax.swing.JRadioButton RegisteredAddLabel;
    public javax.swing.JLabel RegisteredAddress;
    public javax.swing.JLabel asd;
    // End of variables declaration//GEN-END:variables
}