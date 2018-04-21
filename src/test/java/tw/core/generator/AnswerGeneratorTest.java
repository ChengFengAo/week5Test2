package tw.core.generator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import org.mockito.internal.matchers.Equals;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {
    @Test
    public void testAnswerGenetator() throws OutOfRangeAnswerException{
      //  Answer answers=new Answer();
        Answer expected=Answer.createAnswer("1 3 5 7");

       RandomIntGenerator randomIntGenerator=mock(RandomIntGenerator.class);
       when(randomIntGenerator.generateNums(9,4)).thenReturn("1 3 5 7");

       AnswerGenerator answerGenerators= new AnswerGenerator(randomIntGenerator);
       assertThat(answerGenerators.generate().toString(),is(equalTo(expected.toString())));
    }



}

