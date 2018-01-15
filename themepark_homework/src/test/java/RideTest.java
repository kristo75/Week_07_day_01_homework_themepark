import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    RollerCoaster rollerCoaster;
    Dodgem dodgem;
    Waltzer waltzer;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster(15.50, 16, 184);
        dodgem = new Dodgem(10.50, 13, 164);
        waltzer = new Waltzer(7.50, 12, 143);
    }

    @Test

    public void canGetPrice(){
        assertEquals(15.50, rollerCoaster.getPrice(), 0.01);
    }

    @Test

    public void canGetMinAge(){
        assertEquals(12, waltzer.getMinAge());
    }

    @Test

    public void canGetHeight(){
        assertEquals(143, RollerCoaster.getHeight());
    }
}



