package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Cat name
        String expectedName = "Garfield";
        Cat cat = new Cat(expectedName, null, null);
        cat.setName(expectedName);
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        String expectedSpeak = "meow!";
        Cat cat = new Cat(null, null, null);
        String actual = cat.speak();
        Assert.assertEquals(expectedSpeak, actual);
    }

    @Test
    public void setBirthDateTest() {
        Date expectedBirthDate = new Date();
        Cat cat = new Cat(null, expectedBirthDate, null);
        cat.setBirthDate(expectedBirthDate);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expectedBirthDate,actual);
    }
    @Test
    public void eatTest() {
        int expectedEat = 1;
        Food food = new Food();
        Cat cat = new Cat(null, null, null);
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedEat, actual);
    }
    @Test
    public void getIdTest(){
        Integer expectedId = 100;
        Cat cat = new Cat(null, null, expectedId);
        Integer actual = cat.getId();
        Assert.assertEquals(expectedId, actual);
    }

    @Test
    public void animalInheritanceTest() {
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }

}
