// 
// Decompiled by Procyon v0.5.36
// 

package dao;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Estoque;
import factory.ConnectionFactory;
import java.sql.Connection;

public class EstoqueDAO
{
    private Connection connection;
    int id;
    String tipo;
    String quantEntra;
    String quantSai;
    String quantEst;
    String obs;
    
    public EstoqueDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(final Estoque estoque) {
        final String sql = "INSERT INTO estoque (tipo, obs, quantentra, quantsai, quantest) VALUES (?, ?, ?, ?, ?)";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, estoque.getTipo());
            stmt.setString(2, estoque.getObs());
            stmt.setString(3, estoque.getQuantEntra());
            stmt.setString(4, estoque.getQuantSai());
            stmt.setString(5, estoque.getQuantEst());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Estoque consulta(final int id, final String tipo) {
        Estoque estoque = null;
        final String sql = "SELECT * FROM estoque WHERE id=? or tipo=?";
        try (final PreparedStatement ps = this.connection.prepareStatement(sql)) {
            ps.setObject(1, id);
            ps.setObject(2, tipo);
            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                estoque = new Estoque();
                estoque.setId(rs.getInt("id"));
                estoque.setTipo(rs.getString("tipo"));
                estoque.setQuantEntra(rs.getString("quantentra"));
                estoque.setQuantSai(rs.getString("quantsai"));
                estoque.setQuantEst(rs.getString("quantest"));
                estoque.setObs(rs.getString("obs"));
            }
            rs.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return estoque;
    }
    
    public Estoque exclui(final String tipo) {
        final Estoque estoque = null;
        final String sql = "DELETE FROM estoque WHERE tipo=?";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setObject(1, tipo);
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return estoque;
    }
    
    public Estoque altera(final String tipo, final String quantEnt, final String quantSai, final String quantEst, final String obs, final String id) {
        final Estoque estoque = null;
        final String sql = "UPDATE estoque SET tipo=?, quantentra=?, quantsai=?, quantest=?, obs=? WHERE id=?";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setObject(1, tipo);
            stmt.setObject(2, quantEnt);
            stmt.setObject(3, quantSai);
            stmt.setObject(4, quantEst);
            stmt.setObject(5, obs);
            stmt.setObject(6, id);
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return estoque;
    }
}
