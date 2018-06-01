package teamt.elisathegame.model;

//this classe will control all the trafic that goes from our back-end to our front-end, there is an agument to be made about wether we should split this responsability out
//in multiple classes aswell but out team dicided against that idea since our program is fairly simple

//to acomplish this task we need a variable that holds a value from the back end klasses

//we will need a method that runs several methods defined in our other klasses, so that in our activity we wil just have to run a single method for the program to run smoothly

public class DataHandler {

    //here we setup the variables
    private int questionControlVariable = 999999;
    private String DBQuestionReference = "dbreference not defined";
    private String definedRightAnswer = "right answer not defined";
    private int totalQuestionAmountInDatabase = 9999999;
    private String[] wrongAnswerLog = new String[5];
    //the score funktion is put on hold and set as a second priority
    private Double Score = -999999.9;
    private String[] questionPreviousUse = new String[10];
    private String questionDescription = "Description not defined";
    private String difficulty = "difficulty not defined";

    //there was the variables that we need to mediate to our GUI

    //this is a small method to find a random question from the database
    public void startUpFindRandomQuestion(){
        //i make a object first to make use of the two methods
        RandomOpgave randomOpgave = new RandomOpgave();

        //we make sure the two values we get gets saved in the datahandler
        DBQuestionReference = randomOpgave.findRandomQuestion(randomOpgave.loadTotalQuestionAmountInDatabase());
        totalQuestionAmountInDatabase = randomOpgave.loadTotalQuestionAmountInDatabase();
    }

    //this is a method that will find a right answer
    public void startUpFindRightAnswer(){
        //i make a object so that i can make use of the methods
        RandomRightAnswer randomRightAnswer = new RandomRightAnswer();

        //i save the right answer in the handler for later use in the UI


    }


    //i will now write a method that in the end will work but it will be quite hard to test it before the rest of the program is made
    public void startupMethodForUI(){

    }




}
