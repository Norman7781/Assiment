public class Tester {
    private int Fucker;
    private boolean Suckmyball;

    public Tester(){
        Fucker = 69;
        Suckmyball=true;
    }

    public int getFucker() {
        return Fucker;
    }

    public void setFucker(int fucker) {
        Fucker = fucker;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "Fucker=" + Fucker +
                ", Suckmyball=" + Suckmyball +
                '}';
    }
}
