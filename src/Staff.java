/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUYHQSE190407
 */
public class Staff {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String DoB;
    private int salary;

    public Staff() {
    }

    
    
    public Staff(String id, String name, String email, String phone, String password, String DoB, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.DoB = DoB;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
    public void input() {
        
    }
    
    
    
    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password + ", DoB=" + DoB + ", salary=" + salary + '}';
    }
    
}
