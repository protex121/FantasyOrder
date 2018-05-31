package fantasyorder;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class panelloading extends javax.swing.JPanel {
   
   animasi anim;
      
   public panelloading() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize); 
        this.setBackground(Color.white);
        anim = new animasi(jLabel3,lblcounter,btn2);
        anim.start();
        btn2.setEnabled(false);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2 = new javax.swing.JButton();
        lblcounter = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btn2.setText("MASUK");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 510, 260, 70));

        lblcounter.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblcounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcounter.setText("0%");
        add(lblcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 180, 80));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setText("LOADING PLEASE WAIT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/loading.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 350));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1380, 768));
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(anim.isPindahGame() == true){
            JOptionPane.showMessageDialog(null, "Berhasil");
            Frame f = (Frame)this.getParent().getParent().getParent().getParent();
            f.goGame(); //belum parse ARRAYLISTNYA
        }
        else{
            JOptionPane.showMessageDialog(null, "gagal");
        }
    }//GEN-LAST:event_btn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcounter;
    // End of variables declaration//GEN-END:variables
}

class animasi extends java.lang.Thread{
   JButton a;
   JLabel load;
   JLabel ctr;
    public animasi(JLabel load,JLabel ctr,JButton btn) {
        this.load = load;
        this.ctr = ctr;
        this.a = btn;
        
        a.setVisible(false);
    }

    @Override
    public void run() {
        
        
            try{
                for(int i=0;i<15;i++){
                    Thread.sleep(2000);
                }
            }
            catch(Exception e){
            
            }
        
        
        for(int i=0;i<=100;i++){
            ctr.setText(Integer.toString(i)+"%");
            
            //belum tau caranya pindah panel
            if(i == 100){
                pindah = true;
                a.setVisible(true);
                a.setEnabled(true);              
            }
            
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
            
            }
            
        }
        
    }
    
    boolean pindah = false;
    public boolean isPindahGame(){
        return pindah;
    }
}
