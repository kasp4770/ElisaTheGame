package teamt.elisathegame.bussinesslogic;

import java.util.Random;

public class RandomOpgave {


        //this class has to task to make the program able to find a random assignment from the database
        //in order to do that we have to first make it able to keep track of certain key variables
        //then we will have to make a method that the rest of the program cam use to find a random question in our database

        //her er de variabler som er nødvendige for at få det her til at virke

        //this is for use in the random method to find a random question in our intire DB
        //here we will put the referance code for the DB
        private int amountOfTotalQuestionsInDatabase = 17;

        //this will be the kontroll variable for the program to make sure there is alway talking about the same
        private int questionControlVariableHolder = 99999999;

        //we need a variable that can hold all of this in a string so we can use it in firebase
        private String DBQuestionReferanse = "Question_";

        // now the methods that we are gonna use are one random method to find a random question taking referance from our AmountOfTotalQuestionsInDatabase variable
        // and we are gonna use slightly more complicated get method for the questionControlVariableHolder value since it is not gonna be stored here

        //this is the random method that will find our random question
        public String findRandomQuestion( String DBQuestionReferanseHolder, int amountOfTotalQuestionsInDatabaseHolder) {

            //for good messure ill load our value into a lokal holder first for both values
            int TotalQuestionsHolder = amountOfTotalQuestionsInDatabaseHolder;
            int controlVarHolder = 9999999;
            amountOfTotalQuestionsInDatabase = amountOfTotalQuestionsInDatabaseHolder;
            DBQuestionReferanse = DBQuestionReferanseHolder;


            //here i use the previous value to find a random question to put into our controlvariable
            Random randomQuestion = new Random();
            controlVarHolder =  randomQuestion.nextInt(TotalQuestionsHolder+1);
            questionControlVariableHolder = controlVarHolder;
            Integer.toString(controlVarHolder);
            DBQuestionReferanse = DBQuestionReferanse + controlVarHolder;

            return DBQuestionReferanse;
        }

        public int getAmountOfTotalQuestionsInDatabase() {
            return amountOfTotalQuestionsInDatabase;
        }

        public int getQuestionControlVariableHolder() {
            return questionControlVariableHolder;
        }

        public String getDBQuestionReferanse() {
            return DBQuestionReferanse;
        }
    }

