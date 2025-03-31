package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.asdfjkl.jfxchess.lib.Game;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PgnDatabaseEntryDiffblueTest {
  /**
   * Test {@link PgnDatabaseEntry#wasModified()}.
   * <p>
   * Method under test: {@link PgnDatabaseEntry#wasModified()}
   */
  @Test
  @DisplayName("Test wasModified()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean PgnDatabaseEntry.wasModified()"})
  void testWasModified() {
    // Arrange, Act and Assert
    assertFalse((new PgnDatabaseEntry()).wasModified());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link PgnDatabaseEntry}
   *   <li>{@link PgnDatabaseEntry#setBlack(String)}
   *   <li>{@link PgnDatabaseEntry#setDate(String)}
   *   <li>{@link PgnDatabaseEntry#setEco(String)}
   *   <li>{@link PgnDatabaseEntry#setEvent(String)}
   *   <li>{@link PgnDatabaseEntry#setIndex(long)}
   *   <li>{@link PgnDatabaseEntry#setModifiedGame(Game)}
   *   <li>{@link PgnDatabaseEntry#setOffset(long)}
   *   <li>{@link PgnDatabaseEntry#setResult(String)}
   *   <li>{@link PgnDatabaseEntry#setRound(String)}
   *   <li>{@link PgnDatabaseEntry#setSite(String)}
   *   <li>{@link PgnDatabaseEntry#setWhite(String)}
   *   <li>{@link PgnDatabaseEntry#markAsModified()}
   *   <li>{@link PgnDatabaseEntry#markValid()}
   *   <li>{@link PgnDatabaseEntry#getBlack()}
   *   <li>{@link PgnDatabaseEntry#getDate()}
   *   <li>{@link PgnDatabaseEntry#getEco()}
   *   <li>{@link PgnDatabaseEntry#getEvent()}
   *   <li>{@link PgnDatabaseEntry#getIndex()}
   *   <li>{@link PgnDatabaseEntry#getModifiedGame()}
   *   <li>{@link PgnDatabaseEntry#getOffset()}
   *   <li>{@link PgnDatabaseEntry#getResult()}
   *   <li>{@link PgnDatabaseEntry#getRound()}
   *   <li>{@link PgnDatabaseEntry#getSite()}
   *   <li>{@link PgnDatabaseEntry#getWhite()}
   *   <li>{@link PgnDatabaseEntry#isValid()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PgnDatabaseEntry.<init>()", "String PgnDatabaseEntry.getBlack()",
      "String PgnDatabaseEntry.getDate()", "String PgnDatabaseEntry.getEco()", "String PgnDatabaseEntry.getEvent()",
      "long PgnDatabaseEntry.getIndex()", "Game PgnDatabaseEntry.getModifiedGame()",
      "long PgnDatabaseEntry.getOffset()", "String PgnDatabaseEntry.getResult()", "String PgnDatabaseEntry.getRound()",
      "String PgnDatabaseEntry.getSite()", "String PgnDatabaseEntry.getWhite()", "boolean PgnDatabaseEntry.isValid()",
      "void PgnDatabaseEntry.markAsModified()", "void PgnDatabaseEntry.markValid()",
      "void PgnDatabaseEntry.setBlack(String)", "void PgnDatabaseEntry.setDate(String)",
      "void PgnDatabaseEntry.setEco(String)", "void PgnDatabaseEntry.setEvent(String)",
      "void PgnDatabaseEntry.setIndex(long)", "void PgnDatabaseEntry.setModifiedGame(Game)",
      "void PgnDatabaseEntry.setOffset(long)", "void PgnDatabaseEntry.setResult(String)",
      "void PgnDatabaseEntry.setRound(String)", "void PgnDatabaseEntry.setSite(String)",
      "void PgnDatabaseEntry.setWhite(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    PgnDatabaseEntry actualPgnDatabaseEntry = new PgnDatabaseEntry();
    actualPgnDatabaseEntry.setBlack("Black");
    actualPgnDatabaseEntry.setDate("2020-03-01");
    actualPgnDatabaseEntry.setEco("Eco");
    actualPgnDatabaseEntry.setEvent("Event");
    actualPgnDatabaseEntry.setIndex(1L);
    Game game = new Game();
    actualPgnDatabaseEntry.setModifiedGame(game);
    actualPgnDatabaseEntry.setOffset(1L);
    actualPgnDatabaseEntry.setResult("Result");
    actualPgnDatabaseEntry.setRound("Round");
    actualPgnDatabaseEntry.setSite("Site");
    actualPgnDatabaseEntry.setWhite("White");
    actualPgnDatabaseEntry.markAsModified();
    actualPgnDatabaseEntry.markValid();
    String actualBlack = actualPgnDatabaseEntry.getBlack();
    String actualDate = actualPgnDatabaseEntry.getDate();
    String actualEco = actualPgnDatabaseEntry.getEco();
    String actualEvent = actualPgnDatabaseEntry.getEvent();
    long actualIndex = actualPgnDatabaseEntry.getIndex();
    Game actualModifiedGame = actualPgnDatabaseEntry.getModifiedGame();
    long actualOffset = actualPgnDatabaseEntry.getOffset();
    String actualResult = actualPgnDatabaseEntry.getResult();
    String actualRound = actualPgnDatabaseEntry.getRound();
    String actualSite = actualPgnDatabaseEntry.getSite();
    String actualWhite = actualPgnDatabaseEntry.getWhite();

    // Assert
    assertEquals("2020-03-01", actualDate);
    assertEquals("Black", actualBlack);
    assertEquals("Eco", actualEco);
    assertEquals("Event", actualEvent);
    assertEquals("Result", actualResult);
    assertEquals("Round", actualRound);
    assertEquals("Site", actualSite);
    assertEquals("White", actualWhite);
    assertEquals(1L, actualIndex);
    assertEquals(1L, actualOffset);
    assertTrue(actualPgnDatabaseEntry.isValid());
    assertSame(game, actualModifiedGame);
  }
}
