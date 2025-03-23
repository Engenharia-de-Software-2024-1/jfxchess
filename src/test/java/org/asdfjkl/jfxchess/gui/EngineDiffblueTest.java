package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EngineDiffblueTest {
  /**
   * Test {@link Engine#writeToString()}.
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString() {
    // Arrange, Act and Assert
    assertEquals("|", (new Engine()).writeToString());
  }

  /**
   * Test {@link Engine#restoreFromString(String)}.
   * <ul>
   *   <li>When {@code \||false}.</li>
   *   <li>Then {@link Engine} (default constructor) Name is {@code \}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#restoreFromString(String)}
   */
  @Test
  @DisplayName("Test restoreFromString(String); when '\\||false'; then Engine (default constructor) Name is '\\'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Engine.restoreFromString(String)"})
  void testRestoreFromString_whenFalse_thenEngineNameIsBackslash() {
    // Arrange
    Engine engine = new Engine();

    // Act
    engine.restoreFromString("\\||false");

    // Assert
    assertEquals("", engine.getPath());
    assertEquals("\\", engine.getName());
  }

  /**
   * Test {@link Engine#restoreFromString(String)}.
   * <ul>
   *   <li>When {@code |false}.</li>
   *   <li>Then {@link Engine} (default constructor) Name is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#restoreFromString(String)}
   */
  @Test
  @DisplayName("Test restoreFromString(String); when '|false'; then Engine (default constructor) Name is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Engine.restoreFromString(String)"})
  void testRestoreFromString_whenFalse_thenEngineNameIsEmptyString() {
    // Arrange
    Engine engine = new Engine();

    // Act
    engine.restoreFromString("|false");

    // Assert
    assertEquals("", engine.getName());
    String expectedPath = Boolean.FALSE.toString();
    assertEquals(expectedPath, engine.getPath());
  }

  /**
   * Test {@link Engine#restoreFromString(String)}.
   * <ul>
   *   <li>When {@code foo}.</li>
   *   <li>Then {@link Engine} (default constructor) Name is {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#restoreFromString(String)}
   */
  @Test
  @DisplayName("Test restoreFromString(String); when 'foo'; then Engine (default constructor) Name is 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Engine.restoreFromString(String)"})
  void testRestoreFromString_whenFoo_thenEngineNameIsFoo() {
    // Arrange
    Engine engine = new Engine();

    // Act
    engine.restoreFromString("foo");

    // Assert
    assertEquals("", engine.getPath());
    assertEquals("foo", engine.getName());
  }

  /**
   * Test {@link Engine#makeCopy()}.
   * <p>
   * Method under test: {@link Engine#makeCopy()}
   */
  @Test
  @DisplayName("Test makeCopy()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Engine Engine.makeCopy()"})
  void testMakeCopy() {
    // Arrange and Act
    Engine actualMakeCopyResult = (new Engine()).makeCopy();

    // Assert
    assertEquals("", actualMakeCopyResult.getName());
    assertEquals("", actualMakeCopyResult.getPath());
    assertEquals(0, actualMakeCopyResult.getMaxUciElo());
    assertEquals(0, actualMakeCopyResult.getMinUciElo());
    assertEquals(0, actualMakeCopyResult.getUciElo());
    assertEquals(1, actualMakeCopyResult.getMaxMultiPV());
    assertFalse(actualMakeCopyResult.isInternal());
    assertTrue(actualMakeCopyResult.options.isEmpty());
  }

  /**
   * Test {@link Engine#supportsMultiPV()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) Internal is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#supportsMultiPV()}
   */
  @Test
  @DisplayName("Test supportsMultiPV(); given Engine (default constructor) Internal is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsMultiPV()"})
  void testSupportsMultiPV_givenEngineInternalIsTrue_thenReturnTrue() {
    // Arrange
    Engine engine = new Engine();
    engine.setInternal(true);

    // Act and Assert
    assertTrue(engine.supportsMultiPV());
  }

  /**
   * Test {@link Engine#supportsMultiPV()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#supportsMultiPV()}
   */
  @Test
  @DisplayName("Test supportsMultiPV(); given Engine (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsMultiPV()"})
  void testSupportsMultiPV_givenEngine_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new Engine()).supportsMultiPV());
  }

  /**
   * Test {@link Engine#getMaxMultiPV()}.
   * <p>
   * Method under test: {@link Engine#getMaxMultiPV()}
   */
  @Test
  @DisplayName("Test getMaxMultiPV()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxMultiPV()"})
  void testGetMaxMultiPV() {
    // Arrange, Act and Assert
    assertEquals(1, (new Engine()).getMaxMultiPV());
  }

  /**
   * Test {@link Engine#getUciElo()}.
   * <p>
   * Method under test: {@link Engine#getUciElo()}
   */
  @Test
  @DisplayName("Test getUciElo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getUciElo()"})
  void testGetUciElo() {
    // Arrange, Act and Assert
    assertEquals(0, (new Engine()).getUciElo());
  }

  /**
   * Test {@link Engine#getMinUciElo()}.
   * <p>
   * Method under test: {@link Engine#getMinUciElo()}
   */
  @Test
  @DisplayName("Test getMinUciElo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMinUciElo()"})
  void testGetMinUciElo() {
    // Arrange, Act and Assert
    assertEquals(0, (new Engine()).getMinUciElo());
  }

  /**
   * Test {@link Engine#getMaxUciElo()}.
   * <p>
   * Method under test: {@link Engine#getMaxUciElo()}
   */
  @Test
  @DisplayName("Test getMaxUciElo()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxUciElo()"})
  void testGetMaxUciElo() {
    // Arrange, Act and Assert
    assertEquals(0, (new Engine()).getMaxUciElo());
  }

  /**
   * Test {@link Engine#supportsUciLimitStrength()}.
   * <p>
   * Method under test: {@link Engine#supportsUciLimitStrength()}
   */
  @Test
  @DisplayName("Test supportsUciLimitStrength()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsUciLimitStrength()"})
  void testSupportsUciLimitStrength() {
    // Arrange, Act and Assert
    assertFalse((new Engine()).supportsUciLimitStrength());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Engine}
   *   <li>{@link Engine#setInternal(boolean)}
   *   <li>{@link Engine#setName(String)}
   *   <li>{@link Engine#setPath(String)}
   *   <li>{@link Engine#getName()}
   *   <li>{@link Engine#getPath()}
   *   <li>{@link Engine#isInternal()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Engine.<init>()", "String Engine.getName()", "String Engine.getPath()",
      "boolean Engine.isInternal()", "void Engine.setInternal(boolean)", "void Engine.setName(String)",
      "void Engine.setPath(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    Engine actualEngine = new Engine();
    actualEngine.setInternal(true);
    actualEngine.setName("Name");
    actualEngine.setPath("Path");
    String actualName = actualEngine.getName();
    String actualPath = actualEngine.getPath();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Path", actualPath);
    assertTrue(actualEngine.isInternal());
  }
}
