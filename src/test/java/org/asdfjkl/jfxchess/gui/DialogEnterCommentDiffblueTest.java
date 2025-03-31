package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DialogEnterCommentDiffblueTest {
  /**
   * Test new {@link DialogEnterComment} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link DialogEnterComment}
   */
  @Test
  @DisplayName("Test new DialogEnterComment (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void DialogEnterComment.<init>()"})
  void testNewDialogEnterComment() {
    // Arrange and Act
    DialogEnterComment actualDialogEnterComment = new DialogEnterComment();

    // Assert
    assertNull(actualDialogEnterComment.textArea);
    assertNull(actualDialogEnterComment.stage);
    assertFalse(actualDialogEnterComment.accepted);
  }
}
