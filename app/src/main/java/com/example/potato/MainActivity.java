package com.example.potato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox cbarms=(CheckBox) findViewById(R.id.cbarms);
        CheckBox cbears=(CheckBox) findViewById(R.id.cbears);
        CheckBox cbeyebrows=(CheckBox) findViewById(R.id.cbeyebrows);
        CheckBox cbeyes=(CheckBox) findViewById(R.id.cbeyes);
        CheckBox cbglasses=(CheckBox) findViewById(R.id.cbglasses);
        CheckBox cbhat=(CheckBox) findViewById(R.id.cbhat);
        CheckBox cbmouth=(CheckBox) findViewById(R.id.cbmouth);
        CheckBox cbmustache=(CheckBox) findViewById(R.id.cbmustache);
        CheckBox cbnose=(CheckBox) findViewById(R.id.cbnose);
        CheckBox cbshoes=(CheckBox) findViewById(R.id.cbshoes);

        final ImageView arms=(ImageView) findViewById(R.id.arms);
        final ImageView ears=(ImageView) findViewById(R.id.ears);
        final ImageView eyebrows=(ImageView) findViewById(R.id.eyebrows);
        final ImageView glasses=(ImageView) findViewById(R.id.glasses);
        final ImageView hat=(ImageView) findViewById(R.id.hat);
        final ImageView mouth=(ImageView) findViewById(R.id.mouth);
        final ImageView mustache=(ImageView) findViewById(R.id.mustache);
        final ImageView eyes=(ImageView) findViewById(R.id.eyes);
        final ImageView nose=(ImageView) findViewById(R.id.nose);
        final ImageView shoes=(ImageView) findViewById(R.id.shoes);

        cbarms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    arms.setVisibility(View.VISIBLE);
                }else{
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    ears.setVisibility(View.VISIBLE);
                }else{
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbeyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    eyebrows.setVisibility(View.VISIBLE);
                }else{
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbeyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    eyes.setVisibility(View.VISIBLE);
                }else{
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbglasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    glasses.setVisibility(View.VISIBLE);
                }else{
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbhat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    hat.setVisibility(View.VISIBLE);
                }else{
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbarms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    arms.setVisibility(View.VISIBLE);
                }else{
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbmouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    mouth.setVisibility(View.VISIBLE);
                }else{
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbmustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    mustache.setVisibility(View.VISIBLE);
                }else{
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbnose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    nose.setVisibility(View.VISIBLE);
                }else{
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbshoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    shoes.setVisibility(View.VISIBLE);
                }else{
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }


}
