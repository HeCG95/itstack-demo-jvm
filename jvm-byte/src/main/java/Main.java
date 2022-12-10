import java.io.File;

public class Main {

    public static void main(String[] args) {

//        Integer i = null;
//        Boolean flag = false;
//        System.out.println(flag ? 0: i);

        new Main().infinityNaN();

    }

    private void load(int age, String name) {
        load(age, name, 0);
    }

    private void load(int age, String name, long birthday) {
        System.out.println(age + name + birthday);
    }

    private void load(int age, String name, long birthday, boolean sex) {
        System.out.println(age + name + birthday + sex);
    }

    public void pushConstLdc() {
        // 范围 [-1,5]
        int iconst = -1;
        int iconst2 = 6;
        // 范围 [-128,127]
        int bipush = 127;
        // 范围 [-32768,32767]
        int sipush= 32767;
        // 其他 int
        int ldc = 32768;
        String aconst = null;
        String IdcString = "沉默王二";
    }

    public void store(int age, String name) {
        int temp = age + 2;
        String str = name;
    }

    public void infinityNaN() {
        int i = 10;
        double j = i / 0.0;
        System.out.println(j); // Infinity

        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(d2); // NaN
    }

    public void calculate(int age) {
        int add = age + 1;
        int sub = age - 1;
        int mul = age * 2;
        int div = age / 3;
        int rem = age % 4;
        age++;
        age--;
    }

    public void updown() {
        int i = 10;
        double d = i;

        float f = 10f;
        long ong = (long)f;
    }

    public void newObject() {
        String name = new String("沉默王二");
        File file = new File("无愁河的浪荡汉子.book");
        int [] ages = {};
        Object [] ages2 = {};
    }

}
