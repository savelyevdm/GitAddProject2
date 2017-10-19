package ru.developsdm.gitaddproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SingleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(l -> Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show());
    }
}
