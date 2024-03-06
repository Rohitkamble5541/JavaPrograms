package practiceprograms.Oops.Encapsulation;

public class Login {

    /*
    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    declare class variables/attributes as private provide public get and set methods to access and update the value of
    a private variable
     */


    // Getter
    public String getUsername() {
        return username;
    }

    // Setter

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter
    public String getPassword() {
        return password;
    }



    // Setter
    public void setPassword(String password) {
        this.password = password;
    }

    private String username ;  // private = restricted access
    private String password ;  // private = restricted access




}




