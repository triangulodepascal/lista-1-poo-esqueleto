package br.inatel.cdg.algebra.mathClasses;

public class Ponto {
  private double coordenadaX;
  private double coordenadaY;

  public Ponto(double coordenadaX, double coordenadaY) {
    setCoordenadaX(coordenadaX);
    setCoordenadaY(coordenadaY);
  }

  public double getCoordenadaX() {
    return coordenadaX;
  }

  public double getCoordenadaY() {
    return coordenadaY;
  }

  public void setCoordenadaX(double coordenadaX) {
    this.coordenadaX = coordenadaX;
  }

  public void setCoordenadaY(double coordenadaY) {
    this.coordenadaY = coordenadaY;
  }
}
