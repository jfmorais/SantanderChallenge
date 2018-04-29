package br.com.curymorais.desafiosantander.util;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import br.com.curymorais.desafiosantander.controller.FormActivity;
import br.com.curymorais.desafiosantander.domain.dto.FieldDTO;
import br.com.curymorais.desafiosantander.domain.model.EditTextSantander;

public class ViewBuilder {
    public static EditText getEditTextFromField(FieldDTO f, Context c){
        EditText et = new EditText(c);
        et.setText(f.getMessage());
        et.setId(f.getId());
        et.setWidth(1000);
        return et;
    }

    public static TextView getTextViewFromField(FieldDTO f, Context c){
        TextView t = new TextView(c);
        t.setId(f.getId());
        t.setText(f.getMessage());
        return  t;
    }

    public static Button getButtonViewFromField(FieldDTO f, Context c) {
        Button b = new Button(c);
        b.setId(f.getId());
        b.setText(f.getMessage());
        return b;
    }

    public static CheckBox getCheckBoxFromField(FieldDTO f, Context c) {
        CheckBox ch = new CheckBox(c);
        ch.setText(f.getMessage());
        ch.setId(f.getId());
        return  ch;
    }

    public static EditTextSantander getEditTextSantanderFromField(FieldDTO f, Context c){
        EditTextSantander et = new EditTextSantander(c);
        et.setHint(f.getMessage());
        et.setId(f.getId());
        et.setWidth(1000);
        if (f.isRequired()){
            et.setRequired(true);
        }else {
            et.setRequired(false);
        }
        return et;
    }
}
