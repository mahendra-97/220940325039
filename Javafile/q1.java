package JavaTest;


import java.util.ArrayList;
public class q1 {

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList();
        s.add("Hello");
        s.add("How");
        s.add("are");
        s.add("you!!");
        s.add("Wanna");
        s.add("Play");
        s.add("Valorant ?");

        for (String i:s) {
            System.out.println(i);
        }
    }
}
