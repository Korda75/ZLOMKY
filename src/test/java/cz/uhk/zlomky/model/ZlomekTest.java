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
        Zlomek a = new Zlomek(8, 2);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.deleno(b);
        assertEquals(32, c.getCitatel(),"Chybny citatel");
        assertEquals(6, c.getJmenovatel(),"chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void delenoNulovy() {
        Zlomek a = new Zlomek(0, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.deleno(b);
        assertEquals(0, c.getCitatel(),"Chybny citatel");
        assertEquals(15, c.getJmenovatel(),"chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void plus() {
        Zlomek a = new Zlomek(5, 2);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.plus(b);
        assertEquals(26, c.getCitatel(), "Chybny citatel");
        assertEquals(8, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void plusZapor() {
        Zlomek a = new Zlomek(-5, 2);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.plus(b);
        assertEquals(-14, c.getCitatel(), "Chybny citatel");
        assertEquals(8, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void plusNula() {
        Zlomek a = new Zlomek(0, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.plus(b);
        assertEquals(15, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Zlomek a = new Zlomek(5, 3);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.minus(b);
        assertEquals(11, c.getCitatel(),"Chybny citatel");
        assertEquals(12, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void minusNula() {
        Zlomek a = new Zlomek(0, 5);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.plus(b);
        assertEquals(15, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void minusZapor() {
        Zlomek a = new Zlomek(-5, 3);
        Zlomek b = new Zlomek(3, 4);
        Zlomek c = a.plus(b);
        assertEquals(-11, c.getCitatel(), "Chybny citatel");
        assertEquals(12, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void zkratit() {
        Zlomek a = new Zlomek(6, 3);
        Zlomek b = a.zkratit();
        assertEquals(2, b.getCitatel(), "Chybny citatel");
        assertEquals(1, b.getJmenovatel(), "Chybny jmenovatel");
    }

}