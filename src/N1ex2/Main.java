package N1ex2;

import java.util.Arrays;
import java.util.List;

import static N1ex2.ReturnString.extractedLetterOand5letters;

//Has de fer el mateix que en el punt anterior, però ara, el mètode ha de
//        retornar una llista amb els Strings que a més de contenir la lletra ‘o’
//        també tenen més de 5 lletres. Imprimeix el resultat.

public class Main {
    public static void main(String[] args) {

        Cities city1 = new Cities("Barcelona", 1750000);
        Cities city2 = new Cities("Madrid", 4000000);
        Cities city3 = new Cities("Valencia", 750000);
        Cities city4 = new Cities("Zaragoza", 600000);
        Cities city5 = new Cities("Sevilla", 700000);
        Cities city6 = new Cities("Bilbao", 350000);

        List<Cities> listStringCities =  Arrays.asList(city1,city2,city3,city4,city5,city6);

        System.out.println("Return all cities contains the letter O and cities are longer than five letters");
        //We use metode extractedLetterOand5letters
        extractedLetterOand5letters(listStringCities);
    }




}