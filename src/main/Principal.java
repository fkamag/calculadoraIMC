package main;

public class Principal {

  public static void main(String[] args) {
    Paciente p1 = new Paciente(40, 1.60);
    Paciente p2 = new Paciente(70, 1.75);
    Paciente p3 = new Paciente(96.5, 1.80);

    double imc1 = p1.calcularIMC(p1.peso, p1.altura);
    System.out.println("IMC do Paciente 1: " + imc1);
    System.out.println(p1.diagnostico(imc1));

    double imc2 = p2.calcularIMC(p2.peso, p2.altura);
    System.out.println("IMC do Paciente 2: " + imc2);
    System.out.println(p2.diagnostico(imc2));

    double imc3 = p3.calcularIMC(p3.peso, p3.altura);
    System.out.println("IMC do Paciente 3: " + imc3);
    System.out.println(p3.diagnostico(imc3));
  }

}

