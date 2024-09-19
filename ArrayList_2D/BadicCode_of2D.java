package ArrayList_2D;

import java.util.ArrayList;
import java.util.List;
public class BadicCode_of2D {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
       a.add(30); a.add(40); a.add(50); a.add(60);
        List<Integer> b = new ArrayList<>();
        b.add(60); b.add(70);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(30);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

        for (int i = 0; i < l.size(); i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j <x.size() ; j++) {
                System.out.print(x.get(j)+" ");

            }
            System.out.println();
        }


        }


    }

