package tw.controllers;

import org.junit.Before;

import org.junit.Test;

import tw.commands.InputCommand;

import tw.core.Game;
import tw.views.GameView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {

   private ByteArrayOutputStream outPut=new ByteArrayOutputStream();

    @Before
    public void start() {
        System.setOut(new PrintStream(outPut));
    }

    private String out() {
        return outPut.toString();
    }
    @Test
    public void testPlay() throws IOException{
        Game gameMock=mock(Game.class);
        when(gameMock.checkCoutinue()).thenReturn(Boolean.FALSE);
        when(gameMock.checkStatus()).thenReturn("fail");

        InputCommand inputCommandMock=mock(InputCommand.class);
        GameView gameView=new GameView();
        GameController gameController=new GameController(gameMock,gameView);

        gameController.play(inputCommandMock);
        assertThat(out(),is(equalTo("Game Status: fail\r\n")));
    }

}