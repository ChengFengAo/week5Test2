/*
package tw.core;

import org.junit.Before;
import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.generator.AnswerGenerator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

*/
/**
 * 在GameTest文件中完成Game中对应的单元测试
 *//*



public class GameTest {
    private Game game;
    @Before
    public void start()throws OutOfRangeAnswerException {
        String[] expectedString={"1","3","5","7"};
        List<String>  expectedList=Arrays.asList(expectedString);
        Answer expectedAnswer= new Answer();
        expectedAnswer.setNumList(expectedList);
        AnswerGenerator answerGenerator=mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(expectedAnswer);
        this.game=new Game(answerGenerator);
    }
    @Test
    public void testGuess(){
        String expectResult="2A2B";
        String[] inputdString={"7","3","5","1"};
        List<String> iputList=Arrays.asList(inputdString);
        Answer inptAnswer= new Answer();
        inptAnswer.setNumList(iputList);
        assertThat(game.guess(inptAnswer).getResult(),is(equalTo(expectResult)));
    }

    @Test
    public void testCheckStatusContinueAndSuccess(){
        assertThat(game.checkStatus(),is(equalTo("continue")));

        Answer answerContinue=Answer.createAnswer("2 3 5 7");
        game.guess(answerContinue);
        assertThat(game.checkStatus(),is(equalTo("continue")));

        Answer answerSuccess=Answer.createAnswer("1 3 5 7");
        game.guess(answerSuccess);
        assertThat(game.checkStatus(),is(equalTo("success")));
    }
  @Test
  public void testCheckStatusFail(){
      for (int i = 0; i <7 ; i++) {
          Answer mockAnswer=mock(Answer.class);
         game.guess(mockAnswer);
      }
      assertThat(game.checkStatus(),is(equalTo("fail")));
  }



}

*/
