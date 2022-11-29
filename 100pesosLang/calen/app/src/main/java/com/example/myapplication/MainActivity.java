package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;


import com.example.myapplication.R;
import android.widget.Button;
import android.content.Intent;
import android.view.View; 

 
 public class MainActivity extends Activity {
Button button,button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
button= (Button) findViewById(R.id.pasko);
button1= (Button) findViewById(R.id.newyr);
button2= (Button) findViewById(R.id.rizal);
  button.setOnClickListener (new View.OnClickListener(){
   @Override
   public void onClick(View v){
    MainActivity2();
   }
   
   });
   button1.setOnClickListener (new View.OnClickListener(){
    public void onClick(View v){
    MainActivity3();
   }
   
   });
    button2.setOnClickListener (new View.OnClickListener(){
    public void onClick(View v){
    MainActivity4();
   }
   
   });
        
}
public void MainActivity2(){
   Intent intent=new Intent(this, MainActivity2.class);
   startActivity(intent);
 }  
 public void MainActivity4(){
   Intent intent=new Intent(this, MainActivity4.class);
   startActivity(intent);
 }  
 public void MainActivity3(){
   Intent intent=new Intent(this, MainActivity3.class);
   startActivity(intent);
 }   }