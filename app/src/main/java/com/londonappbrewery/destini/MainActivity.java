package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView storyText;
    private Button topButton;
    private Button bottomButton;
    private int storyIndex;

    Story[] storyBank = {
            new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        storyText = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        storyText.setText(R.string.T1_Story);
        topButton.setText(R.string.T1_Ans1);
        bottomButton.setText(R.string.T1_Ans2);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStory(storyIndex, true);
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateStory(storyIndex, false);
            }
        });

    }

    private void updateStory(int index, boolean answer) {
        if ((storyIndex == 0 || storyIndex == 1) && answer) {
            storyIndex = 2;
            storyText.setText(storyBank[storyIndex].getStoryText());
            topButton.setText(storyBank[storyIndex].getTopAnswer());
            bottomButton.setText(storyBank[storyIndex].getBottomAnswer());
        } else if (storyIndex == 0 && !answer) {
            storyIndex = 1;
            storyText.setText(storyBank[storyIndex].getStoryText());
            topButton.setText(storyBank[storyIndex].getTopAnswer());
            bottomButton.setText(storyBank[storyIndex].getBottomAnswer());
        } else if (storyIndex == 1 && !answer) {
            storyText.setText(R.string.T4_End);
            topButton.setVisibility(View.INVISIBLE);
            bottomButton.setVisibility(View.INVISIBLE);
        } else if (storyIndex == 2 && answer) {
            storyText.setText(R.string.T6_End);
            topButton.setVisibility(View.INVISIBLE);
            bottomButton.setVisibility(View.INVISIBLE);
        } else if (storyIndex == 2 && !answer) {
            storyText.setText(R.string.T5_End);
            topButton.setVisibility(View.INVISIBLE);
            bottomButton.setVisibility(View.INVISIBLE);
        }
    }
}
