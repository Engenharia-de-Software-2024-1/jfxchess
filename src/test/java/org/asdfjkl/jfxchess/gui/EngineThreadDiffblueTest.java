package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EngineThreadDiffblueTest {
  /**
   * Test {@link EngineThread#EngineThread(BlockingQueue)}.
   * <p>
   * Method under test: {@link EngineThread#EngineThread(BlockingQueue)}
   */
  @Test
  @DisplayName("Test new EngineThread(BlockingQueue)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineThread.<init>(BlockingQueue)"})
  void testNewEngineThread() {
    // Arrange and Act
    EngineThread actualEngineThread = new EngineThread(new DelayQueue<>());

    // Assert
    StringProperty stringPropertyResult = actualEngineThread.stringProperty();
    assertTrue(stringPropertyResult instanceof SimpleStringProperty);
    assertEquals("", stringPropertyResult.getValue());
    assertEquals("", stringPropertyResult.getValueSafe());
    assertEquals("", stringPropertyResult.get());
    assertEquals("", actualEngineThread.getString());
    assertEquals("String", stringPropertyResult.getName());
    assertNull(actualEngineThread.engineOutput);
    assertNull(actualEngineThread.engineInput);
    assertNull(actualEngineThread.engineProcess);
    assertFalse(stringPropertyResult.isBound());
    assertSame(actualEngineThread, stringPropertyResult.getBean());
  }

  /**
   * Test {@link EngineThread#getString()}.
   * <p>
   * Method under test: {@link EngineThread#getString()}
   */
  @Test
  @DisplayName("Test getString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String EngineThread.getString()"})
  void testGetString() {
    // Arrange, Act and Assert
    assertEquals("", (new EngineThread(new DelayQueue<>())).getString());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EngineThread#terminate()}
   *   <li>{@link EngineThread#stringProperty()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"StringProperty EngineThread.stringProperty()", "void EngineThread.terminate()"})
  void testGettersAndSetters() {
    // Arrange
    EngineThread engineThread = new EngineThread(new DelayQueue<>());

    // Act
    engineThread.terminate();

    // Assert
    assertTrue(engineThread.stringProperty() instanceof SimpleStringProperty);
  }
}
