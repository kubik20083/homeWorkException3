package data;
public class GenderException extends Exception {
    public GenderException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}