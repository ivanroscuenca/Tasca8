package N2ex1;

import N1ex1.Cities;

import java.util.List;

public class ReturnString {

    static void extractedLetterAand3(List<String> listNames) {
        listNames.stream()
                .filter(name -> name.length()==3
                                && name.startsWith("A"))
      .forEach(name -> System.out.println(name));
        ;
    }
}
