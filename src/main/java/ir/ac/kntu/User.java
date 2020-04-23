package ir.ac.kntu;
import java.util.Scanner;

public class User {
    // نام کاربری ، رمز عبور ، ایمیل و شماره تلفن
    private String username;
    private String password;
    private String email;
    private String phone;

    public User(String username,String password,String email,String phone){
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        addToList();
    }

    public User(){

    }
    public User(String str){
        username = str;
    }

    public void addToList(){
        Tools.users.addLast(this);
    }
    public void setUsername(){
        System.out.println("Enter username:");
        Scanner in = new Scanner(System.in);
        username= in.nextLine();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword()
    {
        System.out.println("Enter password:");
        Scanner in = new Scanner(System.in);
        password= in.nextLine();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail() {
        System.out.println("Enter email address:");
        Scanner in = new Scanner(System.in);
        email= in.nextLine();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(){
        System.out.println("Enter phone number:");
        Scanner in = new Scanner(System.in);
        phone= in.nextLine();
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
