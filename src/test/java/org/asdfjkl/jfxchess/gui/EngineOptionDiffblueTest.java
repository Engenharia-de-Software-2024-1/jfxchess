package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EngineOptionDiffblueTest {
  /**
   * Test {@link EngineOption#makeCopy()}.
   * <p>
   * Method under test: {@link EngineOption#makeCopy()}
   */
  @Test
  @DisplayName("Test makeCopy()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"EngineOption EngineOption.makeCopy()"})
  void testMakeCopy() {
    // Arrange and Act
    EngineOption actualMakeCopyResult = (new EngineOption()).makeCopy();

    // Assert
    assertEquals("", actualMakeCopyResult.comboDefault);
    assertEquals("", actualMakeCopyResult.comboValue);
    assertEquals("", actualMakeCopyResult.name);
    assertEquals("", actualMakeCopyResult.stringDefault);
    assertEquals("", actualMakeCopyResult.stringValue);
    assertEquals(-1, actualMakeCopyResult.type);
    assertEquals(0, actualMakeCopyResult.spinDefault);
    assertEquals(0, actualMakeCopyResult.spinMax);
    assertEquals(0, actualMakeCopyResult.spinMin);
    assertEquals(0, actualMakeCopyResult.spinValue);
    assertFalse(actualMakeCopyResult.checkStatusDefault);
    assertFalse(actualMakeCopyResult.checkStatusValue);
    assertTrue(actualMakeCopyResult.comboValues.isEmpty());
    assertTrue(actualMakeCopyResult.isNotDefault());
  }

  /**
   * Test {@link EngineOption#isNotDefault()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#checkStatusDefault} is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#isNotDefault()}
   */
  @Test
  @DisplayName("Test isNotDefault(); given EngineOption (default constructor) checkStatusDefault is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.isNotDefault()"})
  void testIsNotDefault_givenEngineOptionCheckStatusDefaultIsTrue_thenReturnTrue() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.checkStatusDefault = true;
    engineOption.type = 1;

    // Act and Assert
    assertTrue(engineOption.isNotDefault());
  }

  /**
   * Test {@link EngineOption#isNotDefault()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#spinValue} is forty-two.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#isNotDefault()}
   */
  @Test
  @DisplayName("Test isNotDefault(); given EngineOption (default constructor) spinValue is forty-two; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.isNotDefault()"})
  void testIsNotDefault_givenEngineOptionSpinValueIsFortyTwo_thenReturnTrue() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.spinValue = 42;
    engineOption.type = 0;

    // Act and Assert
    assertTrue(engineOption.isNotDefault());
  }

  /**
   * Test {@link EngineOption#isNotDefault()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is one.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#isNotDefault()}
   */
  @Test
  @DisplayName("Test isNotDefault(); given EngineOption (default constructor) type is one; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.isNotDefault()"})
  void testIsNotDefault_givenEngineOptionTypeIsOne_thenReturnFalse() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 1;

    // Act and Assert
    assertFalse(engineOption.isNotDefault());
  }

  /**
   * Test {@link EngineOption#isNotDefault()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is zero.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#isNotDefault()}
   */
  @Test
  @DisplayName("Test isNotDefault(); given EngineOption (default constructor) type is zero; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.isNotDefault()"})
  void testIsNotDefault_givenEngineOptionTypeIsZero_thenReturnFalse() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 0;

    // Act and Assert
    assertFalse(engineOption.isNotDefault());
  }

  /**
   * Test {@link EngineOption#isNotDefault()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor).</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#isNotDefault()}
   */
  @Test
  @DisplayName("Test isNotDefault(); given EngineOption (default constructor); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.isNotDefault()"})
  void testIsNotDefault_givenEngineOption_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new EngineOption()).isNotDefault());
  }

  /**
   * Test {@link EngineOption#toUciCommand()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is one.</li>
   *   <li>Then return {@code setoption name value false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciCommand()}
   */
  @Test
  @DisplayName("Test toUciCommand(); given EngineOption (default constructor) type is one; then return 'setoption name value false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciCommand()"})
  void testToUciCommand_givenEngineOptionTypeIsOne_thenReturnSetoptionNameValueFalse() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 1;
    engineOption.checkStatusValue = false;

    // Act and Assert
    assertEquals("setoption name  value false", engineOption.toUciCommand());
  }

  /**
   * Test {@link EngineOption#toUciCommand()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is three.</li>
   *   <li>Then return {@code setoption name value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciCommand()}
   */
  @Test
  @DisplayName("Test toUciCommand(); given EngineOption (default constructor) type is three; then return 'setoption name value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciCommand()"})
  void testToUciCommand_givenEngineOptionTypeIsThree_thenReturnSetoptionNameValue() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 3;
    engineOption.checkStatusValue = false;

    // Act and Assert
    assertEquals("setoption name  value ", engineOption.toUciCommand());
  }

  /**
   * Test {@link EngineOption#toUciCommand()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is two.</li>
   *   <li>Then return {@code setoption name value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciCommand()}
   */
  @Test
  @DisplayName("Test toUciCommand(); given EngineOption (default constructor) type is two; then return 'setoption name value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciCommand()"})
  void testToUciCommand_givenEngineOptionTypeIsTwo_thenReturnSetoptionNameValue() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 2;
    engineOption.checkStatusValue = false;

    // Act and Assert
    assertEquals("setoption name  value ", engineOption.toUciCommand());
  }

  /**
   * Test {@link EngineOption#toUciCommand()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is zero.</li>
   *   <li>Then return {@code setoption name value 0}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciCommand()}
   */
  @Test
  @DisplayName("Test toUciCommand(); given EngineOption (default constructor) type is zero; then return 'setoption name value 0'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciCommand()"})
  void testToUciCommand_givenEngineOptionTypeIsZero_thenReturnSetoptionNameValue0() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 0;
    engineOption.checkStatusValue = false;

    // Act and Assert
    assertEquals("setoption name  value 0", engineOption.toUciCommand());
  }

  /**
   * Test {@link EngineOption#toUciCommand()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor).</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciCommand()}
   */
  @Test
  @DisplayName("Test toUciCommand(); given EngineOption (default constructor); then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciCommand()"})
  void testToUciCommand_givenEngineOption_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", (new EngineOption()).toUciCommand());
  }

  /**
   * Test {@link EngineOption#toUciCommand()}.
   * <ul>
   *   <li>Then return {@code setoption name value true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciCommand()}
   */
  @Test
  @DisplayName("Test toUciCommand(); then return 'setoption name value true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciCommand()"})
  void testToUciCommand_thenReturnSetoptionNameValueTrue() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 1;
    engineOption.checkStatusValue = true;

    // Act and Assert
    assertEquals("setoption name  value true", engineOption.toUciCommand());
  }

  /**
   * Test {@link EngineOption#parseUciOptionString(String)}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#name} is {@code option name}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#parseUciOptionString(String)}
   */
  @Test
  @DisplayName("Test parseUciOptionString(String); given EngineOption (default constructor) name is 'option name'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.parseUciOptionString(String)"})
  void testParseUciOptionString_givenEngineOptionNameIsOptionName_thenReturnTrue() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.name = "option name";
    engineOption.type = 0;

    // Act and Assert
    assertEquals(0, engineOption.type);
    assertTrue(engineOption.parseUciOptionString("option name"));
  }

  /**
   * Test {@link EngineOption#parseUciOptionString(String)}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor) {@link EngineOption#type} is minus one.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#parseUciOptionString(String)}
   */
  @Test
  @DisplayName("Test parseUciOptionString(String); given EngineOption (default constructor) type is minus one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.parseUciOptionString(String)"})
  void testParseUciOptionString_givenEngineOptionTypeIsMinusOne() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.name = "option name";
    engineOption.type = -1;

    // Act and Assert
    assertEquals(-1, engineOption.type);
    assertFalse(engineOption.parseUciOptionString("option name"));
  }

  /**
   * Test {@link EngineOption#parseUciOptionString(String)}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor).</li>
   *   <li>When {@code Option String}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#parseUciOptionString(String)}
   */
  @Test
  @DisplayName("Test parseUciOptionString(String); given EngineOption (default constructor); when 'Option String'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.parseUciOptionString(String)"})
  void testParseUciOptionString_givenEngineOption_whenOptionString() {
    // Arrange
    EngineOption engineOption = new EngineOption();

    // Act and Assert
    assertEquals(-1, engineOption.type);
    assertFalse(engineOption.parseUciOptionString("Option String"));
  }

  /**
   * Test {@link EngineOption#parseUciOptionString(String)}.
   * <ul>
   *   <li>When {@code option name}.</li>
   *   <li>Then {@link EngineOption} (default constructor) {@link EngineOption#type} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#parseUciOptionString(String)}
   */
  @Test
  @DisplayName("Test parseUciOptionString(String); when 'option name'; then EngineOption (default constructor) type is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.parseUciOptionString(String)"})
  void testParseUciOptionString_whenOptionName_thenEngineOptionTypeIsZero() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.name = "";
    engineOption.type = 0;

    // Act and Assert
    assertEquals(0, engineOption.type);
    assertFalse(engineOption.parseUciOptionString("option name"));
  }

  /**
   * Test {@link EngineOption#parseUciOptionString(String)}.
   * <ul>
   *   <li>When {@code option nametype spin}.</li>
   *   <li>Then {@link EngineOption} (default constructor) {@link EngineOption#type} is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#parseUciOptionString(String)}
   */
  @Test
  @DisplayName("Test parseUciOptionString(String); when 'option nametype spin'; then EngineOption (default constructor) type is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EngineOption.parseUciOptionString(String)"})
  void testParseUciOptionString_whenOptionNametypeSpin_thenEngineOptionTypeIsZero() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.name = "";
    engineOption.type = 0;

    // Act and Assert
    assertEquals(0, engineOption.type);
    assertFalse(engineOption.parseUciOptionString("option nametype spin"));
  }

  /**
   * Test {@link EngineOption#toUciOptionString()}.
   * <ul>
   *   <li>Given {@link EngineOption} (default constructor).</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciOptionString()}
   */
  @Test
  @DisplayName("Test toUciOptionString(); given EngineOption (default constructor); then return empty string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciOptionString()"})
  void testToUciOptionString_givenEngineOption_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", (new EngineOption()).toUciOptionString());
  }

  /**
   * Test {@link EngineOption#toUciOptionString()}.
   * <ul>
   *   <li>Then return {@code option name type check default false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciOptionString()}
   */
  @Test
  @DisplayName("Test toUciOptionString(); then return 'option name type check default false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciOptionString()"})
  void testToUciOptionString_thenReturnOptionNameTypeCheckDefaultFalse() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 1;

    // Act and Assert
    assertEquals("option name  type check default false", engineOption.toUciOptionString());
  }

  /**
   * Test {@link EngineOption#toUciOptionString()}.
   * <ul>
   *   <li>Then return {@code option name type combo default}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciOptionString()}
   */
  @Test
  @DisplayName("Test toUciOptionString(); then return 'option name type combo default'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciOptionString()"})
  void testToUciOptionString_thenReturnOptionNameTypeComboDefault() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 2;

    // Act and Assert
    assertEquals("option name  type combo default ", engineOption.toUciOptionString());
  }

  /**
   * Test {@link EngineOption#toUciOptionString()}.
   * <ul>
   *   <li>Then return {@code option name type spin default 0 min 0 max 0}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciOptionString()}
   */
  @Test
  @DisplayName("Test toUciOptionString(); then return 'option name type spin default 0 min 0 max 0'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciOptionString()"})
  void testToUciOptionString_thenReturnOptionNameTypeSpinDefault0Min0Max0() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 0;

    // Act and Assert
    assertEquals("option name  type spin default 0 min 0 max 0", engineOption.toUciOptionString());
  }

  /**
   * Test {@link EngineOption#toUciOptionString()}.
   * <ul>
   *   <li>Then return {@code option name type string default}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EngineOption#toUciOptionString()}
   */
  @Test
  @DisplayName("Test toUciOptionString(); then return 'option name type string default'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String EngineOption.toUciOptionString()"})
  void testToUciOptionString_thenReturnOptionNameTypeStringDefault() {
    // Arrange
    EngineOption engineOption = new EngineOption();
    engineOption.type = 3;

    // Act and Assert
    assertEquals("option name  type string default ", engineOption.toUciOptionString());
  }

  /**
   * Test new {@link EngineOption} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link EngineOption}
   */
  @Test
  @DisplayName("Test new EngineOption (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EngineOption.<init>()"})
  void testNewEngineOption() {
    // Arrange and Act
    EngineOption actualEngineOption = new EngineOption();

    // Assert
    assertEquals("", actualEngineOption.comboDefault);
    assertEquals("", actualEngineOption.comboValue);
    assertEquals("", actualEngineOption.name);
    assertEquals("", actualEngineOption.stringDefault);
    assertEquals("", actualEngineOption.stringValue);
    assertEquals(-1, actualEngineOption.type);
    assertEquals(0, actualEngineOption.spinDefault);
    assertEquals(0, actualEngineOption.spinMax);
    assertEquals(0, actualEngineOption.spinMin);
    assertEquals(0, actualEngineOption.spinValue);
    assertFalse(actualEngineOption.checkStatusDefault);
    assertFalse(actualEngineOption.checkStatusValue);
    assertTrue(actualEngineOption.comboValues.isEmpty());
    assertTrue(actualEngineOption.isNotDefault());
  }
}
