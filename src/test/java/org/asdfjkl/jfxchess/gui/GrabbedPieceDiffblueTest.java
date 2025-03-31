package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.asdfjkl.jfxchess.gui.GrabbedPiece.GrabbedFrom;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GrabbedPieceDiffblueTest {
  /**
   * Test new {@link GrabbedPiece} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link GrabbedPiece}
   */
  @Test
  @DisplayName("Test new GrabbedPiece (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GrabbedPiece.<init>()"})
  void testNewGrabbedPiece() {
    // Arrange and Act
    GrabbedPiece actualGrabbedPiece = new GrabbedPiece();

    // Assert
    assertEquals(0, actualGrabbedPiece.getPiece());
    assertEquals(0.0d, actualGrabbedPiece.getCurrentXLocation());
    assertEquals(0.0d, actualGrabbedPiece.getCurrentYLocation());
    assertEquals(GrabbedFrom.Board, actualGrabbedPiece.grabbedFrom);
    assertFalse(actualGrabbedPiece.getDrawImage());
    assertFalse(actualGrabbedPiece.isGrabbed());
  }

  /**
   * Test {@link GrabbedPiece#grab(int, int, double, double, int)} with {@code boardX}, {@code boardY}, {@code currentXLocation}, {@code currentYLocation}, {@code pieceType}.
   * <p>
   * Method under test: {@link GrabbedPiece#grab(int, int, double, double, int)}
   */
  @Test
  @DisplayName("Test grab(int, int, double, double, int) with 'boardX', 'boardY', 'currentXLocation', 'currentYLocation', 'pieceType'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GrabbedPiece.grab(int, int, double, double, int)"})
  void testGrabWithBoardXBoardYCurrentXLocationCurrentYLocationPieceType() {
    // Arrange
    GrabbedPiece grabbedPiece = new GrabbedPiece();

    // Act
    grabbedPiece.grab(1, 1, 10.0d, 10.0d, 1);

    // Assert
    assertEquals(1, grabbedPiece.getPiece());
    assertEquals(10.0d, grabbedPiece.getCurrentXLocation());
    assertEquals(10.0d, grabbedPiece.getCurrentYLocation());
    assertTrue(grabbedPiece.getDrawImage());
    assertTrue(grabbedPiece.isGrabbed());
  }

  /**
   * Test {@link GrabbedPiece#grab(double, double, int)} with {@code currentXLocation}, {@code currentYLocation}, {@code pieceType}.
   * <p>
   * Method under test: {@link GrabbedPiece#grab(double, double, int)}
   */
  @Test
  @DisplayName("Test grab(double, double, int) with 'currentXLocation', 'currentYLocation', 'pieceType'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GrabbedPiece.grab(double, double, int)"})
  void testGrabWithCurrentXLocationCurrentYLocationPieceType() {
    // Arrange
    GrabbedPiece grabbedPiece = new GrabbedPiece();

    // Act
    grabbedPiece.grab(10.0d, 10.0d, 1);

    // Assert
    assertEquals(1, grabbedPiece.getPiece());
    assertEquals(10.0d, grabbedPiece.getCurrentXLocation());
    assertEquals(10.0d, grabbedPiece.getCurrentYLocation());
    assertEquals(GrabbedFrom.PieceSelector, grabbedPiece.grabbedFrom);
    assertTrue(grabbedPiece.getDrawImage());
    assertTrue(grabbedPiece.isGrabbed());
  }

  /**
   * Test {@link GrabbedPiece#isGrabbed()}.
   * <ul>
   *   <li>Given {@link GrabbedPiece} (default constructor) Piece is one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrabbedPiece#isGrabbed()}
   */
  @Test
  @DisplayName("Test isGrabbed(); given GrabbedPiece (default constructor) Piece is one; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GrabbedPiece.isGrabbed()"})
  void testIsGrabbed_givenGrabbedPiecePieceIsOne_thenReturnTrue() {
    // Arrange
    GrabbedPiece grabbedPiece = new GrabbedPiece();
    grabbedPiece.setPiece(1);

    // Act and Assert
    assertTrue(grabbedPiece.isGrabbed());
  }

  /**
   * Test {@link GrabbedPiece#isGrabbed()}.
   * <ul>
   *   <li>Given {@link GrabbedPiece} (default constructor).</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GrabbedPiece#isGrabbed()}
   */
  @Test
  @DisplayName("Test isGrabbed(); given GrabbedPiece (default constructor); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean GrabbedPiece.isGrabbed()"})
  void testIsGrabbed_givenGrabbedPiece_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new GrabbedPiece()).isGrabbed());
  }

  /**
   * Test {@link GrabbedPiece#sourceSquareX()}.
   * <p>
   * Method under test: {@link GrabbedPiece#sourceSquareX()}
   */
  @Test
  @DisplayName("Test sourceSquareX()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int GrabbedPiece.sourceSquareX()"})
  void testSourceSquareX() {
    // Arrange, Act and Assert
    assertEquals(-1, (new GrabbedPiece()).sourceSquareX());
  }

  /**
   * Test {@link GrabbedPiece#sourceSquareY()}.
   * <p>
   * Method under test: {@link GrabbedPiece#sourceSquareY()}
   */
  @Test
  @DisplayName("Test sourceSquareY()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int GrabbedPiece.sourceSquareY()"})
  void testSourceSquareY() {
    // Arrange, Act and Assert
    assertEquals(-1, (new GrabbedPiece()).sourceSquareY());
  }

  /**
   * Test {@link GrabbedPiece#rightClickPiece()}.
   * <p>
   * Method under test: {@link GrabbedPiece#rightClickPiece()}
   */
  @Test
  @DisplayName("Test rightClickPiece()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int GrabbedPiece.rightClickPiece()"})
  void testRightClickPiece() {
    // Arrange, Act and Assert
    assertEquals(0, (new GrabbedPiece()).rightClickPiece());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GrabbedPiece#setCurrentXLocation(double)}
   *   <li>{@link GrabbedPiece#setCurrentYLocation(double)}
   *   <li>{@link GrabbedPiece#setDrawImage(boolean)}
   *   <li>{@link GrabbedPiece#setPiece(int)}
   *   <li>{@link GrabbedPiece#setRightClickPiece(int)}
   *   <li>{@link GrabbedPiece#getCurrentXLocation()}
   *   <li>{@link GrabbedPiece#getCurrentYLocation()}
   *   <li>{@link GrabbedPiece#getDrawImage()}
   *   <li>{@link GrabbedPiece#getPiece()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"double GrabbedPiece.getCurrentXLocation()", "double GrabbedPiece.getCurrentYLocation()",
      "boolean GrabbedPiece.getDrawImage()", "int GrabbedPiece.getPiece()",
      "void GrabbedPiece.setCurrentXLocation(double)", "void GrabbedPiece.setCurrentYLocation(double)",
      "void GrabbedPiece.setDrawImage(boolean)", "void GrabbedPiece.setPiece(int)",
      "void GrabbedPiece.setRightClickPiece(int)"})
  void testGettersAndSetters() {
    // Arrange
    GrabbedPiece grabbedPiece = new GrabbedPiece();

    // Act
    grabbedPiece.setCurrentXLocation(10.0d);
    grabbedPiece.setCurrentYLocation(10.0d);
    grabbedPiece.setDrawImage(true);
    grabbedPiece.setPiece(1);
    grabbedPiece.setRightClickPiece(1);
    double actualCurrentXLocation = grabbedPiece.getCurrentXLocation();
    double actualCurrentYLocation = grabbedPiece.getCurrentYLocation();
    boolean actualDrawImage = grabbedPiece.getDrawImage();

    // Assert
    assertEquals(1, grabbedPiece.getPiece());
    assertEquals(10.0d, actualCurrentXLocation);
    assertEquals(10.0d, actualCurrentYLocation);
    assertTrue(actualDrawImage);
  }
}
