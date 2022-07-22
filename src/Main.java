import com.company.Animal;
import com.company.Eagle;
import com.company.Shark;
import com.company.Turtle;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            }
        }
        for (Animal b : animals) {
            if (b instanceof Turtle) {
                ((Turtle) b).swim();
            }
        }
        for (Animal c : animals) {
            if (c instanceof Eagle) {
                ((Eagle) c).fly();
            }
        }
        System.out.println("______________________");
        for (Animal a : animals) {
            if (a.getClass().getName().equals("com.company.Shark")) {
                a.voice();
            }
        }
        for (Animal b : animals) {
            if (b.getClass().getName().equals("com.company.Turtle")) {
                b.voice();
            }
        }
        for (Animal c : animals) {
            if (c.getClass().getName().equals("com.company.Eagle")) {
                c.voice();
            }
        }
    }
}