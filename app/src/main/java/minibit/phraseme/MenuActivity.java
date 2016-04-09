package minibit.phraseme;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        String first = "<font color = '#B5D5A7'>Phrase</font>";
        String second = "<font color = '#38761D'>It</font>";
        first = first + second;
        TextView tv = (TextView)findViewById(R.id.textViewMenuTitle);
        tv.setText(Html.fromHtml(first));
        tv = (TextView)findViewById(R.id.textViewPlay);
        tv.setOnClickListener(new OnClickPlay());
        ImageButton ib = (ImageButton)findViewById(R.id.playButton);
        ib.setOnClickListener(new OnClickPlay());
    }

    protected class OnClickPlay implements View.OnClickListener {
        public void onClick(View view) {
            Intent intent = new Intent(MenuActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
