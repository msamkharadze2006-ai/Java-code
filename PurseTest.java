import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A JUnit test case class for the Purse class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class PurseTest
{    
    
    public static final double EPSILON = 0.01;
    // Coin value constants
    public static final double ONE_EURO_VALUE = 1.0;
    public static final double FIFTY_CENT_VALUE = .50;
    public static final double TEN_CENT_VALUE = .10;
    public static final double ONE_CENT_VALUE = .01;
    
    
        
    
    // Instance variables for number of each coin denomination
    private int numOneEuro;
    private int numFiftyCent;
    private int numTenCent;
    private int numOneCent;

    
    double getTotal(){ return numOneEuro * ONE_EURO_VALUE +
    numFiftyCent * FIFTY_CENT_VALUE + numTenCent * TEN_CENT_VALUE+
    numOneCent*ONE_CENT_VALUE;
}
    void addOneCentCoins(int number) {
        numOneCent = numOneCent + number;
}

void addTenCentCoins(int number) {
    numTenCent = numTenCent + number;
}
void addFiftyCentCoins(int number) {
    numFiftyCent = numFiftyCent + number;
}
void addOneEuroCoins(int number) {
    numOneEuro = numOneEuro + number;
}
    /**
     * Test the AddOneCentCoins method.
     */
    @Test
    public void testAddOneCentCoins()
    {
        numOneEuro = numFiftyCent = numTenCent = numOneCent = 0;
        PurseTest myPurse = new PurseTest();
        assertEquals(0, myPurse.getTotal(), EPSILON); 
        

        myPurse.addOneCentCoins(1);
        assertEquals(0.01, myPurse.getTotal(), EPSILON); 
        
        myPurse.addOneCentCoins(100);
        assertEquals(1.01, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddTenCentCoins method.
     */
    @Test
    public void testAddTenCentCoins()
    {
        PurseTest myPurse = new PurseTest();
        
        myPurse.addTenCentCoins(1);
        assertEquals(0.10, myPurse.getTotal(), EPSILON); 
        
        myPurse.addTenCentCoins(100);
        assertEquals(10.10, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddFiftyCentCoins method.
     */
    @Test
    public void testAddFiftyCentCoins()
    {
        PurseTest myPurse = new PurseTest();
        
        myPurse.addFiftyCentCoins(1);
        assertEquals(0.50, myPurse.getTotal(), EPSILON); 
        
        myPurse.addFiftyCentCoins(100);
        assertEquals(50.50, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddOneEuroCoins method.
     */
    @Test
    public void testAddOneEuroCoins()
    {
        PurseTest myPurse = new PurseTest();
        
        myPurse.addOneEuroCoins(1);
        assertEquals(1.00, myPurse.getTotal(), EPSILON); 
        
        myPurse.addOneEuroCoins(100);
        assertEquals(101.00, myPurse.getTotal(), EPSILON); 
    }
}
