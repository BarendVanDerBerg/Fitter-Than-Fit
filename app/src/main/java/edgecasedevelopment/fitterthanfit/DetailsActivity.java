package edgecasedevelopment.fitterthanfit;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Declares the components in the view
        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView)findViewById(R.id.exerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);

        //Sets the title of the activity
        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        //Checks what button was pressed and changes the activity accordingly
        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)){
            //When weightlifting is pressed
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            //When yoga is pressed
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            //When cardio is pressed or anything else
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}
