public class rbi {
    void loan(){
        System.out.println("lone provided ny rbi;");
    }
    }
class sbi extends rbi{
    void sbiBank(){
        System.out.println("SBI Bank");

    }
}
class Main{
    public static void main(String[] args){
        sbi obj=new sbi();
        obj.loan();
        obj.sbiBank();
    }
}