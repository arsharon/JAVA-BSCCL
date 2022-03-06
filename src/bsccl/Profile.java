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
public class Profile implements Serializable{
    
    String compEmail;
    String compPass;
    String compPhn;
    String compAddress;
    String compName;

    public Profile(String compEmail, String compPass, String compPhn, String compAddress, String compName) {
        this.compEmail = compEmail;
        this.compPass = compPass;
        this.compPhn = compPhn;
        this.compAddress = compAddress;
        this.compName = compName;
    }

    public String getCompEmail() {
        return compEmail;
    }

    public void setCompEmail(String compEmail) {
        this.compEmail = compEmail;
    }

    public String getCompPass() {
        return compPass;
    }

    public void setCompPass(String compPass) {
        this.compPass = compPass;
    }

    public String getCompPhn() {
        return compPhn;
    }

    public void setCompPhn(String compPhn) {
        this.compPhn = compPhn;
    }

    public String getCompAddress() {
        return compAddress;
    }

    public void setCompAddress(String compAddress) {
        this.compAddress = compAddress;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    @Override
    public String toString() {
        return  "compEmail=" + compEmail + ", compPass=" + compPass + ", compPhn=" + compPhn + ", compAddress=" + compAddress + ", compName=" + compName ;
    }
    void display() {
        System.out.println("compEmail=" + compEmail + ", compPass=" + compPass + ", compPhn=" + compPhn + ", compAddress=" + compAddress + ", compName=" + compName );
    }
    
    
    
}
