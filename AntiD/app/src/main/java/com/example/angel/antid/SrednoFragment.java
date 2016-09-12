package com.example.angel.antid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class SrednoFragment extends Fragment {

    User user = new User();
    WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sredno, container, false);

        web = (WebView) view.findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        user.load(getActivity());

        if(user.getGender().equals("Male")) {
            web.loadUrl("http://www.belchohristov.com/fitnes-programi-za-sredno-naprednali/");
        } else {
            web.loadUrl("http://dietiko.com/611/samo-za-zheni-super-fitnes-za-tanko-tyalo");
        }
        return view;
    }

}
