package fantasyorder;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class panelgame extends javax.swing.JPanel {

    ArrayList<Unit> user = new ArrayList<>();
    public panelgame() {
        initComponents();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
       
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
        this.add(user.get(index).lblunit);
    }
    
    int ctr = 0 ;
    int ctr2= 1;
    public void gerakBawah(){
        
        if(user.get(index).lblunit.getY() < 750){
            user.get(index).lblunit.setLocation(user.get(index).lblunit.getX(), user.get(index).lblunit.getY()+25);
        }
            user.get(index).lblunit.setIcon(user.get(index).gambar[1][ctr]);
        
    }
    
    public void gerakAtas(){
        if(user.get(index).lblunit.getY() > 0){
            user.get(index).lblunit.setLocation(user.get(index).lblunit.getX(), user.get(index).lblunit.getY()-25);
        }
        user.get(index).lblunit.setIcon(user.get(index).gambar[0][ctr]);
    }
    
    public void gerakKiri(){
        if(user.get(index).lblunit.getX() > 0){
            user.get(index).lblunit.setLocation(user.get(index).lblunit.getX()-25, user.get(index).lblunit.getY());
        }
        user.get(index).lblunit.setIcon(user.get(index).gambar[2][ctr]);
    }
    
    public void gerakKanan(){
        if(user.get(index).lblunit.getX() < 1000){
            user.get(index).lblunit.setLocation(user.get(index).lblunit.getX()+25, user.get(index).lblunit.getY());
        }
        
        user.get(index).lblunit.setIcon(user.get(index).gambar[3][ctr]);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
