package MyTIme;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "MyTime:" +"\n" + hour +":"+ minute +":"+second;
    }
    public MyTime nextSecond() {
        int newSecond = this.second + 1;
        int newMinute = this.minute;
        int newHour = this.hour;
        if (newSecond >= 60) {
            newSecond = 0;
            newMinute++;
        }
        if (newMinute >= 60) {
            newMinute = 0;
            newHour++;
        }
        if (newHour >= 24) {
            newHour = 0;
        }
        return new MyTime(newHour, newMinute, newSecond);
    }

    public MyTime nextMinute() {
        int newMinute = this.minute + 1;
        int newHour = this.hour;
        if (newMinute >= 60) {
            newMinute = 0;
            newHour++;
        }
        if (newHour >= 24) {
            newHour = 0;
        }
        return new MyTime(newHour, newMinute, this.second);
    }

    public MyTime nextHour() {
        int newHour = this.hour + 1;
        if (newHour >= 24) {
            newHour = 0;
        }
        return new MyTime(newHour, this.minute, this.second);
    }

    public MyTime previousSecond() {
        int newSecond = this.second - 1;
        int newMinute = this.minute;
        int newHour = this.hour;
        if (newSecond < 0) {
            newSecond = 59;
            newMinute--;
        }
        if (newMinute < 0) {
            newMinute = 59;
            newHour--;
        }
        if (newHour < 0) {
            newHour = 23;
        }

        return new MyTime(newHour, newMinute, newSecond);
    }

    public MyTime previousMinute() {
        int newMinute = this.minute - 1;
        int newHour = this.hour;
        if (newMinute < 0) {
            newMinute = 59;
            newHour--;
        }
        if (newHour < 0) {
            newHour = 23;
        }
        return new MyTime(newHour, newMinute, this.second);
    }

    public MyTime previousHour() {
        int newHour = this.hour - 1;
        if (newHour < 0) {
            newHour = 23;
        }
        return new MyTime(newHour, this.minute, this.second);
    }
}
