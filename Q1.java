import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {


    public static void main(String[] args) {
        float sum;
        ArrayList floatList=new ArrayList<Float>();
        floatList.add(2.1f );
        floatList.add(6.5f);
        floatList.add(7.4f);
        floatList.add(8.3f);
        floatList.add(2.7f);

        Iterator iterate=floatList.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());

            System.out.println("sum of all list" );
        }
    }
}
