package MyTIme;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23,59,59);
        System.out.println(time);
        System.out.println(time.nextHour());
        System.out.println(time.nextSecond());
    }
}
