package com.juaracoding;
import org.testng.Assert;
import org.testng.annotations.Test;
public class BilanganTest {
    //testBilanganGenap

    @Test
    public void testBilanganGenap(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGanjilGenap(5), "genap");
    }

    @Test
    public void testBilanganGanjil(){
        Bilangan bilangan = new Bilangan();
        Assert.assertEquals(bilangan.cekGanjilGenap(3), "ganjil");
    }

}
