package JavaTest;
class shape{
    void draw(){
        System.out.println("Drawing Main shapes !!");
    }
    void erase(){
        System.out.println("Erasing Main Shapes !!");
    }
}
class circle extends shape{
    void draw() {
        System.out.println("Drawing Circle !!");
    }
    void erase() {
        System.out.println("Erasing Circle !!");
    }
}
class trianle extends shape{
    void draw() {
        System.out.println("Drawing Triangle !!");
    }
    void erase() {
        System.out.println("Erasing Triangle !!");
    }
}
class sqaure extends shape{
    void draw() {
        System.out.println("Drawing Square !!");
    }
    void erase() {
        System.out.println("Erasing Square !!");
    }
}
public class q3 {
    public static void main(String[] args) {
        shape sp;

        sp = new circle();
        sp.draw();
        sp.erase();

        sp = new trianle();
        sp.draw();
        sp.erase();

        sp = new sqaure();
        sp.draw();
        sp.erase();
    }
}
