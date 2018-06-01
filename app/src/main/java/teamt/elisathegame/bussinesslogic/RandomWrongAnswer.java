package teamt.elisathegame.bussinesslogic;

import com.google.android.gms.common.internal.StringResourceValueReader;

import java.util.Random;

/*
This purpose of this class is to randomly select a wrong answer from our database and to repeat this process
until the needed 5 wrong answers have been selected
*/
public class RandomWrongAnswer {
    /*
    private String[] wrongAnswerLogTemp = new String[5]; //declaring an initializing a temp variable for an array
    private int amountOfTotalWrongAnswerTemp;


    public String findOneWrongAnswer(DB_Connect connect, String DBReference){ //everytime this method is used it is asked to connect to our database and will also require a DB reference

        int amountOfWrongAnswersInDatabaseHolder = connect.findAmountOfWrongAnswers(DBReference);
        int randomWrongAnswerHolder = 9999999;
        String wrongAnswerDBReferenceHolder = "wrongAnswer_";

        Random random = new Random(); //Random object
        randomWrongAnswerHolder = random.nextInt(amountOfWrongAnswersInDatabaseHolder+1); //

        Integer.toString(randomWrongAnswerHolder); //typecasting our randomly selected integer into a String so we can merge it with wrongAnswerDBReferenceHolder

        wrongAnswerDBReferenceHolder = wrongAnswerDBReferenceHolder+randomWrongAnswerHolder; //merging our two Strings to match the database names

        amountOfTotalWrongAnswerTemp = amountOfWrongAnswersInDatabaseHolder;
        return wrongAnswerDBReferenceHolder;

    }*/

    /*
    //this is the method (findFiveWrongAnswer) that our Datahandler is working with - which is why we need DB_Connecter as a parameter again as the datahandler
     cannot see the method within. definedRightAnswer is because we will need to check this later on.
     */
    /*
    public String[] findFiveWrongAnswer(DB_Connect connect, String definedRightAnswerHolder, String DBReference) {

        String[] wrongAnswerLogHolder = new String[5]; //declaring and initializing our array containing 5 indexes


        for (int i = 0; i < 4; i++) {

            String wrongAnswerHolder = findOneWrongAnswer(connect, DBReference); //this is our method to find one random wrong anser in our database which is then stored in our wrongAnswerHolder variable

            //if statement checks that our wrong answer does not match the correct answer as well as ensuring that the same wrong answer cannot be stored twice in the array
            if (wrongAnswerHolder != definedRightAnswerHolder || wrongAnswerHolder != wrongAnswerLogHolder[i - 1] || wrongAnswerHolder != wrongAnswerLogHolder[i - 2] || wrongAnswerHolder != wrongAnswerLogHolder[i - 3] || wrongAnswerHolder != wrongAnswerLogHolder[i - 4] || wrongAnswerHolder != wrongAnswerLogHolder[i - 5]) {

                wrongAnswerLogHolder[i] = wrongAnswerHolder; //our wrong answer from the database is added to the array


            }
        }

        wrongAnswerLogTemp = wrongAnswerLogHolder; //storing the array in the temporary class variable
        return wrongAnswerLogHolder; //return our array

    }



*/
}
