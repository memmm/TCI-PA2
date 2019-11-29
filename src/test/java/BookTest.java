import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void nrOfItems_WhenNoneArePresent_IsZero() {
        //arrange
        BasicStatisticInterface bs = new Book();
        //act
        int nrOfItems = bs.numberOfDataItems();
        //assert
        Assert.assertSame(0, nrOfItems);
    }
    @Test
    public void nrOfItems_AfterAdding_IsNotZero() {
        //arrange
        BasicStatisticInterface bs = new Book();
        //act
        bs.addDoubleToData(2.42);
        int nrOfItems = bs.numberOfDataItems();
        //assert
        Assert.assertNotSame(0, nrOfItems);
    }

    @Test
    public void nrOfItems_AfterClearingData_IsZero() {
        //arrange
        BasicStatisticInterface bs = new Book();
        //act
        bs.addDoubleToData(2.42);
        bs.clearData();
        int nrOfItems = bs.numberOfDataItems();
        //assert
        Assert.assertSame(0, nrOfItems);
    }

    @Test
    public void nrOfItems_AfterAddingItems_IsIncreasedWithSameNrOfItems() {
        //arrange
        BasicStatisticInterface bs = new Book();
        //act
        bs.addDoubleToData(2.42);
        bs.addDoubleToData(1.42);
        bs.addDoubleToData(3.62);
        int nrOfItems = bs.numberOfDataItems();
        //assert
        Assert.assertSame(3, nrOfItems);
    }

    @Test
    public void sumOfItems_AfterAddingAndCalculating_IsCorrect() {
        //arrange
        BasicStatisticInterface bs = new Book();
        //act
        bs.addDoubleToData(2.42);
        bs.addDoubleToData(1.00);
        bs.addDoubleToData(3.58);
        Double sumOfItems = bs.sum();
        //assert
        Assert.assertEquals((Double)7.00, sumOfItems);
    }

    @Test
    public void sumOfItems_WithNoItemAdded_IsZero() {
        //arrange
        BasicStatisticInterface bs = new Book();
        //act
        Double sumOfItems = bs.sum();
        //assert
        Assert.assertEquals( (Double) 0.0, sumOfItems);
    }
}