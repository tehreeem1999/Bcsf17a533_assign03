package com.example.bcsf17a533_assign03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btnminus, btn4, btn5, btn6, btnmul, btn7, btn8, btn9, btndiv, btnequi, btnclr,btnmod,btnplus;
    android.widget.EditText edi;
    float res1,res2;
    Boolean add,sub,mul,div,mode;
    float ans;
    private Object EditText;
    void storePre()
    {
        res1=Float.parseFloat(edi.getText() + "");
    }
    void setFalse()
    {
        add=sub=mul=div=mode=false;
    }
    void clear()
    {
        res1= Float.parseFloat(null);
        edi.setText(null);
        setFalse();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnplus=(Button)findViewById(R.id.btnplus);
        btnminus=(Button)findViewById(R.id.btndiv);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btn1=(Button)findViewById(R.id.btn1);
        btnclr=(Button)findViewById(R.id.btnclr);
        btnmod=(Button)findViewById(R.id.btnmod);
        btnequi=(Button)findViewById(R.id.btnequi);
        btn0=(Button)findViewById(R.id.btn0);
        edi = (EditText) findViewById(R.id.edi);
        btn0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "0");
            }

        });

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "1");
            }

        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "2");
            }

        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "3");
            }

        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "4");
            }

        });

        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "5");
            }

        });

        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "6");
            }

        });

        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "7");
            }

        });

        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "8");
            }

        });

        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText(edi.getText()+ "9");
            }

        });

        btnplus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(edi==null)
                {
                    edi.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    add=true;
                    edi.setText(null);
                }
            }

        });

        btnminus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(edi==null)
                {
                    edi.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    sub=true;
                    edi.setText(null);
                }
            }

        });

        btnmul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(edi==null)
                {
                    edi.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    mul=true;
                    edi.setText(null);
                }
            }

        });

        btndiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(edi==null)
                {
                    edi.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    div=true;
                    edi.setText(null);
                }
            }

        });


        btnequi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(add)
                {
                    edi.setText(res1+Float.parseFloat(edi.getText()+ "")+"");
                }
                if(sub)
                {
                    edi.setText(res1-Float.parseFloat(edi.getText()+ "")+"");
                }
                if(div)
                {
                    edi.setText(res1/Float.parseFloat(edi.getText()+ "")+"");
                }
                if(mul)
                {
                    edi.setText(res1*Float.parseFloat(edi.getText()+ "")+"");
                }
                if(mode)
                {
                    edi.setText(res1%Float.parseFloat(edi.getText()+ "")+"");
                }
            }

        });

        btnmod.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(edi==null)
                {
                    edi.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    mode=true;
                    edi.setText(null);
                }
            }

        });

        btnclr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edi.setText("");
            }

        });



    }
}