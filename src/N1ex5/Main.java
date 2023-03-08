package N1ex5;
//Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double.
//        Des del main() de la classe principal,
//        instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue()
//        i imprimeix el resultat.
public class Main {

    public static void main(String[] args) {
        Pi pi = () ->3.1416;
        System.out.println("The value of Pi is :" + pi.getPiValue());
    }
}
