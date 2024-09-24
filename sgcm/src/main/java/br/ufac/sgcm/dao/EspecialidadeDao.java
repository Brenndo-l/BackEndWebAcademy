package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufac.sgcm.model.Especialidade;

public class EspecialidadeDao {
    Connection conexao;
    PreparedStatement ps;
    ResultSet rs;
    //Construtor
    public EspecialidadeDao(){
        conexao = new ConexaoDB().getConexao();
    }
    //Metodos de acesso aos dados das especialidades (MySQL)
    //Listar todas as especialidades
    public List<Especialidade> get(){
        List<Especialidade> registros = new ArrayList<>();
        String sql = "SELECT * FROM especialidade";
        try{
           ps = conexao.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
              Especialidade obj = new Especialidade();
              obj.setId(rs.getLong("id"));
              obj.setNome(rs.getString("nome"));
           }
        }catch(SQLException e){
           e.printStackTrace();
        }
        return registros;
    }

    //Listar especialidades por termo de busca
    public List<Especialidade> get(String termoBusca){
        List<Especialidade> registros = new ArrayList<>();
        String sql = "SELECT * FROM especialidade WHERE LIKE ?";
        try{
           ps = conexao.prepareStatement(sql);
           ps.setString(1, "%"+termoBusca+"%");
           rs = ps.executeQuery();
           while(rs.next()){
              Especialidade obj = new Especialidade();
              obj.setId(rs.getLong("id"));
              obj.setNome(rs.getString("nome"));
           }
        }catch(SQLException e){
           e.printStackTrace();
        }
        return registros;
    }
    //inserir Especialidade
    public int insert(Especialidade objeto){
        int registroAfetados = 0;
       String sql = "Insert into especialidade (nome) values (?)";
       try {
         ps = conexao.prepareStatement(sql);
         ps.setString(1, objeto.getNome());
         registroAfetados = ps.executeUpdate();
       } catch (SQLException e) {
         e.printStackTrace();
       }
       return registroAfetados;
    }
    //Atualizar Especialidade
    public int update(Especialidade objeto){
        int registroAfetados = 0;
        String sql = "UPDATE especialiade SET nome=? WHERE id=?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setLong(2, objeto.getId());
            registroAfetados = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registroAfetados;

    }
    //Excluir Especialidade
    public int delete(Especialidade objeto){
        int registroAfetados = 0;
        String sql = "DELETE FROM especialidade WHERE id=?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, objeto.getId());
            registroAfetados = ps.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return registroAfetados;
    }
}
