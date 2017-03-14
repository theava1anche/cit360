package JUNIT;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Alexander Bloomfield on 3/10/2017.
 */
public class TestFile {
    String name;
    JUNIT.TestHelper testObj;
    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {

    }
    @Before
    public void setUp(){
        testObj = new JUNIT.TestHelper();
        testObj.setNumList(1,2,3);
    }

    @Test
    public void junitTests1(){
        String dog = "Pug";
        String dog2 = "Pug";
        String male = "male";
        String female = "female";
        String cat = "Siamese";
        String nothing = null;
        int value1 = 10;
        int value2 = 100;
        // German 1, 2, 3
        String[] array1 = {"eins", "zwei", "drei"};
        String[] array2 = {"eins", "zwei", "drei"};

        //test and see if dogs are equal to each other
        Assert.assertEquals(dog, dog2);
        Assert.assertEquals(value1, 10);

        //see if twos things is true or not
        Assert.assertTrue(value1 < value2);

        //See if a condition is false
        Assert.assertFalse(male == female);

        // See if it is not null / empty
        Assert.assertNotNull(female);

        // See if that array1 and array2 are the same
        Assert.assertArrayEquals(array1,array2);
    }

    @Test
    public void junitTests2(){
        JUNIT.TestHelper obj = new JUNIT.TestHelper();
        Assert.assertEquals(obj.math(5),5);
        Assert.assertNotEquals(obj.math(5),10);
    }

    @Test
    public void junitTests3(){
        JUNIT.TestHelper obj = new JUNIT.TestHelper();
        Assert.assertNotNull(obj.math2(0));
    }
}
