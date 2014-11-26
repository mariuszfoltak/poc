package pl.foltak.poc.test.with.embedded.container;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Mariusz Foltak <mariusz@foltak.pl>
 */
@Stateless
@LocalBean
public class CalculatorBean {

    public int add(int a, int b) {
        return a + b;
    }
}
