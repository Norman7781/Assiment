package TheMyPoinAndMyTime;

public class MyPoint {
    private int x =0;
    private int y =0;

    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x= x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y= y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return ("X :"+this.getX()+"\n"+"Y :"+this.getY()+"\n");
    }
    public double distance(int x , int y){
        double forx = Math.pow(x-this.x,2);
        double fory = Math.pow(y-this.y,2);
        double total = Math.sqrt(forx+fory);
        return total;
    }
    public double distance(MyPoint another){
        return distance(another.getX(),another.getY());
    }

}
