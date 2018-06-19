package fantasyorder;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
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
        anim = new animasi(jLabel3,lblcounter,jLabel4);
        anim.start();
        jLabel4.setVisible(false);
        jLabel4.setIcon(new ImageIcon("image/button/btn-ready.png"));
        jLabel4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                pindah();
            }
            @Override
            public void mouseExited(MouseEvent e) {
		jLabel4.setIcon(new ImageIcon("image/button/btn-ready.png"));
            }
            @Override
            public void mouseEntered(MouseEvent e) {
		jLabel4.setIcon(new ImageIcon("image/button/btn-ready-hover.png"));
            }
        });
        
    }
   
   private void pindah(){
       if(anim.isPindahGame() == true){
            JOptionPane.showMessageDialog(null, "Berhasil");
            Frame f =(Frame)this.getParent().getParent().getParent().getParent();
            f.goGame(); //belum parse ARRAYLISTNYA
        }
        else{
            JOptionPane.showMessageDialog(null, "gagal");
        }
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcounter = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcounter.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblcounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcounter.setText("0%");
        add(lblcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 180, 80));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 310, 70));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setText("LOADING PLEASE WAIT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fantasyorder/loading.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, 350));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1380, 768));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblcounter;
    // End of variables declaration//GEN-END:variables
}

class animasi extends java.lang.Thread{
   JLabel a;
   JLabel load;
   JLabel ctr;
    public animasi(JLabel load,JLabel ctr,JLabel btn) {
        this.load = load;
        this.ctr = ctr;
        this.a = btn;
        a.setVisible(false);
    }

    @Override
    public void run() {
       
            try{
                for(int i=0;i<15;i++){
                    Thread.sleep(1000);
                }
            }
            catch(Exception e){
            
            }
        
        
        for(int i=0;i<=100;i++){
            ctr.setText(Integer.toString(i)+"%");
            
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
