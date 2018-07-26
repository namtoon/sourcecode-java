
public class WorkShop01 {

    public static void main(String[] args) {
        int a, b, c = 0;
        a = c++;
        System.out.println(a);

        b = ++a;
        System.out.println(b);

        c++;
        System.out.println(c);

        b = ++c + a++;
        a = --b + c++;
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);

    }

}
