/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
import java.util.Date;

public class Exams {
    private int eid;
    private Date from;
    private float duration;
    private int aid;

    // Constructor
    public Exams(int eid, Date from, float duration, int aid) {
        this.eid = eid;
        this.from = from;
        this.duration = duration;
        this.aid = aid;
    }

    // Getters and setters

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    
}
