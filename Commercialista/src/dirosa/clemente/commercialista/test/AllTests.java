package dirosa.clemente.commercialista.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dirosa.clemente.commercialista.base.Cliente;
import dirosa.clemente.commercialista.base.Commercialista;
import dirosa.clemente.commercialista.base.Dipendente;
import dirosa.clemente.commercialista.base.Imprenditore;
import dirosa.clemente.commercialista.base.LiberoProfessionista;
import dirosa.clemente.commercialista.base.Societa;

@RunWith(Suite.class)
@SuiteClasses({Cliente.class, Commercialista.class, Dipendente.class, Imprenditore.class, LiberoProfessionista.class, Societa.class})
public class AllTests {

}
