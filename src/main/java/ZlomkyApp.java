import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {

    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        //vytvoření instance(objektu) třády Zlomku
        Zlomek a = new Zlomek(3, 4);

        System.out.printf("Zlomek a = %s\n", a);

        Zlomek b = new Zlomek(2, 5);

        Zlomek c = a.krat(b);
        System.out.printf("Zlomek a * b = %s\n", c.zkratit());

        Zlomek d = a.deleno(b);
        System.out.printf("Zlomek a / b = %s\n", d.zkratit());

        Zlomek e = a.plus(b);
        System.out.printf("Zlomek a + b = %s\n", e.zkratit());

        Zlomek f = a.minus(b);
        System.out.printf("Zlomek a - b = %s\n", f.zkratit());
    }
}
