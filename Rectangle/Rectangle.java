package Rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }
}
