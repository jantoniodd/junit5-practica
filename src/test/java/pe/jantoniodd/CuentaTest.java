package pe.jantoniodd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pe.jantoniodd.domains.Cuenta;

class CuentaTest {

    @Test
    void testNombreCuenta() {

        Cuenta cuenta = new Cuenta();
        cuenta.setPersona("Jose");

        String esperado = "Jose";
        String real = cuenta.getPersona();

        Assertions.assertEquals(esperado, real);

    }

}
