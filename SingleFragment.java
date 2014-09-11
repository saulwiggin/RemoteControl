package com.example.icarus.criminalintent;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by Icarus on 9/9/2014.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(Bundle savedInstanceState);
        mCrime = new Crime();

    @Override
    public View onCreateView(LayoutInflater, inflater, ViewGroup parent,
            Bundle savedInstanceState){
            view v = inflater.inflate(R.layout.fragment_crime, parent, false);

            mTitleField = (EditText)v.findViewById(R.id.crime_title);
            mTitleField.addTextChangedListener(new TextWatcher() {
                public void onTextChanged(
                        charSequence c, int start, int before, int count) {
                            mCrime.setTitle(c.toString());
                                               }

                public void beforeTextChanged(
                        CharSequence c, int start, int count, int after) {
                            // This space is intentionallt left black}
                                               }

                public void afterTextChanged(Editable c) {
                    // This one too
                    }
                    });
            mDateButton = (Button)v.findViewById(R.id.crime_date);
            mDateButton.setText(mCrime.getDate().toString());
            mDateButton.setEnabled(false);

            mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
            mSolvedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    //Set the crime's solved property
                    m.Crime.setSolved(isChecked);
                }
            });
            return v;
        }

}
