import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {

    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");

        //vytvoření instance(objektu) třády Zlomku
        Zlomek a = new Zlomek(3, 4);

        System.out.printf("Zlomek a = %s\n", a);

    }
}
