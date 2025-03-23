package org.asdfjkl.jfxchess.gui;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.asdfjkl.jfxchess.lib.Game;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GameMenuControllerDiffblueTest {
  /**
   * Test {@link GameMenuController#handleNextGame()}.
   * <ul>
   *   <li>Given {@link GameModel} {@link GameModel#getPgnDatabase()} return {@link PgnDatabase} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link GameMenuController#handleNextGame()}
   */
  @Test
  @DisplayName("Test handleNextGame(); given GameModel getPgnDatabase() return PgnDatabase (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameMenuController.handleNextGame()"})
  void testHandleNextGame_givenGameModelGetPgnDatabaseReturnPgnDatabase() {
    // Arrange
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getPgnDatabase()).thenReturn(new PgnDatabase());

    // Act
    (new GameMenuController(gameModel)).handleNextGame();

    // Assert
    verify(gameModel).getPgnDatabase();
  }

  /**
   * Test {@link GameMenuController#handleNextGame()}.
   * <ul>
   *   <li>Given {@link PgnDatabase} {@link PgnDatabase#getNrGames()} return one.</li>
   *   <li>Then calls {@link PgnDatabase#getNrGames()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameMenuController#handleNextGame()}
   */
  @Test
  @DisplayName("Test handleNextGame(); given PgnDatabase getNrGames() return one; then calls getNrGames()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameMenuController.handleNextGame()"})
  void testHandleNextGame_givenPgnDatabaseGetNrGamesReturnOne_thenCallsGetNrGames() {
    // Arrange
    PgnDatabase pgnDatabase = mock(PgnDatabase.class);
    when(pgnDatabase.getNrGames()).thenReturn(1);
    GameModel gameModel = mock(GameModel.class);
    when(gameModel.getPgnDatabase()).thenReturn(pgnDatabase);

    // Act
    (new GameMenuController(gameModel)).handleNextGame();

    // Assert
    verify(gameModel).getPgnDatabase();
    verify(pgnDatabase).getNrGames();
  }

  /**
   * Test {@link GameMenuController#handleNextGame()}.
   * <ul>
   *   <li>Given {@link PgnDatabase} {@link PgnDatabase#loadGame(int)} return {@link Game} (default constructor).</li>
   *   <li>Then calls {@link GameModel#setGame(Game)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameMenuController#handleNextGame()}
   */
  @Test
  @DisplayName("Test handleNextGame(); given PgnDatabase loadGame(int) return Game (default constructor); then calls setGame(Game)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameMenuController.handleNextGame()"})
  void testHandleNextGame_givenPgnDatabaseLoadGameReturnGame_thenCallsSetGame() {
    // Arrange
    PgnDatabase pgnDatabase = mock(PgnDatabase.class);
    when(pgnDatabase.loadGame(anyInt())).thenReturn(new Game());
    when(pgnDatabase.getNrGames()).thenReturn(GameModel.MAX_N_ENGINES);
    GameModel gameModel = mock(GameModel.class);
    doNothing().when(gameModel).setGame(Mockito.<Game>any());
    doNothing().when(gameModel).triggerStateChange();
    when(gameModel.getPgnDatabase()).thenReturn(pgnDatabase);

    // Act
    (new GameMenuController(gameModel)).handleNextGame();

    // Assert
    verify(gameModel, atLeast(1)).getPgnDatabase();
    verify(gameModel).setGame(isA(Game.class));
    verify(gameModel).triggerStateChange();
    verify(pgnDatabase).getNrGames();
    verify(pgnDatabase).loadGame(eq(1));
  }

  /**
   * Test {@link GameMenuController#handleNextGame()}.
   * <ul>
   *   <li>Then calls {@link Game#setHeaderWasChanged(boolean)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link GameMenuController#handleNextGame()}
   */
  @Test
  @DisplayName("Test handleNextGame(); then calls setHeaderWasChanged(boolean)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void GameMenuController.handleNextGame()"})
  void testHandleNextGame_thenCallsSetHeaderWasChanged() {
    // Arrange
    Game game = mock(Game.class);
    doNothing().when(game).setHeaderWasChanged(anyBoolean());
    doNothing().when(game).setTreeWasChanged(anyBoolean());
    PgnDatabase pgnDatabase = mock(PgnDatabase.class);
    when(pgnDatabase.loadGame(anyInt())).thenReturn(game);
    when(pgnDatabase.getNrGames()).thenReturn(GameModel.MAX_N_ENGINES);
    GameModel gameModel = mock(GameModel.class);
    doNothing().when(gameModel).setGame(Mockito.<Game>any());
    doNothing().when(gameModel).triggerStateChange();
    when(gameModel.getPgnDatabase()).thenReturn(pgnDatabase);

    // Act
    (new GameMenuController(gameModel)).handleNextGame();

    // Assert
    verify(gameModel, atLeast(1)).getPgnDatabase();
    verify(gameModel).setGame(isA(Game.class));
    verify(gameModel).triggerStateChange();
    verify(pgnDatabase).getNrGames();
    verify(pgnDatabase).loadGame(eq(1));
    verify(game).setHeaderWasChanged(eq(true));
    verify(game).setTreeWasChanged(eq(true));
  }
}
