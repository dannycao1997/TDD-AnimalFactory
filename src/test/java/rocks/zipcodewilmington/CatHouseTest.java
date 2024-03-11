package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        String name = "Test";
        Date birthDate = new Date();
        Integer id = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(name, birthDate, id);

        CatHouse.clear();
        CatHouse.add(cat);
        Cat expectedAddCat = CatHouse.getCatById(id);


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expectedAddCat, cat);
    }


    @Test
    public void removeCatByIdTest() {
        String name = "Test";
        Date birthDate = new Date();
        Integer id = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(name, birthDate, id);

        CatHouse.clear();
        CatHouse.remove(id);


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertNull(CatHouse.getCatById(id));

    }

    @Test
    public void removeCatTest() {
        String name = "Test";
        Date birthDate = new Date();
        Integer id = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(name, birthDate, id);
        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(cat);
    }

    @Test
    public void getCatByIdTest(){
        Integer id;
    }

    @Test
    public void getNumbersOfCatsTest(){
    }
}




