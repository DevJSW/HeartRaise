package org.heartraise.heartraise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HeartraiseRow extends AppCompatActivity {

    private ImageButton mSelectComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heartraise_row);

        mSelectComment = (ImageButton) findViewById(R.id.commentButton);

        mSelectComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HeartraiseRow.this, CommentsActivity.class));
            }
        });
    }
}
