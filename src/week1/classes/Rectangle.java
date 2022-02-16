package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String Color;

    public Rectangle(int width, int height) {
        this.width = width >= 0 ? width : 1;
        this.height = height >= 0 ? height : 1;
        this.Color = "Blue";
    }

    public Rectangle(int width, int height, String Color) {
        this.width = width >= 0 ? width : 1;
        this.height = height >= 0 ? height : 1;
        this.Color = Color.substring(0, 1).toUpperCase() + Color.substring(1);
    }

    public void draw() {
        String firstLetter = this.Color.substring(0, 1);

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(firstLetter);
            }
            System.out.println("");
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.Color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String Color) {
        this.Color = Color.substring(0, 1).toUpperCase() + Color.substring(1);
    }
}
