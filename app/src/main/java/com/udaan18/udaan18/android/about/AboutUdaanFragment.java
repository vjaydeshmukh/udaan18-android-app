package com.udaan18.udaan18.android.about;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udaan18.udaan18.android.R;
import com.udaan18.udaan18.android.databinding.FragmentAboutUdaanBinding;

/**
 * Creator: Varun Barad
 * Date: 26-02-2018
 * Project: udaan18-android-app
 */
public class AboutUdaanFragment extends Fragment {
  private FragmentAboutUdaanBinding dataBinding;
  
  public static AboutUdaanFragment newInstance() {
    AboutUdaanFragment fragment = new AboutUdaanFragment();
    return fragment;
  }
  
  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    this.dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about_udaan, container, false);
    return this.dataBinding.getRoot();
  }
}