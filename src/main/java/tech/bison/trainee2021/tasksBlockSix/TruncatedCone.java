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
   * @param baseRadius
   *          radius of the base circle
   * @param topRadius
   *          radius of the top circle
   */
  public double getSurface() {
    double baseRadius = base.getRadius();
    double topRadius = top.getRadius();
    return Math.PI * (Math.pow(topRadius, 2) + Math.pow(baseRadius, 2) + getSeathLine() * (baseRadius + topRadius));
  }

  public double getSeathing() {
    return (top.getRadius() + base.getRadius()) * Math.PI * getSeathLine();
  }

  public double getSeathLine() {
    return Math.sqrt(Math.pow(base.getRadius() - top.getRadius(), 2) + Math.pow(height, 2));
  }

  public Object getVolume() {
    double baseRadius = base.getRadius();
    double topRadius = top.getRadius();
    return height * Math.PI / 3 * (Math.pow(baseRadius, 2) + baseRadius * topRadius + Math.pow(topRadius, 2));
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
