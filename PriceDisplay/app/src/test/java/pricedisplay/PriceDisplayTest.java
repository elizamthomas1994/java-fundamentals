package pricedisplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class PriceDisplayTest {
  @Test public void appDisplaysItemAndPrice() {
    PriceDisplay pDisplay = new PriceDisplay();
    assertEquals("app should return item name and price", String.valueOf("The price for item: apple is 1.99"), pDisplay.getPriceLabel("apple", 1.99));
  }
}
