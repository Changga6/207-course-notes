/**
 * A class storing the height and width of a Rectangle as doubles.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * A constructor for Rectangle.
   *
   * @param w The width of the Rectangle.
   *
   * @param h The height of the Rectangle.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area of the Rectangle as width times height.
   *
   * @return Returns the area of the Rectangle as a double.
   */
  public double area() {
    return width * height;
  }

  /**
   * Increase the height and width of a Rectangle by a factor.
   *
   * @param factor Increase the height and width by factor times.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Determines if this Rectangle has a larger area than the other.
   *
   * @return True if the area of this Rectangle is larger, false otherwise.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
