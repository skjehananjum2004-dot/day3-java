public class grandparents {

void name(){
    System.out.println("this is grandparents");
}
}
class parent extends grandparents{
    parent(){
        System.out.println("this is parent");

    }
}
class Child1 extends parent{
    Child1(){
        System.out.println("this is Child");
    }
}
class Child2 extends parent{
    Child2(){
        System.out.println("this is Child2");

    }
}
class grandparents {
    public static void main(String[] args) {
             Child ch=new Child();
              ch.name();
    }
}