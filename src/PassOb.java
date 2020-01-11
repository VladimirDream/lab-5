//Объекты допускается передавать методам в качестве параметров
class Test {
    int a, b;
    Test  (int i, int j) {
        a = i;
        b = j;
    }
   // возвратить логическое значение true, если в качестве  параметра о указан вызывающий объект
    boolean equals (Test o) {
        if (o.a == a && o.b == b) return  true;
        else return false;
    }
}

public class PassOb {
    public void Pas() {
        PassOb po = new PassOb();
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("o1 == oЬ2: " + ob1.equals(ob2));
        System.out.println("o1 == oЬ3: " + ob1.equals(ob3));

    }
}
