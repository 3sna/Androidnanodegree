package com.nanasoemarno.testradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    score++;
                    break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio21:
                if (checked)
                    score ++;
                break;
        }
    }

    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio31:
                if (checked)
                    score ++;
                break;
        }
    }

    public void onRadioButtonClicked4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio41:
                if (checked)
                    score ++;
                break;

        }
    }

    public void onRadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio51:
                if (checked)
                    score ++;
                break;
        }
    }

    public void onRadioButtonClicked6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio61:
                if (checked)
                    score ++;
                break;
        }
    }

    public void onRadioButtonClicked7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio71:
                if (checked)
                    score ++;
                break;
        }
    }

    public void onRadioButtonClicked8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio81:
                if (checked)
                    score ++;
                break;
        }
    }
    /** Called when the user taps the Send button */
    public void submitTest(View view) {

        display(score); //called method display by passing an argument score
    }

    /*
    * Create method display
    * @param: numOfPoint is score that has been obtained
    */

    private void display(int numOfPoint) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + numOfPoint);
    }

   /*
    * Create method message
    */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.test_summary_text_view);
        priceTextView.setText(message);
    }



    /** Called when the user taps the RESET button */
    public void resetTest(View view) {
        RadioGroup clearScore1 = (RadioGroup)findViewById (R.id.radioGroup1);
        clearScore1.clearCheck();


        RadioGroup clearScore2 = (RadioGroup)findViewById (R.id.radioGroup2);
        clearScore2.clearCheck();


        RadioGroup clearScore3 = (RadioGroup)findViewById (R.id.radioGroup3);
        clearScore3.clearCheck();


        RadioGroup clearScore4 = (RadioGroup)findViewById (R.id.radioGroup4);
        clearScore4.clearCheck();

        RadioGroup clearScore5 = (RadioGroup)findViewById (R.id.radioGroup5);
        clearScore5.clearCheck();

        RadioGroup clearScore6 = (RadioGroup)findViewById (R.id.radioGroup6);
        clearScore6.clearCheck();

        RadioGroup clearScore7 = (RadioGroup)findViewById (R.id.radioGroup7);
        clearScore7.clearCheck();

        RadioGroup clearScore8 = (RadioGroup)findViewById (R.id.radioGroup8);
        clearScore8.clearCheck();

        score=score-score;
        reset= 0;

        display(reset);


    }
}
