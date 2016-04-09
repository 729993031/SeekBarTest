package com.example.SeekBarTest;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MyActivity extends Activity {
    ImageView image;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        image=(ImageView)findViewById(R.id.image);
        SeekBar seekBar=(SeekBar)findViewById(R.id.seekbar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar arg0,int progress,boolean fromUser)
            {
                image.setImageAlpha(progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar bar)
            {

            }
            @Override
            public void onStopTrackingTouch(SeekBar bar)
            {

            }
        });
    }
}
