// Generated by data binding compiler. Do not edit!
package com.example.team10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.team10.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RestaurantItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView restaurantImage;

  @NonNull
  public final TextView tvaddress;

  @NonNull
  public final TextView tvresName;

  protected RestaurantItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView restaurantImage, TextView tvaddress, TextView tvresName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.restaurantImage = restaurantImage;
    this.tvaddress = tvaddress;
    this.tvresName = tvresName;
  }

  @NonNull
  public static RestaurantItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.restaurant_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RestaurantItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RestaurantItemBinding>inflateInternal(inflater, R.layout.restaurant_item, root, attachToRoot, component);
  }

  @NonNull
  public static RestaurantItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.restaurant_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RestaurantItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RestaurantItemBinding>inflateInternal(inflater, R.layout.restaurant_item, null, false, component);
  }

  public static RestaurantItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RestaurantItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (RestaurantItemBinding)bind(component, view, R.layout.restaurant_item);
  }
}
