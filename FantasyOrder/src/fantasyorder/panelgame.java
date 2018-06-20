package fantasyorder;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class panelgame extends javax.swing.JPanel {
    
    ArrayList<Unit> user = new ArrayList<>();
    
    Archer arc; //belum berasal dari database
    
    public panelgame() {
        //initComponents(); kalau initComponentnya di unremark bakalah error
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        arc = new Archer();
        this.add(arc.lblunit);
        
        //background
        /*ImageIcon imageIcon = new ImageIcon("image/entahlah/Village Map.png");
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(2750, 2500,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        lblbg.setIcon(imageIcon);*/
        
        /*imageIcon = new ImageIcon("image/entahlah/messagebox.png");
        image = imageIcon.getImage(); // transform it 
        newimg = image.getScaledInstance(1000, 300,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        lblmsg.setIcon(imageIcon);*/
        //JLabel a = new JLabel();
        
        /*imageIcon = new ImageIcon("image/walk/archerwalkdown1.png");
        image = imageIcon.getImage(); // transform it 
        newimg = image.getScaledInstance(55, 55,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        a.setIcon(imageIcon);*/
    }
    
    public void gerakBawah(){
        if(arc.lblunit.getY()+50<700){
            arc.lblunit.setLocation(arc.lblunit.getX(), arc.lblunit.getX()+50);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents
    
    int index;
    public void parsedArrayList(ArrayList<Unit> u,int idx){
        user = u;
        index = idx; 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
