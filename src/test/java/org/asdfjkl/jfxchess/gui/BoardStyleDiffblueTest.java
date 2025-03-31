package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BoardStyleDiffblueTest {
  /**
   * Test {@link BoardStyle#setColorStyle(int)}.
   * <ul>
   *   <li>Given {@link BoardStyle} (default constructor).</li>
   *   <li>When one.</li>
   *   <li>Then {@link BoardStyle} (default constructor) ColorStyle is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoardStyle#setColorStyle(int)}
   */
  @Test
  @DisplayName("Test setColorStyle(int); given BoardStyle (default constructor); when one; then BoardStyle (default constructor) ColorStyle is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoardStyle.setColorStyle(int)"})
  void testSetColorStyle_givenBoardStyle_whenOne_thenBoardStyleColorStyleIsOne() {
    // Arrange
    BoardStyle boardStyle = new BoardStyle();

    // Act
    boardStyle.setColorStyle(1);

    // Assert
    assertEquals(1, boardStyle.getColorStyle());
    Color expectedBorderColor = boardStyle.BORDER_BROWN;
    assertSame(expectedBorderColor, boardStyle.getBorderColor());
    Color expectedCoordinateColor = boardStyle.COORDINATE_COLOR_BROWN;
    assertSame(expectedCoordinateColor, boardStyle.getCoordinateColor());
    Color expectedDarkSquareColor = boardStyle.DARK_SQUARE_BROWN;
    assertSame(expectedDarkSquareColor, boardStyle.getDarkSquareColor());
    Color expectedLightSquareColor = boardStyle.LIGHT_SQUARE_BROWN;
    assertSame(expectedLightSquareColor, boardStyle.getLightSquareColor());
  }

  /**
   * Test {@link BoardStyle#setColorStyle(int)}.
   * <ul>
   *   <li>When two.</li>
   *   <li>Then {@link BoardStyle} (default constructor) ColorStyle is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoardStyle#setColorStyle(int)}
   */
  @Test
  @DisplayName("Test setColorStyle(int); when two; then BoardStyle (default constructor) ColorStyle is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoardStyle.setColorStyle(int)"})
  void testSetColorStyle_whenTwo_thenBoardStyleColorStyleIsTwo() {
    // Arrange
    BoardStyle boardStyle = new BoardStyle();
    boardStyle.setPieceStyle(1);

    // Act
    boardStyle.setColorStyle(2);

    // Assert
    assertEquals(2, boardStyle.getColorStyle());
    Color expectedBorderColor = boardStyle.BORDER_GREEN;
    assertSame(expectedBorderColor, boardStyle.getBorderColor());
    Color expectedCoordinateColor = boardStyle.COORDINATE_COLOR_GREEN;
    assertSame(expectedCoordinateColor, boardStyle.getCoordinateColor());
    Color expectedDarkSquareColor = boardStyle.DARK_SQUARE_GREEN;
    assertSame(expectedDarkSquareColor, boardStyle.getDarkSquareColor());
    Color expectedLightSquareColor = boardStyle.LIGHT_SQUARE_GREEN;
    assertSame(expectedLightSquareColor, boardStyle.getLightSquareColor());
  }

  /**
   * Test {@link BoardStyle#setColorStyle(int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then {@link BoardStyle} (default constructor) ColorStyle is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoardStyle#setColorStyle(int)}
   */
  @Test
  @DisplayName("Test setColorStyle(int); when zero; then BoardStyle (default constructor) ColorStyle is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoardStyle.setColorStyle(int)"})
  void testSetColorStyle_whenZero_thenBoardStyleColorStyleIsZero() {
    // Arrange
    BoardStyle boardStyle = new BoardStyle();
    boardStyle.setPieceStyle(1);

    // Act
    boardStyle.setColorStyle(0);

    // Assert that nothing has changed
    assertEquals(0, boardStyle.getColorStyle());
    Color expectedBorderColor = boardStyle.BORDER_BLUE;
    assertSame(expectedBorderColor, boardStyle.getBorderColor());
    Color expectedCoordinateColor = boardStyle.COORDINATE_COLOR_BLUE;
    assertSame(expectedCoordinateColor, boardStyle.getCoordinateColor());
    Color expectedDarkSquareColor = boardStyle.DARK_SQUARE_BLUE;
    assertSame(expectedDarkSquareColor, boardStyle.getDarkSquareColor());
    Color expectedLightSquareColor = boardStyle.LIGHT_SQUARE_BLUE;
    assertSame(expectedLightSquareColor, boardStyle.getLightSquareColor());
  }

  /**
   * Test {@link BoardStyle#setPieceStyle(int)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then {@link BoardStyle} (default constructor) PieceStyle is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoardStyle#setPieceStyle(int)}
   */
  @Test
  @DisplayName("Test setPieceStyle(int); when minus one; then BoardStyle (default constructor) PieceStyle is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoardStyle.setPieceStyle(int)"})
  void testSetPieceStyle_whenMinusOne_thenBoardStylePieceStyleIsZero() {
    // Arrange
    BoardStyle boardStyle = new BoardStyle();

    // Act
    boardStyle.setPieceStyle(-1);

    // Assert that nothing has changed
    assertEquals(0, boardStyle.getPieceStyle());
  }

  /**
   * Test {@link BoardStyle#setPieceStyle(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then {@link BoardStyle} (default constructor) PieceStyle is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoardStyle#setPieceStyle(int)}
   */
  @Test
  @DisplayName("Test setPieceStyle(int); when one; then BoardStyle (default constructor) PieceStyle is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoardStyle.setPieceStyle(int)"})
  void testSetPieceStyle_whenOne_thenBoardStylePieceStyleIsOne() {
    // Arrange
    BoardStyle boardStyle = new BoardStyle();

    // Act
    boardStyle.setPieceStyle(1);

    // Assert
    assertEquals(1, boardStyle.getPieceStyle());
  }

  /**
   * Test {@link BoardStyle#setPieceStyle(int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then {@link BoardStyle} (default constructor) PieceStyle is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link BoardStyle#setPieceStyle(int)}
   */
  @Test
  @DisplayName("Test setPieceStyle(int); when three; then BoardStyle (default constructor) PieceStyle is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoardStyle.setPieceStyle(int)"})
  void testSetPieceStyle_whenThree_thenBoardStylePieceStyleIsZero() {
    // Arrange
    BoardStyle boardStyle = new BoardStyle();

    // Act
    boardStyle.setPieceStyle(3);

    // Assert that nothing has changed
    assertEquals(0, boardStyle.getPieceStyle());
  }

  /**
   * Test new {@link BoardStyle} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link BoardStyle}
   */
  @Test
  @DisplayName("Test new BoardStyle (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void BoardStyle.<init>()"})
  void testNewBoardStyle() {
    // Arrange and Act
    BoardStyle actualBoardStyle = new BoardStyle();

    // Assert
    assertEquals(0, actualBoardStyle.getColorStyle());
    assertEquals(0, actualBoardStyle.getPieceStyle());
    Color expectedBorderColor = actualBoardStyle.BORDER_BLUE;
    assertSame(expectedBorderColor, actualBoardStyle.getBorderColor());
    Color expectedCoordinateColor = actualBoardStyle.COORDINATE_COLOR_BLUE;
    assertSame(expectedCoordinateColor, actualBoardStyle.getCoordinateColor());
    Color expectedDarkSquareColor = actualBoardStyle.DARK_SQUARE_BLUE;
    assertSame(expectedDarkSquareColor, actualBoardStyle.getDarkSquareColor());
    Color expectedLightSquareColor = actualBoardStyle.LIGHT_SQUARE_BLUE;
    assertSame(expectedLightSquareColor, actualBoardStyle.getLightSquareColor());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BoardStyle#getBorderColor()}
   *   <li>{@link BoardStyle#getCoordinateColor()}
   *   <li>{@link BoardStyle#getDarkSquareColor()}
   *   <li>{@link BoardStyle#getLightSquareColor()}
   *   <li>{@link BoardStyle#getPieceStyle()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Color BoardStyle.getBorderColor()", "Color BoardStyle.getCoordinateColor()",
      "Color BoardStyle.getDarkSquareColor()", "Color BoardStyle.getLightSquareColor()",
      "int BoardStyle.getPieceStyle()"})
  void testGettersAndSetters() {
    // Arrange
    BoardStyle boardStyle = new BoardStyle();

    // Act
    Color actualBorderColor = boardStyle.getBorderColor();
    Color actualCoordinateColor = boardStyle.getCoordinateColor();
    Color actualDarkSquareColor = boardStyle.getDarkSquareColor();
    Color actualLightSquareColor = boardStyle.getLightSquareColor();

    // Assert
    assertEquals(0, boardStyle.getPieceStyle());
    assertSame(boardStyle.BORDER_BLUE, actualBorderColor);
    assertSame(boardStyle.COORDINATE_COLOR_BLUE, actualCoordinateColor);
    assertSame(boardStyle.DARK_SQUARE_BLUE, actualDarkSquareColor);
    assertSame(boardStyle.LIGHT_SQUARE_BLUE, actualLightSquareColor);
  }

  /**
   * Test {@link BoardStyle#getColorStyle()}.
   * <p>
   * Method under test: {@link BoardStyle#getColorStyle()}
   */
  @Test
  @DisplayName("Test getColorStyle()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int BoardStyle.getColorStyle()"})
  void testGetColorStyle() {
    // Arrange, Act and Assert
    assertEquals(0, (new BoardStyle()).getColorStyle());
  }
}
