package test.ex1;

public class Container<T>{
    private T item;

    /*

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public Boolean isEmpty(){
        return  item == null;
    }

     */

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public boolean isEmpty(){
        return  item == null;
    }

    public  void runTest(){
            Container<String> stringContainer = new Container<>();
            System.out.println("빈값 확인1: " + stringContainer.isEmpty());

            stringContainer.setItem("data1");
            System.out.println("저장 데이터: " + stringContainer.getItem());
            System.out.println("빈값 확인2: " +stringContainer.isEmpty());

            Container<Integer> integerContianer = new Container<>();
            integerContianer.setItem(10);
            System.out.println("저장 데이터: " +integerContianer.getItem());
    }
}
