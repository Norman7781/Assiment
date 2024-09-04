package Power;

import Fibonacci.Fibonacci;

public class PowerOfNumber {
    private int base;
    private int exponent;
    public PowerOfNumber(int base, int exponent){
        this.base = base;
        this.exponent = exponent;
    }
    public double power(int base, int exp){
        if(exp==0){
            return 1;
        }else if( exp ==1){
            return base;
        }else if (exp >0){
            return base*power(base,exp-1);
        }else{
            return 1/power(base,-exp);
        }
    }
    public String toString(){
        return("*********Probability Factorial***********"+"\n"+"The power of this base of "+this.base+" exponent of"+this.exponent+" is :"+power(base,exponent));
    }
}
