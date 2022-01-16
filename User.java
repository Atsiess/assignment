package ly.assignment;

/**
 *
 * @author jiaying
 */
public class User {
    private String email;
    private int id;
    
    public User(){
        
    }
    public User(String email, int id){
        this.email = email;
        this.id = id;
    }
    
   
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }
}