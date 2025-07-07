package test.ex1.ex2;

public class Pair <T1, T2>{


    private T1 first;
    private T2 secound;

    public void setFirst(T1 first){
        this.first=first;

    }

    public void setSecound(T2 secound){
        this.secound=secound;
    }

    public T1 getFirst() {
        return first;
    }
    public T2 getSecond() {
        return secound;
    }
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + secound +
                '}';
    }


    public static void runPairTest(){
        Pair<Integer , String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecound("data");

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println("pair1 = " + pair1);
        Pair<String, String> pair2 = new Pair<>();
        pair2.setFirst("key");
        pair2.setSecound("value");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println("pair2 = " + pair2);
    }
}


