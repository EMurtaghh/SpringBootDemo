package hello;

import java.util.ArrayList;
import java.util.List;

public class QuestionType {
    List<String> types = new ArrayList();
    String questionType;


    QuestionType(String typeIn) throws Exception{
        if(types.contains(typeIn))
            questionType = typeIn;
        else
            throw new Exception("Invalid question type");
    }

    public void addType(String typeIn){
        if(!types.contains(typeIn))
            types.add(typeIn);
    }

    public void removeType(String typeIn){
        types.remove(typeIn);
    }

    public String typesToString(){
        String toReturn = "";
        for(String currType : types)
            toReturn += ", currType";
        return toReturn;
    }
}
