// Generated by view binder compiler. Do not edit!
package com.manual.mediation.library.sotadlib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.manual.mediation.library.sotadlib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWalkThroughConfigBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ViewPager2 viewPager;

  private ActivityWalkThroughConfigBinding(@NonNull ConstraintLayout rootView,
      @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWalkThroughConfigBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWalkThroughConfigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_walk_through_config, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWalkThroughConfigBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.viewPager;
      ViewPager2 viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityWalkThroughConfigBinding((ConstraintLayout) rootView, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}