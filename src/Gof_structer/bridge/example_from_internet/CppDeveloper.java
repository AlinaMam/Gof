package Gof_structer.bridge.example_from_internet;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
