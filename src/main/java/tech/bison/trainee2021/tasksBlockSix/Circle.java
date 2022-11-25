package tech.bison.trainee2021.tasksBlockSix;

public class Circle {

  private double diameter;

  public Circle() {
  }

  public Circle(double diameter) {
    this.setDiameter(diameter);
  }

  public double getDiameter() {
    return diameter;
  }

  public double getRadius() {
    return diameter / 2;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  public void setRadius(double radius) {
    this.diameter = radius * 2;
  }

  public double getArea() {
    return Math.pow(diameter / 2, 2) * Math.PI;
  }
}
