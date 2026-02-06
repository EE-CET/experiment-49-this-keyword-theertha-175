import java.util.Scanner;

public class ThisDemo {
    int value;

    void setValue(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}
public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        ThisDemo obj = new ThisDemo();
        obj.setValue(val);
        obj.display();

        sc.close();
    }
}
