package com.example.timerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TimerView timerView;
    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        timerView = findViewById( R.id.timer );
        btn1 = findViewById( R.id.btn1 );
        btn2 = findViewById( R.id.btn2 );
        btn3 = findViewById( R.id.btn3 );

        btn1.setOnClickListener( this );
        btn2.setOnClickListener( this );
        btn3.setOnClickListener( this );
    }

    @Override
    public void onClick( View v ) {
        if ( v == btn1 ) {
            timerView.start( 15000 );
        } else if ( v == btn2 ) {
            timerView.stop();
        } else if ( v == btn3 ){
            if ( timerView.isCertification() ){
                Toast.makeText( this, "인증", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText( this, "인증시간초과", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
