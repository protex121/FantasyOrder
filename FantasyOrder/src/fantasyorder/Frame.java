package fantasyorder;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    
    //index user yang sedang login
    int index;
    //ArrayList user global
    ArrayList<Unit> user = new ArrayList<>();
    
    /*bagian panel tolong diurutkan disini semua*/
    panellogin login;
    panelsign sign = new panelsign();
    panelloading load = new panelloading();
    panelpickchar pick = new panelpickchar();
    panelgame game = new panelgame();
    
    public Frame() throws UnsupportedAudioFileException, LineUnavailableException {

        load();

        this.setFocusable(true);

        this.login = new panellogin();
        this.setUndecorated(true); //untuk hilangkan window
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
        this.add(pick);
        login.parseArray(this.user);
        login.setVisible(true);
        sign.setVisible(false);
        load.setVisible(false);
        game.setVisible(false);
        pick.setVisible(false);
        //music(false);
    }
    
    //ke panel signin
    public void goSignIn(){
        sign.setVisible(true);
        login.setVisible(false);
    }
    
    public void goLogin(ArrayList<Unit> u){
        sign.setVisible(false);
        login.setVisible(true);
        login.parseArray(this.user);    //parsing isi array list USER ke panel login
        //user = u;               //mengisi isi ArrayList Global dari panel sign in
    }
    
    public void goLoading(int idx) throws LineUnavailableException, UnsupportedAudioFileException{      
        login.setVisible(false);
        load.setVisible(true);
        index = idx;
        //musicStop();
    }
    
    public void goPick(){
        load.setVisible(false);
        pick.setVisible(true);
        pick.parsedArrayListInfo(user,index);
    }
    
    public void isiArrayList(){
        System.out.println("");
        for(int i=0;i<user.size();i++){
            System.out.println(user.get(i).username);
        }
    }
    
    public void goGame(ArrayList<Unit> u){
        pick.setVisible(false);
        game.setVisible(true);
        user = u;
        game.parsedArrayList(user, index);
    }
    
    public void passVar(ArrayList<Unit> u){
        user = u;
        save();
        
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
    
    public void save(){
        try{
            FileOutputStream fileout=new FileOutputStream("user.txt");
            ObjectOutputStream out=new ObjectOutputStream(fileout);
            out.writeObject(user);
            out.close();
            fileout.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void load(){
        try{
                    FileInputStream filein=new FileInputStream("user.txt");
                    ObjectInputStream in=new ObjectInputStream(filein);
                    user=(ArrayList<Unit>) in.readObject();
                    in.close();
                    filein.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
        for(int i=0;i<user.size();i++){
            System.out.println(user.get(i).username + " - " + user.get(i).password);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

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
    
    //tombol ditekan
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        char temp = evt.getKeyChar();
        
        if(temp == 'w'){
            game.gerakAtas();
        }
        else if(temp == 'a'){
            game.gerakKiri();
        }
        else if(temp == 's'){
            game.gerakBawah();   
        }
        else if(temp == 'd'){
            game.gerakKanan();
        }
        
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        char temp = evt.getKeyChar();
        
        if(temp == 'w'){
            game.gerakAtas();
        }
        else if(temp == 'a'){
            game.gerakKiri();
        }
        else if(temp == 's'){
            game.gerakBawah();   
        }
        else if(temp == 'd'){
            game.gerakKanan();
        }
    }//GEN-LAST:event_formKeyReleased

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
