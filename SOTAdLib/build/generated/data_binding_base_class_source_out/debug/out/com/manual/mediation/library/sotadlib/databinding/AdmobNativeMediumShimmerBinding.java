// Generated by view binder compiler. Do not edit!
package com.manual.mediation.library.sotadlib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.manual.mediation.library.sotadlib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdmobNativeMediumShimmerBinding implements ViewBinding {
  @NonNull
  private final NativeAdView rootView;

  @NonNull
  public final ImageView adAppIcon;

  @NonNull
  public final TextView adAttribute;

  @NonNull
  public final TextView adBody;

  @NonNull
  public final Button adCallToAction;

  @NonNull
  public final TextView adHeadline;

  @NonNull
  public final CardView adIconCard;

  @NonNull
  public final Guideline glNativeAdmobSmall1;

  @NonNull
  public final Guideline glNativeAdmobSmall2;

  @NonNull
  public final Guideline glNativeAdmobSmall3;

  @NonNull
  public final NativeAdView nativead;

  private AdmobNativeMediumShimmerBinding(@NonNull NativeAdView rootView,
      @NonNull ImageView adAppIcon, @NonNull TextView adAttribute, @NonNull TextView adBody,
      @NonNull Button adCallToAction, @NonNull TextView adHeadline, @NonNull CardView adIconCard,
      @NonNull Guideline glNativeAdmobSmall1, @NonNull Guideline glNativeAdmobSmall2,
      @NonNull Guideline glNativeAdmobSmall3, @NonNull NativeAdView nativead) {
    this.rootView = rootView;
    this.adAppIcon = adAppIcon;
    this.adAttribute = adAttribute;
    this.adBody = adBody;
    this.adCallToAction = adCallToAction;
    this.adHeadline = adHeadline;
    this.adIconCard = adIconCard;
    this.glNativeAdmobSmall1 = glNativeAdmobSmall1;
    this.glNativeAdmobSmall2 = glNativeAdmobSmall2;
    this.glNativeAdmobSmall3 = glNativeAdmobSmall3;
    this.nativead = nativead;
  }

  @Override
  @NonNull
  public NativeAdView getRoot() {
    return rootView;
  }

  @NonNull
  public static AdmobNativeMediumShimmerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdmobNativeMediumShimmerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.admob_native_medium_shimmer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdmobNativeMediumShimmerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adAppIcon;
      ImageView adAppIcon = ViewBindings.findChildViewById(rootView, id);
      if (adAppIcon == null) {
        break missingId;
      }

      id = R.id.ad_attribute;
      TextView adAttribute = ViewBindings.findChildViewById(rootView, id);
      if (adAttribute == null) {
        break missingId;
      }

      id = R.id.adBody;
      TextView adBody = ViewBindings.findChildViewById(rootView, id);
      if (adBody == null) {
        break missingId;
      }

      id = R.id.adCallToAction;
      Button adCallToAction = ViewBindings.findChildViewById(rootView, id);
      if (adCallToAction == null) {
        break missingId;
      }

      id = R.id.adHeadline;
      TextView adHeadline = ViewBindings.findChildViewById(rootView, id);
      if (adHeadline == null) {
        break missingId;
      }

      id = R.id.adIconCard;
      CardView adIconCard = ViewBindings.findChildViewById(rootView, id);
      if (adIconCard == null) {
        break missingId;
      }

      id = R.id.glNativeAdmobSmall1;
      Guideline glNativeAdmobSmall1 = ViewBindings.findChildViewById(rootView, id);
      if (glNativeAdmobSmall1 == null) {
        break missingId;
      }

      id = R.id.glNativeAdmobSmall2;
      Guideline glNativeAdmobSmall2 = ViewBindings.findChildViewById(rootView, id);
      if (glNativeAdmobSmall2 == null) {
        break missingId;
      }

      id = R.id.glNativeAdmobSmall3;
      Guideline glNativeAdmobSmall3 = ViewBindings.findChildViewById(rootView, id);
      if (glNativeAdmobSmall3 == null) {
        break missingId;
      }

      NativeAdView nativead = (NativeAdView) rootView;

      return new AdmobNativeMediumShimmerBinding((NativeAdView) rootView, adAppIcon, adAttribute,
          adBody, adCallToAction, adHeadline, adIconCard, glNativeAdmobSmall1, glNativeAdmobSmall2,
          glNativeAdmobSmall3, nativead);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}