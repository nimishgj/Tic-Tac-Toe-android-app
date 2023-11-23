package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name1, name2;
    String namep1, namep2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.boton);
        name1 = findViewById(R.id.player1);
        name2 = findViewById(R.id.player2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Retrieve player names from EditText fields
                namep1 = name1.getText().toString();
                namep2 = name2.getText().toString();

                // Create an Intent to start the next activity (MainActivity2)
                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                // Pass player names as extras to the next activity
                i.putExtra("name1", namep1);
                i.putExtra("name2", namep2);

                // Start the next activity
                startActivity(i);
            }
        });
    }
}
