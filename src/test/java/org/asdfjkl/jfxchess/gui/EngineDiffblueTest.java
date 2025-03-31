package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EngineDiffblueTest {
  /**
   * Test {@link Engine#addEngineOption(EngineOption)}.
   * <ul>
   *   <li>Given {@code MultiPV}.</li>
   *   <li>Then {@link Engine} (default constructor) MaxMultiPV is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#addEngineOption(EngineOption)}
   */
  @Test
  @DisplayName("Test addEngineOption(EngineOption); given 'MultiPV'; then Engine (default constructor) MaxMultiPV is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Engine.addEngineOption(EngineOption)"})
  void testAddEngineOption_givenMultiPV_thenEngineMaxMultiPVIsZero() {
    // Arrange
    Engine engine = new Engine();
    EngineOption option = new EngineOption();
    option.name = "MultiPV";

    // Act
    engine.addEngineOption(option);

    // Assert
    assertEquals(0, engine.getMaxMultiPV());
    assertEquals(0, engine.getMultiPV());
    ArrayList<EngineOption> engineOptionList = engine.options;
    assertEquals(1, engineOptionList.size());
    assertSame(option, engineOptionList.get(0));
  }

  /**
   * Test {@link Engine#addEngineOption(EngineOption)}.
   * <ul>
   *   <li>When {@link EngineOption} (default constructor).</li>
   *   <li>Then {@link Engine} (default constructor) MaxMultiPV is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#addEngineOption(EngineOption)}
   */
  @Test
  @DisplayName("Test addEngineOption(EngineOption); when EngineOption (default constructor); then Engine (default constructor) MaxMultiPV is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Engine.addEngineOption(EngineOption)"})
  void testAddEngineOption_whenEngineOption_thenEngineMaxMultiPVIsOne() {
    // Arrange
    Engine engine = new Engine();
    EngineOption option = new EngineOption();

    // Act
    engine.addEngineOption(option);

    // Assert
    ArrayList<EngineOption> engineOptionList = engine.options;
    assertEquals(1, engineOptionList.size());
    assertEquals(1, engine.getMaxMultiPV());
    assertEquals(1, engine.getMultiPV());
    assertSame(option, engineOptionList.get(0));
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is four.</li>
   *   <li>Then return {@code ||option name type button |true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); given EngineOption (default constructor) type is four; then return '||option name type button |true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_givenEngineOptionTypeIsFour_thenReturnOptionNameTypeButtonTrue() {
    // Arrange
    EngineOption option = new EngineOption();
    option.checkStatusValue = true;
    option.type = 4;

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals("||option name  type button |true", engine.writeToString());
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   *   <li>Then return {@code |}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); given Engine (default constructor); then return '|'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_givenEngine_thenReturnVerticalLine() {
    // Arrange, Act and Assert
    assertEquals("|", (new Engine()).writeToString());
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Then return {@code ||option name type check default false|false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); then return '||option name type check default false|false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_thenReturnOptionNameTypeCheckDefaultFalseFalse() {
    // Arrange
    EngineOption option = new EngineOption();
    option.type = 1;

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals("||option name  type check default false|false", engine.writeToString());
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Then return {@code ||option name type check default false|true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); then return '||option name type check default false|true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_thenReturnOptionNameTypeCheckDefaultFalseTrue() {
    // Arrange
    EngineOption option = new EngineOption();
    option.checkStatusValue = true;
    option.type = 1;

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals("||option name  type check default false|true", engine.writeToString());
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Then return {@code ||option name type combo default |}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); then return '||option name type combo default |'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_thenReturnOptionNameTypeComboDefault() {
    // Arrange
    EngineOption option = new EngineOption();
    option.checkStatusValue = true;
    option.type = 2;

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals("||option name  type combo default |", engine.writeToString());
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Then return {@code ||option name type spin default 0 min 0 max 0|0}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); then return '||option name type spin default 0 min 0 max 0|0'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_thenReturnOptionNameTypeSpinDefault0Min0Max00() {
    // Arrange
    EngineOption option = new EngineOption();
    option.type = 0;

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals("||option name  type spin default 0 min 0 max 0|0", engine.writeToString());
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Then return {@code ||option name type string default |}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); then return '||option name type string default |'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_thenReturnOptionNameTypeStringDefault() {
    // Arrange
    EngineOption option = new EngineOption();
    option.checkStatusValue = true;
    option.type = 3;

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals("||option name  type string default |", engine.writeToString());
  }

  /**
   * Test {@link Engine#writeToString()}.
   * <ul>
   *   <li>Then return {@code ||}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#writeToString()}
   */
  @Test
  @DisplayName("Test writeToString(); then return '||'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Engine.writeToString()"})
  void testWriteToString_thenReturnVerticalLineVerticalLine() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertEquals("||", engine.writeToString());
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
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   *   <li>Then return MaxMultiPV is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#makeCopy()}
   */
  @Test
  @DisplayName("Test makeCopy(); given Engine (default constructor) addEngineOption EngineOption (default constructor); then return MaxMultiPV is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Engine Engine.makeCopy()"})
  void testMakeCopy_givenEngineAddEngineOptionEngineOption_thenReturnMaxMultiPVIsOne() {
    // Arrange
    Engine engine = new Engine();
    EngineOption option = new EngineOption();
    engine.addEngineOption(option);

    // Act
    Engine actualMakeCopyResult = engine.makeCopy();

    // Assert
    ArrayList<EngineOption> engineOptionList = actualMakeCopyResult.options;
    assertEquals(1, engineOptionList.size());
    assertEquals(1, actualMakeCopyResult.getMaxMultiPV());
    assertEquals(1, actualMakeCopyResult.getMultiPV());
    assertSame(option, engineOptionList.get(0));
  }

  /**
   * Test {@link Engine#makeCopy()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code MultiPV}.</li>
   *   <li>Then return MaxMultiPV is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#makeCopy()}
   */
  @Test
  @DisplayName("Test makeCopy(); given EngineOption (default constructor) name is 'MultiPV'; then return MaxMultiPV is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Engine Engine.makeCopy()"})
  void testMakeCopy_givenEngineOptionNameIsMultiPV_thenReturnMaxMultiPVIsZero() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "MultiPV";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act
    Engine actualMakeCopyResult = engine.makeCopy();

    // Assert
    assertEquals(0, actualMakeCopyResult.getMaxMultiPV());
    assertEquals(0, actualMakeCopyResult.getMultiPV());
    ArrayList<EngineOption> engineOptionList = actualMakeCopyResult.options;
    assertEquals(1, engineOptionList.size());
    assertSame(option, engineOptionList.get(0));
  }

  /**
   * Test {@link Engine#makeCopy()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   *   <li>Then return Name is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#makeCopy()}
   */
  @Test
  @DisplayName("Test makeCopy(); given Engine (default constructor); then return Name is empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Engine Engine.makeCopy()"})
  void testMakeCopy_givenEngine_thenReturnNameIsEmptyString() {
    // Arrange and Act
    Engine actualMakeCopyResult = (new Engine()).makeCopy();

    // Assert
    assertEquals("", actualMakeCopyResult.getName());
    assertEquals("", actualMakeCopyResult.getPath());
    assertEquals(0, actualMakeCopyResult.getMaxUciElo());
    assertEquals(0, actualMakeCopyResult.getMinUciElo());
    assertEquals(0, actualMakeCopyResult.getUciElo());
    assertFalse(actualMakeCopyResult.getUciLimitStrength());
    assertFalse(actualMakeCopyResult.isInternal());
    assertTrue(actualMakeCopyResult.options.isEmpty());
  }

  /**
   * Test {@link Engine#supportsMultiPV()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#supportsMultiPV()}
   */
  @Test
  @DisplayName("Test supportsMultiPV(); given Engine (default constructor) addEngineOption EngineOption (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsMultiPV()"})
  void testSupportsMultiPV_givenEngineAddEngineOptionEngineOption_thenReturnFalse() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertFalse(engine.supportsMultiPV());
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
    engine.addEngineOption(new EngineOption());

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
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMaxMultiPV()}
   */
  @Test
  @DisplayName("Test getMaxMultiPV(); given Engine (default constructor) addEngineOption EngineOption (default constructor); then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxMultiPV()"})
  void testGetMaxMultiPV_givenEngineAddEngineOptionEngineOption_thenReturnOne() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertEquals(1, engine.getMaxMultiPV());
  }

  /**
   * Test {@link Engine#getMaxMultiPV()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code MultiPV}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMaxMultiPV()}
   */
  @Test
  @DisplayName("Test getMaxMultiPV(); given EngineOption (default constructor) name is 'MultiPV'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxMultiPV()"})
  void testGetMaxMultiPV_givenEngineOptionNameIsMultiPV_thenReturnZero() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "MultiPV";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals(0, engine.getMaxMultiPV());
  }

  /**
   * Test {@link Engine#getMaxMultiPV()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMaxMultiPV()}
   */
  @Test
  @DisplayName("Test getMaxMultiPV(); given Engine (default constructor); then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxMultiPV()"})
  void testGetMaxMultiPV_givenEngine_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, (new Engine()).getMaxMultiPV());
  }

  /**
   * Test {@link Engine#getMultiPV()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMultiPV()}
   */
  @Test
  @DisplayName("Test getMultiPV(); given Engine (default constructor) addEngineOption EngineOption (default constructor); then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMultiPV()"})
  void testGetMultiPV_givenEngineAddEngineOptionEngineOption_thenReturnOne() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertEquals(1, engine.getMultiPV());
  }

  /**
   * Test {@link Engine#getMultiPV()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code MultiPV}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMultiPV()}
   */
  @Test
  @DisplayName("Test getMultiPV(); given EngineOption (default constructor) name is 'MultiPV'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMultiPV()"})
  void testGetMultiPV_givenEngineOptionNameIsMultiPV_thenReturnZero() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "MultiPV";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals(0, engine.getMultiPV());
  }

  /**
   * Test {@link Engine#getMultiPV()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMultiPV()}
   */
  @Test
  @DisplayName("Test getMultiPV(); given Engine (default constructor); then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMultiPV()"})
  void testGetMultiPV_givenEngine_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, (new Engine()).getMultiPV());
  }

  /**
   * Test {@link Engine#getUciElo()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getUciElo()}
   */
  @Test
  @DisplayName("Test getUciElo(); given Engine (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getUciElo()"})
  void testGetUciElo_givenEngine() {
    // Arrange, Act and Assert
    assertEquals(0, (new Engine()).getUciElo());
  }

  /**
   * Test {@link Engine#getUciElo()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getUciElo()}
   */
  @Test
  @DisplayName("Test getUciElo(); given Engine (default constructor) addEngineOption EngineOption (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getUciElo()"})
  void testGetUciElo_givenEngineAddEngineOptionEngineOption() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertEquals(0, engine.getUciElo());
  }

  /**
   * Test {@link Engine#getUciElo()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code UCI_Elo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getUciElo()}
   */
  @Test
  @DisplayName("Test getUciElo(); given EngineOption (default constructor) name is 'UCI_Elo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getUciElo()"})
  void testGetUciElo_givenEngineOptionNameIsUciElo() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "UCI_Elo";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals(0, engine.getUciElo());
  }

  /**
   * Test {@link Engine#getMinUciElo()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMinUciElo()}
   */
  @Test
  @DisplayName("Test getMinUciElo(); given Engine (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMinUciElo()"})
  void testGetMinUciElo_givenEngine() {
    // Arrange, Act and Assert
    assertEquals(0, (new Engine()).getMinUciElo());
  }

  /**
   * Test {@link Engine#getMinUciElo()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMinUciElo()}
   */
  @Test
  @DisplayName("Test getMinUciElo(); given Engine (default constructor) addEngineOption EngineOption (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMinUciElo()"})
  void testGetMinUciElo_givenEngineAddEngineOptionEngineOption() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertEquals(0, engine.getMinUciElo());
  }

  /**
   * Test {@link Engine#getMinUciElo()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code UCI_Elo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMinUciElo()}
   */
  @Test
  @DisplayName("Test getMinUciElo(); given EngineOption (default constructor) name is 'UCI_Elo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMinUciElo()"})
  void testGetMinUciElo_givenEngineOptionNameIsUciElo() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "UCI_Elo";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals(0, engine.getMinUciElo());
  }

  /**
   * Test {@link Engine#getMaxUciElo()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMaxUciElo()}
   */
  @Test
  @DisplayName("Test getMaxUciElo(); given Engine (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxUciElo()"})
  void testGetMaxUciElo_givenEngine() {
    // Arrange, Act and Assert
    assertEquals(0, (new Engine()).getMaxUciElo());
  }

  /**
   * Test {@link Engine#getMaxUciElo()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMaxUciElo()}
   */
  @Test
  @DisplayName("Test getMaxUciElo(); given Engine (default constructor) addEngineOption EngineOption (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxUciElo()"})
  void testGetMaxUciElo_givenEngineAddEngineOptionEngineOption() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertEquals(0, engine.getMaxUciElo());
  }

  /**
   * Test {@link Engine#getMaxUciElo()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code UCI_Elo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getMaxUciElo()}
   */
  @Test
  @DisplayName("Test getMaxUciElo(); given EngineOption (default constructor) name is 'UCI_Elo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.getMaxUciElo()"})
  void testGetMaxUciElo_givenEngineOptionNameIsUciElo() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "UCI_Elo";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertEquals(0, engine.getMaxUciElo());
  }

  /**
   * Test {@link Engine#supportsUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#supportsUciLimitStrength()}
   */
  @Test
  @DisplayName("Test supportsUciLimitStrength(); given Engine (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsUciLimitStrength()"})
  void testSupportsUciLimitStrength_givenEngine() {
    // Arrange, Act and Assert
    assertFalse((new Engine()).supportsUciLimitStrength());
  }

  /**
   * Test {@link Engine#supportsUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#supportsUciLimitStrength()}
   */
  @Test
  @DisplayName("Test supportsUciLimitStrength(); given Engine (default constructor) addEngineOption EngineOption (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsUciLimitStrength()"})
  void testSupportsUciLimitStrength_givenEngineAddEngineOptionEngineOption() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertFalse(engine.supportsUciLimitStrength());
  }

  /**
   * Test {@link Engine#supportsUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code UCI_Elo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#supportsUciLimitStrength()}
   */
  @Test
  @DisplayName("Test supportsUciLimitStrength(); given EngineOption (default constructor) name is 'UCI_Elo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsUciLimitStrength()"})
  void testSupportsUciLimitStrength_givenEngineOptionNameIsUciElo() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "UCI_Elo";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertFalse(engine.supportsUciLimitStrength());
  }

  /**
   * Test {@link Engine#supportsUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code UCI_LimitStrength}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#supportsUciLimitStrength()}
   */
  @Test
  @DisplayName("Test supportsUciLimitStrength(); given EngineOption (default constructor) name is 'UCI_LimitStrength'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.supportsUciLimitStrength()"})
  void testSupportsUciLimitStrength_givenEngineOptionNameIsUciLimitStrength() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "UCI_LimitStrength";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertFalse(engine.supportsUciLimitStrength());
  }

  /**
   * Test {@link Engine#getUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor) addEngineOption {@link EngineOption} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getUciLimitStrength()}
   */
  @Test
  @DisplayName("Test getUciLimitStrength(); given Engine (default constructor) addEngineOption EngineOption (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.getUciLimitStrength()"})
  void testGetUciLimitStrength_givenEngineAddEngineOptionEngineOption_thenReturnFalse() {
    // Arrange
    Engine engine = new Engine();
    engine.addEngineOption(new EngineOption());

    // Act and Assert
    assertFalse(engine.getUciLimitStrength());
  }

  /**
   * Test {@link Engine#getUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#checkStatusValue} is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getUciLimitStrength()}
   */
  @Test
  @DisplayName("Test getUciLimitStrength(); given EngineOption (default constructor) checkStatusValue is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.getUciLimitStrength()"})
  void testGetUciLimitStrength_givenEngineOptionCheckStatusValueIsTrue_thenReturnTrue() {
    // Arrange
    EngineOption option = new EngineOption();
    option.checkStatusValue = true;
    option.name = "UCI_LimitStrength";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertTrue(engine.getUciLimitStrength());
  }

  /**
   * Test {@link Engine#getUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code UCI_LimitStrength}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getUciLimitStrength()}
   */
  @Test
  @DisplayName("Test getUciLimitStrength(); given EngineOption (default constructor) name is 'UCI_LimitStrength'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.getUciLimitStrength()"})
  void testGetUciLimitStrength_givenEngineOptionNameIsUciLimitStrength_thenReturnFalse() {
    // Arrange
    EngineOption option = new EngineOption();
    option.name = "UCI_LimitStrength";

    Engine engine = new Engine();
    engine.addEngineOption(option);

    // Act and Assert
    assertFalse(engine.getUciLimitStrength());
  }

  /**
   * Test {@link Engine#getUciLimitStrength()}.
   * <ul>
   *   <li>Given {@link Engine} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#getUciLimitStrength()}
   */
  @Test
  @DisplayName("Test getUciLimitStrength(); given Engine (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Engine.getUciLimitStrength()"})
  void testGetUciLimitStrength_givenEngine_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new Engine()).getUciLimitStrength());
  }

  /**
   * Test {@link Engine#compare(Engine, Engine)} with {@code o1}, {@code o2}.
   * <ul>
   *   <li>Given {@code Stockfish (Internal)}.</li>
   *   <li>Then return minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#compare(Engine, Engine)}
   */
  @Test
  @DisplayName("Test compare(Engine, Engine) with 'o1', 'o2'; given 'Stockfish (Internal)'; then return minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.compare(Engine, Engine)"})
  void testCompareWithO1O2_givenStockfishInternal_thenReturnMinusOne() {
    // Arrange
    Engine engine = new Engine();

    Engine o1 = new Engine();
    o1.setName("Stockfish (Internal)");

    // Act and Assert
    assertEquals(-1, engine.compare(o1, new Engine()));
  }

  /**
   * Test {@link Engine#compare(Engine, Engine)} with {@code o1}, {@code o2}.
   * <ul>
   *   <li>Given {@code Stockfish (Internal)}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#compare(Engine, Engine)}
   */
  @Test
  @DisplayName("Test compare(Engine, Engine) with 'o1', 'o2'; given 'Stockfish (Internal)'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.compare(Engine, Engine)"})
  void testCompareWithO1O2_givenStockfishInternal_thenReturnOne() {
    // Arrange
    Engine engine = new Engine();
    Engine o1 = new Engine();

    Engine o2 = new Engine();
    o2.setName("Stockfish (Internal)");

    // Act and Assert
    assertEquals(1, engine.compare(o1, o2));
  }

  /**
   * Test {@link Engine#compare(Engine, Engine)} with {@code o1}, {@code o2}.
   * <ul>
   *   <li>When {@link Engine} (default constructor).</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Engine#compare(Engine, Engine)}
   */
  @Test
  @DisplayName("Test compare(Engine, Engine) with 'o1', 'o2'; when Engine (default constructor); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Engine.compare(Engine, Engine)"})
  void testCompareWithO1O2_whenEngine_thenReturnZero() {
    // Arrange
    Engine engine = new Engine();
    Engine o1 = new Engine();

    // Act and Assert
    assertEquals(0, engine.compare(o1, new Engine()));
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
