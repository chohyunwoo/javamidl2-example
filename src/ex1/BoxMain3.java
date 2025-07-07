package ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);

        Integer integer = integerBox.get();
        System.out.println("Integer = "+integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("String = " + str);

    }


}
