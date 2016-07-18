package org.shailendra.singh;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by shailendra.singh on 7/18/16.
 */
public class Question2 {

    private HashMap<String,Question> questionHashMap;

    public Question2(HashMap<String, Question> questionHashMap) {
        this.questionHashMap = questionHashMap;
    }

    public HashMap<String, Question> getQuestionHashMap() {
        return questionHashMap;
    }

    public void displayQuestion(){
        Iterator<Question> iterator = getQuestionHashMap().values().iterator();
        while (iterator.hasNext()){
            iterator.next().displayQuestion();
        }
    }
}
