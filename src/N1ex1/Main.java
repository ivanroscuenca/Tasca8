package N1ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static N1ex1.ReturnString.extractedLetterO;

//Per a tots els exercicis s'ha d'utilitzar l'API de Java Lambdas and Streams de Java 8+.
//A partir d’una llista de Strings, escriu
//un mètode que retorna una llista de totes les cadenes que contenen
//la lletra ‘o’. Imprimeix el resultat.
public class Main {
    public static void main(String[] args) {

        Cities city1 = new Cities("Barcelona", 1750000);
        Cities city2 = new Cities("Madrid", 4000000);
        Cities city3 = new Cities("Valencia", 750000);
        Cities city4 = new Cities("Zaragoza", 600000);
        Cities city5 = new Cities("Sevilla", 700000);
        Cities city6 = new Cities("Bilbao", 350000);

        List<Cities> listStringCities =  Arrays.asList(city1,city2,city3,city4,city5,city6);

        System.out.println("Return all cities contains the letter O");
        //We use metode extractedLetterO
        extractedLetterO(listStringCities);
    }




}