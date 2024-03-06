package practiceprograms.Oops.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Login lg = new Login();
        lg.setUsername("Rohit");
        System.out.println("Username is :- " + lg.getUsername());
        lg.setPassword("12345");
        System.out.println("Password is :- " +lg.getPassword());
    }
}
