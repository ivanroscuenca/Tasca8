package N1ex8;

import N1ex5.Pi;
//Crea una Functional Interface que contingui un mètode anomenat reverse().
//        Aquest mètode ha de rebre i ha de retornar un String. En el main()
//        de la classe principal, injecta a la interfície creada mitjançant una lambda,
//        el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés.
//        Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.
public class Main {
    public static void main(String[] args) {
        Reverse rev  = (name) -> {
        String reversedWord ="";
            for (int i = name.length()-1; i >=0 ; i--) {
                reversedWord+=name.charAt(i);
            }
            return reversedWord;
        };
        String name1="abcde";

        System.out.printf("The name " + name1+ " reversed is : "+ rev.reverse(name1));
    }
}
