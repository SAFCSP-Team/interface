// * Create an interface named `Shape` which should contain only one method called `calculateArea()`.
// * Create `Rectangle` and `Circle` classes that implement the `Shape` interface.
// * Override the `calculateArea()` method in each class.
// * In the main method, create an object from each class and return the result of `calculateArea()` method, and print it.


public class Main implements Shape {
    private double circleResult;
    private float rectangleResult;

         public double Circle(double radius){
            this.circleResult = radius * 3.14;
            return this.circleResult;

        }

        


        public float Rectangle(float length, float width){
            this.rectangleResult = length * width;
            return this.rectangleResult;
        }

        public void printCircle(){
            System.err.println(this.circleResult);
        }
        
         public void rectangleResult(){
            System.err.println(this.rectangleResult);
        }
        
    public static void main(String[] args) {
       Main circle = new Main();
       circle.Circle(3);
       circle.printCircle();
       Main rect = new Main();
       rect.Rectangle(6 , 4);
       rect.rectangleResult();
    }
}
