import java.util.Date;

public class JVM_PC {

    public static void main(String[] args) {
        int i = 20;
        int j = 30;
        int k = i + j;
        String str = "hello";
        System.out.println(str);
    }

    public String test(Date dateP, String name2){
        dateP = null;
        name2 = "Jack";
        double weight = 1.1;
        char gender = '男';
        return dateP + name2;
    }

    public void testAddOperand(){
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

}
