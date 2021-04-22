package com.example.team10;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.team10.databinding.ActivityOnboardingOneBindingImpl;
import com.example.team10.databinding.ActivityOnboardingThreeBindingImpl;
import com.example.team10.databinding.ActivityOnboardingTwoBindingImpl;
import com.example.team10.databinding.ActivityProfileBindingImpl;
import com.example.team10.databinding.ActivitySignInBindingImpl;
import com.example.team10.databinding.ActivitySignUpBindingImpl;
import com.example.team10.databinding.ActivityWelcomeBindingImpl;
import com.example.team10.databinding.DialogEditInfoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYONBOARDINGONE = 1;

  private static final int LAYOUT_ACTIVITYONBOARDINGTHREE = 2;

  private static final int LAYOUT_ACTIVITYONBOARDINGTWO = 3;

  private static final int LAYOUT_ACTIVITYPROFILE = 4;

  private static final int LAYOUT_ACTIVITYSIGNIN = 5;

  private static final int LAYOUT_ACTIVITYSIGNUP = 6;

  private static final int LAYOUT_ACTIVITYWELCOME = 7;

  private static final int LAYOUT_DIALOGEDITINFO = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.activity_onboarding_one, LAYOUT_ACTIVITYONBOARDINGONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.activity_onboarding_three, LAYOUT_ACTIVITYONBOARDINGTHREE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.activity_onboarding_two, LAYOUT_ACTIVITYONBOARDINGTWO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.activity_sign_in, LAYOUT_ACTIVITYSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.activity_sign_up, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.activity_welcome, LAYOUT_ACTIVITYWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.team10.R.layout.dialog_edit_info, LAYOUT_DIALOGEDITINFO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYONBOARDINGONE: {
          if ("layout/activity_onboarding_one_0".equals(tag)) {
            return new ActivityOnboardingOneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_onboarding_one is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYONBOARDINGTHREE: {
          if ("layout/activity_onboarding_three_0".equals(tag)) {
            return new ActivityOnboardingThreeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_onboarding_three is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYONBOARDINGTWO: {
          if ("layout/activity_onboarding_two_0".equals(tag)) {
            return new ActivityOnboardingTwoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_onboarding_two is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNIN: {
          if ("layout/activity_sign_in_0".equals(tag)) {
            return new ActivitySignInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_in is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_sign_up_0".equals(tag)) {
            return new ActivitySignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWELCOME: {
          if ("layout/activity_welcome_0".equals(tag)) {
            return new ActivityWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_welcome is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGEDITINFO: {
          if ("layout/dialog_edit_info_0".equals(tag)) {
            return new DialogEditInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_edit_info is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "profileViewModel");
      sKeys.put(2, "signInViewModel");
      sKeys.put(3, "signUpViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_onboarding_one_0", com.example.team10.R.layout.activity_onboarding_one);
      sKeys.put("layout/activity_onboarding_three_0", com.example.team10.R.layout.activity_onboarding_three);
      sKeys.put("layout/activity_onboarding_two_0", com.example.team10.R.layout.activity_onboarding_two);
      sKeys.put("layout/activity_profile_0", com.example.team10.R.layout.activity_profile);
      sKeys.put("layout/activity_sign_in_0", com.example.team10.R.layout.activity_sign_in);
      sKeys.put("layout/activity_sign_up_0", com.example.team10.R.layout.activity_sign_up);
      sKeys.put("layout/activity_welcome_0", com.example.team10.R.layout.activity_welcome);
      sKeys.put("layout/dialog_edit_info_0", com.example.team10.R.layout.dialog_edit_info);
    }
  }
}
