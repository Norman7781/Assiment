package TheMyPoinAndMyTime;

public class MyCircle extends MyPoint{
    private MyPoint center;
    double radius = 1.0;

    public MyCircle(){
        this.center =  new MyPoint();
        this.radius = 1.0;
    }
    public MyCircle(int xCenter , int yCenter, double radius){
        this.center.setX(xCenter);
        this.center.setY(yCenter);
        this.radius = radius;
    }
    public MyCircle(MyPoint center , double radius){
        this.center = center;
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setcentreXY(int x, int y){
        this.center.setX(x);
        this.center.setX(y);
    }
    public String toString(){
        return("Centre :"+this.getCenter()+"\n"+"radius :"+this.radius);
    }
    public double getArea(){
        double area = Math.PI* Math.pow(this.radius,2);
        return area;
    }
    public double distance(MyCircle another){
        double a = distance(another.center);
        return a;
    }

}
