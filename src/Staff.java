
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HUYHQSE190407
 */
public class Staff {

    private String id; //done
    private String name; //done
    private String email; //done
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
        while (true) {
            String regex = "^(?=.*[a-zA-Z])[a-zA-Z0-9]{6,}$";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            try {
                id = MyLib.inputString("Enter id: ");
                Matcher matcher = pattern.matcher(id);
                if (matcher.matches()) {
                    System.out.println("Your valid id is: " + id);
                    break;
                } else {
                    System.out.println("your length of id must be had 6 to 16 character");
                }
            } catch (Exception ex) {
                System.out.println("Invalid id!");
            }
        }
        
        while (true) {
            String regex = "^(?=.*[a-zA-Z])[a-zA-Z\\s]+$";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            try {
                name = MyLib.inputString("Enter name: ");
                Matcher matcher = pattern.matcher(name);
                if (matcher.matches()) {
                    System.out.println("Your valid name is: " + name);
                    break;
                } else {
                    System.out.println("your name must be followed(a-z)");
                }
            } catch (Exception ex) {
                System.out.println("Invalid name!");
            }
        }
        
         while (true) {
            String regex = "^(?=.*[a-zA-Z])[a-zA-Z0-9._]{6,}@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            try {
                email = MyLib.inputString("Enter email: ");
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    System.out.println("Your valid name is: " + email);
                    break;
                } else {
                    System.out.println("your email must be followed(username(_)@gmail.com) and has length at least 6");
                }
            } catch (Exception ex) {
                System.out.println("Invalid email!");
            }
        }
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password + ", DoB=" + DoB + ", salary=" + salary + '}';
    }

}
