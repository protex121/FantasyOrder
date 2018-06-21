package fantasyorder;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Archer extends Unit{
    //JLabel lblunit;
    
    public Archer(){
        JOptionPane.showMessageDialog(null, "sukses archer");
        /*this.lblunit = new JLabel();
        ImageIcon im = new ImageIcon("image/walk/archerwalkdown1.png");
        Image image = im.getImage(); 
        Image newimg = image.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        im = new ImageIcon(newimg); 
        this.lblunit = new JLabel(im);
        this.lblunit.setBounds(500,250,55,55);*/
    }
}
