// Generated by view binder compiler. Do not edit!
package com.example.trackly.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.trackly.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecentTransactionBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView ivCategoryIcon;

  @NonNull
  public final TextView tvAmount;

  @NonNull
  public final TextView tvCategory;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvTitle;

  private ItemRecentTransactionBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView ivCategoryIcon, @NonNull TextView tvAmount, @NonNull TextView tvCategory,
      @NonNull TextView tvDate, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.ivCategoryIcon = ivCategoryIcon;
    this.tvAmount = tvAmount;
    this.tvCategory = tvCategory;
    this.tvDate = tvDate;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecentTransactionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecentTransactionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_recent_transaction, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecentTransactionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_category_icon;
      ImageView ivCategoryIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivCategoryIcon == null) {
        break missingId;
      }

      id = R.id.tv_amount;
      TextView tvAmount = ViewBindings.findChildViewById(rootView, id);
      if (tvAmount == null) {
        break missingId;
      }

      id = R.id.tv_category;
      TextView tvCategory = ViewBindings.findChildViewById(rootView, id);
      if (tvCategory == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ItemRecentTransactionBinding((MaterialCardView) rootView, ivCategoryIcon, tvAmount,
          tvCategory, tvDate, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
