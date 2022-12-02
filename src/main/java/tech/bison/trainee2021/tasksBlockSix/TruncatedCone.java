package tech.bison.trainee2021.tasksBlockSix;

public class TruncatedCone {

  private Circle base;
  private Circle top;
  private double height;

  public TruncatedCone(Circle base, Circle top, double height) {
    this.base = base;
    this.top = top;
    this.setHeight(height);
  }

  public TruncatedCone(double baseRadius, double topRadius, double height) {
    base = new Circle(baseRadius * 2);
    top = new Circle(topRadius * 2);
    this.height = height;
  }

  /**
   * Calculates the surface of a truncated cone
   * 
   * @return surface of the truncated cone
   */
  public double getSurface() {
    return getSeathing() + top.getArea() + base.getArea();
  }

  /**
   * Calculates the seathing area of a truncated cone
   * 
   * @return seathing area of the truncated cone
   */
  public double getSeathing() {
    return (top.getRadius() + base.getRadius()) * Math.PI * getSeathLine();
  }

  /**
   * Calculates the seathing line of a truncated cone
   * 
   * @return seathing line of the truncated cone
   */
  public double getSeathLine() {
    return Math.sqrt(Math.pow(base.getRadius() - top.getRadius(), 2) + Math.pow(height, 2));
  }

  /**
   * Calculates the volume of a truncated cone
   * 
   * @return volume of the truncated cone
   */
  public double getVolume() {
    double baseRadius = base.getRadius();
    double topRadius = top.getRadius();
    return height * Math.PI / 3 * (Math.pow(baseRadius, 2) + baseRadius * topRadius + Math.pow(topRadius, 2));
  }

  /**
   * Sets the height of a truncated cone
   * 
   * @param height
   *          This is the new height of a truncated cone.
   */
  public void setHeight(double height) {
    this.height = height;
  }
}
