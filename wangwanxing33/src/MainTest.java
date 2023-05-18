import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void solve() {
        //String s = Main.MakeFormula();
        String sum = Main.Solve("11+22");
       // System.out.printf(sum);
        Assert.assertEquals("11+22=33", sum);
    }
}
