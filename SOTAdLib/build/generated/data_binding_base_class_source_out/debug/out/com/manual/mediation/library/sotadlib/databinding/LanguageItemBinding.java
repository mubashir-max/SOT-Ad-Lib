// Generated by view binder compiler. Do not edit!
package com.manual.mediation.library.sotadlib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.manual.mediation.library.sotadlib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LanguageItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivCountryFlagLanguage;

  @NonNull
  public final ImageView ivUnSelected;

  @NonNull
  public final ConstraintLayout selectedBackground;

  @NonNull
  public final TextView tvCountryNameLanguage;

  @NonNull
  public final View viewDivider;

  private LanguageItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView ivCountryFlagLanguage, @NonNull ImageView ivUnSelected,
      @NonNull ConstraintLayout selectedBackground, @NonNull TextView tvCountryNameLanguage,
      @NonNull View viewDivider) {
    this.rootView = rootView;
    this.ivCountryFlagLanguage = ivCountryFlagLanguage;
    this.ivUnSelected = ivUnSelected;
    this.selectedBackground = selectedBackground;
    this.tvCountryNameLanguage = tvCountryNameLanguage;
    this.viewDivider = viewDivider;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LanguageItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LanguageItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.language_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LanguageItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivCountryFlagLanguage;
      ImageView ivCountryFlagLanguage = ViewBindings.findChildViewById(rootView, id);
      if (ivCountryFlagLanguage == null) {
        break missingId;
      }

      id = R.id.ivUnSelected;
      ImageView ivUnSelected = ViewBindings.findChildViewById(rootView, id);
      if (ivUnSelected == null) {
        break missingId;
      }

      ConstraintLayout selectedBackground = (ConstraintLayout) rootView;

      id = R.id.tvCountryNameLanguage;
      TextView tvCountryNameLanguage = ViewBindings.findChildViewById(rootView, id);
      if (tvCountryNameLanguage == null) {
        break missingId;
      }

      id = R.id.viewDivider;
      View viewDivider = ViewBindings.findChildViewById(rootView, id);
      if (viewDivider == null) {
        break missingId;
      }

      return new LanguageItemBinding((ConstraintLayout) rootView, ivCountryFlagLanguage,
          ivUnSelected, selectedBackground, tvCountryNameLanguage, viewDivider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}