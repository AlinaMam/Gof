package Gof_structer.bridge.example_from_lesson;

public class TouchTerminal implements Terminal{
    @Override
    public void bill(int cost) {
        System.out.println("Touch Terminal billing " + cost);
    }
}
