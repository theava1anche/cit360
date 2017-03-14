package JUNIT;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Alexander Bloomfield on 3/10/2017.
 */
public class TestHelper extends Exception {
    int value1 = 0;
    int value2;
    String words1 = "good";
    String nothing = null;
    String[] list = new String[3];
    String[] list2 = new String[3];
    String moreNothing = null;
    private ArrayList numList = new ArrayList<>();

    public TestHelper(){}
    // Going to test math for number 1 and mather number 2
    public  int math(int number){
        return number + value1;
    }
    public int math2(int number){
        return  number + value2;
    }
    public boolean good(String words){
        if (words == words1){
            return true;
        }else {return false;}
    }
    public void setList1(String eins, String zwei, String drei){
        list[1]=eins;
        list[2]=zwei;
        list[3]=drei;
    }
    public String[] getList1(){
        return list2;
    }
    public void setList2(String eins, String zwei, String drei){
        list[1]=eins;
        list[2]=zwei;
        list[3]=drei;
    }
    public String[] getList2(){
        return list2;
    }
    public String tryExc() throws myItems{
        if (moreNothing == null){
            throw new myItems();
        }
        else {
            return "it didn't go anywhere";
        }
    }
    public void setNumList(int eins, int zwei, int drei){
        numList.add(eins);
        numList.add(zwei);
        numList.add(drei);
    }

    public void tryException() {
    }
}
