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
import pe.upeu.edu.moran.modelo.TipoIglesia;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    ArrayList<TipoIglesia> lista = null;
    public ArrayList<TipoIglesia> listarTipoIglesia(){
        
        lista = new ArrayList();
        try {
         sql="SELECT *FROM tipo_iglesia";
        cx=Conexion.getConex();
        st=cx.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            TipoIglesia ti= new TipoIglesia();
            ti.setIdti(rs.getInt("iddistrito"));
            ti.setNomtipo(rs.getString("idregion"));
            
            lista.add(ti);
            
            
        }
            
        } catch (SQLException e) {
        }
        
        
        
        return lista;
    }
}