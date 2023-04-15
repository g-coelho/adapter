import org.example.Paciente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PacienteTest {

    @Test
    public void deveRetornarEstadoPaciente(){
        Paciente paciente = new Paciente();
        paciente.setAvaliacao("Hipotermia");

        assertEquals("Hipotermia", paciente.getAvaliacao());
    }

    @Test
    public void deveRetornarTemperaturaPaciente(){
        Paciente paciente = new Paciente();
        paciente.setAvaliacao("Hipotermia");

        assertEquals(34.0f, paciente.getTemperatura(), 0.1f);
    }

}
