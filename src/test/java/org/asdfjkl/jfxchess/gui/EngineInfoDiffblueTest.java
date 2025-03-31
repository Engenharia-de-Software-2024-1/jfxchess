package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EngineInfoDiffblueTest {
  /**
   * Test new {@link EngineInfo} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link EngineInfo}
   */
  @Test
  @DisplayName("Test new EngineInfo (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineInfo.<init>()"})
  void testNewEngineInfo() {
    // Arrange and Act
    EngineInfo actualEngineInfo = new EngineInfo();

    // Assert
    assertEquals("", actualEngineInfo.bestmove);
    assertEquals("", actualEngineInfo.currentMove);
    assertEquals("", actualEngineInfo.fen);
    assertEquals("", actualEngineInfo.id);
    assertEquals(-1, actualEngineInfo.depth);
    assertEquals(-1, actualEngineInfo.hashFull);
    assertEquals(-1, actualEngineInfo.selDepth);
    assertEquals(-1, actualEngineInfo.strength);
    assertEquals(-1, actualEngineInfo.tbHits);
    assertEquals(0, actualEngineInfo.halfmoves);
    assertEquals(0, actualEngineInfo.nps);
    assertEquals(0L, actualEngineInfo.zobrist);
    assertEquals(1, actualEngineInfo.fullMoveNumber);
    assertEquals(1, actualEngineInfo.nrPvLines);
    assertFalse(actualEngineInfo.flipEval);
    assertFalse(actualEngineInfo.limitedStrength);
    assertFalse(actualEngineInfo.turn);
    assertTrue(actualEngineInfo.pvList.isEmpty());
    assertEquals(actualEngineInfo.mate, actualEngineInfo.score);
    assertEquals(actualEngineInfo.pvSan, actualEngineInfo.pvUci);
    assertEquals(GameModel.MAX_PV, actualEngineInfo.mate.size());
    assertEquals(GameModel.MAX_PV, actualEngineInfo.pvSan.size());
    assertEquals(GameModel.MAX_PV, actualEngineInfo.seesMate.size());
  }

  /**
   * Test {@link EngineInfo#update(String)}.
   * <ul>
   *   <li>When {@code currmove l9l9}.</li>
   *   <li>Then {@link EngineInfo} (default constructor) {@link EngineInfo#currentMove} is {@code l9l9}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineInfo#update(String)}
   */
  @Test
  @DisplayName("Test update(String); when 'currmove l9l9'; then EngineInfo (default constructor) currentMove is 'l9l9'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineInfo.update(String)"})
  void testUpdate_whenCurrmoveL9l9_thenEngineInfoCurrentMoveIsL9l9() {
    // Arrange
    EngineInfo engineInfo = new EngineInfo();

    // Act
    engineInfo.update("currmove l9l9");

    // Assert
    assertEquals("", engineInfo.id);
    assertEquals("l9l9", engineInfo.currentMove);
  }

  /**
   * Test {@link EngineInfo#update(String)}.
   * <ul>
   *   <li>When {@code Engine Feedback}.</li>
   *   <li>Then {@link EngineInfo} (default constructor) {@link EngineInfo#currentMove} is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineInfo#update(String)}
   */
  @Test
  @DisplayName("Test update(String); when 'Engine Feedback'; then EngineInfo (default constructor) currentMove is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineInfo.update(String)"})
  void testUpdate_whenEngineFeedback_thenEngineInfoCurrentMoveIsEmptyString() {
    // Arrange
    EngineInfo engineInfo = new EngineInfo();

    // Act
    engineInfo.update("Engine Feedback");

    // Assert that nothing has changed
    assertEquals("", engineInfo.currentMove);
    assertEquals("", engineInfo.id);
  }

  /**
   * Test {@link EngineInfo#update(String)}.
   * <ul>
   *   <li>When {@code id name U}.</li>
   *   <li>Then {@link EngineInfo} (default constructor) {@link EngineInfo#id} is {@code U}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineInfo#update(String)}
   */
  @Test
  @DisplayName("Test update(String); when 'id name U'; then EngineInfo (default constructor) id is 'U'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineInfo.update(String)"})
  void testUpdate_whenIdNameU_thenEngineInfoIdIsU() {
    // Arrange
    EngineInfo engineInfo = new EngineInfo();

    // Act
    engineInfo.update("id name U");

    // Assert
    assertEquals("", engineInfo.currentMove);
    assertEquals("U", engineInfo.id);
  }

  /**
   * Test {@link EngineInfo#update(String)}.
   * <ul>
   *   <li>When {@code multipv 999}.</li>
   *   <li>Then {@link EngineInfo} (default constructor) {@link EngineInfo#currentMove} is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineInfo#update(String)}
   */
  @Test
  @DisplayName("Test update(String); when 'multipv 999'; then EngineInfo (default constructor) currentMove is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineInfo.update(String)"})
  void testUpdate_whenMultipv999_thenEngineInfoCurrentMoveIsEmptyString() {
    // Arrange
    EngineInfo engineInfo = new EngineInfo();

    // Act
    engineInfo.update("multipv 999");

    // Assert that nothing has changed
    assertEquals("", engineInfo.currentMove);
    assertEquals("", engineInfo.id);
  }

  /**
   * Test {@link EngineInfo#toString()}.
   * <p>
   * Method under test: {@link EngineInfo#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineInfo.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("||0|||||(0.00) ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||",
        (new EngineInfo()).toString());
  }
}
