package com.peisocodes.vutapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class contacts extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        final Button contactButton1 = (Button) findViewById(R.id.contact_button1);
        contactButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(contacts.this);
                LayoutInflater inflater =(LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View inflaterView = inflater.inflate(R.layout.dialog_layout,null);

                bottomSheetDialog.setContentView(inflaterView);
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) inflaterView.getParent());
                bottomSheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,25,getResources().getDisplayMetrics()));
                bottomSheetDialog.show();

                TextView txt1 = new TextView(contacts.this);
                TextView txt2 = new TextView(contacts.this);
                LinearLayout layout = new LinearLayout(contacts.this);
                layout.setBackgroundColor(Color.parseColor("#7297C9"));
                layout.setOrientation(LinearLayout.VERTICAL);
                CoordinatorLayout.LayoutParams lparams = new CoordinatorLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );

                txt1.setLayoutParams(lparams);


                txt1.setText("Campuses");
                txt1.setTextSize(30);
                txt1.setGravity(5);
                txt1.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


                txt2.setText("VanderbijlPark  : +27(0)16 950 9000\n" +
                        "Ekhuruleni  : +27(0)11 929 7400\n" +
                        "Secunda : +27(0)17 631 1990\n" +
                        "Upington  : +27(0)54 332 3304");
                txt2.setTextSize(20);
                bottomSheetDialog.setContentView(layout);
                layout.addView(txt1);
                layout.addView(txt2);


            }
        });

        Button contactButton2 = (Button)findViewById(R.id.contact_button2);
        contactButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(contacts.this);
                LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View inflaterView= inflater.inflate(R.layout.dialog_layout,null);
                bottomSheetDialog.setContentView(inflaterView);
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)inflaterView.getParent());
                bottomSheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,50,getResources().getDisplayMetrics()));
                bottomSheetDialog.show();

                TextView txt1 = new TextView(contacts.this);
                TextView txt2 = new TextView(contacts.this);
                LinearLayout layout = new LinearLayout(contacts.this);
                layout.setBackgroundColor(Color.parseColor("#7297C9"));
                layout.setOrientation(LinearLayout.VERTICAL);
                CoordinatorLayout.LayoutParams lparams = new CoordinatorLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );

                txt1.setLayoutParams(lparams);


                txt1.setText("International Students");
                txt1.setTextSize(30);
                txt1.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


                txt2.setText("T : +27(0)16 950 9578\n" +
                        "ALT nr : +27(0)16 950 9946");
                txt2.setTextSize(20);
                bottomSheetDialog.setContentView(layout);
                layout.addView(txt1);
                layout.addView(txt2);

            }
        });

        Button contactButton3 = (Button)findViewById(R.id.contact_button3);
        contactButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(contacts.this);
                LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View inflaterView= inflater.inflate(R.layout.dialog_layout,null);
                bottomSheetDialog.setContentView(inflaterView);
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)inflaterView.getParent());
                bottomSheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,50,getResources().getDisplayMetrics()));
                bottomSheetDialog.show();

                TextView txt1 = new TextView(contacts.this);
                TextView txt2 = new TextView(contacts.this);
                LinearLayout layout = new LinearLayout(contacts.this);
                layout.setBackgroundColor(Color.parseColor("#7297C9"));
                layout.setOrientation(LinearLayout.VERTICAL);
                CoordinatorLayout.LayoutParams lparams = new CoordinatorLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );

                txt1.setLayoutParams(lparams);


                txt1.setText("Human Science");
                txt1.setTextSize(30);
                txt1.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


                txt2.setText("Cleo : +27(0)16 950 6865");
                txt2.setTextSize(20);
                bottomSheetDialog.setContentView(layout);
                layout.addView(txt1);
                layout.addView(txt2);

            }
        });

        Button contactButton4 = (Button)findViewById(R.id.contact_button4);
        contactButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(contacts.this);
                LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View inflaterView= inflater.inflate(R.layout.dialog_layout,null);
                bottomSheetDialog.setContentView(inflaterView);
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)inflaterView.getParent());
                bottomSheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,50,getResources().getDisplayMetrics()));
                bottomSheetDialog.show();

                TextView txt1 = new TextView(contacts.this);
                TextView txt2 = new TextView(contacts.this);
                LinearLayout layout = new LinearLayout(contacts.this);
                layout.setBackgroundColor(Color.parseColor("#7297C9"));
                layout.setOrientation(LinearLayout.VERTICAL);
                CoordinatorLayout.LayoutParams lparams = new CoordinatorLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );

                txt1.setLayoutParams(lparams);


                txt1.setText("Applied and Computer Science");
                txt1.setTextSize(30);
                txt1.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


                txt2.setText("De villiers : +27(0)16 950 9249\n" +
                        "Madaleile : +27(0)16 950 9248");
                txt2.setTextSize(20);
                bottomSheetDialog.setContentView(layout);
                layout.addView(txt1);
                layout.addView(txt2);

            }
        });

        Button contactButton5 = (Button)findViewById(R.id.contact_button5);
        contactButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(contacts.this);
                LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View inflaterView= inflater.inflate(R.layout.dialog_layout,null);
                bottomSheetDialog.setContentView(inflaterView);
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)inflaterView.getParent());
                bottomSheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,50,getResources().getDisplayMetrics()));
                bottomSheetDialog.show();
                TextView txt1 = new TextView(contacts.this);
                TextView txt2 = new TextView(contacts.this);
                LinearLayout layout = new LinearLayout(contacts.this);
                layout.setBackgroundColor(Color.parseColor("#7297C9"));
                layout.setOrientation(LinearLayout.VERTICAL);
                CoordinatorLayout.LayoutParams lparams = new CoordinatorLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );

                txt1.setLayoutParams(lparams);


                txt1.setText("Management Sciences");
                txt1.setTextSize(30);
                txt1.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


                txt2.setText("Management : +27(0)16 950 6890\n" +
                        "Accountancy : +27(0)16 950 9267\n" +
                        "Human Resources: +27(0)16 950 6872\n" +
                        "Logistics : +27(0)16 950 6883");
                txt2.setTextSize(20);
                bottomSheetDialog.setContentView(layout);
                layout.addView(txt1);
                layout.addView(txt2);

            }
        });

        Button contactButton6 = (Button)findViewById(R.id.contact_button6);
        contactButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(contacts.this);
                LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View inflaterView= inflater.inflate(R.layout.dialog_layout,null);
                bottomSheetDialog.setContentView(inflaterView);
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)inflaterView.getParent());
                bottomSheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,50,getResources().getDisplayMetrics()));
                bottomSheetDialog.show();

                TextView txt1 = new TextView(contacts.this);
                TextView txt2 = new TextView(contacts.this);
                LinearLayout layout = new LinearLayout(contacts.this);
                layout.setBackgroundColor(Color.parseColor("#7297C9"));
                layout.setOrientation(LinearLayout.VERTICAL);
                CoordinatorLayout.LayoutParams lparams = new CoordinatorLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT
                );

                txt1.setLayoutParams(lparams);


                txt1.setText("Engineering and Technology");
                txt1.setTextSize(30);
                txt1.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


                txt2.setText("Civil/Mata : +27(0)16 950 9243\n" +
                        "Chem/Industry  : +27(0)16 950 9243\n"+
                        "Electro/Power/Process/Comp Sys: +27(0)16 950 9416"
                );
                txt2.setTextSize(20);
                bottomSheetDialog.setContentView(layout);
                layout.addView(txt1);
                layout.addView(txt2);

            }
        });
    }

}
