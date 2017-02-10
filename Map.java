import java.util.HashMap;

/**
 * Created by Alexander on 2/6/2017.
 */
public class Map {
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Alex Bloomfield "," Owner");
        map.put("Ashley Bloomfield ", " Owner");
        map.put("Tammy Elfman "," Client");

        System.out.println();
        System.out.println("Map Elements");
        System.out.print("\t" + map +" ");



    }
}