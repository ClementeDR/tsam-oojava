package dirosa.clemente.azienda.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dirosa.clemente.azienda.base.Azienda;
import dirosa.clemente.azienda.base.Dipendente;
import dirosa.clemente.azienda.test.base.ContrattoLavoroTest;

@RunWith(Suite.class)
@SuiteClasses({Azienda.class, Dipendente.class, ContrattoLavoroTest.class})
public class AllTests {

}
