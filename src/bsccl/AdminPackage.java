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
public class AdminPackage implements Serializable{

    String packIdAd;
    String packBan;
    String packPr;

    public AdminPackage(String packIdAd, String packBan, String packPr) {
        this.packIdAd = packIdAd;
        this.packBan = packBan;
        this.packPr = packPr;
    }

    public String getPackIdAd() {
        return packIdAd;
    }

    public void setPackIdAd(String packIdAd) {
        this.packIdAd = packIdAd;
    }

    public String getPackBan() {
        return packBan;
    }

    public void setPackBan(String packBan) {
        this.packBan = packBan;
    }

    public String getPackPr() {
        return packPr;
    }

    public void setPackPr(String packPr) {
        this.packPr = packPr;
    }

    @Override
    public String toString() {
        return  "packIdAd=" + packIdAd + ", packBan=" + packBan + ", packPr=" + packPr ;
    }
    void display() {
        System.out.println("packIdAd=" + packIdAd + ", packBan=" + packBan + ", packPr=" + packPr);
    }
    
}
