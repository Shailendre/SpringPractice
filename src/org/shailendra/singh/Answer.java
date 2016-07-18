package org.shailendra.singh;

import java.util.Iterator;
import java.util.List;

/**
 * Created by shailendra.singh on 7/18/16.
 */
public class Answer {

    private int qid;
    private List<?> answers;

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public List<?> getAnswers() {
        return answers;
    }

    public void setAnswers(List<?> answers) {
        this.answers = answers;
    }
}
