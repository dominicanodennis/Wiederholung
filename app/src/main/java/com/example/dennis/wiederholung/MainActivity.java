package com.example.dennis.wiederholung;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;
    EditText editText1, editText2;
    Button button1, button2, button3, button4, button5, button6;
    double zahl1, zahl2, erg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
    }

    public void addiere(View view) {
        if (!(editText1.getText().toString().isEmpty()) & !(editText2.getText().toString().isEmpty())) {

            zahl1 = Double.parseDouble(editText1.getText().toString());
            zahl2 = Double.parseDouble(editText2.getText().toString());


            erg = zahl1 + zahl2;
            textView2.setText("" + erg);

        }else{
            textView2.setText("Wert fehlt");
        }

    }

    public void subtrahiere(View view) {

        if (!(editText1.getText().toString().isEmpty()) & !(editText2.getText().toString().isEmpty())) {

            zahl1 = Double.parseDouble(editText1.getText().toString());
            zahl2 = Double.parseDouble(editText2.getText().toString());


            erg = zahl1 - zahl2;
            textView2.setText("" + erg);

        }else{
            textView2.setText("Wert fehlt");
        }


    }

    public void multipliziere(View view) {
        if (!(editText1.getText().toString().isEmpty()) & !(editText2.getText().toString().isEmpty())) {

            zahl1 = Double.parseDouble(editText1.getText().toString());
            zahl2 = Double.parseDouble(editText2.getText().toString());

            erg = zahl1 * zahl2;
            textView2.setText("" + erg);

        }else{
            textView2.setText("Wert fehlt");
        }
    }

    public void dividiere(View view) {
        if (!(editText1.getText().toString().isEmpty()) & !(editText2.getText().toString().isEmpty())) {

            zahl1 = Double.parseDouble(editText1.getText().toString());
            zahl2 = Double.parseDouble(editText2.getText().toString());

            erg = zahl1 / zahl2;
            textView2.setText("" + erg);

        }else{
            textView2.setText("Wert fehlt");
        }
    }

    public void aufNullSetzen(View view) {

        editText1.setText("");
        editText2.setText("");
        textView2.setText("");
    }
    public void deleteLastChar(View view){
        if (!(editText1.getText().toString().isEmpty()) /*& !(editText2.getText().toString().isEmpty()*/) {

            zahl1 = Double.parseDouble(editText1.getText().toString());
          //  zahl2 = Double.parseDouble(editText2.getText().toString());

            int length = editText1.getText().length();
            if (length > 0) {
                editText1.getText().delete(length - 1, length);

//                int length2 = editText2.getText().length();
//                if (length > 0) {
//                    editText2.getText().delete(length2 - 1, length2);
//                }
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
