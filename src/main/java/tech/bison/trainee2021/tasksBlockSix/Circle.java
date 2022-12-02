package tech.bison.trainee2021.tasksBlockSix;

public class Circle {

  private double diameter;

  public Circle() {
  }

  public Circle(double diameter) {
    this.setDiameter(diameter);
  }

  /**
   * Gets the diameter of a circle
   * 
   * @return diameter of the circle
   */
  public double getDiameter() {
    return diameter;
  }

  /**
   * Calculates the radius of a circle
   * 
   * @return radius of the circle
   */
  public double getRadius() {
    return diameter / 2;
  }

  /**
   * Sets the diameter of a circle
   * 
   * @param diameter
   *          This is the new diameter of the circle.
   */
  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  /**
   * Sets the radius of a circle (which is half the diameter)
   * 
   * @param radius
   *          This is the new diameter of the circle (which is half the new diameter).
   */
  public void setRadius(double radius) {
    this.diameter = radius * 2;
  }

  /**
   * Calculates the area of a circle.
   * 
   * @return area of the circle
   */
  public double getArea() {
    return Math.pow(diameter / 2, 2) * Math.PI;
  }
}
