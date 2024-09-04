package SumDigit;

import Fibonacci.Fibonacci;

public class SumDigit {
    Fibonacci f;
    public SumDigit(int num){
        f = new Fibonacci(num);
    }
    public int Sum(int num){
        if(num< 10){
            return num;
        }else{
            int last = num%10;
            int frontLast = num/10;
            return last + Sum(frontLast);
        }
    }
    public String toString(){
        return("*********Probability Factorial***********"+"\n"+"Total last number of "+f.getNum()+" is :"+Sum(f.getNum()));
    }
}
