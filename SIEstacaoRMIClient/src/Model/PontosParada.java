package Model;

import java.io.Serializable;
import java.util.List;

public class PontosParada implements Serializable {
    
    private static final long serialVersionUID = 1190476516911661470L;
    
    private List<String> paradas;
    
    public PontosParada(List<String> paradas){
        this.paradas = paradas;
    }
    
    public List<String> getParadas() {
        return paradas;
    }

    public void setParadas(List<String> paradas) {
        this.paradas = paradas;
    }

}
