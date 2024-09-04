package Factorial;

public class Factorial2 {
    private int n ;
    private int k ;
    private Factorial1 f;
    public Factorial2(int num,int k){
        f = new Factorial1();
        this.n = num;
        this.k = k;
    }

    public  double permutation(int num, int k){
        return (double) num / k;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String toString(){
        return("*********Probability Factorial***********"+"\n"+"Permutation of this answer is "+permutation(f.Fac(n),f.Fac(n-k)));
    }
}
