public class Factorial {
    //Рекурсивный метод
    int factR(int n) {
        int result;
        if (n == 1)
            return 1;
        result = factR(n - 1) * n;
        return result;
    }

    //Вариант программы, вычисляющий факториал итеративным способом
    int factI (int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++)
            result *= t;
        return result;
    }
}

class Recursion {
    public void recursion()  {
        Factorial f = new Factorial();

        System.out.println("Bычиcлeниe рекурсивным методом");
        System.out.println("Фaктopиaл З равен " + f.factR(3));
        System.out.println("Фaктopиaл 4 равен " + f.factR(4));
        System.out.println("Фaктopиaл 5 равен " + f.factR(5));
        System.out.println();

        System.out.println("Bычиcлeниe итеративным методом");
        System.out.println("Фaктopиaл З равен " + f.factI(3));
        System.out.println("Фaктopиaл 4 равен " + f.factI(4));
        System.out.println("Фaктopиaл 5 равен " + f.factI(5));
    }
}