package org.heartraise.heartraise;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton mProfileBtn;

    private Uri mImageUri = null;
    private StorageReference mStorage;
    private DatabaseReference mDatabase;
    private ProgressDialog mProgress;
    private static int GALLERY_REQUEST =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProfileBtn = (ImageButton) findViewById(R.id.profileBtn);
        mProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
                galleryIntent.setType("image/*");
                startActivityForResult(galleryIntent, GALLERY_REQUEST);
            }
        });
    }


}
