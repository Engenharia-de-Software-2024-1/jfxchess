package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ScreenGeometryDiffblueTest {
  /**
   * Test {@link ScreenGeometry#ScreenGeometry(double, double, double, double, double, double)}.
   * <p>
   * Method under test: {@link ScreenGeometry#ScreenGeometry(double, double, double, double, double, double)}
   */
  @Test
  @DisplayName("Test new ScreenGeometry(double, double, double, double, double, double)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ScreenGeometry.<init>(double, double, double, double, double, double)"})
  void testNewScreenGeometry() {
    // Arrange and Act
    ScreenGeometry actualScreenGeometry = new ScreenGeometry(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualScreenGeometry.height);
    assertEquals(10.0d, actualScreenGeometry.mainDividerRatio);
    assertEquals(10.0d, actualScreenGeometry.moveDividerRatio);
    assertEquals(10.0d, actualScreenGeometry.width);
    assertEquals(10.0d, actualScreenGeometry.xOffset);
    assertEquals(10.0d, actualScreenGeometry.yOffset);
    assertFalse(actualScreenGeometry.isValid());
  }

  /**
   * Test {@link ScreenGeometry#isValid()}.
   * <p>
   * Method under test: {@link ScreenGeometry#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ScreenGeometry.isValid()"})
  void testIsValid() {
    // Arrange, Act and Assert
    assertFalse((new ScreenGeometry(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d)).isValid());
  }

  /**
   * Test {@link ScreenGeometry#isValid()}.
   * <p>
   * Method under test: {@link ScreenGeometry#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ScreenGeometry.isValid()"})
  void testIsValid2() {
    // Arrange, Act and Assert
    assertFalse((new ScreenGeometry(-0.5d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d)).isValid());
  }

  /**
   * Test {@link ScreenGeometry#isValid()}.
   * <p>
   * Method under test: {@link ScreenGeometry#isValid()}
   */
  @Test
  @DisplayName("Test isValid()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ScreenGeometry.isValid()"})
  void testIsValid3() {
    // Arrange, Act and Assert
    assertFalse((new ScreenGeometry(10.0d, -0.5d, 10.0d, 10.0d, 10.0d, 10.0d)).isValid());
  }
}
