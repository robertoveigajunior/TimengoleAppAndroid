package com.example.robertoveigajunior.timengole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.robertoveigajunior.timengole.model.Time;
import com.squareup.picasso.Picasso;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imagem;
    private TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = (ImageView) findViewById(R.id.imagemCarro);
        desc = (TextView)findViewById(R.id.desc);

        if(getIntent() != null) {
            Time time = getIntent().getParcelableExtra("time");
            Picasso.with(this).load(time.getEscudo()).placeholder(R.mipmap.ic_launcher).into(imagem);
            desc.setText(time.getAnoFundacao());
        }
    }
}
