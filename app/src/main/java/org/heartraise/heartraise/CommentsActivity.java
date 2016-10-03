package org.heartraise.heartraise;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CommentsActivity extends AppCompatActivity {

    private Button mSubmtBtn;
    private EditText mPostCommnt;
    private DatabaseReference mDatabase;
    private ProgressDialog mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        mSubmtBtn = (Button)findViewById(R.id.sendBtn);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("HeartRaise");
        mPostCommnt = (EditText) findViewById(R.id.postCmmt);
        mProgress = new ProgressDialog(this);

        mSubmtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPosting();
            }
        });
    }

    private void startPosting() {

        mProgress.setMessage("Posting comment...");

        final String comment_val = mPostCommnt.getText().toString().trim();

        if (!TextUtils.isEmpty(comment_val) ) {

            mProgress.show();


                    DatabaseReference newPost = mDatabase.push();
                    newPost.child("comments").setValue(comment_val);


                    mProgress.dismiss();





        }

    }
}
