package net.emojiparty.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import net.emojiparty.android.javaJokes.JokeSmith;
import net.emojiparty.android.jokeactivity.JokeActivity;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void onButtonClicked(View view) {
    Intent intent = new Intent(this, JokeActivity.class);
    String joke = JokeSmith.getJoke();
    intent.putExtra("JOKE", joke);
    startActivity(intent);
  }
}
