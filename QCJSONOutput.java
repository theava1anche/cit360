package QCJSON;

import org.quickconnect.json.JSONException;
import org.quickconnect.json.JSONOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Alexander Bloomfield on 3/3/2017.
 */
public class QCJSONOutput implements Serializable{
    private String FirstName;
    private String LastName;
    private String City;
    private String State;
    private int ZipCode;

    public QCJSONOutput(String FirstName, String LastName, String City, String State, int ZipCode) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    public static void FunnyJSON(){
        QCJSONOutput theObject1 = new QCJSONOutput("Alexander","Bloomfield","Rexburg","Idaho",83440);
        // Line below is not working since the input one does not like them on the same line
        // QCJSONOutput theObject2 = new QCJSONOutput("Ashley","Bloomfield","Santee","Californa",92071);
        try{
            //create a new file stream
            FileOutputStream outputStream = new FileOutputStream("D:\\Documents\\CIT360-Homework\\QJSON-JSON\\src\\QCJSON\\qcjsonOutput1.txt");
            //use the output stream object as the parameter for the json output stream
            JSONOutputStream theStream = new JSONOutputStream(outputStream);
            //use the json object to write the string to the file
            theStream.writeObject(theObject1);
            // Line below is not working since the input one does not like them on the same line
            //theStream.writeObject(theObject2);
        } catch(IOException e){
            e.printStackTrace();
        } catch (JSONException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FunnyJSON();
    }
}
