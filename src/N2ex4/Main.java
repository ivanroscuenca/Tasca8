package N2ex4;
//Crea una llista que contingui algunes cadenes de text i nombres.
//
//        Ordena-les per:
//        Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)
//        Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
//        Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
//        Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listNamesAndStrings = new ArrayList<>();
        listNamesAndStrings.add("66");
        listNamesAndStrings.add("car");
        listNamesAndStrings.add("99");
        listNamesAndStrings.add("airplane");
        listNamesAndStrings.add("2023");
        listNamesAndStrings.add("broadcasting");

//       Order by Alphabet in 1st character
        List<String> listOrderByAlphabet = listNamesAndStrings.stream()
                .sorted(Comparator.comparingInt(s -> s.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(listOrderByAlphabet);

//        Order by strings contains letter e first
        List<String> listOrderByLetterE = listNamesAndStrings.stream()
                .sorted((s1,s2) -> s1.contains("e") ? -1:1)
                .collect(Collectors.toList());
        System.out.println(listOrderByLetterE);

// Modify word contains "a" by 4.
        List<String> listChangeAby4 = listNamesAndStrings.stream()
                .map(s->s.contains("a")?s.replace("a","4"):s)
                .collect(Collectors.toList());
        System.out.println(listChangeAby4);

    //only Show numbers
        List<String> listNumbersOnly = listNamesAndStrings.stream()
                .filter(x -> x.matches("\\d+"))
                .collect(Collectors.toList());
        System.out.println(listNumbersOnly);
    }
}
