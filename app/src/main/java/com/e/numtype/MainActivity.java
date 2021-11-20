package com.e.numtype;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num;
    TextView info_text;
    Button palindrome,armstrong,fibonacci,proth,positive,negative,square,cube,kaprekar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText) findViewById(R.id.num);
        palindrome = findViewById(R.id.palindrome);
        armstrong = findViewById(R.id.armstrong);
        fibonacci = findViewById(R.id.fibonacci);
        proth = findViewById(R.id.proth);
        positive = (Button) findViewById(R.id.positive);
        negative = findViewById(R.id.negative);
        square = findViewById(R.id.square);
        cube = findViewById(R.id.cube);
        kaprekar = findViewById(R.id.kaprekar);
        info_text = findViewById(R.id.info_text);


        palindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());
                int r, sum = 0, temp;

                temp = number;
                while (number > 0) {
                    r = number % 10;  //getting remainder
                    sum = (sum * 10) + r;
                    number = number / 10;
                }
                if (temp == sum) {
                    String msg="Palindrome: YES!";

                    palindrome.setBackgroundColor(getResources().getColor(R.color.win));
                    palindrome.setTextSize(18);
                    palindrome.setText(msg);
                }
                else
                {
                    String msg="Palindrome: NO!";

                    palindrome.setBackgroundColor(getResources().getColor(R.color.fail));
                    palindrome.setTextSize(15);
                    palindrome.setText(msg);
                }
            }
        });


        armstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());
                int c=0,a,temp;
                temp=number;
                while(number>0)
                {
                    a=number%10;
                    number=number/10;
                    c=c+(a*a*a);
                }

                if (temp == c) {
                    String msg="Armstrong: YES!";

                    armstrong.setBackgroundColor(getResources().getColor(R.color.win));
                    armstrong.setTextSize(18);
                    armstrong.setText(msg);
                }
                else
                {
                    String msg="Armstrong: NO!";

                    armstrong.setBackgroundColor(getResources().getColor(R.color.fail));
                    armstrong.setTextSize(15);
                    armstrong.setText(msg);
                }
            }
        });

        fibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());

                int f[] = new int[number + 2];
                int i;

                f[0] = 0;
                f[1] = 0;

                if (number > 0) {
                    f[2] = 1;

                    for (i = 3; i <= number; i++) {

                        f[i] = f[i - 1] + f[i - 2];
                    }
                }

                String msg="Nth Fibonacci term : "+f[number];

                fibonacci.setBackgroundColor(getResources().getColor(R.color.win));
                fibonacci.setTextSize(18);
                fibonacci.setText(msg);
            }
        });

        proth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString())-1;
                int flag=0;
                int k = 1;
                while (k < (number / k)) {

                    // check if k divides n or not
                    if (number % k == 0) {

                        int n=number/k;
                        System.out.println(n);
                        // Check if n/k is power of 2 or not
                        if (n != 0 && ((n & (n - 1)) == 0))
                        {
                            flag=1;
                            String msg="Proth: YES!";

                            proth.setBackgroundColor(getResources().getColor(R.color.win));
                            proth.setTextSize(18);
                            proth.setText(msg);

                            break;
                        }
                    }

                    // update k to next odd number
                    k = k + 2;
                }

                if(flag==0)
                {
                    String msg="Proth: NO!";

                    proth.setBackgroundColor(getResources().getColor(R.color.fail));
                    proth.setTextSize(15);
                    proth.setText(msg);
                }
            }
        });

        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());
                if(number>=0)
                {
                    String msg="Positive: YES!";

                    positive.setBackgroundColor(getResources().getColor(R.color.win));
                    positive.setTextSize(18);
                    positive.setText(msg);
                }
                else
                {
                    String msg="Positive: NO!";

                    positive.setBackgroundColor(getResources().getColor(R.color.fail));
                    positive.setTextSize(15);
                    positive.setText(msg);
                }
            }
        });

        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());
                if(number<0)
                {
                    String msg="Negative: YES!";

                    negative.setBackgroundColor(getResources().getColor(R.color.win));
                    negative.setTextSize(18);
                    negative.setText(msg);
                }
                else
                {
                    String msg="Negative: NO!";

                    negative.setBackgroundColor(getResources().getColor(R.color.fail));
                    negative.setTextSize(15);
                    negative.setText(msg);
                }
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());
                String msg="Square: "+(number*number);

                square.setBackgroundColor(getResources().getColor(R.color.win));
                square.setTextSize(18);
                square.setText(msg);

            }
        });

        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());
                String msg="Cube: "+(number*number*number);

                cube.setBackgroundColor(getResources().getColor(R.color.win));
                cube.setTextSize(18);
                cube.setText(msg);
            }
        });

        kaprekar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(num.getText());
                int number = Integer.parseInt(num.getText().toString());

                int square = number * number; // can use long for bigger numbers
                String squaredStr = Integer.toString(square);
                String left = "0";
                String right = "0";
                for(int i = 0; i < squaredStr.length() / 2; i++)
                {
                    left = left + squaredStr.charAt(i); //storing the first half of string
                }
                for(int i = squaredStr.length() / 2; i < squaredStr.length(); i++)
                {
                    right = right + squaredStr.charAt(i); //storing second half of string
                }
                int n1 = Integer.parseInt(left);
                int n2 = Integer.parseInt(right);
                if(n1 + n2 == number)
                {
                    String msg="Kaprekar: YES!";

                    kaprekar.setBackgroundColor(getResources().getColor(R.color.win));
                    kaprekar.setTextSize(18);
                    kaprekar.setText(msg);
                }
                else
                {
                    String msg="Kaprekar: NO!";

                    kaprekar.setBackgroundColor(getResources().getColor(R.color.fail));
                    kaprekar.setTextSize(15);
                    kaprekar.setText(msg);
                }
            }
        });
    }
}