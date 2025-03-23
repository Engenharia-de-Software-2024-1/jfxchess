package org.asdfjkl.jfxchess.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BoardDiffblueTest {
  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code A}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'A'; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenA_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, Board.alphaToPos('A'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code B}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'B'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenB_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, Board.alphaToPos('B'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code C}.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'C'; then return two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenC_thenReturnTwo() {
    // Arrange, Act and Assert
    assertEquals(2, Board.alphaToPos('C'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code D}.</li>
   *   <li>Then return three.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'D'; then return three")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenD_thenReturnThree() {
    // Arrange, Act and Assert
    assertEquals(3, Board.alphaToPos('D'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code E}.</li>
   *   <li>Then return four.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'E'; then return four")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenE_thenReturnFour() {
    // Arrange, Act and Assert
    assertEquals(4, Board.alphaToPos('E'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code F}.</li>
   *   <li>Then return five.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'F'; then return five")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenF_thenReturnFive() {
    // Arrange, Act and Assert
    assertEquals(5, Board.alphaToPos('F'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code G}.</li>
   *   <li>Then return six.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'G'; then return six")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenG_thenReturnSix() {
    // Arrange, Act and Assert
    assertEquals(6, Board.alphaToPos('G'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When {@code H}.</li>
   *   <li>Then return seven.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when 'H'; then return seven")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenH_thenReturnSeven() {
    // Arrange, Act and Assert
    assertEquals(7, Board.alphaToPos('H'));
  }

  /**
   * Test {@link Board#alphaToPos(char)}.
   * <ul>
   *   <li>When null.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#alphaToPos(char)}
   */
  @Test
  @DisplayName("Test alphaToPos(char); when null; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.alphaToPos(char)"})
  void testAlphaToPos_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Board.alphaToPos('\u0000'));
  }

  /**
   * Test {@link Board#Board()}.
   * <p>
   * Method under test: {@link Board#Board()}
   */
  @Test
  @DisplayName("Test new Board()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.<init>()"})
  void testNewBoard() {
    // Arrange and Act
    Board actualBoard = new Board();

    // Assert
    assertEquals("-", actualBoard.getEnPassantSquare());
    assertEquals(-516182592762444535L, actualBoard.getZobrist());
    assertEquals(0, actualBoard.getEpTarget());
    assertEquals(0, actualBoard.halfmoveClock);
    assertEquals(0L, actualBoard.getPositionHash());
    assertEquals(1, actualBoard.fullmoveNumber);
    assertFalse(actualBoard.isCheck());
    assertFalse(actualBoard.isUndoAvailable());
    assertFalse(actualBoard.turn);
    assertTrue(actualBoard.isBlackKingCastleLost());
    assertTrue(actualBoard.isBlackQueenCastleLost());
    assertTrue(actualBoard.isInsufficientMaterial());
    assertTrue(actualBoard.isWhiteKingCastleLost());
    assertTrue(actualBoard.isWhiteQueenCastleLost());
  }

  /**
   * Test {@link Board#Board(String)}.
   * <p>
   * Method under test: {@link Board#Board(String)}
   */
  @Test
  @DisplayName("Test new Board(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.<init>(String)"})
  void testNewBoard2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new Board("Fen"));
  }

  /**
   * Test {@link Board#Board(boolean)}.
   * <ul>
   *   <li>When {@code false}.</li>
   *   <li>Then return Zobrist is {@code -516182592762444535}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#Board(boolean)}
   */
  @Test
  @DisplayName("Test new Board(boolean); when 'false'; then return Zobrist is '-516182592762444535'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.<init>(boolean)"})
  void testNewBoard_whenFalse_thenReturnZobristIs516182592762444535() {
    // Arrange and Act
    Board actualBoard = new Board(false);

    // Assert
    assertEquals(-516182592762444535L, actualBoard.getZobrist());
    assertEquals(0L, actualBoard.getPositionHash());
    assertTrue(actualBoard.isBlackKingCastleLost());
    assertTrue(actualBoard.isBlackQueenCastleLost());
    assertTrue(actualBoard.isInsufficientMaterial());
    assertTrue(actualBoard.isWhiteKingCastleLost());
    assertTrue(actualBoard.isWhiteQueenCastleLost());
  }

  /**
   * Test {@link Board#Board(boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   *   <li>Then return PositionHash is {@code -4190708195696060804}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#Board(boolean)}
   */
  @Test
  @DisplayName("Test new Board(boolean); when 'true'; then return PositionHash is '-4190708195696060804'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.<init>(boolean)"})
  void testNewBoard_whenTrue_thenReturnPositionHashIs4190708195696060804() {
    // Arrange and Act
    Board actualBoard = new Board(true);

    // Assert
    assertEquals(-4190708195696060804L, actualBoard.getPositionHash());
    assertEquals(5060803636482931868L, actualBoard.getZobrist());
    assertFalse(actualBoard.isBlackKingCastleLost());
    assertFalse(actualBoard.isBlackQueenCastleLost());
    assertFalse(actualBoard.isInsufficientMaterial());
    assertFalse(actualBoard.isWhiteKingCastleLost());
    assertFalse(actualBoard.isWhiteQueenCastleLost());
  }

  /**
   * Test {@link Board#getEnPassantSquare()}.
   * <ul>
   *   <li>Given {@link Board#Board()} EnPassantSquare is {@code 42}.</li>
   *   <li>Then return {@code `2}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#getEnPassantSquare()}
   */
  @Test
  @DisplayName("Test getEnPassantSquare(); given Board() EnPassantSquare is '42'; then return '`2'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.getEnPassantSquare()"})
  void testGetEnPassantSquare_givenBoardEnPassantSquareIs42_thenReturn2() {
    // Arrange
    Board board = new Board();
    board.setEnPassantSquare("42");

    // Act and Assert
    assertEquals("`2", board.getEnPassantSquare());
  }

  /**
   * Test {@link Board#getEnPassantSquare()}.
   * <ul>
   *   <li>Given {@link Board#Board()}.</li>
   *   <li>Then return {@code -}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#getEnPassantSquare()}
   */
  @Test
  @DisplayName("Test getEnPassantSquare(); given Board(); then return '-'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.getEnPassantSquare()"})
  void testGetEnPassantSquare_givenBoard_thenReturnDash() {
    // Arrange, Act and Assert
    assertEquals("-", (new Board()).getEnPassantSquare());
  }

  /**
   * Test {@link Board#getEnPassantSquare()}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#getEnPassantSquare()}
   */
  @Test
  @DisplayName("Test getEnPassantSquare(); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.getEnPassantSquare()"})
  void testGetEnPassantSquare_thenThrowIllegalArgumentException() {
    // Arrange
    Board board = new Board();
    board.setEnPassantSquare("Square Algebraic");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> board.getEnPassantSquare());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Given {@link Board#Board()} CastleBKing is {@code true}.</li>
   *   <li>Then return {@code 8/8/8/8/8/8/8/8 w k - 0 1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); given Board() CastleBKing is 'true'; then return '8/8/8/8/8/8/8/8 w k - 0 1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_givenBoardCastleBKingIsTrue_thenReturn88888888WK01() {
    // Arrange
    Board board = new Board();
    board.setCastleBKing(true);

    // Act and Assert
    assertEquals("8/8/8/8/8/8/8/8 w k - 0 1", board.fen());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Given {@link Board#Board()} CastleBQueen is {@code true}.</li>
   *   <li>Then return {@code 8/8/8/8/8/8/8/8 w q - 0 1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); given Board() CastleBQueen is 'true'; then return '8/8/8/8/8/8/8/8 w q - 0 1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_givenBoardCastleBQueenIsTrue_thenReturn88888888WQ01() {
    // Arrange
    Board board = new Board();
    board.setCastleBQueen(true);

    // Act and Assert
    assertEquals("8/8/8/8/8/8/8/8 w q - 0 1", board.fen());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Given {@link Board#Board()} CastleWKing is {@code true}.</li>
   *   <li>Then return {@code 8/8/8/8/8/8/8/8 w K - 0 1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); given Board() CastleWKing is 'true'; then return '8/8/8/8/8/8/8/8 w K - 0 1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_givenBoardCastleWKingIsTrue_thenReturn88888888WK01() {
    // Arrange
    Board board = new Board();
    board.setCastleWKing(true);

    // Act and Assert
    assertEquals("8/8/8/8/8/8/8/8 w K - 0 1", board.fen());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Given {@link Board#Board()} CastleWQueen is {@code true}.</li>
   *   <li>Then return {@code 8/8/8/8/8/8/8/8 w Q - 0 1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); given Board() CastleWQueen is 'true'; then return '8/8/8/8/8/8/8/8 w Q - 0 1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_givenBoardCastleWQueenIsTrue_thenReturn88888888WQ01() {
    // Arrange
    Board board = new Board();
    board.setCastleWQueen(true);

    // Act and Assert
    assertEquals("8/8/8/8/8/8/8/8 w Q - 0 1", board.fen());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Given {@link Board#Board()} EnPassantSquare is {@code 42}.</li>
   *   <li>Then return {@code 8/8/8/8/8/8/8/8 w - `2 0 1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); given Board() EnPassantSquare is '42'; then return '8/8/8/8/8/8/8/8 w - `2 0 1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_givenBoardEnPassantSquareIs42_thenReturn88888888W201() {
    // Arrange
    Board board = new Board();
    board.setEnPassantSquare("42");

    // Act and Assert
    assertEquals("8/8/8/8/8/8/8/8 w - `2 0 1", board.fen());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Given {@link Board#Board()}.</li>
   *   <li>Then return {@code 8/8/8/8/8/8/8/8 w - - 0 1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); given Board(); then return '8/8/8/8/8/8/8/8 w - - 0 1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_givenBoard_thenReturn88888888W01() {
    // Arrange, Act and Assert
    assertEquals("8/8/8/8/8/8/8/8 w - - 0 1", (new Board()).fen());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Then return {@code rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); then return 'rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_thenReturnRnbqkbnrPppppppp8888PpppppppRnbqkbnrWKQkq01() {
    // Arrange, Act and Assert
    assertEquals("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1", (new Board(true)).fen());
  }

  /**
   * Test {@link Board#fen()}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#fen()}
   */
  @Test
  @DisplayName("Test fen(); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String Board.fen()"})
  void testFen_thenThrowIllegalArgumentException() {
    // Arrange
    Board board = new Board();
    board.setEnPassantSquare("Square Algebraic");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> board.fen());
  }

  /**
   * Test {@link Board#apply(Move)}.
   * <ul>
   *   <li>When {@link Move#Move(int, int)} with from is {@link CONSTANTS#E5} and to is one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#apply(Move)}
   */
  @Test
  @DisplayName("Test apply(Move); when Move(int, int) with from is E5 and to is one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.apply(Move)"})
  void testApply_whenMoveWithFromIsE5AndToIsOne_thenThrowIllegalArgumentException() {
    // Arrange
    Board board = new Board();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> board.apply(new Move(CONSTANTS.E5, 1)));
  }

  /**
   * Test {@link Board#apply(Move)}.
   * <ul>
   *   <li>When {@link Move#Move(int, int)} with from is one and to is one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#apply(Move)}
   */
  @Test
  @DisplayName("Test apply(Move); when Move(int, int) with from is one and to is one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.apply(Move)"})
  void testApply_whenMoveWithFromIsOneAndToIsOne_thenThrowIllegalArgumentException() {
    // Arrange
    Board board = new Board();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> board.apply(new Move(1, 1)));
  }

  /**
   * Test {@link Board#apply(Move)}.
   * <ul>
   *   <li>When {@link Move#Move(int, int)} with from is one hundred twenty and to is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#apply(Move)}
   */
  @Test
  @DisplayName("Test apply(Move); when Move(int, int) with from is one hundred twenty and to is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.apply(Move)"})
  void testApply_whenMoveWithFromIsOneHundredTwentyAndToIsOne() {
    // Arrange
    Board board = new Board();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> board.apply(new Move(120, 1)));
  }

  /**
   * Test {@link Board#apply(Move)}.
   * <ul>
   *   <li>When {@link Move#Move()}.</li>
   *   <li>Then {@link Board#Board()} Zobrist is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#apply(Move)}
   */
  @Test
  @DisplayName("Test apply(Move); when Move(); then Board() Zobrist is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void Board.apply(Move)"})
  void testApply_whenMove_thenBoardZobristIsZero() {
    // Arrange
    Board board = new Board();

    // Act
    board.apply(new Move());

    // Assert
    assertEquals(0L, board.getZobrist());
    assertTrue(board.isUndoAvailable());
    assertTrue(board.turn);
  }

  /**
   * Test {@link Board#canCastleWhiteKing()}.
   * <ul>
   *   <li>Given {@link Board#Board(boolean)} with startingPosition is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleWhiteKing()}
   */
  @Test
  @DisplayName("Test canCastleWhiteKing(); given Board(boolean) with startingPosition is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleWhiteKing()"})
  void testCanCastleWhiteKing_givenBoardWithStartingPositionIsTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new Board(true)).canCastleWhiteKing());
  }

  /**
   * Test {@link Board#canCastleWhiteKing()}.
   * <ul>
   *   <li>Given {@link Board#Board()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleWhiteKing()}
   */
  @Test
  @DisplayName("Test canCastleWhiteKing(); given Board(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleWhiteKing()"})
  void testCanCastleWhiteKing_givenBoard_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new Board()).canCastleWhiteKing());
  }

  /**
   * Test {@link Board#canCastleBlackKing()}.
   * <ul>
   *   <li>Given {@link Board#Board(boolean)} with startingPosition is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleBlackKing()}
   */
  @Test
  @DisplayName("Test canCastleBlackKing(); given Board(boolean) with startingPosition is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleBlackKing()"})
  void testCanCastleBlackKing_givenBoardWithStartingPositionIsTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new Board(true)).canCastleBlackKing());
  }

  /**
   * Test {@link Board#canCastleBlackKing()}.
   * <ul>
   *   <li>Given {@link Board#Board()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleBlackKing()}
   */
  @Test
  @DisplayName("Test canCastleBlackKing(); given Board(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleBlackKing()"})
  void testCanCastleBlackKing_givenBoard_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new Board()).canCastleBlackKing());
  }

  /**
   * Test {@link Board#canCastleWhiteQueen()}.
   * <ul>
   *   <li>Given {@link Board#Board(boolean)} with startingPosition is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleWhiteQueen()}
   */
  @Test
  @DisplayName("Test canCastleWhiteQueen(); given Board(boolean) with startingPosition is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleWhiteQueen()"})
  void testCanCastleWhiteQueen_givenBoardWithStartingPositionIsTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new Board(true)).canCastleWhiteQueen());
  }

  /**
   * Test {@link Board#canCastleWhiteQueen()}.
   * <ul>
   *   <li>Given {@link Board#Board()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleWhiteQueen()}
   */
  @Test
  @DisplayName("Test canCastleWhiteQueen(); given Board(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleWhiteQueen()"})
  void testCanCastleWhiteQueen_givenBoard_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new Board()).canCastleWhiteQueen());
  }

  /**
   * Test {@link Board#canCastleBlackQueen()}.
   * <ul>
   *   <li>Given {@link Board#Board(boolean)} with startingPosition is {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleBlackQueen()}
   */
  @Test
  @DisplayName("Test canCastleBlackQueen(); given Board(boolean) with startingPosition is 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleBlackQueen()"})
  void testCanCastleBlackQueen_givenBoardWithStartingPositionIsTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new Board(true)).canCastleBlackQueen());
  }

  /**
   * Test {@link Board#canCastleBlackQueen()}.
   * <ul>
   *   <li>Given {@link Board#Board()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canCastleBlackQueen()}
   */
  @Test
  @DisplayName("Test canCastleBlackQueen(); given Board(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canCastleBlackQueen()"})
  void testCanCastleBlackQueen_givenBoard_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new Board()).canCastleBlackQueen());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Board#setCastleBKing(boolean)}
   *   <li>{@link Board#setCastleBQueen(boolean)}
   *   <li>{@link Board#setCastleWKing(boolean)}
   *   <li>{@link Board#setCastleWQueen(boolean)}
   *   <li>{@link Board#getEpTarget()}
   *   <li>{@link Board#isUndoAvailable()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int Board.getEpTarget()", "boolean Board.isUndoAvailable()", "void Board.setCastleBKing(boolean)",
      "void Board.setCastleBQueen(boolean)", "void Board.setCastleWKing(boolean)",
      "void Board.setCastleWQueen(boolean)"})
  void testGettersAndSetters() {
    // Arrange
    Board board = new Board();

    // Act
    board.setCastleBKing(true);
    board.setCastleBQueen(true);
    board.setCastleWKing(true);
    board.setCastleWQueen(true);
    int actualEpTarget = board.getEpTarget();

    // Assert
    assertEquals(0, actualEpTarget);
    assertFalse(board.isUndoAvailable());
  }

  /**
   * Test {@link Board#canClaimFiftyMoves()}.
   * <ul>
   *   <li>Given {@link Board#Board()} {@link Board#halfmoveClock} is one hundred.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canClaimFiftyMoves()}
   */
  @Test
  @DisplayName("Test canClaimFiftyMoves(); given Board() halfmoveClock is one hundred; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canClaimFiftyMoves()"})
  void testCanClaimFiftyMoves_givenBoardHalfmoveClockIsOneHundred_thenReturnTrue() {
    // Arrange
    Board board = new Board();
    board.halfmoveClock = 100;

    // Act and Assert
    assertTrue(board.canClaimFiftyMoves());
  }

  /**
   * Test {@link Board#canClaimFiftyMoves()}.
   * <ul>
   *   <li>Given {@link Board#Board()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Board#canClaimFiftyMoves()}
   */
  @Test
  @DisplayName("Test canClaimFiftyMoves(); given Board(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean Board.canClaimFiftyMoves()"})
  void testCanClaimFiftyMoves_givenBoard_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new Board()).canClaimFiftyMoves());
  }
}
