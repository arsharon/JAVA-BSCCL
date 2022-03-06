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
public class AdminApprovesCus implements Serializable{

    String compname;

    @Override
    public String toString() {
        return "compname=" + compname + ", comppack=" + comppack ;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getComppack() {
        return comppack;
    }

    public void setComppack(String comppack) {
        this.comppack = comppack;
    }

    public AdminApprovesCus(String compname, String comppack) {
        this.compname = compname;
        this.comppack = comppack;
    }
    String comppack;
    void display() {
        System.out.println("compname=" + compname + ", comppack=" + comppack);
    }
    
}
