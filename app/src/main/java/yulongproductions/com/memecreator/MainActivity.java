package yulongproductions.com.memecreator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements TopSectionFragment.TopSectionListener {

    /*
        Old code when using MainActivity to communicate with the fragments.
        Worked fine, with no error, but does not showcase the fragment way
        of communicating with MainActivity.


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

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Gets called by TopSectionFragment when user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top, bottom);
    }
}
