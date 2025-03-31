package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import javafx.stage.FileChooser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DialogDatabaseDiffblueTest {
  /**
   * Test new {@link DialogDatabase} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link DialogDatabase}
   */
  @Test
  @DisplayName("Test new DialogDatabase (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DialogDatabase.<init>()"})
  void testNewDialogDatabase() {
    // Arrange and Act
    DialogDatabase actualDialogDatabase = new DialogDatabase();

    // Assert
    FileChooser fileChooser = actualDialogDatabase.fileChooser;
    assertNull(fileChooser.getInitialDirectory());
    assertNull(fileChooser.getInitialFileName());
    assertNull(fileChooser.getTitle());
    assertNull(actualDialogDatabase.table);
    assertNull(fileChooser.getSelectedExtensionFilter());
    assertNull(actualDialogDatabase.stage);
    assertNull(actualDialogDatabase.gameModel);
    assertNull(actualDialogDatabase.pgnDatabase);
    assertNull(actualDialogDatabase.searchPattern);
    assertEquals(-1, actualDialogDatabase.idxCurrentlyOpen);
    assertFalse(actualDialogDatabase.accepted);
    assertTrue(fileChooser.getExtensionFilters().isEmpty());
  }
}
