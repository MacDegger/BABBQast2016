package com.lifeboat.mobile.BABBQastPresentation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by Maarten Edgar on 24-10-2015.
 */
public class MainActivity extends AppCompatActivity {

    private CardView mStartCardView32;
    private TextView mStartCardTextView32;

    private CardView mStartCardView16;
    private TextView mStartCardTextView16;

    private CardView mStartCardView32BG;
    private TextView mStartCardTextView32BG;

    private CardView mStartCardView16BG;
    private TextView mStartCardTextView16BG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        requestWindowFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setAllowEnterTransitionOverlap(true);
        getWindow().setAllowReturnTransitionOverlap(true);
        getWindow().setSharedElementExitTransition(TransitionInflater.from(this).inflateTransition(R.transition.trans_move));
        getWindow().setSharedElementReenterTransition(TransitionInflater.from(this).inflateTransition(R.transition.trans_move));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartCardView32 = (CardView)findViewById(R.id.activity_main_startcard_32);
        mStartCardView32.setTransitionName("titlecardone");
        mStartCardTextView32 = (TextView)findViewById(R.id.activity_main_startcard_textview_32);

        mStartCardView16 = (CardView)findViewById(R.id.activity_main_startcard_16);
        mStartCardView16.setTransitionName("titlecardone");
        mStartCardTextView16 = (TextView)findViewById(R.id.activity_main_startcard_textview_16);

        mStartCardView32BG = (CardView)findViewById(R.id.activity_main_startcard_bg_30);
        mStartCardView32BG.setTransitionName("titlecardone");
        mStartCardTextView32BG = (TextView)findViewById(R.id.activity_main_startcard_textview_bg_30);

        mStartCardView16BG = (CardView)findViewById(R.id.activity_main_startcard_bg_60);
        mStartCardView16BG.setTransitionName("titlecardone");
        mStartCardTextView16BG = (TextView)findViewById(R.id.activity_main_startcard_textview_bg_60);
    }

    public void onCardClick(View v){
        switch (v.getId()){
            case R.id.activity_main_startcard_32:
                Intent intent = new Intent(this, LandscapeActivity.class);
                intent.putExtra("heroname", "titlecardone");
                intent.putExtra("herotext", mStartCardTextView32.getText());
                intent.putExtra("framespeed", "32");
                intent.putExtra("bg", false);
                ((ViewGroup) mStartCardView32.getParent()).setTransitionGroup(true);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, mStartCardView32, "titlecardone");
                startActivity(intent, options.toBundle());
                break;
            case R.id.activity_main_startcard_16:
                Intent intent2 = new Intent(this, LandscapeActivity.class);
                intent2.putExtra("heroname", "titlecardone");
                intent2.putExtra("herotext", mStartCardTextView16.getText());
                intent2.putExtra("framespeed", "16");
                intent2.putExtra("bg", false);
                ((ViewGroup) mStartCardView16.getParent()).setTransitionGroup(true);
                ActivityOptions options2 = ActivityOptions.makeSceneTransitionAnimation(this, mStartCardView16, "titlecardone");
                startActivity(intent2, options2.toBundle());
                break;
            case R.id.activity_main_startcard_bg_30:
                Intent intent3 = new Intent(this, LandscapeActivity.class);
                intent3.putExtra("heroname", "titlecardone");
                intent3.putExtra("herotext", mStartCardTextView32BG.getText());
                intent3.putExtra("framespeed", "32");
                intent3.putExtra("bg", true);
                ((ViewGroup) mStartCardTextView32BG.getParent()).setTransitionGroup(true);
                ActivityOptions options3 = ActivityOptions.makeSceneTransitionAnimation(this, mStartCardTextView32BG, "titlecardone");
                startActivity(intent3, options3.toBundle());
                break;
            case R.id.activity_main_startcard_bg_60:
                Intent intent4 = new Intent(this, LandscapeActivity.class);
                intent4.putExtra("heroname", "titlecardone");
                intent4.putExtra("herotext", mStartCardTextView16BG.getText());
                intent4.putExtra("framespeed", "16");
                intent4.putExtra("bg", true);
                ((ViewGroup) mStartCardTextView16BG.getParent()).setTransitionGroup(true);
                ActivityOptions options4 = ActivityOptions.makeSceneTransitionAnimation(this, mStartCardTextView16BG, "titlecardone");
                startActivity(intent4, options4.toBundle());
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
