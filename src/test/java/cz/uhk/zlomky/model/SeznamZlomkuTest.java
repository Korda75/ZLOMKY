package cz.uhk.zlomky.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeznamZlomkuTest {
    SeznamZlomku seznam;

    @BeforeEach
    void setUp() {
        seznam = new SeznamZlomku();
    }

    @Test
    @DisplayName("Test Pridani")
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        assertEquals(1, seznam.pocetZlomku(), "Pocet Zlomku");
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }
    @Test
    @DisplayName("Test Null")
    void pridatZlomekNull() {
        assertThrows(NullPointerException.class, () -> seznam.pridatZlomek(null));
        assertEquals(0, seznam.pocetZlomku(), "Pocet zlomku");
    }
    @Test
    void odebratZlomek() {
        seznam.pridatZlomek(new Zlomek(5,6));
        seznam.pridatZlomek(new Zlomek(4,7));
        seznam.odebratZlomek(1);
        Zlomek y = seznam.vratZlomek(0);
        assertEquals(5, y.getCitatel(),"Citatel");
        assertEquals(6, y.getJmenovatel(), "Jmenovatel");

    }

    @Test
    void vratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void vratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.vratZlomek(0));
    }

    @Test
    void vypisZlomky() {
        //nemusíme dělat
        fail();
    }

    @Test
    void spoctiSoucet() {
        seznam.pridatZlomek(new Zlomek (2,7));
        seznam.pridatZlomek(new Zlomek(5,2));
        Zlomek y = seznam.spoctiSoucet();
        assertEquals(39, y.getCitatel(), "Citatel");
        assertEquals(14, y.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void spoctiPrumer() {
        seznam.pridatZlomek(new Zlomek (2,7));
        seznam.pridatZlomek(new Zlomek(5,2));
        Zlomek y = seznam.spoctiPrumer();
        assertEquals(39, y.getCitatel(), "Citatel");
        assertEquals(28, y.getJmenovatel(), "Jmenovatel");
    }
}