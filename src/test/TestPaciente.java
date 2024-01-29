package test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import main.Paciente;
import main.Principal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPaciente {

  @Test
  @DisplayName("1 - Testa peso muito baixo")
  public void testImcBaixoPesoMuitoGrave() {

    Paciente paciente = new Paciente(40, 1.60);
    assertEquals(15.62, round(paciente.calcularIMC(paciente.getPeso(),
        paciente.getAltura())), 2);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);
    Principal.main(null);

    String output = baos.toString();
    assertTrue(output.contains("Baixo peso muito grave"));

  }

}
