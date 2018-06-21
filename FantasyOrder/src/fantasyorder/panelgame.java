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
        user.get(index).lblunit.setLocation(user.get(index).lblunit.getX(), user.get(index).lblunit.getY()+25);
        user.get(index).lblunit.setIcon(user.get(index).gambar[1][ctr]);
        /*if(ctr == 0){
            ctr+=ctr2;
        }
        else if(ctr == 1){
            ctr+=ctr2;
        }
        else if(ctr == 2){
            ctr+=ctr2;
            ctr2*=-1;
        }*/
        
    }
    public void gerakAtas(){
        user.get(index).lblunit.setLocation(user.get(index).lblunit.getX(), user.get(index).lblunit.getY()-25);
        user.get(index).lblunit.setIcon(user.get(index).gambar[0][ctr]);
    }
    public void gerakKiri(){
        user.get(index).lblunit.setLocation(user.get(index).lblunit.getX()-25, user.get(index).lblunit.getY());
        user.get(index).lblunit.setIcon(user.get(index).gambar[2][ctr]);
    }
    public void gerakKanan(){
        user.get(index).lblunit.setLocation(user.get(index).lblunit.getX()+25, user.get(index).lblunit.getY());
        user.get(index).lblunit.setIcon(user.get(index).gambar[3][ctr]);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
