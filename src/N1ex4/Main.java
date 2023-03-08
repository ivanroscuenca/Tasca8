package N1ex4;

import java.util.Arrays;
import java.util.List;

//Crea una llista amb els noms dels mesos de l’any.
//        Imprimeix tots els elements de la llista amb una lambda.
public class Main {

    public static void main(String[] args) {

        List<String> ListMonths = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        //metodos por referencia
        //1.Clase::Metodo
        //2.Instancia::metodo
        //3.Directamente con System.out. "::" separa clase+atributo System.out e imprime con método println
        ListMonths.forEach(System.out::println);
    }
}
