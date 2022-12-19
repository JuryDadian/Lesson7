package specialists;

public class Director implements JobTitle {
    @Override
    public void print(String text) {
        JobTitle.super.print(text);
    }
}
