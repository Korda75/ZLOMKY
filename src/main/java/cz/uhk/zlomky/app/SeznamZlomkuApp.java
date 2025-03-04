package cz.uhk.zlomky.app;

import cz.uhk.zlomky.model.SeznamZlomku;
import cz.uhk.zlomky.model.Zlomek;

import java.nio.file.FileSystemNotFoundException;

public class SeznamZlomkuApp {

    public static void main(String[] args) {
        SeznamZlomku seznam = new SeznamZlomku();

        seznam.pridatZlomek(new Zlomek(1,2));
        seznam.pridatZlomek(new Zlomek(2,3));
        seznam.pridatZlomek(new Zlomek(4,5));
        seznam.pridatZlomek(new Zlomek(7,8));

        seznam.vybratZlomek(System.out);



        System.out.println("Soucet Zlomku je " +seznam.spoctiSoucet());

        System.out.println("Soucet Zlomku realne je " +seznam.spoctiSoucet().doubleValue());

        Zlomek prumer = seznam.spoctiPrumer();
        System.out.println("Prumer zlomku je " +prumer);

        System.out.println("Prumer Zlomku realne je " +prumer.doubleValue());
    }




    }
