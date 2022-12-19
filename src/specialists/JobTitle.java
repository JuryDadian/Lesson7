package specialists;

public interface JobTitle {
    default void print(String text) {
        System.out.println("Сотрудник занимает должность: " + text);
    }
}
