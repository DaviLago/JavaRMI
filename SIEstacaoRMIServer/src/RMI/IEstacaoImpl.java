package RMI;

import Model.Estacao;
import Model.LinhaMetro;
import Model.LinhaTrem;
import Model.PontosParada;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IEstacaoImpl extends UnicastRemoteObject implements IEstacao {
    
    private static final long serialVersionUID = 1L;
    
    Estacao estacao;
    List<LinhaMetro> metro;
    List<LinhaTrem> trem;
    BigDecimal precoTrem = new BigDecimal(3.00);
    BigDecimal precoMetro = new BigDecimal(4.00);
    
    public IEstacaoImpl() throws RemoteException {
        super();
        estacao = new Estacao();
        estacao.setPrecoMetro(precoMetro);
        estacao.setPrecoTrem(precoTrem);
        estacao.setInfo("A Estação São Caetano do Sul - Prefeito Walter Braido, chamada extraoficialmente apenas de São Caetano ou São Caetano do Sul, é uma estação ferroviária, pertencente à Linha 10 - Turquesa da CPTM.\n" +
                        "\n" +
                        "A estação localizada no centro do município de São Caetano do Sul, na Região do Grande ABC.\n" +
                        "\n" +
                        "Em janeiro de 2015, a até então chamada Estação São Caetano passou a ser chamada oficialmente de Estação São Caetano do Sul - Prefeito Walter Braido.");
//------------------------------------------------------------------------------------------       
        metro = new ArrayList<>();        
        List<PontosParada> paradas = new ArrayList<>();
        paradas.add(new PontosParada(Arrays.asList("Jabaquara",
                                                   "Conceição",
                                                   "São Judas",
                                                   "Saúde",
                                                   "Praça da Árvore",
                                                   "Santa Cruz",
                                                   "Vila Mariana",
                                                   "Ana Rosa",
                                                   "Paraíso",
                                                   "Vergueiro",
                                                   "São Joaquim",
                                                   "Liberdade",
                                                   "Sé",
                                                   "São Bento",
                                                   "Luz",
                                                   "Tiradentes",
                                                   "Armênia",
                                                   "Portuguesa-Tietê",
                                                   "Carandiru",
                                                   "Santana",
                                                   "Jardim São Paulo-Ayrton Senna",
                                                   "Parada Inglesa",
                                                   "Tucuruvi")));
        
        paradas.add(new PontosParada(Arrays.asList("Vila Prudente",
                                                   "Tamanduateí",
                                                   "Sacomã",
                                                   "Alto do Ipiranga",
                                                   "Santos-Imigrantes",
                                                   "Chácara Klabin",
                                                   "Ana Rosa",
                                                   "Paraíso",
                                                   "Brigadeiro",
                                                   "Trianon-Masp",
                                                   "Consolação",
                                                   "Clínicas",
                                                   "S. N. Sra. de Fátima-Sumaré",
                                                   "Vila Madalena")));
        
        paradas.add(new PontosParada(Arrays.asList("Corinthians-Itaquera",
                                                   "Artur Alvim",
                                                   "Patriarca",
                                                   "Guilhermina-Esperança",
                                                   "Vila Matilde",
                                                   "Penha",
                                                   "Carrão",
                                                   "Tatuapé",
                                                   "Belém",
                                                   "Bresser-Mooca",
                                                   "Brás",
                                                   "Pedro II",
                                                   "Sé",
                                                   "Anhangabaú",
                                                   "República",
                                                   "Santa Cecília",
                                                   "Marechal Deodoro",
                                                   "Palmeiras-Barra Funda")));
        
        metro.add(new LinhaMetro("Linha 1 - Azul", paradas.get(0)));
        metro.add(new LinhaMetro("Linha 2 - Verde", paradas.get(1)));
        metro.add(new LinhaMetro("Linha 3 - Vermelha", paradas.get(2)));
//---------------------------------------------------------------------------------------
        trem = new ArrayList<>();        
        paradas.clear();
        paradas.add(new PontosParada(Arrays.asList("Brás",
                                                   "Mooca",
                                                   "Ipiranga",
                                                   "Tamanduateí",
                                                   "São Caetano",
                                                   "Utinga",
                                                   "Prefeito Saladino",
                                                   "Pref. Celso Daniel - Santo André",
                                                   "Capuava",
                                                   "Mauá",
                                                   "Guapituba",
                                                   "Ribeirão Pires",
                                                   "Rio Grande Da Serra")));
        
        trem.add(new LinhaTrem("Linha 10 - Turquesa", paradas.get(0)));
//---------------------------------------------------------------------------
        estacao.setMetro(metro);
        estacao.setTrem(trem);
    }
    
    @Override
    public List<LinhaTrem> getLinhasTrem() throws RemoteException {
        return estacao.getTrem();
    }

    @Override
    public List<LinhaMetro> getLinhasMetro() throws RemoteException {
        return estacao.getMetro();
    }

    @Override
    public Estacao getEstacao() throws RemoteException {
        return estacao;
    }
    
}
