/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.Serializable;

/**
 *
 * @author Adnan Rahman Sharon
 */
public class AdminApprovesSupp implements Serializable{
    String suppcomp;
    String supptenID;

    public AdminApprovesSupp(String suppcomp, String supptenID) {
        this.suppcomp = suppcomp;
        this.supptenID = supptenID;
    }

    public String getSuppcomp() {
        return suppcomp;
    }

    public void setSuppcomp(String suppcomp) {
        this.suppcomp = suppcomp;
    }

    public String getSupptenID() {
        return supptenID;
    }

    public void setSupptenID(String supptenID) {
        this.supptenID = supptenID;
    }

    @Override
    public String toString() {
        return "suppcomp=" + suppcomp + ", supptenID=" + supptenID ;
    }

    
    void display() {
        System.out.println("suppcomp=" + suppcomp + ", supptenID=" + supptenID);
    }
    
}
