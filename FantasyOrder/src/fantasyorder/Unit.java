package fantasyorder;

import javax.swing.JLabel;

public class Unit {
    String username;
    char[] password = new char[100];
    boolean isNew = false;
    int job;
        
    public Unit(String username,char[] pass) {
        this.username = username;
        this.password = pass;
    }
    
    public Unit(){
    
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

    public void setJob(int job) {
        this.job = job;
    }
    
    
}
