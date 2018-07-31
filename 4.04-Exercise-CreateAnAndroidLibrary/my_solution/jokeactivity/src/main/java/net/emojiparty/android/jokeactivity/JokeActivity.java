package net.emojiparty.android.jokeactivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_joke);
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    TextView textView = findViewById(R.id.joke_text_view);

    if (getIntent().getStringExtra("JOKE") != null) {
      textView.setText(getIntent().getStringExtra("JOKE"));
    } else {
      textView.setText("Didn't get anything in my bundle :(");
    }
  }
}
