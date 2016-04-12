import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDeck {
  private String[] ranks = {"ugh", "idk"};
  private String[] suits = {"something", "heyo"};
  private int[] values = {1,2};

  private Deck myDeck = new Deck(ranks, suits, values);

  @Test
  public void testIfDeckHoldsExpected() {
    Card lastCard = new Card("idk", "heyo", 2);

    assertEquals(8, myDeck.size());
    assertEquals(false, myDeck.isEmpty());
    assertEquals(true, lastCard.matches(myDeck.deal()));
//    assertEquals(myDeck.deal(), lastCard); memory pointers :(
  }
}
