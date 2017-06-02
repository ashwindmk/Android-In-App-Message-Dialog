package com.example.ashwin.inappdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mShowInAppButton;
    InAppDialogFragment mInAppDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mShowInAppButton = (Button) findViewById(R.id.show_in_app_button);
        mShowInAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInAppDialogFragment = new InAppDialogFragment();
                if (!mInAppDialogFragment.isAdded()) {
                    mInAppDialogFragment.show((MainActivity.this).getFragmentManager(), "DialogFragment");
                }
            }
        });
    }
}
