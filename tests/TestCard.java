import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCard {
  private Card twoHearts = new Card("two", "hearts", 2);
  private Card anotherTwoHearts = new Card("two", "hearts", 2);
  private Card differentCard = new Card("king", "spades", 100);

  @Test
  public void testIfCardsHoldsExpected() {
    assertEquals("hearts", twoHearts.suit());
    assertEquals(2, twoHearts.pointValue());
    assertEquals("two", twoHearts.rank());
    assertEquals("two of hearts (point value = 2)", twoHearts.toString());
  }

  @Test
  public void testCompare() {
    assertEquals(true, twoHearts.matches(anotherTwoHearts));
    assertEquals(false, twoHearts.matches(differentCard));
  }
}
