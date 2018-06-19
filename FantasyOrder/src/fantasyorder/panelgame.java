package fantasyorder;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class panelgame extends javax.swing.JPanel {

    public panelgame() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        //lblbg.setVisible(true);
        
        //background
        ImageIcon imageIcon = new ImageIcon("image/battlebacks1/CobblestonesPool.png");
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(xsize, ysize,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        lblbg.setIcon(imageIcon);
        
        imageIcon = new ImageIcon("image/entahlah/messagebox.png");
        image = imageIcon.getImage(); // transform it 
        newimg = image.getScaledInstance(1000, 300,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        lblmsg.setIcon(imageIcon);
        chat();
        
    }
    private void chat(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmsg = new javax.swing.JLabel();
        lblbg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(lblmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 1000, 300));
        add(lblbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblbg;
    private javax.swing.JLabel lblmsg;
    // End of variables declaration//GEN-END:variables
}
