/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.sampleClasses;

/**
 * @author Luis Edo. Hodgson Quesada C13822
 * @time 23:14:18
 * @date 26 nov. 2021
 */
public class User {
    
    private String Username;
    private String Password;

    public User(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public String toString() {
        return "Username: " + Username + "\nPassword: " + Password; 
    }
    
    
}
