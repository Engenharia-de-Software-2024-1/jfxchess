package org.asdfjkl.jfxchess.gui;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EditMenuControllerDiffblueTest {
  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then calls {@link GameNode#getNags()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given ArrayList() add two; then calls getNags()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenArrayListAddTwo_thenCallsGetNags() {
    // Arrange
    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));

    GameNode gameNode = new GameNode();
    gameNode.setBoard(new Board(true));

    ArrayList<Integer> integerList = new ArrayList<>();
    integerList.add(2);

    ArrayList<GameNode> gameNodeList2 = new ArrayList<>();
    gameNodeList2.add(new GameNode());
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariation(anyInt())).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode2.getVariations()).thenReturn(gameNodeList2);
    when(gameNode2.getBoard()).thenReturn(new Board());
    when(gameNode2.getComment()).thenReturn("Comment");
    when(gameNode2.getSan()).thenReturn("San");
    when(gameNode2.getNags()).thenReturn(integerList);
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
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2).getBoard();
    verify(gameNode3, atLeast(1)).getBoard();
    verify(gameNode3, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2).getNags();
    verify(gameNode2).getParent();
    verify(gameNode2).getSan();
    verify(gameNode2).getVariation(eq(0));
    verify(gameNode3, atLeast(1)).getVariation(eq(0));
    verify(gameNode3).getVariations();
    verify(gameNode2).getVariations();
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }

  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link Board} {@link Board#isInitialPosition()} return {@code false}.</li>
   *   <li>Then calls {@link Board#fen()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given Board isInitialPosition() return 'false'; then calls fen()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenBoardIsInitialPositionReturnFalse_thenCallsFen() {
    // Arrange
    Board board = mock(Board.class);
    when(board.isInitialPosition()).thenReturn(false);
    when(board.fen()).thenReturn("Fen");

    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));
    GameNode gameNode = mock(GameNode.class);
    when(gameNode.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode).setBoard(Mockito.<Board>any());
    gameNode.setBoard(new Board(true));

    ArrayList<GameNode> gameNodeList2 = new ArrayList<>();
    gameNodeList2.add(new GameNode());
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariation(anyInt())).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode2.getVariations()).thenReturn(gameNodeList2);
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
    when(gameNode3.getBoard()).thenReturn(board);
    doNothing().when(gameNode3).setBoard(Mockito.<Board>any());
    gameNode3.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(board).fen();
    verify(board).isInitialPosition();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2).getBoard();
    verify(gameNode).getBoard();
    verify(gameNode3, atLeast(1)).getBoard();
    verify(gameNode3, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2).getNags();
    verify(gameNode2).getParent();
    verify(gameNode2).getSan();
    verify(gameNode2).getVariation(eq(0));
    verify(gameNode3, atLeast(1)).getVariation(eq(0));
    verify(gameNode3).getVariations();
    verify(gameNode2).getVariations();
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }

  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link Board} {@link Board#isInitialPosition()} return {@code true}.</li>
   *   <li>Then calls {@link Board#isInitialPosition()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given Board isInitialPosition() return 'true'; then calls isInitialPosition()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenBoardIsInitialPositionReturnTrue_thenCallsIsInitialPosition() {
    // Arrange
    Board board = mock(Board.class);
    when(board.isInitialPosition()).thenReturn(true);

    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));
    GameNode gameNode = mock(GameNode.class);
    when(gameNode.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode).setBoard(Mockito.<Board>any());
    gameNode.setBoard(new Board(true));

    ArrayList<GameNode> gameNodeList2 = new ArrayList<>();
    gameNodeList2.add(new GameNode());
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariation(anyInt())).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode2.getVariations()).thenReturn(gameNodeList2);
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
    when(gameNode3.getBoard()).thenReturn(board);
    doNothing().when(gameNode3).setBoard(Mockito.<Board>any());
    gameNode3.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(board).isInitialPosition();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2).getBoard();
    verify(gameNode).getBoard();
    verify(gameNode3, atLeast(1)).getBoard();
    verify(gameNode3, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2).getNags();
    verify(gameNode2).getParent();
    verify(gameNode2).getSan();
    verify(gameNode2).getVariation(eq(0));
    verify(gameNode3, atLeast(1)).getVariation(eq(0));
    verify(gameNode3).getVariations();
    verify(gameNode2).getVariations();
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }

  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link GameNode} (default constructor) Board is {@link Board#Board(boolean)} with startingPosition is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given GameNode (default constructor) Board is Board(boolean) with startingPosition is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenGameNodeBoardIsBoardWithStartingPositionIsTrue() {
    // Arrange
    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));

    GameNode gameNode = new GameNode();
    gameNode.setBoard(new Board(true));

    ArrayList<GameNode> gameNodeList2 = new ArrayList<>();
    gameNodeList2.add(new GameNode());
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariation(anyInt())).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode2.getVariations()).thenReturn(gameNodeList2);
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
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2).getBoard();
    verify(gameNode3, atLeast(1)).getBoard();
    verify(gameNode3, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2).getNags();
    verify(gameNode2).getParent();
    verify(gameNode2).getSan();
    verify(gameNode2).getVariation(eq(0));
    verify(gameNode3, atLeast(1)).getVariation(eq(0));
    verify(gameNode3).getVariations();
    verify(gameNode2).getVariations();
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }

  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link GameNode} Board is {@link Board#Board(boolean)} with startingPosition is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given GameNode Board is Board(boolean) with startingPosition is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenGameNodeBoardIsBoardWithStartingPositionIsTrue2() {
    // Arrange
    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));
    GameNode gameNode = mock(GameNode.class);
    when(gameNode.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode).setBoard(Mockito.<Board>any());
    gameNode.setBoard(new Board(true));

    ArrayList<GameNode> gameNodeList2 = new ArrayList<>();
    gameNodeList2.add(new GameNode());
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariation(anyInt())).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode2.getVariations()).thenReturn(gameNodeList2);
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
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2).getBoard();
    verify(gameNode).getBoard();
    verify(gameNode3, atLeast(1)).getBoard();
    verify(gameNode3, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2).getNags();
    verify(gameNode2).getParent();
    verify(gameNode2).getSan();
    verify(gameNode2).getVariation(eq(0));
    verify(gameNode3, atLeast(1)).getVariation(eq(0));
    verify(gameNode3).getVariations();
    verify(gameNode2).getVariations();
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }

  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link GameNode} Board is {@link Board#Board(boolean)} with startingPosition is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given GameNode Board is Board(boolean) with startingPosition is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenGameNodeBoardIsBoardWithStartingPositionIsTrue3() {
    // Arrange
    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));
    GameNode gameNode = mock(GameNode.class);
    when(gameNode.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode).setBoard(Mockito.<Board>any());
    gameNode.setBoard(new Board(true));

    ArrayList<GameNode> gameNodeList2 = new ArrayList<>();
    gameNodeList2.add(new GameNode());
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariation(anyInt())).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode2.getVariations()).thenReturn(gameNodeList2);
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
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode2).getBoard();
    verify(gameNode3, atLeast(1)).getBoard();
    verify(gameNode, atLeast(1)).getBoard();
    verify(gameNode3, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getComment();
    verify(gameNode2, atLeast(1)).getNags();
    verify(gameNode2, atLeast(1)).getParent();
    verify(gameNode2, atLeast(1)).getSan();
    verify(gameNode3, atLeast(1)).getVariation(anyInt());
    verify(gameNode2).getVariation(eq(0));
    verify(gameNode3).getVariations();
    verify(gameNode2).getVariations();
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }

  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link GameNode} {@link GameNode#getBoard()} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code Event}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given GameNode getBoard() throw IllegalArgumentException(String) with 'Event'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenGameNodeGetBoardThrowIllegalArgumentExceptionWithEvent() {
    // Arrange
    ArrayList<GameNode> gameNodeList = new ArrayList<>();
    gameNodeList.add(new GameNode());

    GameNode node = new GameNode();
    node.setBoard(mock(Board.class));

    GameNode gameNode = new GameNode();
    gameNode.setBoard(new Board(true));
    GameNode gameNode2 = mock(GameNode.class);
    when(gameNode2.getVariations()).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode2.getBoard()).thenThrow(new IllegalArgumentException("Event"));
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
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode3);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
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
    verify(gameNode3).setBoard(isA(Board.class));
    verify(gameNode2).setParent(isA(GameNode.class));
  }

  /**
   * Test {@link EditMenuController#copyGame()}.
   * <ul>
   *   <li>Given {@link GameNode} {@link GameNode#getVariations()} throw {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code Event}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EditMenuController#copyGame()}
   */
  @Test
  @DisplayName("Test copyGame(); given GameNode getVariations() throw IllegalArgumentException(String) with 'Event'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EditMenuController.copyGame()"})
  void testCopyGame_givenGameNodeGetVariationsThrowIllegalArgumentExceptionWithEvent() {
    // Arrange
    GameNode gameNode = mock(GameNode.class);
    when(gameNode.getVariations()).thenThrow(new IllegalArgumentException("Event"));
    when(gameNode.getComment()).thenReturn("Comment");
    when(gameNode.getBoard()).thenReturn(new Board());
    doNothing().when(gameNode).setBoard(Mockito.<Board>any());
    gameNode.setBoard(new Board());
    Game game = mock(Game.class);
    when(game.getHeader(Mockito.<String>any())).thenReturn("Header");
    when(game.getTags()).thenReturn(new ArrayList<>());
    when(game.getRootNode()).thenReturn(gameNode);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getGame()).thenReturn(game);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new EditMenuController(gameModel)).copyGame());
    verify(gameModel).getGame();
    verify(game, atLeast(1)).getHeader(Mockito.<String>any());
    verify(game, atLeast(1)).getRootNode();
    verify(game).getTags();
    verify(gameNode, atLeast(1)).getBoard();
    verify(gameNode, atLeast(1)).getComment();
    verify(gameNode).getVariations();
    verify(gameNode).setBoard(isA(Board.class));
  }
}
