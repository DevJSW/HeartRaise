package org.heartraise.heartraise;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HeartraiseRow extends AppCompatActivity {

    private ImageButton mSelectComment;
    private TextView myCustomFont, textViewCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heartraise_row);

        mSelectComment = (ImageButton) findViewById(R.id.commentButton);

        TextView textViewCustom = (TextView) findViewById(R.id.post_story);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Oswald-Medium.ttf");
        textViewCustom.setTypeface(myCustomFont);


        mSelectComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HeartraiseRow.this, CommentsActivity.class));
            }
        });
    }
}
