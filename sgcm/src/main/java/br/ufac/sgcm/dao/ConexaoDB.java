package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;

public class ConexaoDB {
    private String usuario = "root2";
    private String senha = "root";
    private String url = "jdbc:mysql://localhost/sgcm";
    Connection con;
    public Connection getConexao(){
        try{
             Class.forName("com.mysql.cj.JdbcConnection.Driver");
             return DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
