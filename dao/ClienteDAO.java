// 
// Decompiled by Procyon v0.5.36
// 

package dao;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;
import factory.ConnectionFactory;
import java.sql.Connection;

public class ClienteDAO
{
    private Connection connection;
    int id;
    String cpf;
    String nome;
    String telefone;
    String endereco;
    String cidade;
    String email;
    String obs;
    
    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(final Cliente cliente) {
        final String sql = "INSERT INTO cliente (cpf, nome, telefone, endereco, cidade, email, obs) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getCidade());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getObs());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Cliente consulta(final int id, final String cpf, final String nome) {
        Cliente cliente = null;
        final String sql = "SELECT * FROM cliente WHERE id=? or cpf=? or nome=?";
        try (final PreparedStatement ps = this.connection.prepareStatement(sql)) {
            ps.setObject(1, id);
            ps.setObject(2, cpf);
            ps.setObject(3, nome);
            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEmail(rs.getString("email"));
                cliente.setObs(rs.getString("obs"));
            }
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return cliente;
    }
    
    public Cliente exclui(final String cpf, final String nome) {
        final Cliente cliente = null;
        final String sql = "DELETE FROM cliente WHERE cpf=? or nome=?";
        try (final PreparedStatement ps = this.connection.prepareStatement(sql)) {
            ps.setObject(1, cpf);
            ps.setObject(2, nome);
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cliente;
    }
    
    public Cliente altera(final String cpf, final String nome, final String telefone, final String endereco, final String cidade, final String email, final String obs, final String id) {
        final Cliente cliente = null;
        final String sql = "UPDATE cliente SET cpf=?, nome=?, telefone=?, endereco=?, cidade=?, email=?, obs=? WHERE id=?";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setObject(1, cpf);
            stmt.setObject(2, nome);
            stmt.setObject(3, telefone);
            stmt.setObject(4, endereco);
            stmt.setObject(5, cidade);
            stmt.setObject(6, email);
            stmt.setObject(7, obs);
            stmt.setObject(8, id);
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cliente;
    }
}
