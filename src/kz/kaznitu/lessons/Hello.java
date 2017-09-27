package kz.kaznitu.lessons;
/**
 * Created by User on 26.09.2017.
 */
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Бұл зертханалық жұмыстың мақсаты!");
        System.out.println("Github - пен жумыс жасап уйрену");

        int a = MyMath.kvadrat(5);
        int b = MyMath.kub(5);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(MyMath.max(8,9));
    }
}
