package fantasyorder;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class panellogin extends javax.swing.JPanel {
    
    ArrayList<Unit> user = new ArrayList<>();
    
    public panellogin() throws UnsupportedAudioFileException, LineUnavailableException {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);  
        //music();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        userfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/login.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/loginhover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/signin.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/signinhover.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 200, 50));

        userfield.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        userfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(userfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 610, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("PASSWORD");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 140, -1));

        passfield.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        passfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 610, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/bglogin.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));
    }// </editor-fold>//GEN-END:initComponents
    
    public void parseArray(ArrayList<Unit> u){
        user = u;
    }
    
    //login button 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        char[] temp = passfield.getPassword();        
        canLogin();
        
        if(login == true){
            //pindah panel ke panelloading
            Frame f = (Frame)this.getParent().getParent().getParent().getParent();
            try {
                f.goLoading(); //belum di parse ARRAYLISTNYA
            } catch (LineUnavailableException ex) {
                Logger.getLogger(panellogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(panellogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Username/Password Wrong ! Try Again");         
        }
        userfield.setText("");
        passfield.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    
    int idx = 0;
    boolean login = false;
    private void canLogin(){
        
        for(int i=0;i<user.size();i++){
            char[] temp = passfield.getPassword();
            
            if(user.get(i).getUsername().equals(userfield.getText()) && Arrays.equals(user.get(i).getPassword(), temp)){
                login = true;
                idx = i;
                break;
            }
            else{
                login = false;
            }
            
        }
    }
    
    //Sign In pindah ke panel lain
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frame f = (Frame)this.getParent().getParent().getParent().getParent();
        f.goSignIn();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
