import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCard {
  protected Card twoHearts = new Card("two", "hearts", 2);
  protected Card anotherTwoHearts = new Card("two", "hearts", 2);
  protected Card differentCard = new Card("king", "spades", 100);

  @Test
  public void testAdd() {
    String str= "Junit is working fine";
    assertEquals("Junit is working fine",str);
  }

  @Test
  public void testIfCardsHoldExpected() {
    assertEquals(twoHearts.suit(), "hearts");
    assertEquals(twoHearts.pointValue(), 2);
    assertEquals(twoHearts.rank(), "two");
    assertEquals(twoHearts.toString(), "two of hearts (point value = 2)");
  }

  @Test
  public void testCompare() {
    assertEquals(twoHearts.matches(anotherTwoHearts), true);
    assertEquals(twoHearts.matches(differentCard), false);
  }
}