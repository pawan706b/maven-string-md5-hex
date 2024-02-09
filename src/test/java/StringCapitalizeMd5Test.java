import com.smu.mscda.StringCapitalizeMd5;
import org.junit.Assert;
import org.junit.Test;

public class StringCapitalizeMd5Test {
    private String input="pawan";
    @Test
    public void testCapatalizeString(){
        Assert.assertEquals("PAWAN", StringCapitalizeMd5.capitalizeString(input));
    }
    @Test
    public void testStringToMD5Hex(){
        Assert.assertEquals("40eb95572d967a62183292ef5f78bf9a", StringCapitalizeMd5.generateMD5Hex(input));
    }

}
