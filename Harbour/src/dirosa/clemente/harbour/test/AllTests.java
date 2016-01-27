package dirosa.clemente.harbour.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dirosa.clemente.harbour.base.Aereo;
import dirosa.clemente.harbour.base.Gioco;
import dirosa.clemente.harbour.base.Invasore;
import dirosa.clemente.harbour.base.Sottomarino;

@RunWith(Suite.class)
@SuiteClasses({Aereo.class, Gioco.class, Invasore.class, Sottomarino.class})
public class AllTests {

}
