package pl.foltak.poc.test.with.embedded.container;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mariusz Foltak <mariusz@foltak.pl>
 */
public class CalculatorBeanTest {

    private EJBContainer container;
    private CalculatorBean instance;

    @Before
    public void setUp() throws NamingException {
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        instance = (CalculatorBean) container.getContext().lookup(
                "java:global/classes/CalculatorBean");
    }

    @After
    public void tearDown() {
        container.close();
    }

    @Test
    public void testAdd() {
        assertEquals(30, instance.add(10, 20));
    }

}
