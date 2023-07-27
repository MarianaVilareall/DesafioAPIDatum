package br.ce.mariana.suite;

import br.ce.mariana.test.CadastroUserTest;
import br.ce.mariana.test.ConsultarListaUserTest;
import br.ce.mariana.test.ConsultarUserTest;
import br.ce.mariana.test.UpdateUserTest;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({
        CadastroUserTest.class,
        ConsultarListaUserTest.class,
        ConsultarUserTest.class,
        UpdateUserTest.class
})
public class Suite {
}
