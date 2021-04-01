package za.ac.cput.adp3_GitAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MultiplicationTest
{

    private Multiplication set1;
    private Multiplication set2;
    private Multiplication set3;
    
    @Test
    @BeforeEach
    void setUp()
    {
        set1 = new Multiplication();
        set2 = new Multiplication();
        set3 = set1;
    }

    @Test
    void testIdentity()
    {
        assertSame(set1, set3);
    }

    @Test
    void testEquality()
    {
        assertEquals(set1, set3);
    }

    @Test
    @Timeout(10)
    void testTimeout()
    {
        for (int i = 0; i < 100; i++)
            System.out.println(i);
    }

    @Test
    @Disabled
    void testDisable()
    {
        System.out.println("this is disabled");
    }

    @Test
    void main()
    {
        int result = set1.multiplication(2,7);
        assertEquals(14, result);
    }

}
