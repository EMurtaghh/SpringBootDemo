package hello;

import java.util.ArrayList;

public class Questions {
    public ArrayList<String> q;

    public Questions(){
        q = new ArrayList<String>();
        q.add("What is your favorite color?");
        q.add("When is your birthday?");
        q.add("What is your eye color?");
        q.add("What is your credit card number?");
        q.add("What is your social security number?");
    }

    /**
     *
     * @param num
     * @return question
     * @throws IndexOutOfBoundsException if the index is too high
     *
     */
    public String getQ(int num){
        return q.get(num);
    }

    public int getLen(){
        return q.size();
    }


}