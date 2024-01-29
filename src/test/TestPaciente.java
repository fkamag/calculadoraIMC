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
    assertEquals(15.62, result, 0.01);
    assertEquals("Baixo peso muito grave", diagnostic);
  }

  @Test
  @Order(2)
  @DisplayName("2 - Testa Baixo peso grave")
  public void testImcBaixoPesoGrave() {
    Paciente paciente = new Paciente(50, 1.72);
    double result = paciente.calcularIMC(paciente.getPeso(), paciente.getAltura());
    String diagnostic = paciente.diagnostico(result);
    assertEquals(16.90, result, 0.01);
    assertEquals("Baixo peso grave", diagnostic);
  }

  @Test
  @Order(3)
  @DisplayName("3 - Testa Baixo peso")
  public void testImcBaixoPeso() {
    Paciente paciente = new Paciente(53, 1.70);
    double result = paciente.calcularIMC(paciente.getPeso(), paciente.getAltura());
    String diagnostic = paciente.diagnostico(result);
    assertEquals(18.34, result, 0.01);
    assertEquals("Baixo peso", diagnostic);
  }

  @Test
  @Order(4)
  @DisplayName("4 - Testa Peso normal")
  public void testImcPesoNormal() {
    Paciente paciente = new Paciente(77, 1.82);
    double result = paciente.calcularIMC(paciente.getPeso(), paciente.getAltura());
    String diagnostic = paciente.diagnostico(result);
    assertEquals(23.25, result, 0.01);
    assertEquals("Peso normal", diagnostic);
  }

  @Test
  @Order(5)
  @DisplayName("5 - Testa Sobrepeso")
  public void testImcSobrepeso() {
    Paciente paciente = new Paciente(96, 1.80);
    double result = paciente.calcularIMC(paciente.getPeso(), paciente.getAltura());
    String diagnostic = paciente.diagnostico(result);
    assertEquals(29.63, result, 0.01);
    assertEquals("Sobrepeso", diagnostic);
  }

}
