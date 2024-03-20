import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ce = new Estado("CE", "Ceará");
        Estado ro = new Estado("RO", "Rondônia");
        Estado sp = new Estado("SP", "São Paulo");

        Cidade saoPaulo = new Cidade(3550308, "São Paulo", 12_396_372);
        Cidade beloHorizonte = new Cidade(3106200, "Belo Horizonte", 2_530_701);
        Cidade fortaleza = new Cidade(2304400, "Fortaleza", 2_703_391);
        Cidade portoVelho = new Cidade(1100205, "Porto Velho", 548_952);

        // TODO Performance é mais importante (não garante a ordem das chaves)
//        Map<Estado, Cidade> capitais = new HashMap<>();

        // TODO Performance é importante, mas precisa manter ordem de inserção das chaves
//        Map<Estado, Cidade> capitais = new LinkedHashMap<>();

        // TODO Performance é menos importante e precisa manter a ordem natural das chaves
        Map<Estado, Cidade> capitais = new TreeMap<>();

        capitais.put(sp, saoPaulo);
        capitais.put(mg, beloHorizonte);
        capitais.put(ce, fortaleza);
        capitais.put(ro, portoVelho);

        // TODO Iteração nas entradas do mapa (chave/valor)
        for (var entry : capitais.entrySet()) {
            System.out.printf("%s = %s (%d habitantes)%n", entry.getKey().getSigla(),
                    entry.getValue().getNome(), entry.getValue().getTotalHabitantes());
        }

        Map<Cidade, Estado> capitais2 = new TreeMap<>();

        capitais2.put(saoPaulo, sp);
        capitais2.put(beloHorizonte, mg);
        capitais2.put(fortaleza, ce);
        capitais2.put(portoVelho, ro);

        System.out.println("================================");

        // TODO Iteração nas entradas do mapa (chave/valor)
        for (var entry : capitais2.entrySet()) {
            System.out.printf("%s = %s - %d (%d habitantes)%n", entry.getValue().getSigla(),
                    entry.getKey().getNome(), entry.getKey().getCodigoIbge(),
                        entry.getKey().getTotalHabitantes()

            );
        }
    }

}