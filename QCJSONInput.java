package QCJSON;

import java.io.FileInputStream;
import java.io.IOException;

import org.quickconnect.json.JSONException;
import org.quickconnect.json.JSONInputStream;


/**
 * Created by Alexander Bloomfield on 3/3/2017.
 */
public class QCJSONInput {
    public static void happyJson() {
        try {
            FileInputStream inputStream1 = new FileInputStream("D:\\Documents\\CIT360-Homework\\QJSON-JSON\\src\\QCJSON\\qcjsonOutput1.txt");
            JSONInputStream jsonInput1 = new JSONInputStream(inputStream1);
            System.out.println(jsonInput1.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        System.out.println("This is going to be a simple json file that it is going to turn into a comma dilimited file to put into excel:");
        happyJson();
    }
}