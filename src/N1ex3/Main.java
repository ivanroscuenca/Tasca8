package N1ex3;

import java.util.Arrays;
import java.util.List;

//Crea una llista amb els noms dels mesos de l’any.
//        Imprimeix tots els elements de la llista amb una lambda.
public class Main {

    public static void main(String[] args) {

        List<String> ListMonths = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        ListMonths.forEach(month -> System.out.println(month));
    }
}
