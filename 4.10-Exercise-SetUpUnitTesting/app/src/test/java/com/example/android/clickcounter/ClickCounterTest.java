package com.example.android.clickcounter;

import org.junit.Assert;
import org.junit.Test;

public class ClickCounterTest {
  @Test
  public void testIncrementCount() {
    ClickCounter counter = new ClickCounter();
    Assert.assertEquals(counter.getCount(), 0);
    counter.increment();
    Assert.assertEquals(counter.getCount(), 1);
  }
}
