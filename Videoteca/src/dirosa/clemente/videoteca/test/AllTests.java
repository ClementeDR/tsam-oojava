package dirosa.clemente.videoteca.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dirosa.clemente.videoteca.base.Attore;
import dirosa.clemente.videoteca.base.BluRay;
import dirosa.clemente.videoteca.base.Cassetta;
import dirosa.clemente.videoteca.base.Cliente;
import dirosa.clemente.videoteca.base.Dvd;
import dirosa.clemente.videoteca.base.Film;

@RunWith(Suite.class)
@SuiteClasses({Attore.class, BluRay.class, Cassetta.class, Cliente.class, Dvd.class, Film.class})
public class AllTests {

}
