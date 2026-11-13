public class parent {
    void name(){
        System.out.println("this is parents");

    }
}
class Child1 extends parent{
    Child1(){
        System.out.println("thhis is child1");

    }
}
class Child2 extends parent{
    Child2(){
        System.out.println("this is Child2");

    }
}
class Main{
    public static void main(String[] args){
        Child1 ch1=new Child1();
        ch1.name();
        Child2 ch2=new Child2();
        ch2.name();


        
    }
}