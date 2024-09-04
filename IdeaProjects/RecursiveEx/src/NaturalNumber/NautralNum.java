package NaturalNumber;

import Fibonacci.Fibonacci;

public class NautralNum {
    Fibonacci f;
    public NautralNum(int num){
        f = new Fibonacci(num);
    }
    public int sumNatural(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * (num + 1) / 2;
        }
    }
    @Override
    public String toString(){
        return("*********Sum natural number***********"+"\n"+"Total sum of "+f.getNum()+" natural number is "+ sumNatural(f.getNum()));
    }

}
