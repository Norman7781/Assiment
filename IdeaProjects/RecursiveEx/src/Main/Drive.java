package Main;

import Factorial.Factorial1;
import Factorial.Factorial2;
import Fibonacci.Fibonacci;
import NaturalNumber.NautralNum;
import Power.PowerOfNumber;
import SumDigit.SumDigit;
import Tribonacci.TribonacciF;

public class Drive {
    public static void main(String[] args) {
         /*
    Probability
    Permutation formula{
     n!/(n-k)!
     }

    Question:
    Five lifeguards are available for duty one Saturday
    afternoon.There are three lifeguard stations.

    In how many ways can three lifeguards be chosen and ordered among the station.
     */
        Factorial2 f2 = new Factorial2(5,3);
        System.out.println(f2);

        Factorial1 f1 = new Factorial1(5);
        System.out.println(f1);

        SumDigit sum = new SumDigit(123);
        System.out.println(sum);

        NautralNum n = new NautralNum(5);
        System.out.println(n);

        Fibonacci f = new Fibonacci(6);
        System.out.println(f);

        TribonacciF t = new TribonacciF(5);
        System.out.println(t);

        PowerOfNumber p = new PowerOfNumber(2,3);
        System.out.println(p);
    }
}
