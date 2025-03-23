package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PieceImageProviderDiffblueTest {
  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When five.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when five; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenFive_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(5, 3, 129));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When four.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when four; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenFour_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(4, 3, -1));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when minus one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(1, 3, -1));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when minus one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(129, 3, -1));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When one hundred thirty-one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when one hundred thirty-one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenOneHundredThirtyOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(131, 3, 129));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When one hundred thirty-three.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when one hundred thirty-three; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenOneHundredThirtyThree_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(133, 3, 129));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When one hundred thirty-two.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when one hundred thirty-two; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenOneHundredThirtyTwo_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(132, 3, -1));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When one hundred thirty.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when one hundred thirty; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenOneHundredThirty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(130, 3, -1));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When one hundred twenty-nine.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when one hundred twenty-nine; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenOneHundredTwentyNine_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(2, 3, 129));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when three; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenThree_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(3, 3, 3));
  }

  /**
   * Test {@link PieceImageProvider#getImage(int, int, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PieceImageProvider#getImage(int, int, int)}
   */
  @Test
  @DisplayName("Test getImage(int, int, int); when zero; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"javafx.scene.image.Image PieceImageProvider.getImage(int, int, int)"})
  void testGetImage_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new PieceImageProvider()).getImage(0, 3, 1));
  }

  /**
   * Test new {@link PieceImageProvider} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link PieceImageProvider}
   */
  @Test
  @DisplayName("Test new PieceImageProvider (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PieceImageProvider.<init>()"})
  void testNewPieceImageProvider() {
    // Arrange and Act
    PieceImageProvider actualPieceImageProvider = new PieceImageProvider();

    // Assert
    assertTrue(actualPieceImageProvider.blackBishopsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.blackBishopsOld.isEmpty());
    assertTrue(actualPieceImageProvider.blackBishopsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.blackKingsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.blackKingsOld.isEmpty());
    assertTrue(actualPieceImageProvider.blackKingsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.blackKnightsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.blackKnightsOld.isEmpty());
    assertTrue(actualPieceImageProvider.blackKnightsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.blackPawnsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.blackPawnsOld.isEmpty());
    assertTrue(actualPieceImageProvider.blackPawnsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.blackQueensMerida.isEmpty());
    assertTrue(actualPieceImageProvider.blackQueensOld.isEmpty());
    assertTrue(actualPieceImageProvider.blackQueensUscf.isEmpty());
    assertTrue(actualPieceImageProvider.blackRooksMerida.isEmpty());
    assertTrue(actualPieceImageProvider.blackRooksOld.isEmpty());
    assertTrue(actualPieceImageProvider.blackRooksUscf.isEmpty());
    assertTrue(actualPieceImageProvider.whiteBishopsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.whiteBishopsOld.isEmpty());
    assertTrue(actualPieceImageProvider.whiteBishopsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.whiteKingsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.whiteKingsOld.isEmpty());
    assertTrue(actualPieceImageProvider.whiteKingsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.whiteKnightsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.whiteKnightsOld.isEmpty());
    assertTrue(actualPieceImageProvider.whiteKnightsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.whitePawnsMerida.isEmpty());
    assertTrue(actualPieceImageProvider.whitePawnsOld.isEmpty());
    assertTrue(actualPieceImageProvider.whitePawnsUscf.isEmpty());
    assertTrue(actualPieceImageProvider.whiteQueensMerida.isEmpty());
    assertTrue(actualPieceImageProvider.whiteQueensOld.isEmpty());
    assertTrue(actualPieceImageProvider.whiteQueensUscf.isEmpty());
    assertTrue(actualPieceImageProvider.whiteRooksMerida.isEmpty());
    assertTrue(actualPieceImageProvider.whiteRooksOld.isEmpty());
    assertTrue(actualPieceImageProvider.whiteRooksUscf.isEmpty());
  }
}
