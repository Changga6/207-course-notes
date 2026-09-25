/**
 A class for a Rectangle with height and width.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
 Resets the height and width of the Rectangle to w and h respectively.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
    Returns the area the rectangle.
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
  Returns true if the area of this Rectangle is larger than the other, false if otherwise.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
