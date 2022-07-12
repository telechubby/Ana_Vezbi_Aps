import java.util.Locale;
class Test{
    int a;
    char b;

    public Test(int a, char b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public char getB() {
        return b;
    }

    public void setB(char b) {
        this.b = b;
    }


}
public class Variables {
    public static void main(String[] args) {
        int a=10;
        Integer a1=10;
        String s1="abc";
        String s2="abc";
        System.out.println(s1.toUpperCase(Locale.ROOT));
    }
}
