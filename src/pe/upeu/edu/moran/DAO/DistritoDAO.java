/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.moran.DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pe.upeu.edu.moran.config.Conexion;
import pe.upeu.edu.moran.modelo.Distrito;

/**
 *
 * @author alum.fial7
 */
public class DistritoDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<Distrito> lista = null;
    public ArrayList<Distrito> listarDistrito(){
        
        lista = new ArrayList();
        try {
         sql="SELECT *FROM distrito";
        cx=Conexion.getConex();
        st=cx.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            Distrito d= new Distrito();
            d.setIdd(rs.getInt("iddistrito"));
            d.setIdr(rs.getInt("idregion"));
            d.setDisc(rs.getString("distrito"));
            d.setEstado(rs.getString("estado"));
            lista.add(d);
            
            
        }
            
        } catch (SQLException e) {
        }
        
        
        
        return lista;
        
    }
    
    
    
    
    
}
