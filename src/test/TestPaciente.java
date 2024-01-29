package test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Paciente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestPaciente {

  @Test
  @Order(1)
  @DisplayName("1 - Testa Baixo peso muito grave")
  public void testImcBaixoPesoMuitoGrave() {
    Paciente paciente = new Paciente(40, 1.60);
    double result = paciente.calcularIMC(paciente.getPeso(), paciente.getAltura());
    String diagnostic = paciente.diagnostico(result);
    assertEquals(15.63, round(result), 2);
    assertEquals("Baixo peso muito grave", diagnostic);
  }

  @Test
  @Order(2)
  @DisplayName("2 - Testa Baixo peso grave")
  public void testImcBaixoPesoGrave() {
    Paciente paciente = new Paciente(50, 1.72);
    double result = paciente.calcularIMC(paciente.getPeso(), paciente.getAltura());
    String diagnostic = paciente.diagnostico(result);
    assertEquals(16.91, round(paciente.calcularIMC(paciente.getPeso(),
        paciente.getAltura())), 2);
    assertEquals("Baixo peso grave", diagnostic);
  }

}
