import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String... args) {


//        long nano1 = System.nanoTime();
//
//        List<Integer> arr = new ArrayList<>();
//        for(int i = 0; i < 5000000; ++i) {
//            arr.add(i);
//        }
//        System.out.println("ArrayList" + (System.nanoTime() - nano1) );
//
//        long nano2 = System.nanoTime();
//
//        List<Integer> arrL = new LinkedList<>();
//        for(int i = 0; i < 5000000; ++i) {
//            arrL.add(i);
//        }
//        System.out.println("LinkedList" + (System.nanoTime() - nano2) );

        int MAX_VAL = 10000;
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        long firstTime = System.nanoTime();

        for(int i = 0; i < MAX_VAL; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        System.out.println("-----------TimePoccess_Max_value(10000)-------------");

        System.out.println("LinkedList addMax_Value_TimeProccess:\t" + (System.nanoTime() - firstTime));
        System.out.println("ArrayList addMax_Value_TimeProccess:\t" + (System.nanoTime() - firstTime));

        System.out.println("-----------MIddle-------------");

        long centerTime = System.nanoTime();


        for(int i = 0; i < MAX_VAL; i++) {
            linkedList.add(MAX_VAL/2, i);
        }
        System.out.println("LinkedList centerTime_Middle:\t" + (System.nanoTime() - centerTime));

        centerTime = System.nanoTime();
        for(int i = 0; i < MAX_VAL; i++) {
            arrayList.add(i, MAX_VAL/2);
        }
        System.out.println("ArrayList centerTime_Middle:\t" + (System.nanoTime() - centerTime));

        System.out.println("-----------Remove-------------");

        long removeTime = System.nanoTime();

        for(int i = 0; i < MAX_VAL; i++) {
            linkedList.remove(1);
        }
        System.out.println("LinkedList remove_index-1000:\t" + (System.nanoTime() - removeTime));

        for(int i = 0; i < MAX_VAL; i++) {
            arrayList.remove(1);
        }
        System.out.println("ArrayList remove_index-1000:\t" + (System.nanoTime() - removeTime));

        System.out.println("-----------Iterator-------------");


        linkedList = new LinkedList<>();
        arrayList = new ArrayList<>();
        for(int i = 0; i < MAX_VAL; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        firstTime = System.nanoTime();
        ListIterator<Integer> li = linkedList.listIterator(MAX_VAL/2);
        for(int i = 0; i < MAX_VAL; i++) {
            li.add(i);
        }
        System.out.println("LinkedList iterator:\t" + (System.nanoTime() - firstTime));

        firstTime = System.nanoTime();
        ListIterator<Integer> ali = arrayList.listIterator(MAX_VAL/2);
        for(int i = 0; i < MAX_VAL; i++) {
            ali.add(i);
        }
        System.out.println("ArrayList iterator:\t" + (System.nanoTime() - firstTime));
    }
    }

