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
    private int wins;
    private int losses;
    private int wins_TF;
    private int wins_MS;
    private int wins_US;
    private int losses_TF;
    private int losses_MS;
    private int losses_US;

    public User() {
    }

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

    public void setWins(int wins) {
        this.wins = wins;
    }


    public void setWins_MS(int wins_MS) {
        this.wins_MS = wins_MS;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setWins_TF(int wins_TF) {
        this.wins_TF = wins_TF;
    }

    public void setWins_US(int wins_US) {
        this.wins_US = wins_US;
    }

    public void setLosses_MS(int losses_MS) {
        this.losses_MS = losses_MS;
    }

    public void setLosses_TF(int losses_TF) {
        this.losses_TF = losses_TF;
    }

    public void setLosses_US(int losses_US) {
        this.losses_US = losses_US;
    }
    
    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }
        public int getWins() {
        return wins;
    }

    public int getWins_MS() {
        return wins_MS;
    }

    public int getWins_TF() {
        return wins_TF;
    }

    public int getWins_US() {
        return wins_US;
    }

    public int getLosses_TF() {
        return losses_TF;
    }

    public int getLosses_US() {
        return losses_US;
    }
    
    public int getLosses_MS() {
        return losses_MS;
    }

    public int getLosses() {
        return losses;
    }

    @Override
    public String toString() {
        return Username + "-" + Password + "-" + wins + "-" + wins_TF + "-" 
                + wins_US + "-" + wins_MS + "-" + losses + "-" + losses_TF + "-" 
                + losses_US + "-" + losses_MS;
    }

}
