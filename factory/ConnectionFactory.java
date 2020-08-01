// 
// Decompiled by Procyon v0.5.36
// 

package factory;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ConnectionFactory
{
    public Connection getConnection() {
        System.out.println("...conectando ao bando de cacos...");
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/empresa", "empresa", "");
        }
        catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro:" + excecao);
            throw new RuntimeException(excecao);
        }
    }
}
