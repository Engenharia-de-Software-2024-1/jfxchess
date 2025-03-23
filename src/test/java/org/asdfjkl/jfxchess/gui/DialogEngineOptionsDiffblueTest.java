package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DialogEngineOptionsDiffblueTest {
  /**
   * Test new {@link DialogEngineOptions} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link DialogEngineOptions}
   */
  @Test
  @DisplayName("Test new DialogEngineOptions (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DialogEngineOptions.<init>()"})
  void testNewDialogEngineOptions() {
    // Arrange and Act
    DialogEngineOptions actualDialogEngineOptions = new DialogEngineOptions();

    // Assert
    assertNull(actualDialogEngineOptions.checkboxWidgets);
    assertNull(actualDialogEngineOptions.comboboxWidgets);
    assertNull(actualDialogEngineOptions.spinnerWidgets);
    assertNull(actualDialogEngineOptions.textfieldWidgets);
    assertNull(actualDialogEngineOptions.btnCancel);
    assertNull(actualDialogEngineOptions.btnOk);
    assertNull(actualDialogEngineOptions.stage);
    assertFalse(actualDialogEngineOptions.accepted);
  }
}
