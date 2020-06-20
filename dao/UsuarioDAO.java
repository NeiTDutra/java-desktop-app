// 
// Decompiled by Procyon v0.5.36
// 

package dao;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Usuario;
import factory.ConnectionFactory;
import java.sql.Connection;

public class UsuarioDAO
{
    private Connection connection;
    int id;
    String nome;
    String senha;
    
    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(final Usuario usuario) {
        final String sql = "INSERT INTO usuario (nome, senha) VALUES (?, ?)";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.execute();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Usuario consulta(final int id, final String nome, final String senha) {
        Usuario usuario = null;
        final String sql = "SELECT * FROM usuario WHERE id=? or nome=? or senha=?";
        try (final PreparedStatement ps = this.connection.prepareStatement(sql)) {
            ps.setObject(1, id);
            ps.setObject(2, nome);
            ps.setObject(3, senha);
            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
            }
            ps.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return usuario;
    }
    
    public Usuario exclui(final String nome, final String senha) {
        final Usuario usu = null;
        final String sql = "DELETE FROM usuario WHERE nome=? or senha=?";
        try (final PreparedStatement ps = this.connection.prepareStatement(sql)) {
            ps.setObject(1, nome);
            ps.setObject(2, senha);
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usu;
    }
    
    public Usuario altera(final String nome, final String senha, final String id) {
        final Usuario usuario = null;
        final String sql = "UPDATE usuario SET nome=?, senha=? WHERE id=?";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setObject(1, nome);
            stmt.setObject(2, senha);
            stmt.setObject(3, id);
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }
}
