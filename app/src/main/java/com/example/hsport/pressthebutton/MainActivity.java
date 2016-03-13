package com.example.hsport.pressthebutton;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;
import java.util.Scanner;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int ResultofCoin;
    private int ResultofDice;
    private int Resultof0To9;
    private String Show;

    private TextView TheResult;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        ResultofCoin = (int) (Math.random() * 2);
                        if (ResultofCoin == 0) {
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("TOP!");
                        } else {
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("BOTTOM!");
                        }
                    }

                }
        );


        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        ResultofDice = (int) (Math.random() * 6) + 1;

                        if(ResultofDice==1){
                                TextView ResultView = (TextView) findViewById(R.id.ResultView);
                                ResultView.setText("ONE!");}
                        else if(ResultofDice==2){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("TWO!");}
                        else if(ResultofDice==3){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("THREE!");}
                        else if(ResultofDice==4){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("FOUR!");}
                        else if(ResultofDice==5){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("FIVE!");}
                        else {
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("SIX!");}

                        }
                    }

        );

        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        Resultof0To9 = (int) (Math.random() * 10);

                        if(Resultof0To9==0){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("0!");}
                        else if(Resultof0To9==1){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("1!");}
                        else if(Resultof0To9==2){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("2!");}
                        else if(Resultof0To9==3){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("3!");}
                        else if(Resultof0To9==4){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("4!");}
                        else if(Resultof0To9==5){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("5!");}
                        else if(Resultof0To9==6){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("6!");}
                        else if(Resultof0To9==7){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("7!");}
                        else if(Resultof0To9==8){
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("8!");}
                        else {
                            TextView ResultView = (TextView) findViewById(R.id.ResultView);
                            ResultView.setText("9!");}
                    }
                }


        );


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.hsport.pressthebutton/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.hsport.pressthebutton/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
