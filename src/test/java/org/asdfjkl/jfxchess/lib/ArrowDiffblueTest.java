package org.asdfjkl.jfxchess.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArrowDiffblueTest {
  /**
   * Test {@link Arrow#equals(Object)}, and {@link Object#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Arrow arrow = new Arrow();
    Arrow arrow2 = new Arrow();

    // Act and Assert
    assertEquals(arrow, arrow2);
    int notExpectedHashCodeResult = arrow.hashCode();
    assertNotEquals(notExpectedHashCodeResult, arrow2.hashCode());
  }

  /**
   * Test {@link Arrow#equals(Object)}, and {@link Object#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Arrow arrow = new Arrow();

    // Act and Assert
    assertEquals(arrow, arrow);
    int expectedHashCodeResult = arrow.hashCode();
    assertEquals(expectedHashCodeResult, arrow.hashCode());
  }

  /**
   * Test {@link Arrow#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Arrow(), 1);
  }

  /**
   * Test {@link Arrow#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Arrow arrow = new Arrow();
    arrow.xFrom = 1;

    // Act and Assert
    assertNotEquals(arrow, new Arrow());
  }

  /**
   * Test {@link Arrow#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Arrow arrow = new Arrow();
    arrow.xTo = 1;

    // Act and Assert
    assertNotEquals(arrow, new Arrow());
  }

  /**
   * Test {@link Arrow#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Arrow arrow = new Arrow();
    arrow.yFrom = 1;

    // Act and Assert
    assertNotEquals(arrow, new Arrow());
  }

  /**
   * Test {@link Arrow#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Arrow arrow = new Arrow();
    arrow.yTo = 1;

    // Act and Assert
    assertNotEquals(arrow, new Arrow());
  }

  /**
   * Test {@link Arrow#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Arrow(), null);
  }

  /**
   * Test {@link Arrow#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Arrow#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Arrow.equals(Object)"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Arrow(), "Different type to Arrow");
  }

  /**
   * Test new {@link Arrow} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link Arrow}
   */
  @Test
  @DisplayName("Test new Arrow (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Arrow.<init>()"})
  void testNewArrow() {
    // Arrange and Act
    Arrow actualArrow = new Arrow();

    // Assert
    assertEquals(0, actualArrow.xFrom);
    assertEquals(0, actualArrow.xTo);
    assertEquals(0, actualArrow.yFrom);
    assertEquals(0, actualArrow.yTo);
  }
}
