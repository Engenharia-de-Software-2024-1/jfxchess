package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import org.asdfjkl.jfxchess.lib.Board;
import org.asdfjkl.jfxchess.lib.Game;
import org.asdfjkl.jfxchess.lib.GameNode;
import org.asdfjkl.jfxchess.lib.Move;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GameModelDiffblueTest {
  /**
   * Test new {@link GameModel} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link GameModel}
   */
  @Test
  @DisplayName("Test new GameModel (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.<init>()"})
  void testNewGameModel() {
    // Arrange and Act
    GameModel actualGameModel = new GameModel();

    // Assert
    assertEquals("", actualGameModel.childBestPv);
    assertEquals("", actualGameModel.currentBestPv);
    assertNull(actualGameModel.lastOpenedDirPath);
    assertNull(actualGameModel.lastSaveDirPath);
    assertEquals(-1, actualGameModel.childMateInMoves);
    assertEquals(-1, actualGameModel.currentMateInMoves);
    assertEquals(-1, actualGameModel.currentPgnDatabaseIdx);
    assertEquals(0, actualGameModel.getMode());
    assertEquals(0, actualGameModel.childBestEval);
    assertEquals(0, actualGameModel.currentBestEval);
    assertEquals(0.5d, actualGameModel.getGameAnalysisThreshold());
    assertEquals(1, actualGameModel.engines.size());
    assertEquals(1, actualGameModel.getComputerThinkTimeSecs());
    assertEquals(1, actualGameModel.getMultiPv());
    assertEquals(1, actualGameModel.THEME);
    assertEquals(20, actualGameModel.getEngineStrength());
    assertEquals(3, actualGameModel.getGameAnalysisThinkTimeSecs());
    assertEquals(5, actualGameModel.getGameAnalysisForPlayer());
    assertFalse(actualGameModel.getFlipBoard());
    assertFalse(actualGameModel.getGameAnalysisJustStarted());
    assertFalse(actualGameModel.getHumanPlayerColor());
    assertFalse(actualGameModel.childIsMate);
    assertFalse(actualGameModel.currentIsMate);
    assertFalse(actualGameModel.doNotNotifyAboutResult);
    assertFalse(actualGameModel.openDatabaseOnNextDialog);
    assertFalse(actualGameModel.wasSaved);
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link GameModel#setComputerThinkTimeSecs(int)}
   *   <li>{@link GameModel#setEloHasBeenSetInGUI(boolean)}
   *   <li>{@link GameModel#setEngineStrength(int)}
   *   <li>{@link GameModel#setFlipBoard(boolean)}
   *   <li>{@link GameModel#setGame(Game)}
   *   <li>{@link GameModel#setGameAnalysisForPlayer(int)}
   *   <li>{@link GameModel#setGameAnalysisJustStarted(boolean)}
   *   <li>{@link GameModel#setGameAnalysisThinkTimeSecs(int)}
   *   <li>{@link GameModel#setGameAnalysisThreshold(double)}
   *   <li>{@link GameModel#setHumanPlayerColor(boolean)}
   *   <li>{@link GameModel#setMode(int)}
   *   <li>{@link GameModel#setMultiPvChange(boolean)}
   *   <li>{@link GameModel#setSearchPattern(SearchPattern)}
   *   <li>{@link GameModel#getComputerThinkTimeSecs()}
   *   <li>{@link GameModel#getEngineStrength()}
   *   <li>{@link GameModel#getFlipBoard()}
   *   <li>{@link GameModel#getGame()}
   *   <li>{@link GameModel#getGameAnalysisForPlayer()}
   *   <li>{@link GameModel#getGameAnalysisJustStarted()}
   *   <li>{@link GameModel#getGameAnalysisThinkTimeSecs()}
   *   <li>{@link GameModel#getGameAnalysisThreshold()}
   *   <li>{@link GameModel#getHumanPlayerColor()}
   *   <li>{@link GameModel#getMode()}
   *   <li>{@link GameModel#getPgnDatabase()}
   *   <li>{@link GameModel#getSearchPattern()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int GameModel.getComputerThinkTimeSecs()", "int GameModel.getEngineStrength()",
      "boolean GameModel.getFlipBoard()", "Game GameModel.getGame()", "int GameModel.getGameAnalysisForPlayer()",
      "boolean GameModel.getGameAnalysisJustStarted()", "int GameModel.getGameAnalysisThinkTimeSecs()",
      "double GameModel.getGameAnalysisThreshold()", "boolean GameModel.getHumanPlayerColor()",
      "int GameModel.getMode()", "PgnDatabase GameModel.getPgnDatabase()", "SearchPattern GameModel.getSearchPattern()",
      "void GameModel.setComputerThinkTimeSecs(int)", "void GameModel.setEloHasBeenSetInGUI(boolean)",
      "void GameModel.setEngineStrength(int)", "void GameModel.setFlipBoard(boolean)", "void GameModel.setGame(Game)",
      "void GameModel.setGameAnalysisForPlayer(int)", "void GameModel.setGameAnalysisJustStarted(boolean)",
      "void GameModel.setGameAnalysisThinkTimeSecs(int)", "void GameModel.setGameAnalysisThreshold(double)",
      "void GameModel.setHumanPlayerColor(boolean)", "void GameModel.setMode(int)",
      "void GameModel.setMultiPvChange(boolean)", "void GameModel.setSearchPattern(SearchPattern)"})
  void testGettersAndSetters() {
    // Arrange
    GameModel gameModel = new GameModel();

    // Act
    gameModel.setComputerThinkTimeSecs(1);
    gameModel.setEloHasBeenSetInGUI(true);
    gameModel.setEngineStrength(1);
    gameModel.setFlipBoard(true);
    Game game = new Game();
    gameModel.setGame(game);
    gameModel.setGameAnalysisForPlayer(1);
    gameModel.setGameAnalysisJustStarted(true);
    gameModel.setGameAnalysisThinkTimeSecs(1);
    gameModel.setGameAnalysisThreshold(10.0d);
    gameModel.setHumanPlayerColor(true);
    gameModel.setMode(1);
    gameModel.setMultiPvChange(true);
    SearchPattern searchPattern = new SearchPattern();
    gameModel.setSearchPattern(searchPattern);
    int actualComputerThinkTimeSecs = gameModel.getComputerThinkTimeSecs();
    int actualEngineStrength = gameModel.getEngineStrength();
    boolean actualFlipBoard = gameModel.getFlipBoard();
    Game actualGame = gameModel.getGame();
    int actualGameAnalysisForPlayer = gameModel.getGameAnalysisForPlayer();
    boolean actualGameAnalysisJustStarted = gameModel.getGameAnalysisJustStarted();
    int actualGameAnalysisThinkTimeSecs = gameModel.getGameAnalysisThinkTimeSecs();
    double actualGameAnalysisThreshold = gameModel.getGameAnalysisThreshold();
    boolean actualHumanPlayerColor = gameModel.getHumanPlayerColor();
    int actualMode = gameModel.getMode();
    PgnDatabase actualPgnDatabase = gameModel.getPgnDatabase();
    SearchPattern actualSearchPattern = gameModel.getSearchPattern();

    // Assert
    assertNull(actualPgnDatabase.filename);
    assertNull(actualPgnDatabase.getSearchResults());
    assertNull(actualPgnDatabase.dialogDatabase);
    assertEquals(0, actualPgnDatabase.getNrGames());
    assertEquals(1, actualComputerThinkTimeSecs);
    assertEquals(1, actualEngineStrength);
    assertEquals(1, actualGameAnalysisForPlayer);
    assertEquals(1, actualGameAnalysisThinkTimeSecs);
    assertEquals(1, actualMode);
    assertEquals(10.0d, actualGameAnalysisThreshold);
    assertTrue(actualFlipBoard);
    assertTrue(actualGameAnalysisJustStarted);
    assertTrue(actualHumanPlayerColor);
    assertSame(searchPattern, actualSearchPattern);
    assertSame(game, actualGame);
  }

  /**
   * Test {@link GameModel#triggerStateChange()}.
   * <ul>
   *   <li>Then calls {@link StateChangeListener#stateChange()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameModel#triggerStateChange()}
   */
  @Test
  @DisplayName("Test triggerStateChange(); then calls stateChange()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.triggerStateChange()"})
  void testTriggerStateChange_thenCallsStateChange() {
    // Arrange
    StateChangeListener toAdd = mock(StateChangeListener.class);
    doNothing().when(toAdd).stateChange();

    GameModel gameModel = new GameModel();
    gameModel.addListener(toAdd);

    // Act
    gameModel.triggerStateChange();

    // Assert
    verify(toAdd).stateChange();
  }

  /**
   * Test {@link GameModel#saveModel()}.
   * <ul>
   *   <li>Given {@link Game} {@link Game#getResult()} return three.</li>
   *   <li>Then calls {@link Game#getHeader(String)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameModel#saveModel()}
   */
  @Test
  @DisplayName("Test saveModel(); given Game getResult() return three; then calls getHeader(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.saveModel()"})
  void testSaveModel_givenGameGetResultReturnThree_thenCallsGetHeader() {
    // Arrange
    GameNode gameNode = new GameNode();
    gameNode.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getResult()).thenReturn(3);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode);

    GameModel gameModel = new GameModel();
    gameModel.setGame(game);

    // Act
    gameModel.saveModel();

    // Assert
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game).getResult();
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
  }

  /**
   * Test {@link GameModel#saveModel()}.
   * <ul>
   *   <li>Given {@link Game} {@link Game#getResult()} return two.</li>
   *   <li>Then calls {@link Game#getHeader(String)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameModel#saveModel()}
   */
  @Test
  @DisplayName("Test saveModel(); given Game getResult() return two; then calls getHeader(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.saveModel()"})
  void testSaveModel_givenGameGetResultReturnTwo_thenCallsGetHeader() {
    // Arrange
    GameNode gameNode = new GameNode();
    gameNode.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getResult()).thenReturn(2);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode);

    GameModel gameModel = new GameModel();
    gameModel.setGame(game);

    // Act
    gameModel.saveModel();

    // Assert
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game).getResult();
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
  }

  /**
   * Test {@link GameModel#saveModel()}.
   * <ul>
   *   <li>Given {@link GameNode} (default constructor) Board is {@link Board#Board()}.</li>
   *   <li>Then calls {@link Game#getHeader(String)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameModel#saveModel()}
   */
  @Test
  @DisplayName("Test saveModel(); given GameNode (default constructor) Board is Board(); then calls getHeader(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.saveModel()"})
  void testSaveModel_givenGameNodeBoardIsBoard_thenCallsGetHeader() {
    // Arrange
    GameNode gameNode = new GameNode();
    gameNode.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getResult()).thenReturn(1);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode);

    GameModel gameModel = new GameModel();
    gameModel.setGame(game);

    // Act
    gameModel.saveModel();

    // Assert
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game).getResult();
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
  }

  /**
   * Test {@link GameModel#saveModel()}.
   * <ul>
   *   <li>Given {@link GameNode} {@link GameNode#getVariations()} return {@link ArrayList#ArrayList()}.</li>
   *   <li>Then calls {@link GameNode#getBoard()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameModel#saveModel()}
   */
  @Test
  @DisplayName("Test saveModel(); given GameNode getVariations() return ArrayList(); then calls getBoard()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.saveModel()"})
  void testSaveModel_givenGameNodeGetVariationsReturnArrayList_thenCallsGetBoard() {
    // Arrange
    GameNode gameNode = mock(GameNode.class);
    when(gameNode.getVariations()).thenReturn(new ArrayList<>());
    when(gameNode.getComment()).thenReturn("Comment");
    when(gameNode.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode).setBoard(Mockito.<Board>any());
    gameNode.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getResult()).thenReturn(1);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode);

    GameModel gameModel = new GameModel();
    gameModel.setGame(game);

    // Act
    gameModel.saveModel();

    // Assert
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game).getResult();
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode, atLeast(1)).getBoard();
    verify(gameNode, atLeast(1)).getComment();
    verify(gameNode).getVariations();
    verify(gameNode).setBoard(isA(Board.class));
  }

  /**
   * Test {@link GameModel#saveModel()}.
   * <ul>
   *   <li>Given {@link GameNode} (default constructor) Parent is {@link GameNode} (default constructor).</li>
   *   <li>Then calls {@link Board#san(Move)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameModel#saveModel()}
   */
  @Test
  @DisplayName("Test saveModel(); given GameNode (default constructor) Parent is GameNode (default constructor); then calls san(Move)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.saveModel()"})
  void testSaveModel_givenGameNodeParentIsGameNode_thenCallsSan() {
    // Arrange
    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());
    Board b = mock(Board.class);
    when(b.san(Mockito.<Move>any())).thenReturn("San");

    GameNode node = new GameNode();
    node.setBoard(b);

    GameNode gameNode = new GameNode();
    gameNode.setParent(node);
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariation(anyInt())).thenReturn(gameNode);
    when(gameNode2.getVariations()).thenReturn(gameNodeList);
    when(gameNode2.getComment()).thenReturn("Comment");
    when(gameNode2.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode2).setBoard(Mockito.<Board>any());
    gameNode2.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getResult()).thenReturn(1);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode2);

    GameModel gameModel = new GameModel();
    gameModel.setGame(game);

    // Act
    gameModel.saveModel();

    // Assert
    verify(b).san(isNull());
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game).getResult();
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2, atLeast(1)).getBoard();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getVariation(eq(0));
    verify(gameNode2).getVariations();
    verify(gameNode2).setBoard(isA(Board.class));
  }

  /**
   * Test {@link GameModel#saveModel()}.
   * <ul>
   *   <li>Then calls {@link GameNode#getNags()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameModel#saveModel()}
   */
  @Test
  @DisplayName("Test saveModel(); then calls getNags()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameModel.saveModel()"})
  void testSaveModel_thenCallsGetNags() {
    // Arrange
    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));

    GameNode gameNode = new GameNode();
    gameNode.setBoard(new Board(true));
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariations()).thenReturn(new ArrayList<>());
    when(gameNode2.getBoard()).thenReturn(new Board());
    when(gameNode2.getComment()).thenReturn("Comment");
    when(gameNode2.getSan()).thenReturn("San");
    when(gameNode2.getNags()).thenReturn(new ArrayList<>());
    when(gameNode2.getParent()).thenReturn(gameNode);
    doNothing().when(gameNode2).setParent(Mockito.<GameNode>any());
    gameNode2.setParent(node);
    GameNode gameNode3 = mock(GameNode.class);
    when(gameNode3.getVariation(anyInt())).thenReturn(gameNode2);
    when(gameNode3.getVariations()).thenReturn(gameNodeList);
    when(gameNode3.getComment()).thenReturn("Comment");
    when(gameNode3.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode3).setBoard(Mockito.<Board>any());
    gameNode3.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getResult()).thenReturn(1);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);

    GameModel gameModel = new GameModel();
    gameModel.setGame(game);

    // Act
    gameModel.saveModel();

    // Assert
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game).getResult();
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2).getBoard();
    verify(gameNode3, atLeast(1)).getBoard();
    verify(gameNode3, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2).getNags();
    verify(gameNode2).getParent();
    verify(gameNode2).getSan();
    verify(gameNode3, atLeast(1)).getVariation(eq(0));
    verify(gameNode3).getVariations();
    verify(gameNode2).getVariations();
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }
}
