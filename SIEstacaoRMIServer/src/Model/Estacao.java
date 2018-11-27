package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Estacao implements Serializable {
    
    private static final long serialVersionUID = 1190476516911661470L;
    
    private List<LinhaMetro> metro;
    private List<LinhaTrem> trem;
    private BigDecimal precoTrem;
    private BigDecimal precoMetro;
    private String info;
    
    public List<LinhaMetro> getMetro() {
        return metro;
    }

    public void setMetro(List<LinhaMetro> metro) {
        this.metro = metro;
    }

    public List<LinhaTrem> getTrem() {
        return trem;
    }

    public void setTrem(List<LinhaTrem> trem) {
        this.trem = trem;
    }

    public BigDecimal getPrecoTrem() {
        return precoTrem;
    }

    public void setPrecoTrem(BigDecimal precoTrem) {
        this.precoTrem = precoTrem;
    }

    public BigDecimal getPrecoMetro() {
        return precoMetro;
    }

    public void setPrecoMetro(BigDecimal precoMetro) {
        this.precoMetro = precoMetro;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
}
