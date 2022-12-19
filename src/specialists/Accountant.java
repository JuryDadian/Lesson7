package specialists;

public class Accountant implements JobTitle {
    @Override
    public void print(String text) {
        JobTitle.super.print(text);
    }
}
