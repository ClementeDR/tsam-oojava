package dirosa.clemente.lampadina.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dirosa.clemente.lampadina.base.CircuitoElettrico;
import dirosa.clemente.lampadina.base.Lampadina;

@RunWith(Suite.class)
@SuiteClasses({CircuitoElettrico.class, Lampadina.class})
public class AllTests {

}
