package ir.ac.kntu;

import org.checkerframework.checker.units.qual.C;

public class Admin extends User {

    public Admin(String username,String password,String email,String phone){
        setUsername(username);
        setPassword(password);
        setEmail(email);
        setPhone(phone);
        addToList();
    }
    public Admin(){

    }

    public void addAdmin(){
        Admin admin1 = new Admin();
        admin1.setUsername();
        admin1.setPassword();
        admin1.setEmail();
        admin1.setPhone();
        admin1.addToList();
    }
    public void addTourLeader(){
        Leader leader = new Leader();
        leader.setName();
        leader.setUsername();
        leader.setPassword();
        leader.setShenasnameNumber();
        leader.setMelliCode();
        leader.setDob();
        leader.setDoe();
        leader.setKnownCities();
        leader.setMarried();
        leader.addToList();
    }

    public void addEmployee(){
        Employee emp = new Employee();
        emp.setUsername();
        emp.setPassword();
        emp.setEmail();
        emp.setPhone();
        emp.setSalary();
        emp.setDoe();
        emp.addToList();
    }

    public void addCustomer(){
        Customer customer = new Customer();
        customer.setName();
        customer.setPhone();
        customer.setEmail();
        customer.setUsername();
        customer.setPassword();
        customer.addToList();
    }
}
