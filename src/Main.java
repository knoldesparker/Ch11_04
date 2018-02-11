import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//Denne opgave er ikke fuldend men jeg ved ikke hvordan den skal løses længere en hvad jeg er kommet til.
public class Main {
    public static void main(String[] args) {

        Integer elements[]={15,1,6,12,-3,4,8,21,2,30,-1,9};
        List<Integer> ogList = new LinkedList<>(Arrays.asList(elements));
        System.out.println(ogList);

        partition(ogList,1);


    }
    public static void partition(List<Integer> list, int split){
        List<Integer> tempList1 = new LinkedList<>();
        List<Integer> tempList2 = new LinkedList<>();
        List<Integer> temp3 = new LinkedList<>();
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            Integer less = itr.next();
            if (less.compareTo(split)<0){
                tempList1.add(less);
            }
            if (less.compareTo(split)>0){
                tempList2.add(less);
            }
        }
        temp3.addAll(tempList1);
        temp3.addAll(tempList2);
        System.out.println(temp3);



    }
}
