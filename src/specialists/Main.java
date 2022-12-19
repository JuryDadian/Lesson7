package specialists;

public class Main {
    public static void main(String[] args) {

        JobTitle director = new Director();
        director.print("директор");

        JobTitle worker = new Worker();
        worker.print("рабочий");

        JobTitle accountant = new Accountant();
        accountant.print("бухгалтер");
    }
}
