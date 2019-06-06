package hello;

import java.util.ArrayList;
import java.util.List;

public class QuestionSet {
    public List<String> q;
    public List<Boolean> seen;

    public QuestionSet(){
        q = new ArrayList<String>();
        q.add("What is your favorite color?");
        q.add("When is your birthday?");
        q.add("What is your eye color?");
        q.add("What is your credit card number?");
        q.add("What is your social security number?");

        seen = new ArrayList<Boolean>();
        for(int i=0; i<=5; i++){
            seen.add(false);
        }

    }

    /**
     *
     * @param num
     * @return question
     * @throws IndexOutOfBoundsException if the index is too high
     *
     */
    public String getQ(int num){
        seen.set(num, true);
        return q.get(num);
    }

    public int getLen(){
        return q.size();
    }




}