package JUNIT;

import com.sun.deploy.util.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Talon on 4/6/2017.
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



    @Test
    public void BrotherTest() {
        String Brother1 = "Tyler Pitchforth";
        String Brother2 = "Talon Pitchforth";
        //test and see if the two are brothers based on last name
        Assert.assertEquals(Brother1.substring(7), Brother2.substring(7));}

        @Test
            public void CheckIfPairable() {
            String Species1 = "Giraffe";
            String Species2 = "Giraffe";
            String gender1 = "female";
            String gender2 = "male";

            Assert.assertEquals(Species1, Species2);
            Assert.assertNotEquals(gender1, gender2);
        }

        @Test
        public void MathCheck(){
        int value1 = 10;
        int value2 = 100;
        // Check math

        Assert.assertEquals(value1*value2, 1000);

        //see if twos things is true or not
        Assert.assertTrue(value1 < value2);

        // See if it is not null / empty
        Assert.assertNotNull(value1);

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
