package com.example.angel.antid;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    User user = new User();
    private TextView name;
    private Button buttonEdit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        user.load(getActivity());

        SharedPreferences prefs = this.getActivity().getSharedPreferences("PREFS", 0);

        name = (TextView) view.findViewById(R.id.name_text);
        name.setText(prefs.getString("name", user.getName()));

        buttonEdit = (Button) view.findViewById(R.id.buttonEdit);

        buttonEdit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditFragment fragment = new EditFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction =
                        getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }

}
