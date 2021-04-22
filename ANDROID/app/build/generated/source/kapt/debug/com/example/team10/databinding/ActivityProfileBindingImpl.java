package com.example.team10.databinding;
import com.example.team10.R;
import com.example.team10.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileBindingImpl extends ActivityProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_skip, 5);
        sViewsWithIds.put(R.id.fl_avatar, 6);
        sViewsWithIds.put(R.id.btn_edit_profile, 7);
        sViewsWithIds.put(R.id.tv_title_full_name, 8);
        sViewsWithIds.put(R.id.cv_full_name, 9);
        sViewsWithIds.put(R.id.tv_title_email, 10);
        sViewsWithIds.put(R.id.cv_email, 11);
        sViewsWithIds.put(R.id.tv_title_phone_number, 12);
        sViewsWithIds.put(R.id.cv_phone_number, 13);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageButton) bindings[5]
            , (com.google.android.material.card.MaterialCardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (com.google.android.material.card.MaterialCardView) bindings[13]
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmail.setTag(null);
        this.tvFullName.setTag(null);
        this.tvPhoneNumber.setTag(null);
        this.tvUserName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.profileViewModel == variableId) {
            setProfileViewModel((com.example.team10.activity.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileViewModel(@Nullable com.example.team10.activity.profile.ProfileViewModel ProfileViewModel) {
        this.mProfileViewModel = ProfileViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.profileViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProfileViewModelUser((androidx.lifecycle.MutableLiveData<com.example.team10.User>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProfileViewModelUser(androidx.lifecycle.MutableLiveData<com.example.team10.User> ProfileViewModelUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String profileViewModelUserFullName = null;
        androidx.lifecycle.MutableLiveData<com.example.team10.User> profileViewModelUser = null;
        java.lang.String profileViewModelUserEmail = null;
        com.example.team10.User profileViewModelUserGetValue = null;
        com.example.team10.activity.profile.ProfileViewModel profileViewModel = mProfileViewModel;
        java.lang.String profileViewModelUserPhoneNumber = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (profileViewModel != null) {
                    // read profileViewModel.user
                    profileViewModelUser = profileViewModel.getUser();
                }
                updateLiveDataRegistration(0, profileViewModelUser);


                if (profileViewModelUser != null) {
                    // read profileViewModel.user.getValue()
                    profileViewModelUserGetValue = profileViewModelUser.getValue();
                }


                if (profileViewModelUserGetValue != null) {
                    // read profileViewModel.user.getValue().fullName
                    profileViewModelUserFullName = profileViewModelUserGetValue.getFullName();
                    // read profileViewModel.user.getValue().email
                    profileViewModelUserEmail = profileViewModelUserGetValue.getEmail();
                    // read profileViewModel.user.getValue().phoneNumber
                    profileViewModelUserPhoneNumber = profileViewModelUserGetValue.getPhoneNumber();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, profileViewModelUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFullName, profileViewModelUserFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhoneNumber, profileViewModelUserPhoneNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, profileViewModelUserFullName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileViewModel.user
        flag 1 (0x2L): profileViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}