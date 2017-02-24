package Tree;

import java.util.*;

/**
 * Created by Alexander on 2/16/2017.
 */
class Client{
    int id;
    String fname,lname,city,state,status;
    int numberOfItems;
    public Client(int id, String fname, String lname, String city, String state, String status, int numberOfItems){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.state = state;
        this.status = status;
        this.numberOfItems = numberOfItems;
    }

}

public class MapTree{
    public static void main(String[] args) {
        //Creating Tree.Client
        Map<Integer,Client> map = new TreeMap<Integer,Client>();
        //Creating Clients
        Client c01 = new Client(1000000,"Alexander","Bloomfield","Rexburg","Idaho","Owner",100);
        Client c02 = new Client(1000001,"Ashley","Bloomfield","Rexburg","Idaho","Owner",100);
        Client c03 = new Client(101,"Flo","Hammitt","Santee","California","New Client",2);
        Client c04 = new Client(102,"Asha","Palmer","Salt Lake City","Utah","Current Client",18);
        Client c05 = new Client(103,"Odessa","Ebner","Centerville","Utah","Current Client",78);
        Client c06 = new Client(104,"Krystina","Dorsch","Indianapolis","Indiana","Current Client",12);
        Client c07 = new Client(105,"Willena","Mcbee","San Jose","California","Current Client",22);
        Client c08 = new Client(106,"Randee","Levitsky","Columbus","Ohio","Current Client",13);
        Client c09 = new Client(107,"Aleen","Benham","Tampa","Florida","New Client",1);
        Client c10 = new Client(108,"Isabel","Rosinski","Phoenix","Arizona","Old Client",16);
        Client c11 = new Client(109,"Isabell","Zulauf","Fresno","California","Current Client",18);
        Client c12 = new Client(110,"Tish","Speidel","Bloomfield","New Mexico","Current Client",22);
        Client c13 = new Client(111,"Cornelius","Ryles","Chula Vista","California","Current Client",44);
        Client c14 = new Client(112,"Risa","Zarrella","Jersey City","New Jersey","Current Client",25);
        Client c15 = new Client(113,"Miles","Dapolito","Pittsburgh","Pennsylvania","Current Client",34);
        Client c16 = new Client(114,"Parker","Dulac","Kansas City","Missouri","Current Client",55);
        Client c17 = new Client(115,"Kendrick","Pumphrey","Fort Worth","Texas","New Client",1);

        // Adding Clients to the Map
        map.put(1,c01);
        map.put(2,c02);
        map.put(3,c03);
        map.put(4,c04);
        map.put(5,c05);
        map.put(6,c06);
        map.put(7,c07);
        map.put(8,c08);
        map.put(9,c09);
        map.put(10,c10);
        map.put(11,c11);
        map.put(12,c12);
        map.put(13,c13);
        map.put(14,c14);
        map.put(15,c15);


        //Printing out the Map

        for (Map.Entry<Integer, Client> entry:map.entrySet()){
            int key = entry.getKey();
            Client c = entry.getValue();
            System.out.println();
            System.out.println("Details on Client : " +key);
            System.out.println(c.status);
            System.out.println(c.fname+" "+c.lname);
            System.out.println(c.city+", "+c.state);
            System.out.println(c.numberOfItems);

        }


    }
}
