package edgecasedevelopment.fitterthanfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    //Declaring some constants to use throughout the app
    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String EXTRA_ITEM_TITLE = "extra.item.title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaring the relativeLayouts to be clickable
        RelativeLayout btnWeight = (RelativeLayout)findViewById(R.id.btnWeight);
        RelativeLayout btnYoga = (RelativeLayout)findViewById(R.id.btnYoga);
        RelativeLayout btnCardio = (RelativeLayout)findViewById(R.id.btnCardio);

        //Onclick listener for the weight layout
        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });

        //Onclick listener for the yoga layout
        btnYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        //Onclick listener for the cardio layout
        btnCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });
    }

    private void loadDetailActivity(String exerciseTitle){
        //Tells the manager what to activity to start (FROM, TO)
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        //Adds info to send into the next activity
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        //Starts the next activity
        startActivity(intent);
    }
}
