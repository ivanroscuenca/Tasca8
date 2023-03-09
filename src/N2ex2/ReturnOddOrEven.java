package N2ex2;

import java.util.List;


public class ReturnOddOrEven {

    static void oddOrEven(List<Integer> listInt) {
        listInt.stream()
                .forEach(number->{
        if (number.intValue()%2==0){
            System.out.println("e"+number);
        }else{
            System.out.println("o"+number);
        }
        });
    }
//                .map(s->s%2==0?"e-"+s:"o-"+s)
//                .forEach(System.out::println);

    }

