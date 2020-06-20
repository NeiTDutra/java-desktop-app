// 
// Decompiled by Procyon v0.5.36
// 

package modelo;

public class Usuario
{
    private int id;
    private String nome;
    private String senha;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(final String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(final String senha) {
        this.senha = senha;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
}
