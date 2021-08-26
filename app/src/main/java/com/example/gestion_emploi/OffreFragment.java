package com.example.gestion_emploi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class OffreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private EditText txtOfferTitle, txtOfferDescription, txtCompanyName, txtPositiontype, txtPlace;
    private Button btnSave;
    private String offerTitle, offerDescription,  CompanyName, Positiontype, Place;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_offre, container, false);
        txtOfferTitle=view.findViewById(R.id.txtOfferTitle);
        txtOfferDescription=view.findViewById(R.id.txtOfferDescription);
        txtCompanyName=view.findViewById(R.id.txtCompanyName);
        txtPositiontype=view.findViewById(R.id.txtPositiontype);
        txtPlace=view.findViewById(R.id.txtPlace);

        btnSave=view.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                offerTitle=txtOfferTitle.getText().toString().trim();
                CompanyName=txtCompanyName.getText().toString().trim();
                offerDescription=txtOfferDescription.getText().toString().trim();
                Positiontype=txtPositiontype.getText().toString().trim();
                Place=txtPlace.getText().toString().trim();

                //testet si les champs sont vides
                if(offerTitle.isEmpty()|| offerDescription.isEmpty()||CompanyName.isEmpty()|| Positiontype.isEmpty() || Place.isEmpty()){
                    String message=getString(R.string.error_fields);
                    Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
                }
                else{
                    String resume= offerTitle+"\n\n" +offerDescription +"\n\n"  +CompanyName+"\n\n" +Positiontype +"\n\n" +Place +"\n\n";
                    Toast.makeText(getActivity(), resume , Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;

    }

}