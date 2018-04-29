package br.com.curymorais.desafiosantander.controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v4.content.res.ResourcesCompat;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;

import br.com.curymorais.desafiosantander.R;

public class FormResponseActivity extends RootActivity {
    private static final String TAG = "FORMRESPONSE_ACTIVITY";
    Typeface typeFont ;
    TextView mensagem ;
    TextView name ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        typeFont = ResourcesCompat.getFont(getApplicationContext(), R.font.dinpromedium);
        setContentView(R.layout.form_reponse_view);
        buildView();

    }

    @SuppressLint("ResourceType")
    public void buildView() {
        ConstraintLayout layout = findViewById(R.id.layout_response);
        ConstraintSet set = new ConstraintSet();
        Intent intent = getIntent();
        set.clone(layout);

        //name box
        name = new TextView(this);
        name.setId(100);
        name.setText(intent.getStringExtra("fieldNome completo"));
        name.setTextSize(20);
        name.setTypeface(typeFont);
        layout.addView(name);
        set.connect(name.getId(), ConstraintSet.LEFT,ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 0);
        set.connect(name.getId(), ConstraintSet.RIGHT,ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 0);
        set.connect(name.getId(), ConstraintSet.TOP,ConstraintSet.PARENT_ID, ConstraintSet.TOP, 600);
        set.constrainHeight(name.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainWidth(name.getId(), ConstraintSet.WRAP_CONTENT);
        set.applyTo(layout);

        //menssage box
        mensagem = new TextView(this);
        mensagem.setText("Mensagem Enviada com sucesso!!");
        mensagem.setTextSize(30);
        mensagem.setTypeface(typeFont);
        mensagem.setGravity(Gravity.CENTER);
        layout.addView(mensagem);
        set.connect(mensagem.getId(), ConstraintSet.LEFT,ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 0);
        set.connect(mensagem.getId(), ConstraintSet.RIGHT,ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 0);
        set.connect(mensagem.getId(), ConstraintSet.TOP,name.getId(), ConstraintSet.BOTTOM, 200);
        set.constrainHeight(mensagem.getId(), ConstraintSet.WRAP_CONTENT);
        set.constrainWidth(mensagem.getId(), ConstraintSet.WRAP_CONTENT);
        set.applyTo(layout);
    }
}
