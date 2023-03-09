package N2ex2;

import java.util.Arrays;
import java.util.List;


import static N2ex2.ReturnOddOrEven.oddOrEven;

//Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers.
//        Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o”
//        si el nombre és imparell.
//        Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”.
//        Imprimeix el resultat.
public class Main {

    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(44, 55, 88, 77, 51, 66, 79);
        oddOrEven(listInt);
    }
}
