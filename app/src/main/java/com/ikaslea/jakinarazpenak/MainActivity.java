package com.ikaslea.jakinarazpenak;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnDefecto;
    Toast toast1;
    Button btnGravity;
    Toast toast2;
    Button btnLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDefecto = findViewById(R.id.button);
        btnGravity = findViewById(R.id.button2);
        btnLayout = findViewById(R.id.button3);

        btnDefecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

        btnGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                 toast2 =
                        Toast.makeText(getApplicationContext(),
                                "Toast con gravity", Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.CENTER|Gravity.START,0,0);
                toast2.show();
            }
        });

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast toast3 = new Toast(getApplicationContext());
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout,
                        (ViewGroup) findViewById(R.id.lytLayout));
                TextView txtMsg = (TextView)layout.findViewById(R.id.txtMensaje);
                txtMsg.setText("Toast Personalizado");
                toast3.setDuration(Toast.LENGTH_SHORT);
                toast3.setView(layout);
                toast3.show();
            }
        });
    }
}