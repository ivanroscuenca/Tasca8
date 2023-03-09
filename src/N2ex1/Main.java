package N2ex1;

import java.util.Arrays;
import java.util.List;

import static N2ex1.ReturnString.extractedLetterAand3;

//Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista de totes
//        les cadenes que comencen amb la lletra 'A'
//        (majúscula) i  tenen exactament 3 lletres. Imprimeix el resultat.
public class Main {

    public static void main(String[] args) {
        List<String> listNames = Arrays.asList("Joan", "Fabrizio", "Monica", "Augusto", "Miguel", "Julio", "Ari");
        extractedLetterAand3(listNames);
    }
}
