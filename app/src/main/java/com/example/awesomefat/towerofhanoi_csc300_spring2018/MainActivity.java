package com.example.awesomefat.towerofhanoi_csc300_spring2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button tower0Button;
    private Button tower1Button;
    private Button tower2Button;

    private Tower tower0 = new Tower();
    private Tower tower1 = new Tower();
    private Tower tower2 = new Tower();

    private Disk disk0 = new Disk(1);
    private Disk disk1 = new Disk(2);
    private Disk disk2 = new Disk(3);


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tower0Button = (Button)this.findViewById(R.id.tower0Button);
        this.tower1Button = (Button)this.findViewById(R.id.tower1Button);
        this.tower2Button = (Button)this.findViewById(R.id.tower2Button);

    }

    public void buttonOnClick (View v)
    {
        if(v == this.tower0Button)
        {
            System.out.println("Button 0");
        }
        else if(v == this.tower1Button)
        {
            System.out.println("Button 1");
        }
        else if(v == this.tower2Button)
        {
            System.out.println("Button 2");
        }
    }
}
