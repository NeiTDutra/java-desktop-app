// 
// Decompiled by Procyon v0.5.36
// 

package modelo;

public class Cliente
{
    private int id;
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;
    private String email;
    private String obs;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(final String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(final String telefone) {
        this.telefone = telefone;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(final String endereco) {
        this.endereco = endereco;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(final String cidade) {
        this.cidade = cidade;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(final String obs) {
        this.obs = obs;
    }
}
