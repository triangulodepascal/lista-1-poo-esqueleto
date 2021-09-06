package br.inatel.cdg.algebra.mathClasses;

public class Reta {
  private Ponto p1;
  private Ponto p2;

  public Reta(double coordenadaXP1, double coordenadaYP1, double coordenadaXP2, double coordenadaYP2) {
    p1 = new Ponto(coordenadaXP1, coordenadaYP1);
    p2 = new Ponto(coordenadaXP2, coordenadaYP2);
  }

  public Ponto getP1() {
    return p1;
  }

  public Ponto getP2() {
    return p2;
  }

  public void setP1x(double p1x) {
    this.p1.setCoordenadaX(p1x);
  }

  public void setP1y(double p1y) {
    this.p1.setCoordenadaY(p1y);
  }

  public void setP2x(double p2x) {
    this.p2.setCoordenadaX(p2x);
  }

  public void setP2y(double p2y) {
    this.p2.setCoordenadaY(p2y);
  }

  public double calculaCoefAngular() {
    return (p2.getCoordenadaY() - p1.getCoordenadaY()) / (p2.getCoordenadaX() - p1.getCoordenadaX());
  }

  public double calculaCoefLinear() {
    return p1.getCoordenadaY() - (calculaCoefAngular() * p1.getCoordenadaX());
  }

}
