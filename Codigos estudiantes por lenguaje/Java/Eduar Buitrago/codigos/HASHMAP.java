import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> dicc = new HashMap<>();//si pongo TreeMap me ordena
        dicc.put("Programar", "Utilización de codigo para ejecutar un programa");
        dicc.put("Futbol", "Deporte con una pelota y arcos");
        dicc.put("Funar", "Gritar como una loca (Diego cof cof)");
        dicc.put("among us", "juego para funar");

        for (String concepto : dicc.keySet()) {
            String key = concepto;
            String value = dicc.get(concepto);
            System.out.println(key + "->" + value);
        }
    }

}
