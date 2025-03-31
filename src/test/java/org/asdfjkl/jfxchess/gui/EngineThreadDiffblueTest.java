package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EngineThreadDiffblueTest {
  /**
   * Test {@link EngineThread#EngineThread(BlockingQueue)}.
   * <ul>
   *   <li>Given {@code nps\s(\d)+}.</li>
   *   <li>When {@link LinkedBlockingDeque#LinkedBlockingDeque()} add {@code nps\s(\d)+}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineThread#EngineThread(BlockingQueue)}
   */
  @Test
  @DisplayName("Test new EngineThread(BlockingQueue); given 'nps\\s(\\d)+'; when LinkedBlockingDeque() add 'nps\\s(\\d)+'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineThread.<init>(BlockingQueue)"})
  void testNewEngineThread_givenNpsSD_whenLinkedBlockingDequeAddNpsSD() {
    // Arrange
    LinkedBlockingDeque<String> cmdQueue = new LinkedBlockingDeque<>();
    cmdQueue.add("nps\\s(\\d)+");
    cmdQueue.add("score\\scp\\s-{0,1}(\\d)+");

    // Act
    EngineThread actualEngineThread = new EngineThread(cmdQueue);

    // Assert
    StringProperty stringPropertyResult = actualEngineThread.stringProperty();
    assertTrue(stringPropertyResult instanceof SimpleStringProperty);
    ObservableList<?> dependencies = stringPropertyResult.isEmpty().getDependencies();
    assertEquals(1, dependencies.size());
    assertEquals(dependencies, stringPropertyResult.isNotEmpty().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNotNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.length().getDependencies());
    assertSame(actualEngineThread, stringPropertyResult.getBean());
    assertSame(stringPropertyResult, dependencies.get(0));
  }

  /**
   * Test {@link EngineThread#EngineThread(BlockingQueue)}.
   * <ul>
   *   <li>Given {@code score\scp\s-{0,1}(\d)+}.</li>
   *   <li>When {@link LinkedBlockingDeque#LinkedBlockingDeque()} add {@code score\scp\s-{0,1}(\d)+}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineThread#EngineThread(BlockingQueue)}
   */
  @Test
  @DisplayName("Test new EngineThread(BlockingQueue); given 'score\\scp\\s-{0,1}(\\d)+'; when LinkedBlockingDeque() add 'score\\scp\\s-{0,1}(\\d)+'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineThread.<init>(BlockingQueue)"})
  void testNewEngineThread_givenScoreScpS01D_whenLinkedBlockingDequeAddScoreScpS01D() {
    // Arrange
    LinkedBlockingDeque<String> cmdQueue = new LinkedBlockingDeque<>();
    cmdQueue.add("score\\scp\\s-{0,1}(\\d)+");

    // Act
    EngineThread actualEngineThread = new EngineThread(cmdQueue);

    // Assert
    StringProperty stringPropertyResult = actualEngineThread.stringProperty();
    assertTrue(stringPropertyResult instanceof SimpleStringProperty);
    ObservableList<?> dependencies = stringPropertyResult.isEmpty().getDependencies();
    assertEquals(1, dependencies.size());
    assertEquals(dependencies, stringPropertyResult.isNotEmpty().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNotNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.length().getDependencies());
    assertSame(actualEngineThread, stringPropertyResult.getBean());
    assertSame(stringPropertyResult, dependencies.get(0));
  }

  /**
   * Test {@link EngineThread#EngineThread(BlockingQueue)}.
   * <ul>
   *   <li>When {@link LinkedBlockingDeque#LinkedBlockingDeque()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineThread#EngineThread(BlockingQueue)}
   */
  @Test
  @DisplayName("Test new EngineThread(BlockingQueue); when LinkedBlockingDeque()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineThread.<init>(BlockingQueue)"})
  void testNewEngineThread_whenLinkedBlockingDeque() {
    // Arrange and Act
    EngineThread actualEngineThread = new EngineThread(new LinkedBlockingDeque<>());

    // Assert
    StringProperty stringPropertyResult = actualEngineThread.stringProperty();
    assertTrue(stringPropertyResult instanceof SimpleStringProperty);
    ObservableList<?> dependencies = stringPropertyResult.isEmpty().getDependencies();
    assertEquals(1, dependencies.size());
    assertEquals(dependencies, stringPropertyResult.isNotEmpty().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNotNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.length().getDependencies());
    assertSame(actualEngineThread, stringPropertyResult.getBean());
    assertSame(stringPropertyResult, dependencies.get(0));
  }

  /**
   * Test {@link EngineThread#EngineThread(BlockingQueue)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineThread#EngineThread(BlockingQueue)}
   */
  @Test
  @DisplayName("Test new EngineThread(BlockingQueue); when 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineThread.<init>(BlockingQueue)"})
  void testNewEngineThread_whenNull() {
    // Arrange and Act
    EngineThread actualEngineThread = new EngineThread(null);

    // Assert
    StringProperty stringPropertyResult = actualEngineThread.stringProperty();
    assertTrue(stringPropertyResult instanceof SimpleStringProperty);
    ObservableList<?> dependencies = stringPropertyResult.isEmpty().getDependencies();
    assertEquals(1, dependencies.size());
    assertEquals(dependencies, stringPropertyResult.isNotEmpty().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNotNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.isNull().getDependencies());
    assertEquals(dependencies, stringPropertyResult.length().getDependencies());
    assertSame(actualEngineThread, stringPropertyResult.getBean());
    assertSame(stringPropertyResult, dependencies.get(0));
  }

  /**
   * Test {@link EngineThread#engineIsOn()}.
   * <p>
   * Method under test: {@link EngineThread#engineIsOn()}
   */
  @Test
  @DisplayName("Test engineIsOn()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineThread.engineIsOn()"})
  void testEngineIsOn() {
    // Arrange, Act and Assert
    assertFalse((new EngineThread(null)).engineIsOn());
  }

  /**
   * Test {@link EngineThread#getString()}.
   * <p>
   * Method under test: {@link EngineThread#getString()}
   */
  @Test
  @DisplayName("Test getString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineThread.getString()"})
  void testGetString() {
    // Arrange, Act and Assert
    assertEquals("", (new EngineThread(null)).getString());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EngineThread#engineInfoSetID(String)}
   *   <li>{@link EngineThread#engineInfoSetLimitedStrength(boolean)}
   *   <li>{@link EngineThread#engineInfoSetPVLines(int)}
   *   <li>{@link EngineThread#engineInfoSetStrength(int)}
   *   <li>{@link EngineThread#terminate()}
   *   <li>{@link EngineThread#stringProperty()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineThread.engineInfoSetID(String)",
      "void EngineThread.engineInfoSetLimitedStrength(boolean)", "void EngineThread.engineInfoSetPVLines(int)",
      "void EngineThread.engineInfoSetStrength(int)", "StringProperty EngineThread.stringProperty()",
      "void EngineThread.terminate()"})
  void testGettersAndSetters() {
    // Arrange
    EngineThread engineThread = new EngineThread(null);

    // Act
    engineThread.engineInfoSetID("Engine ID");
    engineThread.engineInfoSetLimitedStrength(true);
    engineThread.engineInfoSetPVLines(1);
    engineThread.engineInfoSetStrength(1);
    engineThread.terminate();

    // Assert
    assertTrue(engineThread.stringProperty() instanceof SimpleStringProperty);
  }
}
