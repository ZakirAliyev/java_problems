package az.iktlab.lessons.lesson12;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class findPassword2Test {

    @Test
    public void find() {
        Assert.assertEquals(false,findPassword2.findPass("72346"));
        Assert.assertEquals(false,findPassword2.findPass("asd46"));
        Assert.assertEquals(true,findPassword2.findPass("asdasdasdasd46"));
        Assert.assertEquals(false,findPassword2.findPass("72aasdasdasd.46"));
        Assert.assertEquals(true,findPassword2.findPass("asdasdas12"));
        Assert.assertEquals(false,findPassword2.findPass("adsd.asdasasdas"));
        Assert.assertEquals(false,findPassword2.findPass("adsdasdasasdas"));
    }
}
