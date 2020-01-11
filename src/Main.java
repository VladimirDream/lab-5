public class Main {
    public static void main (String[] args){

    System.out.println("Перегрузка метода");
    Overload obi = new Overload();
    obi.overload();
    System.out.println("-----------------------------------------------------------");

    System.out.println("Рекурсия");
    Recursion r = new Recursion();
    r.recursion();
    System.out.println("-----------------------------------------------------------");

    System.out.println("Применение объектов в качестве параметров");
    PassOb op = new PassOb();
    op.Pas();
    }

}