/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication8;

/**
 *
 * @author User
 */
public class Person {
    private String firstName=null;
    private String lastName=null;
    private String email=null;
    private String mobile=null;

    public Person(String firstName, String lastName, String email, String mobile) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.mobile=mobile;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
