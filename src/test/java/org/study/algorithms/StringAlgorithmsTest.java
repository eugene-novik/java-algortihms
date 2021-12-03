package org.study.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringAlgorithmsTest {

  private StringAlgorithms stringAlgorithms;

  @BeforeEach
  void setUp() {
    stringAlgorithms = new StringAlgorithms();
  }

  @Test
  public void firstNonRepeatedCharacterTest() {
    assertEquals('B', stringAlgorithms.findFirstNonRepeatedCharacter("ABCA"));
    assertNull(stringAlgorithms.findFirstNonRepeatedCharacter("BCABAC"));
    assertEquals('B', stringAlgorithms.findFirstNonRepeatedCharacter("BAC"));
    assertEquals('O', stringAlgorithms.findFirstNonRepeatedCharacter("GlovoOnGlovo"));
    assertEquals('W',
        stringAlgorithms
            .findFirstNonRepeatedCharacter("What is the first non-repeated character?"));

  }
  
  @Test
  public void romanToIntTest() {
    assertEquals(3, stringAlgorithms.romanToInt("III"));
    assertEquals(4, stringAlgorithms.romanToInt("IV"));
    assertEquals(9, stringAlgorithms.romanToInt("IX"));
    assertEquals(58, stringAlgorithms.romanToInt("LVIII"));
    assertEquals(99, stringAlgorithms.romanToInt("XCIX"));
    assertEquals(183, stringAlgorithms.romanToInt("CLXXXIII"));
    assertEquals(1994, stringAlgorithms.romanToInt("MCMXCIV"));
    assertEquals(229, stringAlgorithms.romanToInt("CCXXIX"));
    assertEquals(19, stringAlgorithms.romanToInt("LIX"));
  }

}