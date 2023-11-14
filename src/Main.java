public class Main {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 5, d = 5;
        int c1 = --a + a--;
        int c2 = b-- + --b;
        int c3 = ++c - c++;
        int c4 = d++ - ++d;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("Информация о системе");
        System.out.print("Операционная система: ");
        System.out.print(System.getProperty("os.name") + " ");
        System.out.println(System.getProperty("os.version"));
        System.out.print("Количество ядер процессора: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("Количество памяти, доступной JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb");
    }
}