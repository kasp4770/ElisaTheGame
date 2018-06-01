package teamt.elisathegame.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DB_Connect {

    //DatabaseReference variabel, der opretter forbindelse til Databasens root.
    //DatabaseReference bliver også brugt til at finde Child-nodes i vores Database fra Root.
    private DatabaseReference DB_REF = FirebaseDatabase.getInstance().getReference();

    //Metode til at finde mængden af spørgsmål i Databasen
    //Child-nodes = amountOfQuestionsDatabase
    public DatabaseReference findAmountOfQuestions(String amountOfQuestions) {

        //Database Reference der tjekker om der er et child-node (af Root) der hedder Questions
        DatabaseReference questions = DB_REF.child("Questions");

        //Database Reference der tjekker om der er et child-node (af Questions) der hedder amountOfQuestions
        DatabaseReference amount = questions.child(amountOfQuestions);

        //Returnere mængden some en Database Reference (Totale mængde af spørgsmål i Databasen)
        return amount;
    }

    //Metode til at finde en Opgave beskrivelse
    //Child-nodes = Question_ + nummer og questDesc
    public DatabaseReference findQuestionDesc(String questionNo, String questionDesc) {

        //Database Reference der tjekker om der er et child-node (af Root) der hedder Questions
        DatabaseReference questions = DB_REF.child("Questions");

        //Database Reference der tjekker om der er et child-node (af Questions) der hedder Question_ + valueDB
        DatabaseReference questions_ = questions.child(questionNo);

        //Database Reference der tjekker om der er et child-node (af Question_) der hedder questDesc
        DatabaseReference questDesc = questions_.child(questionDesc);

        //Return questDesc som en Database Reference (Opgave beskrivelsen)
        return questDesc;
    }

    //METODE IKKE FÆRDIG
    public DatabaseReference findRightAnswers(String questionNo, String questRightAnswers) {
        DatabaseReference questions = DB_REF.child("Questions");
        DatabaseReference question_ = questions.child(questionNo);
        DatabaseReference questRAS = question_.child(questRightAnswers);
        return questRAS;

    }

    //Metode til at finde Mængden af rigtgie svar
    //Child-nodes = Question_ + nummer, rightAnswers og amountOfRightAnswers
    public DatabaseReference findAmountOfRightAnswers(String questionNo, String rightAnswers, String amountOfRightAnswers){
        //Database Reference der tjekker om der er et child-node (af Root) der hedder Questions
        DatabaseReference questions = DB_REF.child("Questions");

        //Database Reference der tjekker om der er et child-node (af Questions) der hedder Question_ + et nummer
        DatabaseReference question_ = questions.child(questionNo);

        //Database Reference der tjekker om der er et child-node (af Question_) der hedder rightAnswers
        DatabaseReference questRAS = question_.child(rightAnswers);

        //Database Reference der tjekker om der er et child-node (af rightAnswers) der hedder AmountOfRightAnswers
        DatabaseReference questAmount = questRAS.child(amountOfRightAnswers);

        //Return questDesc som en Database Reference (Total mængden af rigtige svar)
        return questAmount;
    }

    public DatabaseReference findAmountOfWrongAnswers(){
        return null;
    }

    public DatabaseReference findWrongAnswers(){
        return null;
    }

}
