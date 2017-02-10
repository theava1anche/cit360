import java.util.*;

/**
 * Created by Alexander on 2/9/2017.
 */
public class Set {
    public static void main(String args[]) {
        //Creating and adding elements
        TreeSet<String> client=new TreeSet<String>();
        client.add("Adolph Whitlock");
        client.add("Humberto Eilers");
        client.add("Velva Falkowski");
        client.add("Ian Deardorff");
        client.add("Gilma Gerlach");
        client.add("Kendrick Pumphrey");
        client.add("Flo Hammitt");
        client.add("Asha Palmer");
        client.add("Odessa Ebner");
        client.add("Krystina Dorsch");
        client.add("Willena Mcbee");
        client.add("Randee Levitsky");
        client.add("Aleen Benham");
        client.add("Isabel Rosinski");
        client.add("Isabell Zulauf");
        client.add("Tish Speidel");
        client.add("Cornelius Ryles");
        client.add("Risa Zarrella");
        client.add("Miles Dapolito");
        client.add("Parker Dulac");
        //Traversing elements
        Iterator<String> itr=client.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

