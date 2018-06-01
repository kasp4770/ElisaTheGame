package teamt.elisathegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

import teamt.elisathegame.bussinesslogic.RandomOpgave;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        //this secktion is intirely for testing (Lasse from Team T)
        //right here test to see if the checkbox call works properly
        RandomOpgave randomOpgave = new RandomOpgave();
        CheckBox anwserOption_1 = findViewById(R.id.checkBox4);
        anwserOption_1.setText(randomOpgave.findRandomQuestion( 15));

    }
}
