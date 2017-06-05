package com.androidveteran.android.materialprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class ReviewActivity extends AppCompatActivity {

    EditText edittext;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);



        edittext = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        //버튼 행위
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { //버튼을 눌렀을때 작업
                String inPutText = edittext.getText().toString();
                Toast.makeText(ReviewActivity.this, inPutText,Toast.LENGTH_SHORT).show();
            }});


        final TextView tv = (TextView) findViewById(R.id.textView);
        RatingBar rb =(RatingBar)findViewById(R.id.ratingBar);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                tv.setText("평가 : " + rating);
            }
        });

        String inPutText = edittext.getText().toString();
        Toast.makeText(ReviewActivity.this, inPutText,Toast.LENGTH_SHORT).show();

    }
}
