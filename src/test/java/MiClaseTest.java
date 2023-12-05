

import static org.junit.Assert.*;
import org.junit.Test;

import com.example.MiClase;

public class MiClaseTest {

    @Test
    public void testDiaLaboral() {
        assertTrue(MiClase.dia_laboral("Lunes"));
        assertTrue(MiClase.dia_laboral("Martes"));
        assertTrue(MiClase.dia_laboral("Miercoles"));
        assertTrue(MiClase.dia_laboral("Jueves"));
        assertTrue(MiClase.dia_laboral("Viernes"));

        assertFalse(MiClase.dia_laboral("Sabado"));
        assertFalse(MiClase.dia_laboral("Domingo"));

        // También puedes probar un caso por defecto, por ejemplo, si se ingresa un día
        // no reconocido.
        assertFalse(MiClase.dia_laboral("OtroDia"));
    }
}
