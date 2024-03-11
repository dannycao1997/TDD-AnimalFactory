package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest() {

        String expectedName = "Cliford";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);

        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void speakTest() {
        String expectedSpeak = "bark!";
        Dog dog = new Dog(null, null, null);
        String actual = dog.speak();
        Assert.assertEquals(expectedSpeak, actual);
    }

    @Test
    public void setBirthDateTest() {
        Date expectedBirthDate = new Date();
        Dog dog = new Dog(null, expectedBirthDate, null);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actual);
    }

    @Test
    public void eatTest() {
        int expectedEat = 0;
        Dog dog = new Dog(null, null, null);
        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedEat, actual);
    }

    @Test
    public void getIdTest() {
        Integer expectedId = 0;
        Dog dog = new Dog(null, null, expectedId);
        Integer actual = dog.getId();
        Assert.assertEquals(expectedId, actual);
    }

    @Test
    public void animalInheritanceTest() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
