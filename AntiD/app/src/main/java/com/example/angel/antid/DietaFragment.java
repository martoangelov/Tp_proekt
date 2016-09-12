package com.example.angel.antid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class DietaFragment extends Fragment {

    WebView web;
    User user = new User();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dieta, container, false);

        web = (WebView) view.findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        user.load(getActivity());

       if(user.getGender().equals("Male")) {
            web.loadUrl("http://gotvach.bg/n6-41357-%D0%95%D1%84%D0%B8%D0%BA%D0%B0%D1%81%D0%BD%D0%B0_%D0%B4%D0%B8%D0%B5%D1%82%D0%B0_%D0%B7%D0%B0_%D0%BC%D1%8A%D0%B6%D0%B5");
        } else {
            web.loadUrl("http://4fitness.bg/%D0%B4%D0%B8%D0%B5%D1%82%D0%B8-%D0%B7%D0%B0-%D0%B4%D0%B0%D0%BC%D0%B8%D1%82%D0%B5/%D1%85%D1%80%D0%B0%D0%BD%D0%B" +
                    "8%D1%82%D0%B5%D0%BB%D0%B5%D0%BD-%D1%80%D0%B5%D0%B6%D0%B8%D0%BC-%D0%B7%D0%B0-%D0%B6%D0%B5%D0%BD%D0%B8-%D1%86%D0%B5%D0%BB%D1%8F%D1%89%D0" +
                    "%B8-%D1%82%D0%BE%D0%BD%D0%B8%D0%B7%D0%B8%D1%80%D0%B0%D0%BD%D0%B5-%D1%81%D1%82%D1%8F%D0%B3%D0%B0%D0%BD%D0%B5-%D0%B8-%D0%BE%D1%82%D1%81%D" +
                    "0%BB%D0%B0%D0%B1%D0%B2%D0%B0%D0%BD%D0%B5/");
        }

        return view;
    }

}
