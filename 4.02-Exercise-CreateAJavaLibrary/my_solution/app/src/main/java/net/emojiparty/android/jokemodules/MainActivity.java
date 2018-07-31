package net.emojiparty.android.jokemodules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import net.emojiparty.android.javaJokes.JokeSmith;
import net.emojiparty.android.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView jokeSmithTextView = findViewById(R.id.joke_smith_joke);
    jokeSmithTextView.setText(JokeSmith.getJoke());
    TextView jokeWizardTextView = findViewById(R.id.joke_wizard_joke);
    jokeWizardTextView.setText(JokeWizard.getJoke());
  }
}
