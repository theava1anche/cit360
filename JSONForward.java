package JSON;

import org.json.simple.JSONObject;

/**
 * Created by Alexander on 2/23/2017.
 */
public class JSONForward {
    public static void main(String[] args) {
        JSONObject cli1 = new JSONObject();

        cli1.put("First Name","Adolph");
        cli1.put("Last Name","Whitlock");
        cli1.put("City","Santee");
        cli1.put("State","Californa");
        cli1.put("ZIP Code", new Integer(92071));
        cli1.put("balance", new Double(00.00));
        cli1.put("Current Client",new Boolean(false));

        JSONObject cli2 = new JSONObject();

        cli2.put("First Name","Humberto");
        cli2.put("Last Name","Eilers");
        cli2.put("City","Centerville");
        cli2.put("State","Utah");
        cli2.put("ZIP Code", new Integer(84014));
        cli2.put("balance", new Double(98.26));
        cli2.put("Current Client",new Boolean(true));

        JSONObject cli3 = new JSONObject();

        cli3.put("First Name","Velva");
        cli3.put("Last Name","Falkowski");
        cli3.put("City","Rexburg");
        cli3.put("State","Idaho");
        cli3.put("ZIP Code", new Integer(83440));
        cli3.put("balance", new Double(00.00));
        cli3.put("Current Client",new Boolean(false));

        JSONObject cli4 = new JSONObject();

        cli4.put("First Name","Ian");
        cli4.put("Last Name","Deardorff");
        cli4.put("City","Phonix");
        cli4.put("State","Arizona");
        cli4.put("ZIP Code", new Integer(85020));
        cli4.put("balance", new Double(70.59));
        cli4.put("Current Client",new Boolean(true));


        JSONObject cli5 = new JSONObject();

        cli5.put("First Name","Gilma");
        cli5.put("Last Name","Gerlach");
        cli5.put("City","Bloomfield");
        cli5.put("State","New Mexico");
        cli5.put("zipecode", new Integer(87413));
        cli5.put("balance", new Double(30.12));
        cli5.put("Current Client",new Boolean(false));

        System.out.print(cli1);
        System.out.println(" ");
        System.out.print(cli2);
        System.out.println(" ");
        System.out.print(cli3);
        System.out.println(" ");
        System.out.print(cli4);
        System.out.println(" ");
        System.out.print(cli5);
    }
}