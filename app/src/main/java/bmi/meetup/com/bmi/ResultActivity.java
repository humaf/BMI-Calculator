package bmi.meetup.com.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView result;
    TextView category;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView)findViewById(R.id.result);
        category = (TextView)findViewById(R.id.category);

      Bundle bundle = getIntent().getExtras();
        float res = bundle.getFloat("bmi");
        String bmistr=Float.toString(res);

        result.setText(bmistr);


        if(res < 18.5){

            category.setText("You are Underweight");
        }
        else
        if(res < 25){
            category.setText("Your bmi is normal " );

        }
        else
            category.setText("You are overweight ");



    }
    }

