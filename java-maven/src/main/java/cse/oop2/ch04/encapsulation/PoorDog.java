package cse.oop2.ch04.encapsulation;

public class PoorDog {
    private int size;
    private String name;

    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        PoorDog dog = new PoorDog();
        System.out.println("개 크기:"+dog.getSize());
        System.out.println("개 이름:"+dog.getName());
    }
}
