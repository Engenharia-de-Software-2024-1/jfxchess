package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.asdfjkl.jfxchess.lib.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SearchPatternDiffblueTest {
  /**
   * Test {@link SearchPattern#setBoard(Board)}.
   * <ul>
   *   <li>Then {@link SearchPattern} (default constructor) PositionHash is {@code -4190708195696060804}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#setBoard(Board)}
   */
  @Test
  @DisplayName("Test setBoard(Board); then SearchPattern (default constructor) PositionHash is '-4190708195696060804'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SearchPattern.setBoard(Board)"})
  void testSetBoard_thenSearchPatternPositionHashIs4190708195696060804() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    Board board = new Board(true);

    // Act
    searchPattern.setBoard(board);

    // Assert
    assertEquals(-4190708195696060804L, searchPattern.getPositionHash());
    assertSame(board, searchPattern.getBoard());
  }

  /**
   * Test {@link SearchPattern#setBoard(Board)}.
   * <ul>
   *   <li>When {@link Board#Board()}.</li>
   *   <li>Then {@link SearchPattern} (default constructor) PositionHash is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#setBoard(Board)}
   */
  @Test
  @DisplayName("Test setBoard(Board); when Board(); then SearchPattern (default constructor) PositionHash is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SearchPattern.setBoard(Board)"})
  void testSetBoard_whenBoard_thenSearchPatternPositionHashIsZero() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    Board board = new Board();

    // Act
    searchPattern.setBoard(board);

    // Assert
    assertEquals(0L, searchPattern.getPositionHash());
    assertSame(board, searchPattern.getBoard());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SearchPattern#setBlackName(String)}
   *   <li>{@link SearchPattern#setCheckEco(boolean)}
   *   <li>{@link SearchPattern#setCheckElo(int)}
   *   <li>{@link SearchPattern#setCheckMoves(boolean)}
   *   <li>{@link SearchPattern#setCheckYear(boolean)}
   *   <li>{@link SearchPattern#setEcoStart(String)}
   *   <li>{@link SearchPattern#setEcoStop(String)}
   *   <li>{@link SearchPattern#setEvent(String)}
   *   <li>{@link SearchPattern#setIgnoreNameColor(boolean)}
   *   <li>{@link SearchPattern#setMaxElo(int)}
   *   <li>{@link SearchPattern#setMaxMove(int)}
   *   <li>{@link SearchPattern#setMaxYear(int)}
   *   <li>{@link SearchPattern#setMinElo(int)}
   *   <li>{@link SearchPattern#setMinMove(int)}
   *   <li>{@link SearchPattern#setMinYear(int)}
   *   <li>{@link SearchPattern#setPositionHash(long)}
   *   <li>{@link SearchPattern#setResultBlackWins(boolean)}
   *   <li>{@link SearchPattern#setResultDraw(boolean)}
   *   <li>{@link SearchPattern#setResultUndef(boolean)}
   *   <li>{@link SearchPattern#setResultWhiteWins(boolean)}
   *   <li>{@link SearchPattern#setSearchForHeader(boolean)}
   *   <li>{@link SearchPattern#setSearchForPosition(boolean)}
   *   <li>{@link SearchPattern#setSite(String)}
   *   <li>{@link SearchPattern#setWhiteName(String)}
   *   <li>{@link SearchPattern#getBlackName()}
   *   <li>{@link SearchPattern#getBoard()}
   *   <li>{@link SearchPattern#getCheckElo()}
   *   <li>{@link SearchPattern#getEcoStart()}
   *   <li>{@link SearchPattern#getEcoStop()}
   *   <li>{@link SearchPattern#getEvent()}
   *   <li>{@link SearchPattern#getMaxElo()}
   *   <li>{@link SearchPattern#getMaxMove()}
   *   <li>{@link SearchPattern#getMaxYear()}
   *   <li>{@link SearchPattern#getMinElo()}
   *   <li>{@link SearchPattern#getMinMove()}
   *   <li>{@link SearchPattern#getMinYear()}
   *   <li>{@link SearchPattern#getPositionHash()}
   *   <li>{@link SearchPattern#getSite()}
   *   <li>{@link SearchPattern#getWhiteName()}
   *   <li>{@link SearchPattern#isCheckEco()}
   *   <li>{@link SearchPattern#isCheckMoves()}
   *   <li>{@link SearchPattern#isCheckYear()}
   *   <li>{@link SearchPattern#isIgnoreNameColor()}
   *   <li>{@link SearchPattern#isResultBlackWins()}
   *   <li>{@link SearchPattern#isResultDraw()}
   *   <li>{@link SearchPattern#isResultUndef()}
   *   <li>{@link SearchPattern#isResultWhiteWins()}
   *   <li>{@link SearchPattern#isSearchForHeader()}
   *   <li>{@link SearchPattern#isSearchForPosition()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String SearchPattern.getBlackName()", "Board SearchPattern.getBoard()",
      "int SearchPattern.getCheckElo()", "String SearchPattern.getEcoStart()", "String SearchPattern.getEcoStop()",
      "String SearchPattern.getEvent()", "int SearchPattern.getMaxElo()", "int SearchPattern.getMaxMove()",
      "int SearchPattern.getMaxYear()", "int SearchPattern.getMinElo()", "int SearchPattern.getMinMove()",
      "int SearchPattern.getMinYear()", "long SearchPattern.getPositionHash()", "String SearchPattern.getSite()",
      "String SearchPattern.getWhiteName()", "boolean SearchPattern.isCheckEco()",
      "boolean SearchPattern.isCheckMoves()", "boolean SearchPattern.isCheckYear()",
      "boolean SearchPattern.isIgnoreNameColor()", "boolean SearchPattern.isResultBlackWins()",
      "boolean SearchPattern.isResultDraw()", "boolean SearchPattern.isResultUndef()",
      "boolean SearchPattern.isResultWhiteWins()", "boolean SearchPattern.isSearchForHeader()",
      "boolean SearchPattern.isSearchForPosition()", "void SearchPattern.setBlackName(String)",
      "void SearchPattern.setCheckEco(boolean)", "void SearchPattern.setCheckElo(int)",
      "void SearchPattern.setCheckMoves(boolean)", "void SearchPattern.setCheckYear(boolean)",
      "void SearchPattern.setEcoStart(String)", "void SearchPattern.setEcoStop(String)",
      "void SearchPattern.setEvent(String)", "void SearchPattern.setIgnoreNameColor(boolean)",
      "void SearchPattern.setMaxElo(int)", "void SearchPattern.setMaxMove(int)", "void SearchPattern.setMaxYear(int)",
      "void SearchPattern.setMinElo(int)", "void SearchPattern.setMinMove(int)", "void SearchPattern.setMinYear(int)",
      "void SearchPattern.setPositionHash(long)", "void SearchPattern.setResultBlackWins(boolean)",
      "void SearchPattern.setResultDraw(boolean)", "void SearchPattern.setResultUndef(boolean)",
      "void SearchPattern.setResultWhiteWins(boolean)", "void SearchPattern.setSearchForHeader(boolean)",
      "void SearchPattern.setSearchForPosition(boolean)", "void SearchPattern.setSite(String)",
      "void SearchPattern.setWhiteName(String)"})
  void testGettersAndSetters() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();

    // Act
    searchPattern.setBlackName("Black Name");
    searchPattern.setCheckEco(true);
    searchPattern.setCheckElo(1);
    searchPattern.setCheckMoves(true);
    searchPattern.setCheckYear(true);
    searchPattern.setEcoStart("Eco Start");
    searchPattern.setEcoStop("Eco Stop");
    searchPattern.setEvent("Event");
    searchPattern.setIgnoreNameColor(true);
    searchPattern.setMaxElo(3);
    searchPattern.setMaxMove(3);
    searchPattern.setMaxYear(3);
    searchPattern.setMinElo(1);
    searchPattern.setMinMove(1);
    searchPattern.setMinYear(1);
    searchPattern.setPositionHash(81985529216486895L);
    searchPattern.setResultBlackWins(true);
    searchPattern.setResultDraw(true);
    searchPattern.setResultUndef(true);
    searchPattern.setResultWhiteWins(true);
    searchPattern.setSearchForHeader(true);
    searchPattern.setSearchForPosition(true);
    searchPattern.setSite("Site");
    searchPattern.setWhiteName("White Name");
    String actualBlackName = searchPattern.getBlackName();
    Board actualBoard = searchPattern.getBoard();
    int actualCheckElo = searchPattern.getCheckElo();
    String actualEcoStart = searchPattern.getEcoStart();
    String actualEcoStop = searchPattern.getEcoStop();
    String actualEvent = searchPattern.getEvent();
    int actualMaxElo = searchPattern.getMaxElo();
    int actualMaxMove = searchPattern.getMaxMove();
    int actualMaxYear = searchPattern.getMaxYear();
    int actualMinElo = searchPattern.getMinElo();
    int actualMinMove = searchPattern.getMinMove();
    int actualMinYear = searchPattern.getMinYear();
    long actualPositionHash = searchPattern.getPositionHash();
    String actualSite = searchPattern.getSite();
    String actualWhiteName = searchPattern.getWhiteName();
    boolean actualIsCheckEcoResult = searchPattern.isCheckEco();
    boolean actualIsCheckMovesResult = searchPattern.isCheckMoves();
    boolean actualIsCheckYearResult = searchPattern.isCheckYear();
    boolean actualIsIgnoreNameColorResult = searchPattern.isIgnoreNameColor();
    boolean actualIsResultBlackWinsResult = searchPattern.isResultBlackWins();
    boolean actualIsResultDrawResult = searchPattern.isResultDraw();
    boolean actualIsResultUndefResult = searchPattern.isResultUndef();
    boolean actualIsResultWhiteWinsResult = searchPattern.isResultWhiteWins();
    boolean actualIsSearchForHeaderResult = searchPattern.isSearchForHeader();
    boolean actualIsSearchForPositionResult = searchPattern.isSearchForPosition();

    // Assert
    assertEquals("-", actualBoard.getEnPassantSquare());
    assertEquals("Black Name", actualBlackName);
    assertEquals("Eco Start", actualEcoStart);
    assertEquals("Eco Stop", actualEcoStop);
    assertEquals("Event", actualEvent);
    assertEquals("Site", actualSite);
    assertEquals("White Name", actualWhiteName);
    assertEquals(-516182592762444535L, actualBoard.getZobrist());
    assertEquals(0, actualBoard.getEpTarget());
    assertEquals(0, actualBoard.halfmoveClock);
    assertEquals(0L, actualBoard.getPositionHash());
    assertEquals(1, actualCheckElo);
    assertEquals(1, actualMinElo);
    assertEquals(1, actualMinMove);
    assertEquals(1, actualMinYear);
    assertEquals(1, actualBoard.fullmoveNumber);
    assertEquals(3, actualMaxElo);
    assertEquals(3, actualMaxMove);
    assertEquals(3, actualMaxYear);
    assertEquals(81985529216486895L, actualPositionHash);
    assertFalse(actualBoard.isCheck());
    assertFalse(actualBoard.isUndoAvailable());
    assertFalse(actualBoard.turn);
    assertTrue(actualIsCheckEcoResult);
    assertTrue(actualIsCheckMovesResult);
    assertTrue(actualIsCheckYearResult);
    assertTrue(actualIsIgnoreNameColorResult);
    assertTrue(actualIsResultBlackWinsResult);
    assertTrue(actualIsResultDrawResult);
    assertTrue(actualIsResultUndefResult);
    assertTrue(actualIsResultWhiteWinsResult);
    assertTrue(actualIsSearchForHeaderResult);
    assertTrue(actualIsSearchForPositionResult);
    assertTrue(actualBoard.isBlackKingCastleLost());
    assertTrue(actualBoard.isBlackQueenCastleLost());
    assertTrue(actualBoard.isInsufficientMaterial());
    assertTrue(actualBoard.isWhiteKingCastleLost());
    assertTrue(actualBoard.isWhiteQueenCastleLost());
  }

  /**
   * Test {@link SearchPattern#makeCopy()}.
   * <p>
   * Method under test: {@link SearchPattern#makeCopy()}
   */
  @Test
  @DisplayName("Test makeCopy()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SearchPattern SearchPattern.makeCopy()"})
  void testMakeCopy() {
    // Arrange and Act
    SearchPattern actualMakeCopyResult = (new SearchPattern()).makeCopy();

    // Assert
    assertEquals("", actualMakeCopyResult.getBlackName());
    assertEquals("", actualMakeCopyResult.getEvent());
    assertEquals("", actualMakeCopyResult.getSite());
    assertEquals("", actualMakeCopyResult.getWhiteName());
    assertEquals("A00", actualMakeCopyResult.getEcoStart());
    assertEquals("E99", actualMakeCopyResult.getEcoStop());
    assertEquals(0, actualMakeCopyResult.getCheckElo());
    assertEquals(0L, actualMakeCopyResult.getPositionHash());
    assertEquals(1, actualMakeCopyResult.getMinMove());
    assertEquals(1000, actualMakeCopyResult.getMinElo());
    assertEquals(2100, actualMakeCopyResult.getMaxYear());
    assertEquals(3000, actualMakeCopyResult.getMaxElo());
    assertEquals(500, actualMakeCopyResult.getMinYear());
    assertEquals(99, actualMakeCopyResult.getMaxMove());
    assertFalse(actualMakeCopyResult.isCheckEco());
    assertFalse(actualMakeCopyResult.isCheckMoves());
    assertFalse(actualMakeCopyResult.isCheckYear());
    assertFalse(actualMakeCopyResult.isIgnoreNameColor());
    assertFalse(actualMakeCopyResult.isSearchForHeader());
    assertFalse(actualMakeCopyResult.isSearchForPosition());
    assertTrue(actualMakeCopyResult.isResultBlackWins());
    assertTrue(actualMakeCopyResult.isResultDraw());
    assertTrue(actualMakeCopyResult.isResultUndef());
    assertTrue(actualMakeCopyResult.isResultWhiteWins());
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@code 0-1}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor) Result is {@code 0-1}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given '0-1'; when PgnDatabaseEntry (default constructor) Result is '0-1'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_given01_whenPgnDatabaseEntryResultIs01_thenReturnFalse() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEvent("");
    searchPattern.setSite("");
    searchPattern.setMinYear(-1);
    searchPattern.setMaxYear(-1);
    searchPattern.setIgnoreNameColor(false);
    searchPattern.setWhiteName("");
    searchPattern.setBlackName("");
    searchPattern.setResultBlackWins(false);
    searchPattern.setResultWhiteWins(false);
    searchPattern.setResultDraw(false);
    searchPattern.setResultUndef(false);
    searchPattern.setEcoStart("");
    searchPattern.setEcoStop("");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setResult("0-1");
    pgnDatabaseEntry.setEco("");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@code 1-0}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor) Result is {@code 1-0}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given '1-0'; when PgnDatabaseEntry (default constructor) Result is '1-0'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_given10_whenPgnDatabaseEntryResultIs10_thenReturnFalse() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEvent("");
    searchPattern.setSite("");
    searchPattern.setMinYear(-1);
    searchPattern.setMaxYear(-1);
    searchPattern.setIgnoreNameColor(false);
    searchPattern.setWhiteName("");
    searchPattern.setBlackName("");
    searchPattern.setResultBlackWins(false);
    searchPattern.setResultWhiteWins(false);
    searchPattern.setResultDraw(false);
    searchPattern.setResultUndef(false);
    searchPattern.setEcoStart("");
    searchPattern.setEcoStop("");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setResult("1-0");
    pgnDatabaseEntry.setEco("");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor) Eco is {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given '42'; when PgnDatabaseEntry (default constructor) Eco is '42'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_given42_whenPgnDatabaseEntryEcoIs42_thenReturnFalse() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setEco("42");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@code 1/2-1/2}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor) Result is {@code 1/2-1/2}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given '1/2-1/2'; when PgnDatabaseEntry (default constructor) Result is '1/2-1/2'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_given1212_whenPgnDatabaseEntryResultIs1212_thenReturnFalse() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEvent("");
    searchPattern.setSite("");
    searchPattern.setMinYear(-1);
    searchPattern.setMaxYear(-1);
    searchPattern.setIgnoreNameColor(false);
    searchPattern.setWhiteName("");
    searchPattern.setBlackName("");
    searchPattern.setResultBlackWins(false);
    searchPattern.setResultWhiteWins(false);
    searchPattern.setResultDraw(false);
    searchPattern.setResultUndef(false);
    searchPattern.setEcoStart("");
    searchPattern.setEcoStop("");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setResult("1/2-1/2");
    pgnDatabaseEntry.setEco("");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@code *}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor) Result is {@code *}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given '*'; when PgnDatabaseEntry (default constructor) Result is '*'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenAsterisk_whenPgnDatabaseEntryResultIsAsterisk() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEvent("");
    searchPattern.setSite("");
    searchPattern.setMinYear(-1);
    searchPattern.setMaxYear(-1);
    searchPattern.setIgnoreNameColor(false);
    searchPattern.setWhiteName("");
    searchPattern.setBlackName("");
    searchPattern.setResultBlackWins(false);
    searchPattern.setResultWhiteWins(false);
    searchPattern.setResultDraw(false);
    searchPattern.setResultUndef(false);
    searchPattern.setEcoStart("");
    searchPattern.setEcoStop("");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setResult("*");
    pgnDatabaseEntry.setEco("");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) BlackName is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) BlackName is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternBlackNameIsBackslashDot() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setBlackName("\\.");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setBlack("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) BlackName is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) BlackName is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternBlackNameIsBackslashDot2() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setIgnoreNameColor(true);
    searchPattern.setBlackName("\\.");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setBlack("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) BlackName is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) BlackName is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternBlackNameIsBackslashDot3() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setIgnoreNameColor(true);
    searchPattern.setBlackName("\\.");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setWhite("\\.");
    pgnDatabaseEntry.setBlack("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) BlackName is {@code \.}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) BlackName is '\\.'; when PgnDatabaseEntry (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternBlackNameIsBackslashDot_whenPgnDatabaseEntry() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setBlackName("\\.");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(new PgnDatabaseEntry()));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) BlackName is {@code Black Name}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) BlackName is 'Black Name'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternBlackNameIsBlackName() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setIgnoreNameColor(true);
    searchPattern.setBlackName("Black Name");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setBlack("\\.");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) EcoStop is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) EcoStop is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternEcoStopIsBackslashDot() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEcoStop("\\.");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setEco("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) Event is {@code \.}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) Event is '\\.'; when PgnDatabaseEntry (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternEventIsBackslashDot_whenPgnDatabaseEntry() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEvent("\\.");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(new PgnDatabaseEntry()));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) IgnoreNameColor is {@code true}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) IgnoreNameColor is 'true'; when PgnDatabaseEntry (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternIgnoreNameColorIsTrue_whenPgnDatabaseEntry() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setIgnoreNameColor(true);

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(new PgnDatabaseEntry()));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) ResultBlackWins is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) ResultBlackWins is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternResultBlackWinsIsTrue() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEvent("");
    searchPattern.setSite("");
    searchPattern.setMinYear(-1);
    searchPattern.setMaxYear(-1);
    searchPattern.setIgnoreNameColor(false);
    searchPattern.setWhiteName("");
    searchPattern.setBlackName("");
    searchPattern.setResultBlackWins(true);
    searchPattern.setResultWhiteWins(false);
    searchPattern.setResultDraw(false);
    searchPattern.setResultUndef(false);
    searchPattern.setEcoStart("");
    searchPattern.setEcoStop("");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setResult("0-1");
    pgnDatabaseEntry.setEco("");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) Site is {@code \.}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) Site is '\\.'; when PgnDatabaseEntry (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternSiteIsBackslashDot_whenPgnDatabaseEntry() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setSite("\\.");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(new PgnDatabaseEntry()));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) WhiteName is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) WhiteName is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternWhiteNameIsBackslashDot() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setWhiteName("\\.");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setWhite("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) WhiteName is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) WhiteName is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternWhiteNameIsBackslashDot2() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setIgnoreNameColor(true);
    searchPattern.setWhiteName("\\.");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setWhite("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) WhiteName is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) WhiteName is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternWhiteNameIsBackslashDot3() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setIgnoreNameColor(true);
    searchPattern.setWhiteName("\\.");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setBlack("\\.");
    pgnDatabaseEntry.setWhite("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) WhiteName is {@code \.}.</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) WhiteName is '\\.'; when PgnDatabaseEntry (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternWhiteNameIsBackslashDot_whenPgnDatabaseEntry() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setWhiteName("\\.");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(new PgnDatabaseEntry()));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor) WhiteName is {@code White Name}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor) WhiteName is 'White Name'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPatternWhiteNameIsWhiteName() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setIgnoreNameColor(true);
    searchPattern.setWhiteName("White Name");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setWhite("\\.");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor).</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor) Eco is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor); when PgnDatabaseEntry (default constructor) Eco is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPattern_whenPgnDatabaseEntryEcoIsBackslashDot() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setEco("\\.");

    // Act and Assert
    assertFalse(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>Given {@link SearchPattern} (default constructor).</li>
   *   <li>When {@link PgnDatabaseEntry} (default constructor).</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); given SearchPattern (default constructor); when PgnDatabaseEntry (default constructor); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_givenSearchPattern_whenPgnDatabaseEntry_thenReturnTrue() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(new PgnDatabaseEntry()));
  }

  /**
   * Test {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}.
   * <ul>
   *   <li>When {@link PgnDatabaseEntry} (default constructor) Eco is {@code \.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SearchPattern#matchesHeader(PgnDatabaseEntry)}
   */
  @Test
  @DisplayName("Test matchesHeader(PgnDatabaseEntry); when PgnDatabaseEntry (default constructor) Eco is '\\.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SearchPattern.matchesHeader(PgnDatabaseEntry)"})
  void testMatchesHeader_whenPgnDatabaseEntryEcoIsBackslashDot() {
    // Arrange
    SearchPattern searchPattern = new SearchPattern();
    searchPattern.setEcoStop("");

    PgnDatabaseEntry pgnDatabaseEntry = new PgnDatabaseEntry();
    pgnDatabaseEntry.setEco("\\.");

    // Act and Assert
    assertTrue(searchPattern.matchesHeader(pgnDatabaseEntry));
  }

  /**
   * Test new {@link SearchPattern} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link SearchPattern}
   */
  @Test
  @DisplayName("Test new SearchPattern (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SearchPattern.<init>()"})
  void testNewSearchPattern() {
    // Arrange and Act
    SearchPattern actualSearchPattern = new SearchPattern();

    // Assert
    assertEquals("", actualSearchPattern.getBlackName());
    assertEquals("", actualSearchPattern.getEvent());
    assertEquals("", actualSearchPattern.getSite());
    assertEquals("", actualSearchPattern.getWhiteName());
    assertEquals("A00", actualSearchPattern.getEcoStart());
    assertEquals("E99", actualSearchPattern.getEcoStop());
    assertEquals(0, actualSearchPattern.getCheckElo());
    assertEquals(0L, actualSearchPattern.getPositionHash());
    assertEquals(1, actualSearchPattern.getMinMove());
    assertEquals(1000, actualSearchPattern.getMinElo());
    assertEquals(2100, actualSearchPattern.getMaxYear());
    assertEquals(3000, actualSearchPattern.getMaxElo());
    assertEquals(500, actualSearchPattern.getMinYear());
    assertEquals(99, actualSearchPattern.getMaxMove());
    assertFalse(actualSearchPattern.isCheckEco());
    assertFalse(actualSearchPattern.isCheckMoves());
    assertFalse(actualSearchPattern.isCheckYear());
    assertFalse(actualSearchPattern.isIgnoreNameColor());
    assertFalse(actualSearchPattern.isSearchForHeader());
    assertFalse(actualSearchPattern.isSearchForPosition());
    assertTrue(actualSearchPattern.isResultBlackWins());
    assertTrue(actualSearchPattern.isResultDraw());
    assertTrue(actualSearchPattern.isResultUndef());
    assertTrue(actualSearchPattern.isResultWhiteWins());
  }
}
