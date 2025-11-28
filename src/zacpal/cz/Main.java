package zacpal.cz;

public class Main {
    public static void main(String[] args) {
    String s = Vypocty.lanNetwork("192.168.1.11","255.192.0.0");
    System.out.println(s);
    Vypocty v1 = new Vypocty();
    for (int i=1;i<32;i++) System.out.println(i+ ": " + v1.maska(i));
    }
}