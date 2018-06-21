package fantasyorder;

import java.awt.Toolkit;
import java.util.ArrayList;

public class panelpickchar extends javax.swing.JPanel {


    ArrayList<Unit> user = new ArrayList<>();    
    int index;
    
    public panelpickchar() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }
    
    //Parsing dari ArrayList Global ke panel
    public void parsedArrayListInfo(ArrayList<Unit> u,int idx){
        user = u;
        index = idx;
        System.out.println(user.get(index).getClass().getSimpleName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        archer = new javax.swing.JButton();
        priest = new javax.swing.JButton();
        warrior = new javax.swing.JButton();
        larcher = new javax.swing.JLabel();
        lpriest = new javax.swing.JLabel();
        lwarrior = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setLayout(null);

        archer.setText("Archer");
        archer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archerActionPerformed(evt);
            }
        });
        add(archer);
        archer.setBounds(510, 490, 71, 32);

        priest.setText("Priest");
        priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priestActionPerformed(evt);
            }
        });
        add(priest);
        priest.setBounds(796, 489, 65, 32);

        warrior.setText("Warrior");
        warrior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warriorActionPerformed(evt);
            }
        });
        add(warrior);
        warrior.setBounds(1091, 490, 75, 32);
        add(larcher);
        larcher.setBounds(521, 431, 50, 60);
        add(lpriest);
        lpriest.setBounds(805, 424, 0, 0);
        add(lwarrior);
        lwarrior.setBounds(1104, 423, 0, 0);

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(1110, 280, 38, 32);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Pick Your Character");
        add(jLabel1);
        jLabel1.setBounds(510, 280, 313, 44);

        jButton2.setText("CONFIRM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(1080, 550, 120, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void archerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archerActionPerformed
        user.set(index, new Archer());
        System.out.println(user.get(index).getClass().getSimpleName());
        if(user.get(index) instanceof Archer){
            user.get(index).setImage(1);
        }
        else{
            System.out.println("gagal");
        }
        
    }//GEN-LAST:event_archerActionPerformed

    private void priestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priestActionPerformed
        //pick = 2;
    }//GEN-LAST:event_priestActionPerformed

    private void warriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorActionPerformed
        //pick = 3;
    }//GEN-LAST:event_warriorActionPerformed
    
    //tombol confirm
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Frame f = (Frame)this.getParent().getParent().getParent().getParent();
        f.goGame(user);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //ini exit button ga tau mau diapakan
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel larcher;
    private javax.swing.JLabel lpriest;
    private javax.swing.JLabel lwarrior;
    private javax.swing.JButton priest;
    private javax.swing.JButton warrior;
    // End of variables declaration//GEN-END:variables
}
