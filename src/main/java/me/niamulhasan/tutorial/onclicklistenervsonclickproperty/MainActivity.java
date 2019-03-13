package me.niamulhasan.tutorial.onclicklistenervsonclickproperty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting up the variable for the Button of OnClickListener
        Button button1 = (Button) findViewById(R.id.button1);


        //The OnclickListener applied on the 'button1', what uses in class file
        //The OnClickListener used to fire buttons within nested method of class.
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "I am fired by the OnclickListener in the Class", Toast.LENGTH_LONG).show();      //the first variable of makeText() a little bit different here, in first depth method we can use 'this' as parameter, but in neated method we have to use getApplicationContext()
            }
        });

    }


    //The OnClick property defined in the XML layout file
    //But the OnClick property of XML used to trigger method of first depth
    public void fireByOnClickProperty(View view){
        Toast.makeText(this, "I am fired by the Onclick property of XML layout file", Toast.LENGTH_LONG).show();
    }
}
