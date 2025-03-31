package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DialogSimpleAlertDiffblueTest {
  /**
   * Test new {@link DialogSimpleAlert} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link DialogSimpleAlert}
   */
  @Test
  @DisplayName("Test new DialogSimpleAlert (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DialogSimpleAlert.<init>()"})
  void testNewDialogSimpleAlert() {
    // Arrange, Act and Assert
    assertNull((new DialogSimpleAlert()).stage);
  }
}
