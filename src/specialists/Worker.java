package specialists;

public class Worker implements JobTitle {
    @Override
    public void print(String text) {
        JobTitle.super.print(text);
    }
}
