package N2ex3;
//Crea una Functional Interface que contingui un mètode anomenat operacio().
//        Aquest mètode ha de retornar un float. Injecta a la interfície creada
//        mitjançant una lambda, el cos del mètode, de manera que es pugui transformar
//        l’operació amb una suma, una resta, una multiplicació i una divisió.

public class Main {

    public static void main(String[] args) {
        Operations suma = (num1,num2) -> num1+num2;
        Operations resta = (num1,num2) -> num1-num2;
        Operations multi = (num1,num2) -> num1*num2;
        Operations div = (num1,num2) -> num1/num2;

        System.out.println(suma.operacio(18,3));
        System.out.println(resta.operacio(18,3));
        System.out.println(multi.operacio(18,3));
        System.out.println(div.operacio(18,3));


    }
}
