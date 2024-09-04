package Tribonacci;

import Fibonacci.Fibonacci;

public class TribonacciF {
    Fibonacci f ;
    public TribonacciF(int n){
        f = new Fibonacci(n);
    }
    public int Tri(int num){
        if(num==0){
            return 0;
        }else if (num==1 || num==2){
            return 1;
        }else{
            return Tri(num-1)+Tri(num-2)+Tri(num-3);
        }
    }
    public int getF(){
        return f.getNum();
    }
    public void setF(int num){
        f.setNum(num);
    }
    @Override
    public String toString(){
        return("*********Tribonacci***********"+"\n"+"Tribonanci of "+ f.getNum()+" is "+Tri(f.getNum()));
    }
}
