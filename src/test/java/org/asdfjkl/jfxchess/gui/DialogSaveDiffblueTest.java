package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DialogSaveDiffblueTest {
  /**
   * Test new {@link DialogSave} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link DialogSave}
   */
  @Test
  @DisplayName("Test new DialogSave (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DialogSave.<init>()"})
  void testNewDialogSave() {
    // Arrange and Act
    DialogSave actualDialogSave = new DialogSave();

    // Assert
    assertNull(actualDialogSave.stage);
    assertEquals(0, actualDialogSave.result);
  }
}
