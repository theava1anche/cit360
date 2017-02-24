import java.util.HashMap;

/**
 * Created by Alexander on 2/6/2017.
 */
public class Map {
    public static void main(String[] args){
        // This is going to put it into a list to store it in a HashMap
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Alex Bloomfield "," Owner");
        map.put("Ashley Bloomfield ", " Owner");
        map.put("Tammy Elfman "," Tree.Client");

        //This is going to print out the HashMap
        System.out.println();
        System.out.println("Map Elements");
        System.out.print("\t" + map +" ");



    }
}