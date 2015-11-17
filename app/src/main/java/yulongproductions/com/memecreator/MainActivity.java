package yulongproductions.com.memecreator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private EditText memeLine1;
    private EditText memeLine2;
    private TextView topText;
    private TextView bottomText;
    private Button memeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.memeLine1 = (EditText) findViewById(R.id.memeLine1);
        this.memeLine2 = (EditText) findViewById(R.id.memeLine2);
        this.topText = (TextView) findViewById(R.id.topText);
        this.bottomText = (TextView) findViewById(R.id.bottomText);
        this.memeButton = (Button) findViewById(R.id.memeButton);

        this.memeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topText.setText(convert(memeLine1));
                bottomText.setText(convert(memeLine2));

                memeLine1.setText("");
                memeLine2.setText("");
            }
        });
    }

    private String convert(EditText editText) {
        return editText.getText().toString();
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
