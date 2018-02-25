package bmi.meetup.com.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText height, weight;
    TextView height_text, weight_text, result_text;
    Button calculate;
    float bmi = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = (EditText) findViewById(R.id.edit1);

        weight = (EditText) findViewById(R.id.edit2);
        height_text = (TextView) findViewById(R.id.heighttv);
        weight_text = (TextView) findViewById(R.id.weightv);
        result_text = (TextView) findViewById(R.id.result);
        calculate = (Button) findViewById(R.id.button);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float help = 0;

                int h = Integer.parseInt(height.getText().toString());
                System.out.println(h);
                int w = Integer.parseInt(weight.getText().toString());
                System.out.println(w);
                help = h * h;

                bmi = (w / help) * 703;
                System.out.println(bmi);
                // result_text.setVisibility(View.VISIBLE);

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                Bundle data = new Bundle();
                data.putFloat("bmi",bmi);
                intent.putExtras(data);
                startActivity(intent);
            }


        });

/*
        Intent intent = new Intent(this, ResultActivity.class);
        Bundle data = new Bundle();
        data.putFloat("bmi",bmi);
        intent.putExtras(data);
        startActivity(intent);
*/
    }
}
