package com.example.angel.antid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class NaprednaliFragment extends Fragment {

    User user = new User();
    WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_naprednali, container, false);

        web = (WebView) view.findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        user.load(getActivity());

        if(user.getGender().equals("Male")) {
            web.loadUrl("http://kulturizam.eu/%D1%82%D1%80%D0%B5%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B8/12/03/%D1%82%D1%80%D0%B5%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D1%8A%D1%87%D0%BD%D0%B0-%D1%81%D1%82%D1%80%D0%B0%D1%82%D0%B5%D0%B3%D0%B8%D1%8F-%D0%B7%D0%B0-%D0%BD%D0%B0%D0%BF%D1%80%D0%B5%D0%B4%D0%BD%D0%B0%D0%BB/");
        } else {
            web.loadUrl("http://4fitness.bg/%D1%82%D1%80%D0%B5%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B8-%D0%B7%D0%B0-%D0%B6%D0%B5%D0%BD%D0%B8/%D1%82%D1%80%D0%B5%D0%BD%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-%D0%B7%D0%B0-%D0%B0%D0%BC%D0%B1%D0%B8%D1%86%D0%B8%D0%BE%D0%B7%D0%BD%D0%B8-%D0%B4%D0%B0%D0%BC%D0%B8/");
        }
        return view;
    }

}
