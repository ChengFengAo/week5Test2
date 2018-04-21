package tw.core;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {
    private RandomIntGenerator randomIntGenerator;
    @Before
    public void creatRandomIntGeneratorObject() {
         randomIntGenerator=new RandomIntGenerator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRandomIntGeneratorThrowException() {
        int digitmax=2,numberOfNedd=3;
        randomIntGenerator.generateNums(digitmax,numberOfNedd);
    }

    @Test
    public void testRandomIntGeneratorRangeOfNumber() {
        int digitmax=9,numberOfNedd=4;
         String result=randomIntGenerator.generateNums(digitmax,numberOfNedd);
         String[] testData=result.split(" ");
        for (int i = 0; i <testData.length ; i++) {
            boolean  numberRange=(Integer.parseInt(testData[i])>=0||Integer.parseInt(testData[i])<=9);
            assertThat(numberRange,is(equalTo(true)));
        }

    }
    @Test
    public void testRandomIntGeneratorNoRepeat()
    {
        int digitmax=9,numberOfNedd=4;
        String result=randomIntGenerator.generateNums(digitmax,numberOfNedd);
        String[] testData=result.split(" ");
        List<String> noRepeat= Stream.of(testData)
                .distinct()
                .collect(Collectors.toList());
        assertThat(noRepeat.size(),is(equalTo(4)));
    }


}