/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicess;

import Domain.pho;
import Respository.phores;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class phoservicess {

    private ArrayList<pho> listSV=new ArrayList<>();
    private phores phorepo;
    
    public phoservicess(){
        this.phorepo=new phores();
    }
    
    public void insert(pho p){
        this.phorepo.insert(p);
    }
    
    public void update(String ma, pho p)
    {
        this.phorepo.update(ma, p);
    }
    
    public void delete(String maSV)
    {
        this.phorepo.delete(maSV);
    }
    public ArrayList<pho> getListSV(){
        return this.phorepo.all();
    }
    
}
