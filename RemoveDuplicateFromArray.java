package codes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4, 5, 6, 6, 2, 3, 9, 8,8,6,9,5};


        //1st Approach => brute force

        Arrays.sort(a);

        // 1, 2 , 2 , 3 , 3 , 4 , 5 , 6 , 6

//        ArrayList<Integer> nonDuplicate = new ArrayList<Integer>(); //-n
//        for (int i = 0; i < a.length-1; i++) { //-n
//            if (a[i] != a[i + 1]) {
//                nonDuplicate.add(a[i]);
//            }
//        }
//        nonDuplicate.add(a[a.length-1]);
//        System.out.println(nonDuplicate);


        // 2nd Approach => Set => it will reduce time complexity
        HashSet<Integer> hm = new HashSet<Integer>();
        for (int i = 0; i< a.length; i++) {
            hm.add(a[i]);
        }
        System.out.println(hm);



    }

}
