public class ThrowAndThrows {

    public static void main(String[] args) {
//        TestThrow obj=new TestThrow();
//        obj.checkNum(-2);
//        System.out.println(".................");
        TestThrows obj1=new TestThrows();
        try {
            obj1.checkNum(3,0);
        }catch (Exception e){
            System.out.println("Exception Handled");
        }

    }
}

class TestThrow {
    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\n number is negative, cannot calculate square");
        } else {
            System.out.println("Square of " + num + " is: " + (num * num));
        }
    }
}

class TestThrows{
    public static int checkNum(int m, int n) throws ArithmeticException{
       return  m/n;
    }
}

class Test1{
    public static void main(String[] args) {
        
    }
}
