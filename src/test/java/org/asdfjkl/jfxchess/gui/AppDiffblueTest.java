package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import javafx.scene.input.KeyCodeCombination;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppDiffblueTest {
  /**
   * Test new {@link App} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link App}
   */
  @Test
  @DisplayName("Test new App (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void App.<init>()"})
  void testNewApp() {
    // Arrange and Act
    App actualApp = new App();

    // Assert
    assertTrue(actualApp.keyCombinationAnalysis instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationCopy instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationEnterMoves instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationEnterPosition instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationFlipBoard instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationNextGame instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationOpen instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationPaste instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationPlayBlack instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationPlayWhite instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationPreviousGame instanceof KeyCodeCombination);
    assertTrue(actualApp.keyCombinationSave instanceof KeyCodeCombination);
    assertEquals("", actualApp.moveBuffer);
    assertNull(actualApp.getParameters());
    assertNull(actualApp.itmToggleToolbar);
    assertNull(actualApp.itmEnterMoves);
    assertNull(actualApp.spChessboardMoves);
    assertNull(actualApp.spMain);
    assertNull(actualApp.tglEngineOnOff);
    assertNull(actualApp.tbMainWindow);
    assertNull(actualApp.txtGameData);
    assertNull(actualApp.engineController);
    assertNull(actualApp.engineOutputView);
    assertNull(actualApp.gameModel);
    assertNull(actualApp.modeMenuController);
  }
}
