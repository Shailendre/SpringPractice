package org.shailendra.singh;

import java.util.Iterator;

/**
 * Created by shailendra.singh on 7/18/16.
 */
public class Question {

    private int qid;
    private String question;
    private Answer answer;

    public Question(int qid, String question, Answer answer) {
        this.qid = qid;
        this.question = question;
        this.answer = answer;
    }

    public int getQid() {
        return qid;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void displayQuestion(){
        System.out.println(getQid()+": "+getQuestion());
        displayAnswer();
    }

    public void displayAnswer(){
        Iterator<?> iterator = getAnswer().getAnswers().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
