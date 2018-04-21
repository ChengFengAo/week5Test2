package tw.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.common.graph.AbstractNetwork;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.generator.AnswerGenerator;
import tw.core.model.Record;

import javax.xml.ws.Action;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    @Test
    public void validate_Effective_equivalence_class() throws OutOfRangeAnswerException {
        Answer answer = Answer.createAnswer("1 3 5 7");
        answer.validate();
    }

    @Rule
    public ExpectedException exceptions = ExpectedException.none();

    @Test
    public void validate_RepeatdeNumber() throws OutOfRangeAnswerException {
        Answer answer = Answer.createAnswer("2 3 3 5");
        exceptions.expect(OutOfRangeAnswerException.class);
        exceptions.expectMessage("Answer format is incorrect");
        answer.validate();
    }

    @Test(expected = OutOfRangeAnswerException.class)
    public void validate_outOfRange() throws OutOfRangeAnswerException {
        Answer answer = Answer.createAnswer("3 4 5 10");
        answer.validate();
    }

    @Test
    public void check() {
        Answer answerReferentce = Answer.createAnswer("1 3 5 7");
        Answer inputAnswer = Answer.createAnswer("7 3 5 1");
        int[] expectedResult = new int[]{2, 2};
        Record actureResult = inputAnswer.check(answerReferentce);
        assertThat(actureResult.getValue(), is(equalTo(expectedResult)));
    }

}