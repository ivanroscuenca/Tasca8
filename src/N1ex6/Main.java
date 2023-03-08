package N1ex6;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.lang.Object.*;

//Crea una llista amb nombres i cadenes de
//        text i ordena la llista amb les cadenes de més curta a més llarga.
public class Main {
    public static void main(String[] args) {
        //List must be kind Object
        List<Object> listNamesAndStrings = new ArrayList<>();
        listNamesAndStrings.add(66);
        listNamesAndStrings.add("car");
        listNamesAndStrings.add(99);
        listNamesAndStrings.add("airplane");
        listNamesAndStrings.add(2023);
        listNamesAndStrings.add("abcdefghijklmnop");
        listNamesAndStrings.sort((o1, o2) -> {
           String s1= String.valueOf(o1);
           String s2= String.valueOf(o2);
            int n1= s1.length();
            int n2= s2.length();
            if(n1!=n2){
                return Integer.compare(n1,n2);
            }else{
                return s1.compareTo(s2);
            }
        });
        System.out.println(listNamesAndStrings);
    }
}
