/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Subjects {
    private int subid;
    private String subname;

    // Constructor
    
    public Subjects() {
    }

    public Subjects(int subid, String subname) {
        this.subid = subid;
        this.subname = subname;
    }
    // Getters and setters

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }
    
}
