package fantasyorder;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Frame extends javax.swing.JFrame {
    
    ArrayList<Unit> user = new ArrayList<>();
    /*bagian panel tolong diurutkan disini semua*/
    panellogin login;
    panelsign sign = new panelsign();
    panelloading load = new panelloading();
    panelgame game = new panelgame();
    
    public Frame() throws UnsupportedAudioFileException, LineUnavailableException {
        this.login = new panellogin();
        
        this.setUndecorated(true); //supaya hilangkan window
        this.setResizable(false);   
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        this.setTitle("FANTASY ORDER");
        this.add(login);
        this.add(sign);
        this.add(load);
        this.add(game);
        login.setVisible(true);
        sign.setVisible(false);
        load.setVisible(false);
        game.setVisible(false);
        //music(false);
    }
    
    public void goSignIn(){
        sign.setVisible(true);
        login.setVisible(false);
    }
    
    public void goLogin(ArrayList<Unit> u){
        sign.setVisible(false);
        login.setVisible(true);
        login.parseArray(u); //parsing isi array list USER ke panel login
        user = u; //hasil parsing isi arraylist user dari signin
    }
    
    //belum parsing Array
    public void goLoading() throws LineUnavailableException, UnsupportedAudioFileException{      
        login.setVisible(false);
        load.setVisible(true);
        musicStop();
    }
    
    public void goGame(){
        load.setVisible(false);
        game.setVisible(true);
    }
    
    public static void music() throws UnsupportedAudioFileException, LineUnavailableException{
        try
        {
            Clip clip = AudioSystem.getClip();
            
            if(!clip.isActive()){
                clip.open(AudioSystem.getAudioInputStream(new File("sound/bgm.wav")));
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
            }
            else{
                clip.flush();
                clip.stop();
            }
            
        }
        catch(IOException e)
        {
            System.out.println("cant find the file");
        }
    }
    
    public static void musicStop() throws LineUnavailableException, UnsupportedAudioFileException{
        //music();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frame().setVisible(true);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
