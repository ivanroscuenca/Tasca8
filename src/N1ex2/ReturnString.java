package N1ex2;

import java.util.List;

public class ReturnString {

    public static void extractedLetterOand5letters(List<Cities> listStringCities) {
        listStringCities.stream()
                .filter(x -> x.getName().
                        toLowerCase()
                        .contains("o") && x.getName().length()>5)
                .forEach(x -> System.out.println(x));
        ;
    }
}


