package N1ex1;

import java.util.List;

public class ReturnString {

    static void extractedLetterO(List<Cities> listStringCities) {
        listStringCities.stream()
                .filter(x -> x.getName().
                        toLowerCase()
                        .contains("o"))
                .forEach(x -> System.out.println(x));
        ;
    }

}


