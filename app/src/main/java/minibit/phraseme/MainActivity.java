package minibit.phraseme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView[] tv = new TextView[9];
    EditText[] et = new EditText[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setString();
            }
        });
        setString();
        et[0] = (EditText)findViewById(R.id.editText2);
        et[1] = (EditText)findViewById(R.id.editText3);
        et[2] = (EditText)findViewById(R.id.editText4);
        et[3] = (EditText)findViewById(R.id.editText5);
        et[4] = (EditText)findViewById(R.id.editText6);
        et[5] = (EditText)findViewById(R.id.editText7);
        et[6] = (EditText)findViewById(R.id.editText8);
        et[7] = (EditText)findViewById(R.id.editText9);

        et[0].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[0].getText().toString().contains(" ")) {
                    et[0].setText(et[0].getText().toString().trim());
                    et[1].requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {}
        });
        et[1].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[1].getText().toString().contains(" ")) {
                    et[1].setText(et[1].getText().toString().trim());
                    et[2].requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {}
        });
        et[2].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[2].getText().toString().contains(" ")) {
                    et[2].setText(et[2].getText().toString().trim());
                    et[3].requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {}
        });
        et[3].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[3].getText().toString().contains(" ")) {
                    et[3].setText(et[3].getText().toString().trim());
                    et[4].requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {}
        });
        et[4].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[4].getText().toString().contains(" ")) {
                    et[4].setText(et[4].getText().toString().trim());
                    et[5].requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {}
        });
        et[5].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[5].getText().toString().contains(" ")) {
                    et[5].setText(et[5].getText().toString().trim());
                    et[6].requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {}
        });
        et[6].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[6].getText().toString().contains(" ")) {
                    et[6].setText(et[6].getText().toString().trim());
                    et[7].requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {}
        });
        et[7].addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(et[7].getText().toString().contains(" ")) {
                    et[7].setText(et[7].getText().toString().trim());
                }
            }
            public void afterTextChanged(Editable s) {}
        });
    }

    private void setString() {
        String str = "";
        tv[0] = (TextView)findViewById(R.id.textView);
        tv[1] = (TextView)findViewById(R.id.textView2);
        tv[2] = (TextView)findViewById(R.id.textView3);
        tv[3] = (TextView)findViewById(R.id.textView4);
        tv[4] = (TextView)findViewById(R.id.textView5);
        tv[5] = (TextView)findViewById(R.id.textView6);
        tv[6] = (TextView)findViewById(R.id.textView7);
        tv[7] = (TextView)findViewById(R.id.textView8);
        tv[8] = (TextView)findViewById(R.id.textView9);

        for(int i = 0; i < 8; i++)
            str += getCharByFrequency();
        tv[0].setText(str);
        for(int i = 0; i < 8; i++)
            tv[i+1].setText(str.substring(i, i+1).concat(":"));
    }

    private char getCharByFrequency() {
        Random rand = new Random();
        int i = rand.nextInt(10000);
        char c = 'A';
        if(i < 711)
            c = 'A';
        else if(i < 1180)
            c = 'B';
        else if(i < 2017)
            c = 'C';
        else if(i < 2485)
            c = 'D';
        else if(i < 2854)
            c = 'E';
        else if(i < 3155)
            c = 'F';
        else if(i < 3449)
            c = 'G';
        else if(i < 3833)
            c = 'H';
        else if(i < 4205)
            c = 'I';
        else if(i < 4274)
            c = 'J';
        else if(i < 4368)
            c = 'K';
        else if(i < 4634)
            c = 'L';
        else if(i < 5161)
            c = 'M';
        else if(i < 5446)
            c = 'N';
        else if(i < 5778)
            c = 'O';
        else if(i < 6808)
            c = 'P';
        else if(i < 6857)
            c = 'Q';
        else if(i < 7275)
            c = 'R';
        else if(i < 8357)
            c = 'S';
        else if(i < 8904)
            c = 'T';
        else if(i < 9601)
            c = 'U';
        else if(i < 9745)
            c = 'V';
        else if(i < 9916)
            c = 'W';
        else if(i < 9932)
            c = 'X';
        else if(i < 9960)
            c = 'Y';
        else if(i < 10000)
            c = 'Z';
        return c;
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
