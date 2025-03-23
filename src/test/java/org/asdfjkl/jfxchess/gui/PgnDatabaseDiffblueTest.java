package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PgnDatabaseDiffblueTest {
  /**
   * Test new {@link PgnDatabase} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link PgnDatabase}
   */
  @Test
  @DisplayName("Test new PgnDatabase (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PgnDatabase.<init>()"})
  void testNewPgnDatabase() {
    // Arrange and Act
    PgnDatabase actualPgnDatabase = new PgnDatabase();

    // Assert
    assertNull(actualPgnDatabase.filename);
    assertNull(actualPgnDatabase.getSearchResults());
    assertNull(actualPgnDatabase.dialogDatabase);
    assertEquals(0, actualPgnDatabase.getNrGames());
    assertTrue(actualPgnDatabase.getRunningTasks().isEmpty());
    assertTrue(actualPgnDatabase.getEntries().isEmpty());
  }

  /**
   * Test {@link PgnDatabase#getNrGames()}.
   * <p>
   * Method under test: {@link PgnDatabase#getNrGames()}
   */
  @Test
  @DisplayName("Test getNrGames()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int PgnDatabase.getNrGames()"})
  void testGetNrGames() {
    // Arrange, Act and Assert
    assertEquals(0, (new PgnDatabase()).getNrGames());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PgnDatabase#setDialogDatabase(DialogDatabase)}
   *   <li>{@link PgnDatabase#getEntries()}
   *   <li>{@link PgnDatabase#getRunningTasks()}
   *   <li>{@link PgnDatabase#getSearchResults()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ObservableList PgnDatabase.getEntries()", "ArrayList PgnDatabase.getRunningTasks()",
      "ObservableList PgnDatabase.getSearchResults()", "void PgnDatabase.setDialogDatabase(DialogDatabase)"})
  void testGettersAndSetters() {
    // Arrange
    PgnDatabase pgnDatabase = new PgnDatabase();

    // Act
    pgnDatabase.setDialogDatabase(new DialogDatabase());
    ObservableList<PgnDatabaseEntry> actualEntries = pgnDatabase.getEntries();
    ArrayList<Task> actualRunningTasks = pgnDatabase.getRunningTasks();

    // Assert
    assertNull(pgnDatabase.getSearchResults());
    assertTrue(actualRunningTasks.isEmpty());
    assertTrue(actualEntries.isEmpty());
  }
}
