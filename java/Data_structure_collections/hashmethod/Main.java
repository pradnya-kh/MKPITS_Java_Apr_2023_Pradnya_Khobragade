package hashmethod;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(30);
        hashSet.add(60);
        hashSet.add(20);
        hashSet.add(40);
        Integer[]numArray1={45,33,88,65};
        Integer[]numArray2={44,45,88,85};
        HashSet hashSet1=new HashSet(Arrays.asList(numArray1));
        HashSet hashSet2=new HashSet(Arrays.asList(numArray2));
        System.out.println(hashSet1);
        System.out.println(hashSet2);
        HashSet UnionofSet1ndSet2=new HashSet();
        UnionofSet1ndSet2.addAll(hashSet1);
        UnionofSet1ndSet2.addAll(hashSet2);
        System.out.println("union of two set: "+UnionofSet1ndSet2);

        System.out.println("Intersection of two set");
        HashSet intersectionofset1ndset2=new HashSet(hashSet1);
        intersectionofset1ndset2.retainAll(hashSet2);
        System.out.println(intersectionofset1ndset2);



        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(50));
        System.out.println(hashSet.add(80));
        System.out.println(hashSet);
        System.out.println(hashSet.clone());
        System.out.println();
    }
}
