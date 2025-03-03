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
        fail();
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
        //nemusím dělat
        fail();
    }

    @Test
    void spoctiSoucet() {
        fail();
    }

    @Test
    void spoctiPrumer() {
        fail();
    }
}