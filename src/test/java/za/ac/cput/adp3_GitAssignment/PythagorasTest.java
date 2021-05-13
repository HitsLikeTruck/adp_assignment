package za.ac.cput.adp3_GitAssignment;

import org.junit.Rule;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import javax.management.RuntimeErrorException;

import static org.junit.jupiter.api.Assertions.*;

class PythagorasTest {

    private Pythagoras theorem1;
    private Pythagoras theorem2;
    private Pythagoras theorem3;
    private Pythagoras theorem4;

    @Test
    public void setUp(){
        theorem1 = new Pythagoras();
        theorem2 = new Pythagoras();
        theorem3=theorem4;

    }

    @Test
    public void Equality(){
      assertEquals(theorem3,theorem4);
    }

    @Test
    public void Identity(){
        assertSame(theorem1,theorem2);
    }

    @Test
    public void failMethod(){
        try{
            fail();
        }
        catch (RuntimeErrorException e){
            assertTrue(true);
            System.out.println("Or else pass");
        }
    }


    @Test
    public void testInfiniteTametakingLoop2() throws InterruptedException
    {
        while (true)
        {
            Thread.currentThread().sleep(5000);
        }
    }
/*
    @Test(timeout = 100)
    public void testTimeout() {
        int maximumNumber = 2000;
        int prevNum = 0;
        int nextNum = 1;

        for (int i = 1; i <= maximumNumber; ++i) {
            System.out.println(prevNum + "");
            int sum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = sum;
        }
    }
    */


    @Disabled
    @Test
    public void disableMethod() {

        System.out.println("");
    }

}