package edwin;

import org.junit.Test;

import static org.junit.Assert.*;

public class practiceTest {
    @Test
    public void getType() throws Exception {
        Practice triangle = new Practice(5, 10, 5);

        String result = triangle.getType();

        Assert.assertEquals("不是三角形", result);
    }

}
