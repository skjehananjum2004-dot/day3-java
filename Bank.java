abstract class Bank {
    abstract void money();
    void balance(){
        System.out.println("Balance is checked");
    }
    }
    class SBI extends Bank{
        void money(){
            System.out.println("Money Accepted!!");
        }
        }
    class Main{
        public static void main(String[] args) {
            User u1=new User();
            
            SBI obj=new SBI();
            obj.money();
            obj.balance();
        }
    }
