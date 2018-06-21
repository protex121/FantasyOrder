package fantasyorder;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Unit {
    JLabel lblunit = new JLabel();
    ImageIcon[][] gambar = new ImageIcon[4][3];
    
    String username;
    char[] password = new char[100];
    boolean isNew = false;
    int job;
    
    public Unit(String username,char[] pass) {
        this.username = username;
        this.password = pass;
    }

    public Unit() {
        
    }
    

    public char[] getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }    

    public int getJob() {
        return job;
    }

    public void setImage(int ket) {
        if(ket == 1){
            //ImageIcon im = new ImageIcon("image/walk/archerwalkdown1.png");
            //Image image = im.getImage(); 
            //Image newimg = image.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            //this.gambar[0][0] = new ImageIcon(newimg);
            //im = new ImageIcon(newimg); 
            //this.lblunit = new JLabel(im);
            //this.lblunit.setBounds(1000,500,55,55);
            ImageIcon raw=new ImageIcon("image/walk/archerwalkup1.png");
            Image img=raw.getImage();
            Image newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[0][0]=new ImageIcon(newimg);
        
            raw=new ImageIcon("image/walk/archerwalkup2.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[0][1]=new ImageIcon(newimg);
        
            raw=new ImageIcon("image/walk/archerwalkup3.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[0][2]=new ImageIcon(newimg);
        
            raw=new ImageIcon("image/walk/archerwalkdown1.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[1][0]=new ImageIcon(newimg);
        
            raw=new ImageIcon("image/walk/archerwalkdown2.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[1][1]=new ImageIcon(newimg);
        
            raw=new ImageIcon("image/walk/archerwalkdown3.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[1][2]=new ImageIcon(newimg);
        
            raw=new ImageIcon("image/walk/archerwalkleft1.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[2][0]=new ImageIcon(newimg);
        
            raw=new ImageIcon("image/walk/archerwalkkeft2.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[2][1]=new ImageIcon(newimg);

            raw=new ImageIcon("image/walk/archerwalkleft3.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[2][2]=new ImageIcon(newimg);

            raw=new ImageIcon("image/walk/archerwalkright1.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[3][0]=new ImageIcon(newimg);

            raw=new ImageIcon("image/walk/archerwalkright2.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[3][1]=new ImageIcon(newimg);

            raw=new ImageIcon("image/walk/archerwalkright3.png");
            img=raw.getImage();
            newimg=img.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
            this.gambar[3][2]=new ImageIcon(newimg);

            this.lblunit=new JLabel(this.gambar[1][2]);
            this.lblunit.setBounds(500, 250, 55, 55);
        }
        
        
    }
    
    
}
