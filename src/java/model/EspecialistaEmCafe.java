package model;
import java.util.*;
/**
 *
 * @author slk
 */

/*
 Aqui está nosso sofisticado e inteligente sistema baseado 
em regras que dá conselhos sobre café:
*/
public class EspecialistaEmCafe {
    
    public List getMarcas (String tipo){
        List marcas = new ArrayList();
        if (tipo.equals("Tradicional")) {
            marcas.add("Luiz da Silva");
            marcas.add("Wanderlei do nascimento");
        } else {
            marcas.add("Maria Alves");
            marcas.add("Ana Beatriz");
        }
        return (marcas);
    }
}
