package teamt.elisathegame.bussinesslogic;

import java.util.Random;
        /*
        this class has to task to make the program able to find a random assignment from the database
        in order to do that we have to first make it able to keep track of certain key variables
        then we will have to make a method that the rest of the program cam use to find a random question in our database
        */

public class RandomOpgave {

        //her er de variabler som er nødvendige for at få det her til at virke

        //this is for use in the random method to find a random question in our intire DB
        //here we will put the reference code for the DB
        private int amountOfTotalQuestionsInDatabase = 17;

        //this will be the control variable for the program to make sure there is alway talking about the same
        private int questionControlVariableHolder = 99999999;

        //we need a variable that can hold all of this in a string so we can use it in firebase
        private String DBQuestionReference = "Question_";

        // now the methods that we are gonna use are one random method to find a random question taking referance from our AmountOfTotalQuestionsInDatabase variable
        // and we are gonna use slightly more complicated get method for the questionControlVariableHolder value since it is not gonna be stored here

        //since the database reference methods are not made yet i have to just make a placeholder
        public int loadTotalQuestionAmountInDatabase(){
            int DBQuestionAmountHolder;

            //here i will eventually replace this code with the actual reference code
            DBQuestionAmountHolder = 17;
            amountOfTotalQuestionsInDatabase = DBQuestionAmountHolder;

            return DBQuestionAmountHolder;
        }

        //this is the random method that will find our random question
        public String findRandomQuestion(int amountOfTotalQuestionsInDatabaseHolder) {

            //for good measure ill load our value into a local holder first for both values
            int TotalQuestionsHolder = amountOfTotalQuestionsInDatabaseHolder;
            int controlVarHolder = 9999999;
            amountOfTotalQuestionsInDatabase = amountOfTotalQuestionsInDatabaseHolder;


            //here i use the previous value to find a random question to put into our control variable
            Random randomQuestion = new Random();
            controlVarHolder =  randomQuestion.nextInt(TotalQuestionsHolder+1);
            questionControlVariableHolder = controlVarHolder;
            Integer.toString(controlVarHolder);
            DBQuestionReference = DBQuestionReference + controlVarHolder;

            return DBQuestionReference;
        }

        public int getAmountOfTotalQuestionsInDatabase() {
            return amountOfTotalQuestionsInDatabase;
        }

        public int getQuestionControlVariableHolder() {
            return questionControlVariableHolder;
        }

        public String getDBQuestionReference() {
            return DBQuestionReference;
        }
    }

