package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufac.sgcm.model.Profissional;

public class ProfissionalDao implements IDao<Profissional> {
    private Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;
    private EspecialidadeDao eDao = new EspecialidadeDao();
    private UnidadeDao uDao = new UnidadeDao();
    
    //Construtor
    public ProfissionalDao(){
        conexao = new ConexaoDB().getConexao();
        eDao = new EspecialidadeDao();
        uDao = new UnidadeDao();
    }

    //Metodos
    //Listar todos os profissionais
    //Listar os profissionais de acordo com um termo de busca
    //Inserir
    //Atualizar
    //Deletar

    @Override
    public List<Profissional> get() {
        List<Profissional> registros = new ArrayList<>();
        String sql = "SELECT * FROM profissional";
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Profissional p = new Profissional();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
                p.setEmail(rs.getString("email"));
                p.setTelefone(rs.getString("telefone"));
                p.setRegistro(rs.getString("registro_conselho"));
                // Long id = rs.getLong("especialidade_id");
                // Especialidade esp = eDao.get(id)
                // p.setEspecialidade(esp);
                p.setEspecialidade(eDao.get(rs.getLong("especialidade_id")));
                p.setUnidade(uDao.get(rs.getLong("unidade_id")));
                registros.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registros;

    }

    @Override
    public List<Profissional> get(String termoBusca) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Profissional objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(Profissional objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(Profissional objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
