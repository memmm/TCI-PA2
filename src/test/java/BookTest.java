import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.*;

public class BookTest {

    @Test
    public void chapterName_IsNotNull() {
        //arrange
        Chapter c = new Chapter("The Polyjuice Potion", "11.3");
        //act
        String cName = c.getName();
        //assert
        Assert.assertNotNull(cName);

    }

    @Test
    public void book_IfNullOrEmpty_IllegalArgumentExceptionIsThrown() {
        //arrange
        Book b = new Book("Hart's Hope", "Orson Scott Card");
        //act
        String name = b.getName();
        //assert
        Assert.assertNotNull(b);
        Assert.assertNotNull(name);
    }

    @Test
    public void chapterNumber_IsAStringWithMaxTwoLevels() {
        //arrange
        Chapter c = new Chapter("The Polyjuice Potion", "11.3");
        //act
        String number = c.getNumber();
        //assert
        assertThat(number, isA(String.class));
        assertThat(number, matchesPattern("^[^.]*.[^.]*$"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void chapterNameAndNumber_IfWrongParams_IllegalArgumentExceptionIsThrown() {
        //arrange
        Chapter c = new Chapter("The Polyjuice Potion", "13");
        //act
        //assert
    }

    @Test
    public void chapter_OverridesEquals() {

    }
    @Test
    public void chapter_OverridesHashCode() {

    }
    @Test
    public void chapter_IsComparable() {

    }

    @Test
    public void chapter_WhenAddedToBook_IsCreatedWithNameAndNumberParams() {

    }
    @Test
    public void chapter_WhenAddedToBook_IsUnique() {

    }

    @Test
    public void chapter_IfNotUnique_IllegalArgumentExceptionIsThrown() {

    }
    @Test
    public void tableOfContents_WhenGetting_IsReturnedAsSetInNaturalOrder() {

    }

}