package fantasyorder;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class panelsign extends javax.swing.JPanel {
    
    ArrayList<Unit> user = new ArrayList<>();
    
    public panelsign() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        btndaftar = new javax.swing.JButton();
        fieldrepass = new javax.swing.JPasswordField();
        fieldpass = new javax.swing.JPasswordField();
        fielduser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        back.setText("BACK TO LOGIN PAGE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, -1, -1));

        btndaftar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btndaftar.setText("DAFTAR");
        btndaftar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });
        add(btndaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 410, 40));

        fieldrepass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fieldrepass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(fieldrepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 410, 50));

        fieldpass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fieldpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(fieldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 410, 50));

        fielduser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fielduser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(fielduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 300, 400, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/bgsingin.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));
    }// </editor-fold>//GEN-END:initComponents
    
    //tombol daftar
    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        
        cekUserKembar();

        if(isUserKembar == false || isPassKembar == true){
            user.add(new Unit(fielduser.getText(),fieldpass.getPassword()));
            JOptionPane.showMessageDialog(null, "Sukses Mendaftar!");
        }
        else{
            cekPassKembar();
            if(isPassKembar == false){
                JOptionPane.showMessageDialog(null, "Password tidak sama");
            }
            else{
                JOptionPane.showMessageDialog(null, "Username Sudah digunakan");
            }
        }
        
        fielduser.setText("");
        fieldpass.setText("");
        fieldrepass.setText("");
        
    }//GEN-LAST:event_btndaftarActionPerformed
    //tombol kembali ke panel login
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Frame f = (Frame)this.getParent().getParent().getParent().getParent();
        f.goLogin(user);
    }//GEN-LAST:event_backActionPerformed
    
    boolean isUserKembar = false;
    private boolean cekUserKembar(){
         for(int i=0;i<user.size();i++){
            if(user.get(i).getUsername().equalsIgnoreCase(fielduser.getText())){
                isUserKembar = true;
            }
            else{
                isUserKembar = false;
            }
        }
        return isUserKembar;
    }
    
    boolean isPassKembar = false;
    
    private void cekPassKembar(){
        //jika isPassKembar false artinya antara field password dengan field re password tidak sama
        if(!fieldpass.getPassword().equals(fieldrepass.getPassword())){
            isPassKembar = false;
        }
        else{
            isPassKembar = true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btndaftar;
    private javax.swing.JPasswordField fieldpass;
    private javax.swing.JPasswordField fieldrepass;
    private javax.swing.JTextField fielduser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
