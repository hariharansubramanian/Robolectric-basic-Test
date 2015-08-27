package com.example.hari.helloworld;

import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Nicky on 8/26/2015.
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;
    @Before
    public void setup(){
        activity= Robolectric.setupActivity(MainActivity.class);
    }

@Test
    public void validateTextViewContent(){
    TextView textView1= (TextView) activity.findViewById(R.id.textView1);
    assertNotNull("TextView could not be found",textView1);
    assertTrue("TextView contains incorrect text", "Hello world!".equals(textView1.getText().toString()));
}





}



