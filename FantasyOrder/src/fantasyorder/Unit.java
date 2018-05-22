package fantasyorder;

public class Unit {
    String username;
    char[] password = new char[100];

    public Unit(String username,char[] pass) {
        this.username = username;
        this.password = pass;
    }

    public char[] getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    
    
    
    
}
