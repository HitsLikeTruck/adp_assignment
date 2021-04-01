package za.ac.cput.adp3_GitAssignment;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

class DivisionTest {

    private Division d1;
    private Division d2;

    @Test
    @BeforeEach
    void setUp() {
        this.d1 = new Division(10, 1);
        this.d2 = new Division(10,2);
    }

    //Timeouts
    @Test
    @Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
    @AfterEach
    void tearDown() {

    }

    @Test
    void testIdentity() {

    }


    @Test
    void getDividend() {
    }

    @Test
    void setDividend() {
    }

    @Test
    void getDivisor() {
    }

    @Test
    void setDivisor() {
    }
}