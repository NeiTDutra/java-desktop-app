// 
// Decompiled by Procyon v0.5.36
// 

package dao;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Montado;
import factory.ConnectionFactory;
import java.sql.Connection;

public class MontadoDAO
{
    private Connection connection;
    int id;
    String placaMae;
    String processador;
    String memoria;
    String fonte;
    String hdssd;
    String placaVideo;
    String gabinete;
    String teclado;
    String mouse;
    String caixaSom;
    String monitor;
    String camera;
    String obs;
    
    public void Montado() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(final Montado montado) {
        final String sql = "INSERT INTO montado (placamae, processador, memoria, fonte, hdssd, placavideo, gabinete, teclado, mouse, caixasom, monitor, camera, obs) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (final PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, montado.getPlacaMae());
            stmt.setString(2, montado.getProcessador());
            stmt.setString(3, montado.getMemoria());
            stmt.setString(4, montado.getFonte());
            stmt.setString(5, montado.getHdssd());
            stmt.setString(6, montado.getPlacaVideo());
            stmt.setString(7, montado.getGabinete());
            stmt.setString(7, montado.getTeclado());
            stmt.setString(8, montado.getMouse());
            stmt.setString(9, montado.getCaixaSom());
            stmt.setString(10, montado.getMonitor());
            stmt.setString(11, montado.getCamera());
            stmt.setString(12, montado.getObs());
            stmt.execute();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Montado consulta(final int id, final String nome) {
        Montado montado = null;
        final String sql = "SELECT * FROM montado where id=? or nome=?";
        try (final PreparedStatement ps = this.connection.prepareStatement(sql)) {
            ps.setObject(1, id);
            ps.setObject(2, nome);
            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                montado = new Montado();
                montado.setId(rs.getInt("id"));
                montado.setNome(rs.getString("nome"));
                montado.setPlacaMae(rs.getString("placamae"));
                montado.setProcessador(rs.getString("processador"));
                montado.setMemoria(rs.getString("memoria"));
                montado.setFonte(rs.getString("fonte"));
                montado.setHdssd(rs.getString("hdssd"));
                montado.setPlacaVideo(rs.getString("placavideo"));
                montado.setGabinete(rs.getString("gabinete"));
                montado.setTeclado(rs.getString("teclado"));
                montado.setMouse(rs.getString("mouse"));
                montado.setCaixaSom(rs.getString("caixasom"));
                montado.setMonitor(rs.getString("monitor"));
                montado.setCamera(rs.getString("camera"));
                montado.setObs(rs.getString("obs"));
            }
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return montado;
    }
    
    public Montado exclui(final String nome) {
        final Montado montado = null;
        final String sql = "DELETE FROM montado WHERE nome=?";
        try (final PreparedStatement ps = this.connection.prepareStatement(sql)) {
            ps.setObject(1, nome);
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return montado;
    }
    
    public Montado altera(final String nome, final String placaMae, final String processador, final String memoria, final String fonte, final String hdssd, final String teclado, final String mouse, final String placaVideo, final String caixaSom, final String gabinete, final String monitor, final String camera, final String obs, final String id) {
        final Montado montado = null;
        final String sql = "UPDATE montado SET nome=?, placamae=?, processador=?, memoria=?, fonte=?, hdssd=?, teclado=?, mouse=?, placavideo=?, caixasom=?, gabinete=?, monitor=?, camera=?, obs=? WHERE id=?";
        try {
            final PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setObject(1, nome);
            stmt.setObject(2, placaMae);
            stmt.setObject(3, processador);
            stmt.setObject(4, memoria);
            stmt.setObject(5, fonte);
            stmt.setObject(6, hdssd);
            stmt.setObject(7, teclado);
            stmt.setObject(8, mouse);
            stmt.setObject(9, placaVideo);
            stmt.setObject(10, caixaSom);
            stmt.setObject(11, gabinete);
            stmt.setObject(12, monitor);
            stmt.setObject(13, camera);
            stmt.setObject(14, obs);
            stmt.setObject(15, id);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return montado;
    }
}
