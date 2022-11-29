package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.R;

 
import android.media.MediaPlayer;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity4 extends Activity {
Button button;
   private MediaPlayer mediaPlayer;
    @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
     setContentView(R.layout.r);
          button= (Button) findViewById(R.id.btn);
   button.setOnClickListener (new View.OnClickListener(){
   @Override
   public void onClick(View v){
    MainActivity();
    mediaPlayer.stop();
    Toast.makeText(getApplicationContext(),"Salute For Dr.Jose P. Rizal", Toast.LENGTH_LONG).show(); 
   }
   
   });
   mediaPlayer = MediaPlayer.create(this, R.drawable.lupa);
     mediaPlayer.start();
     
          mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
    public void onCompletion(MediaPlayer mp) {
               Toast.makeText(getApplicationContext(),"Salute for Dr.Jose Rizal", Toast.LENGTH_LONG).show(); 
                 MainActivity();
         // display a toast when an video is completed
            }
        });
        }
      public void MainActivity(){
        Intent intent=new Intent(this, MainActivity.class);
   startActivity(intent);
 }
}