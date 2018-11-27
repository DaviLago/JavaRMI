package Model;

import java.io.Serializable;

public class LinhaMetro implements Serializable {
    
    private static final long serialVersionUID = 1190476516911661470L;
    
    private String nome;
    private PontosParada paradas;
    
    public LinhaMetro(String nome, PontosParada paradas){
        this.nome = nome;
        this.paradas = paradas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PontosParada getParadas() {
        return paradas;
    }

    public void setParadas(PontosParada paradas) {
        this.paradas = paradas;
    }
    
    
}
