package pixelartcom.pixel.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    private long Id;

    private String password;
    private String user;

    public Admin(String password, String user){
        this.password = password;
        this.user = user ;
    }

    public String getPassword() {
        return password;
    }

    public long getId() {
        return Id;
    }

    public String getUser() {
        return user;
    }

    public void setUser( String newUser){
        this.user = newUser;
    }

    public void setPassword( String newPassword){
        this.password =  newPassword;
    }
}
