package teamt.elisathegame.model;

/*
* This class has the task to get one random right answer from the database
* */

import com.google.firebase.database.DatabaseReference;

import java.util.Random;

public class RandomRightAnswer {

    private int amountOfTotalRightAnswerTemp;

    public String findOneRandomRightAnswer(DB_Connect con, String DBQuestionReference, String amountOfRightAnswers){
        String rightAnswer = "rightAnswer_";
        DatabaseReference DBAmount = con.findAmountOfRightAnswers(DBQuestionReference, amountOfRightAnswers);
        String DBAmountRightAnswerString = DBAmount.toString();
        amountOfTotalRightAnswerTemp = Integer.parseInt(DBAmountRightAnswerString);

        Random random = new Random();
        int randomRightAnswerNo = random.nextInt(amountOfTotalRightAnswerTemp);

        return rightAnswer + Integer.toString(randomRightAnswerNo);
    }
}
