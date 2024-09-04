package Factorial;

public class Factorial1 {
    private int num;
    public Factorial1(){

    }
    public Factorial1(int num){
        this.num = num;
    }
    public  int Fac(int num){
        if(num<=1){
            return 1;
        }else{
            return num*Fac(num-1);
        }
    }
    public int getInt(){
        return this.num;
    }
    public String toString(){
        return("*******Factorial**********"+"\n"+"the factorial of "+getInt()+" is "+Fac(this.num));
    }
}
