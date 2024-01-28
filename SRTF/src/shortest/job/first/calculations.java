/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortest.job.first;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class calculations {
    private String name;
    private int burstTime;
    private int arrivalTime;
    private int turnaround;
    private int waiting;
    public calculations(String name, int burstTime, int arrivalTime,int turnaround,int waiting) {
        this.name = name;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.turnaround=turnaround;
        this.waiting=waiting;
    }
    public String getProcess() {
        return name;
    }

    public int getTimeBurst() {
        return burstTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
    public int getWaiting(){
    return waiting;
    }
    
    public int getTurnAround(){
    return turnaround;
    }
}
