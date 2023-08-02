package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[] b = new Button[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=1;i<b.length;i++){
            int id=getResources().getIdentifier("b"+i,"id",getPackageName());
            b[i]=findViewById(id);
            b[i].setOnClickListener(this);
            System.out.println("id = "+id);
        }
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==b[6].getId())
        {
            if(b[3].getText().toString().isEmpty())
            {
                b[3].setText(""+b[6].getText().toString());
                b[6].setText("");
            }
            if(b[5].getText().toString().isEmpty())
            {
                b[5].setText(""+b[6].getText().toString());
                b[6].setText("");
            }
            if(b[9].getText().toString().isEmpty())
            {
                b[9].setText(""+b[6].getText().toString());
                b[6].setText("");
            }
        }
        if(view.getId()==b[1].getId())
        {
            if(b[2].getText().toString().isEmpty())
            {
                b[2].setText(""+b[1].getText().toString());
                b[1].setText("");
            }
            if(b[4].getText().toString().isEmpty())
            {
                b[4].setText(""+b[1].getText().toString());
                b[1].setText("");
            }
        }
        if(view.getId()==b[2].getId())
        {
            if(b[3].getText().toString().isEmpty())
            {
                b[3].setText(""+b[2].getText().toString());
                b[2].setText("");
            }
            if(b[5].getText().toString().isEmpty())
            {
                b[5].setText(""+b[2].getText().toString());
                b[2].setText("");
            }
            if(b[1].getText().toString().isEmpty())
            {
                b[1].setText(""+b[2].getText().toString());
                b[2].setText("");
            }
        }
        if(view.getId()==b[3].getId())
        {
            if(b[2].getText().toString().isEmpty())
            {
                b[2].setText(""+b[3].getText().toString());
                b[3].setText("");
            }
            if(b[6].getText().toString().isEmpty())
            {
                b[6].setText(""+b[3].getText().toString());
                b[3].setText("");
            }
        }
        if(view.getId()==b[4].getId())
        {
            if(b[1].getText().toString().isEmpty())
            {
                b[1].setText(""+b[4].getText().toString());
                b[4].setText("");
            }
            if(b[5].getText().toString().isEmpty())
            {
                b[5].setText(""+b[4].getText().toString());
                b[4].setText("");
            }
            if(b[7].getText().toString().isEmpty())
            {
                b[7].setText(""+b[4].getText().toString());
                b[4].setText("");
            }
        }
        if(view.getId()==b[5].getId())
        {
            if(b[2].getText().toString().isEmpty())
            {
                b[2].setText(""+b[5].getText().toString());
                b[5].setText("");
            }
            if(b[6].getText().toString().isEmpty())
            {
                b[6].setText(""+b[5].getText().toString());
                b[5].setText("");
            }
            if(b[4].getText().toString().isEmpty())
            {
                b[4].setText(""+b[5].getText().toString());
                b[5].setText("");
            }
            if(b[8].getText().toString().isEmpty())
            {
                b[8].setText(""+b[5].getText().toString());
                b[5].setText("");
            }
        }
        if(view.getId()==b[7].getId())
        {
            if(b[4].getText().toString().isEmpty())
            {
                b[4].setText(""+b[7].getText().toString());
                b[7].setText("");
            }
            if(b[8].getText().toString().isEmpty())
            {
                b[8].setText(""+b[7].getText().toString());
                b[7].setText("");
            }
        }
        if(view.getId()==b[8].getId())
        {
            if(b[5].getText().toString().isEmpty())
            {
                b[5].setText(""+b[8].getText().toString());
                b[8].setText("");
            }
            if(b[7].getText().toString().isEmpty())
            {
                b[7].setText(""+b[8].getText().toString());
                b[8].setText("");
            }
            if(b[9].getText().toString().isEmpty())
            {
                b[9].setText(""+b[8].getText().toString());
                b[8].setText("");
            }
        }
        if(view.getId()==b[9].getId())
        {
            if(b[6].getText().toString().isEmpty())
            {
                b[6].setText(""+b[9].getText().toString());
                b[9].setText("");
            }
            if(b[8].getText().toString().isEmpty())
            {
                b[8].setText(""+b[9].getText().toString());
                b[9].setText("");
            }
        }
    }

}