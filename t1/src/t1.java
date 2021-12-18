import java.util.*;

public class t1 {
//    private static final Arrays;
//    private static final PolicySpi;
//    public static final int
    private static final int ti1=2;
    private static final char[] tc1={'2','3','5','6'};
    private static A pa1;
    private static A pa2;

    public static void main(String[] args) {
        System.out.println();

        tc1[1]='a';

        String s1="12345";
        System.out.println("s1 = " + s1);
        char a=s1.toCharArray()[1];

        Integer[] b=new Integer[]{11,2,6,4,5};
        System.out.println("b = " + Arrays.toString(b));
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        ArrayList arrayList=new ArrayList();
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            
        }
        int aa=(int)arrayList.get(1);
        System.out.println("aa = " + aa);
        System.out.println("b = " + Arrays.toString(b));
        System.out.println(1+'1');

        HashSet hashSet = new HashSet();
        hashSet.add("123");
        hashSet.add("234");
        System.out.println(hashSet.hashCode());
        HashSet hashSet1 = new HashSet();
        hashSet1.add("123");
        hashSet1.add("234");
        System.out.println(hashSet1.hashCode());
        hashSet.equals(hashSet1);
        A aa1=new A(5);
        System.out.println("aa1 = " + aa1.hashCode());
        A aa2=new A(5);
        Objects.equals(1,2);
        A a1 = new A();
        A a2 = new A();
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("pa1 = " + pa1);
        System.out.println("pa2 = " + pa2);
        System.out.println(pa1==pa2);
        try {
            System.out.println("aa2 = " + aa2.hashCode());
            new Integer(1).hashCode();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class A{
    public int aa=1;

    public A(int aa) {
        this.aa = aa;
    }

    public A() {
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        return aa == a.aa;
    }


}
