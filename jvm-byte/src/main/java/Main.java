public class Main {

    public static void main(String[] args) {

        Integer i = null;
        Boolean flag = false;
        System.out.println(flag ? 0: i);

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

}
