/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import Domain.pho;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class phores {

     public void insert(pho p){
        try {
            Connection conn=DBConnection.getConnection();
            String sql="INSERT INTO Menu"+"(MaMenu,Tenmonan,giatien)"+"VALUES(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, p.getTenmon());
            ps.setString(2, p.getGiatien());
          
       
            ps.execute();
            System.out.println("Truy vấn thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(String ma,pho p){
        try {
            Connection conn=DBConnection.getConnection();
            String sql="UPDATE Menu SET "+"MaMenu=?, Tenmonan = ? ,giatien=? WHERE MaMenu=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, p.getTenmon());
            ps.setString(2, p.getGiatien());
           
            ps.setString(3, ma);
            ps.execute();
            System.out.println("Truy vấn thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(String ma){
        try {
            Connection conn=DBConnection.getConnection();
            String sql="DELETE FROM Menu WHERE ma=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            System.out.println("Truy vấn thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<pho> all(){
        ArrayList<pho> listSV=new ArrayList<>();
        try {
            Connection conn=DBConnection.getConnection();
            String sql="SELECT * FROM Menu";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs=ps.getResultSet();
            while (rs.next()) {                
//                String maSV=rs.getString("masv");
                String Ten=rs.getString("Tenmonan");
                String gia=rs.getString("giatien");
             
              pho p = new pho(Ten, gia);
                listSV.add(p);
            }
            System.out.println("Truy vấn thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSV;
    }
    
}
