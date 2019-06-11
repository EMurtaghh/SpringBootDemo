package hello;

import java.util.ArrayList;
import java.util.List;

public class UserQuestionSet {
    public List<Question>allQuestions;
    public List<Integer> timesSeen;
    public List<Integer> timesCorrect;
    public String userId;

    public UserQuestionSet(String userIdIn){

        allQuestions = new ArrayList<Question>();
        timesSeen = new ArrayList<Integer>();
        timesCorrect = new ArrayList<Integer>();
        this.userId=userIdIn;

        List<String > eyeA = new ArrayList<String>();
        eyeA.add("purple");
        eyeA.add("blue");
        eyeA.add("green");
        eyeA.add("brown");
        Question q1 = new Question("1", "What is your eye color?","PLANE", "purple", eyeA);
        allQuestions.add(q1);
        timesSeen.add(0);
        timesCorrect.add(0);

        List<String > colorA = new ArrayList<String>();
        colorA.add("purple");
        colorA.add("blue");
        colorA.add("green");
        colorA.add("brown");
        Question q2 = new Question("2", "What is your favorite color?", "STRUCTURE", "brown", colorA);
        allQuestions.add(q2);
        timesSeen.add(0);
        timesCorrect.add(0);

        List<String > skyA = new ArrayList<String>();
        skyA.add("purple");
        skyA.add("blue");
        skyA.add("green");
        skyA.add("brown");
        Question q3 = new Question("3", "What color is the sky?", "ATTACHMENT", "blue", skyA);
        allQuestions.add(q3);
        timesSeen.add(0);
        timesCorrect.add(0);

        List<String > grassA = new ArrayList<String>();
        grassA.add("purple");
        grassA.add("blue");
        grassA.add("green");
        grassA.add("brown");
        Question q4 = new Question("4", "What color is the grass?", "ZONE", "green", grassA);
        allQuestions.add(q4);
        timesSeen.add(0);
        timesCorrect.add(0);

        List<String > ounceA = new ArrayList<String>();
        ounceA.add("4");
        ounceA.add("8");
        ounceA.add("16");
        ounceA.add("12");
        Question q5 = new Question("5", "How many ounces are in a pound?", "ATTACHMENT", "16", ounceA);
        allQuestions.add(q5);
        timesSeen.add(0);
        timesCorrect.add(0);




    }

    /**
     *
     * @param questionId
     * @return question
     * @throws IndexOutOfBoundsException if the index is too high
     *
     */
    public Question getQ(String questionId){
        for (int i = 0; i < allQuestions.size(); i++){
            if (allQuestions.get(i).getId()==questionId){
                return allQuestions.get(i);
            }
        }
        return null;
    }

    public int getLen(){
        return allQuestions.size();
    }





}