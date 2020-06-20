// 
// Decompiled by Procyon v0.5.36
// 

package modelo;

public class Estoque
{
    private int id;
    private String tipo;
    private String obs;
    private String quantEntra;
    private String quantSai;
    private String quantEst;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }
    
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(final String obs) {
        this.obs = obs;
    }
    
    public String getQuantEntra() {
        return this.quantEntra;
    }
    
    public void setQuantEntra(final String quantEntra) {
        this.quantEntra = quantEntra;
    }
    
    public String getQuantSai() {
        return this.quantSai;
    }
    
    public void setQuantSai(final String quantSai) {
        this.quantSai = quantSai;
    }
    
    public String getQuantEst() {
        return this.quantEst;
    }
    
    public void setQuantEst(final String quantEst) {
        this.quantEst = quantEst;
    }
}
