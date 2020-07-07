package edu.tacoma.uw.gitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = (EditText)findViewById(R.id.eNum1);
        num2 = (EditText)findViewById(R.id.eNum2);
        add = (Button) findViewById(R.id.ADDbutton);
        result = (TextView)findViewById(R.id.Result);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer: " + String.valueOf(sum));
            }
        });
    }
}
