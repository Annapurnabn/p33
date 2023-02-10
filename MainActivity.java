package com.example.cc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText res;
    Button nine,eight,seven,six,five,four,three,two,one,zero,dot,mod,div,mul,sub,add,equ,clear;
    String operatorPressed=" ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res=findViewById(R.id.res);
        nine=findViewById(R.id.nine);
        eight=findViewById(R.id.eight);
        seven=findViewById(R.id.seven);
        six=findViewById(R.id.six);
        five=findViewById(R.id.five);
        four=findViewById(R.id.four);
        three=findViewById(R.id.three);
        two=findViewById(R.id.two);
        one=findViewById(R.id.one);
        zero=findViewById(R.id.zero);
        dot=findViewById(R.id.dot);
        mod=findViewById(R.id.mod);
        div=findViewById(R.id.div);
        mul=findViewById(R.id.mul);
        sub=findViewById(R.id.sub);
        add=findViewById(R.id.add);
        equ=findViewById(R.id.equ);
        clear=findViewById(R.id.clear);

        res.setOnClickListener(this);
        nine.setOnClickListener(this);
        eight.setOnClickListener(this);
        seven.setOnClickListener(this);
        six.setOnClickListener(this);
        five.setOnClickListener(this);
        four.setOnClickListener(this);
        three.setOnClickListener(this);
        two.setOnClickListener(this);
        one.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        mod.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);
        equ.setOnClickListener(this);
        clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        double finalResult=0.0;

        switch(view.getId()){

            case R.id.nine:
                res.append("9");
                break;

            case R.id.eight:
                res.append("8");
                break;

            case R.id.seven:
                res.append("7");
                break;

            case R.id.six:
                res.append("6");
                break;

            case R.id.five:
                res.append("5");
                break;

            case R.id.four:
                res.append("4");
                break;

            case R.id.three:
                res.append("3");
                break;

            case R.id.two:
                res.append("2");
                break;

            case R.id.one:
                res.append("1");
                break;

            case R.id.zero:
                res.append("0");
                break;






            case R.id.dot:
                res.append(".");
                operatorPressed=".";
                break;

            case R.id.mod:
                res.append("%");
                operatorPressed="%";
                break;

            case R.id.div:
                res.append("/");
                operatorPressed="/";
                break;

            case R.id.mul:
                res.append("*");
                operatorPressed="*";
                break;

            case R.id.sub:
                res.append("-");
                operatorPressed="-";
                break;

            case R.id.add:
                res.append("+");
                operatorPressed="+";
                break;






            case R.id.clear:
                res.setText("0");
                break;

            case R.id.equ:
                finalResult=evaluateEpression(res.getText().toString(),operatorPressed);
                res.setText(String.valueOf(finalResult));
                break;


            default:
                return;

        }
    }

    private double evaluateEpression(String res,String operatorPressed) {
        String[] tokens=res.split("\\+|-|\\*|\\/");
        double firstOperand=Double.parseDouble(tokens[0]);
        double seconfOperand=Double.parseDouble(tokens[1]);

        switch(operatorPressed){
            case "+" : return firstOperand+seconfOperand;
            case "-" : return firstOperand-seconfOperand;
            case "/" : return firstOperand/seconfOperand;
            case "*" : return firstOperand*seconfOperand;
            case "%" : return firstOperand%seconfOperand;
            default: return 0;



        }
    }
}
