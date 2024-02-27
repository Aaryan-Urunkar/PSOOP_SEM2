public class Rectangle extends Shape {
    int length, width;
    void setDimensions(int length, int width){
        this.length = length;
        this.width = width;
    }

    void displayDimensions(){
        System.out.println("Length = " + length + "\n Width = "+ width);
        System.out.println("\n Area = " + super.calcArea(length,width));
    }

    public static void main(String[] args) {
        Rectangle ob = new Rectangle();
        ob.setDimensions(4, 5);
        ob.displayDimensions();
    }
}
