public class Grandparent {
    void name(){
        System.out.println("this is parent");

    }
}
class parent extends Grandparent{
    parent(){
        System.out.println("this is chil1");
    }
}
class child extends parent{
    child(){
        System.out.println("this is child2");

    }
}
class Main{
    public static void main(String[] args) {
        
        child ch=new child();
        ch.name();
    }
}
