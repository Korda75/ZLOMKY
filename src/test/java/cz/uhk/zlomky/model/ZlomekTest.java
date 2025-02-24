package cz.uhk.zlomky.model;

import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {


    @org.junit.jupiter.api.Test
    void krat() {
        Zlomek a = new Zlomek(3, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b);
        assertEquals(12, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(),"Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void kratNulovy() {

        Zlomek a = new Zlomek(0, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b);
        assertEquals(0, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(),"Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void deleno() {

    }

    @org.junit.jupiter.api.Test
    void plus() {
    }

    @org.junit.jupiter.api.Test
    void minus() {
    }

    @org.junit.jupiter.api.Test
    void zkratit() {
    }
}