package tw.core;
import org.junit.Assert;
import org.junit.Test;
import tw.validator.InputValidator;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    InputValidator inputObject=new InputValidator();
    //InputValidator input=mock(InputValidator.class);
    @Test
    public void testValidate() {
        Assert.assertTrue(inputObject.validate("2 4 5 7"));
        Assert.assertFalse(inputObject.validate(""));
        Assert.assertFalse(inputObject.validate("2 3 4 5 6"));
        Assert.assertFalse(inputObject.validate("2，#，@"));
        Assert.assertFalse(inputObject.validate("2 3 3 5"));
        Assert.assertFalse(inputObject.validate("0 10 3 4"));
    }
}
