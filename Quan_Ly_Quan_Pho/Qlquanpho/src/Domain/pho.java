/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author admin
 */
public class pho {
  private String mamenu;
   private  String tenmon;
   private String giatien;

    public pho() {
    }

    public pho(String mamenu, String tenmon, String giatien) {
        this.mamenu = mamenu;
        this.tenmon = tenmon;
        this.giatien = giatien;
    }
   
   

    public pho(String tenmon, String giatien) {
        this.tenmon = tenmon;
        this.giatien = giatien;
    }

    public String getMamenu() {
        return mamenu;
    }

    public void setMamenu(String mamenu) {
        this.mamenu = mamenu;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }
   
   
    
}
