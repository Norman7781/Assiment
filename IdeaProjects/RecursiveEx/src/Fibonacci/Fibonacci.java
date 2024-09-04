package Fibonacci;

public class Fibonacci {
    private int num;

    public Fibonacci(){

    }

    public Fibonacci(int num){
        this.num=num;
    }

    public int Fib(int num){
        if(num==0){
            return 0;
        }else if(num==1){
            return 1;
        }else{
            return Fib(num-1) + Fib(num-2);
        }
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return("*********Fibonacci***********"+"\n"+"Fibonacci of "+this.num+" is "+ Fib(this.num));
    }

}
