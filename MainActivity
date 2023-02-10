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





_________________________________________________________________________________________________________________________
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/text1"
        android:layout_width="292dp"
        android:layout_height="78dp"
        android:layout_marginStart="85dp"
        android:layout_marginTop="70dp"
        android:layout_marginEnd="34dp"
        android:text="calculator"
        android:textSize="48sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/res"
        android:layout_width="264dp"
        android:layout_height="69dp"
        android:layout_marginStart="93dp"
        android:layout_marginTop="37dp"
        android:layout_marginEnd="54dp"
        android:layout_marginBottom="30dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="res"
        android:textSize="34sp"
        app:layout_constraintBottom_toTopOf="@+id/linearLayout"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/text1" />

    <LinearLayout
        android:id="@+id/linearLayout"
        android:layout_width="405dp"
        android:layout_height="59dp"
        android:layout_marginStart="3dp"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="6dp"
        android:orientation="horizontal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/res">

        <Button
            android:id="@+id/nine"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="9" />

        <Button
            android:id="@+id/eight"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="8" />

        <Button
            android:id="@+id/seven"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="7" />

        <Button
            android:id="@+id/div"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="/" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/linearLayout2"
        android:layout_width="408dp"
        android:layout_height="57dp"
        android:layout_marginStart="3dp"
        android:layout_marginTop="14dp"
        android:layout_marginEnd="3dp"
        android:orientation="horizontal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/linearLayout">

        <Button
            android:id="@+id/six"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="6" />

        <Button
            android:id="@+id/five"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="5" />

        <Button
            android:id="@+id/four"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="4" />

        <Button
            android:id="@+id/mul"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="*" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/linearLayout3"
        android:layout_width="409dp"
        android:layout_height="62dp"
        android:layout_marginStart="1dp"
        android:layout_marginTop="13dp"
        android:layout_marginEnd="4dp"
        android:orientation="horizontal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/linearLayout2">

        <Button
            android:id="@+id/three"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="3" />

        <Button
            android:id="@+id/two"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="2" />

        <Button
            android:id="@+id/one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="1" />

        <Button
            android:id="@+id/sub"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="-" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/linearLayout5"
        android:layout_width="406dp"
        android:layout_height="62dp"
        android:layout_marginStart="3dp"
        android:layout_marginTop="11dp"
        android:layout_marginEnd="5dp"
        android:orientation="horizontal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/linearLayout3">

        <Button
            android:id="@+id/dot"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="." />

        <Button
            android:id="@+id/zero"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="0" />

        <Button
            android:id="@+id/mod"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="%" />

        <Button
            android:id="@+id/add"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="+" />
    </LinearLayout>

    <Button
        android:id="@+id/equ"
        android:layout_width="407dp"
        android:layout_height="53dp"
        android:layout_marginStart="10dp"
        android:layout_marginTop="19dp"
        android:layout_marginEnd="3dp"
        android:layout_marginBottom="12dp"
        android:text="="
        app:layout_constraintBottom_toTopOf="@+id/clear"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.888"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/linearLayout5" />

    <Button
        android:id="@+id/clear"
        android:layout_width="415dp"
        android:layout_height="47dp"
        android:layout_marginTop="12dp"
        android:layout_marginBottom="35dp"
        android:text="clear"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/equ" />

</androidx.constraintlayout.widget.ConstraintLayout>
