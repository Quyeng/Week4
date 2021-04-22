package com.example.team10.databinding;
import com.example.team10.R;
import com.example.team10.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignInBindingImpl extends ActivitySignInBinding implements com.example.team10.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_skip, 4);
        sViewsWithIds.put(R.id.tv_sign_in, 5);
        sViewsWithIds.put(R.id.tv_email, 6);
        sViewsWithIds.put(R.id.tv_password, 7);
        sViewsWithIds.put(R.id.til_email, 8);
        sViewsWithIds.put(R.id.til_password, 9);
        sViewsWithIds.put(R.id.tv_forgot_password, 10);
        sViewsWithIds.put(R.id.tv_no_account, 11);
        sViewsWithIds.put(R.id.btn_sign_up, 12);
        sViewsWithIds.put(R.id.tv_sign_in_with, 13);
        sViewsWithIds.put(R.id.view_left_bar, 14);
        sViewsWithIds.put(R.id.view_right_bar, 15);
        sViewsWithIds.put(R.id.btn_facebook, 16);
        sViewsWithIds.put(R.id.btn_google, 17);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signInViewModel.user.getValue().email
            //         is signInViewModel.user.getValue().setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtEmail);
            // localize variables for thread safety
            // signInViewModel.user.getValue() != null
            boolean signInViewModelUserGetValueJavaLangObjectNull = false;
            // signInViewModel.user != null
            boolean signInViewModelUserJavaLangObjectNull = false;
            // signInViewModel != null
            boolean signInViewModelJavaLangObjectNull = false;
            // signInViewModel.user.getValue().email
            java.lang.String signInViewModelUserEmail = null;
            // signInViewModel
            com.example.team10.activity.signin.SignInViewModel signInViewModel = mSignInViewModel;
            // signInViewModel.user.getValue()
            com.example.team10.User signInViewModelUserGetValue = null;
            // signInViewModel.user
            androidx.lifecycle.MutableLiveData<com.example.team10.User> signInViewModelUser = null;



            signInViewModelJavaLangObjectNull = (signInViewModel) != (null);
            if (signInViewModelJavaLangObjectNull) {


                signInViewModelUser = signInViewModel.getUser();

                signInViewModelUserJavaLangObjectNull = (signInViewModelUser) != (null);
                if (signInViewModelUserJavaLangObjectNull) {


                    signInViewModelUserGetValue = signInViewModelUser.getValue();

                    signInViewModelUserGetValueJavaLangObjectNull = (signInViewModelUserGetValue) != (null);
                    if (signInViewModelUserGetValueJavaLangObjectNull) {




                        signInViewModelUserGetValue.setEmail(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signInViewModel.user.getValue().password
            //         is signInViewModel.user.getValue().setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtPassword);
            // localize variables for thread safety
            // signInViewModel.user.getValue() != null
            boolean signInViewModelUserGetValueJavaLangObjectNull = false;
            // signInViewModel.user != null
            boolean signInViewModelUserJavaLangObjectNull = false;
            // signInViewModel != null
            boolean signInViewModelJavaLangObjectNull = false;
            // signInViewModel
            com.example.team10.activity.signin.SignInViewModel signInViewModel = mSignInViewModel;
            // signInViewModel.user.getValue()
            com.example.team10.User signInViewModelUserGetValue = null;
            // signInViewModel.user
            androidx.lifecycle.MutableLiveData<com.example.team10.User> signInViewModelUser = null;
            // signInViewModel.user.getValue().password
            java.lang.String signInViewModelUserPassword = null;



            signInViewModelJavaLangObjectNull = (signInViewModel) != (null);
            if (signInViewModelJavaLangObjectNull) {


                signInViewModelUser = signInViewModel.getUser();

                signInViewModelUserJavaLangObjectNull = (signInViewModelUser) != (null);
                if (signInViewModelUserJavaLangObjectNull) {


                    signInViewModelUserGetValue = signInViewModelUser.getValue();

                    signInViewModelUserGetValueJavaLangObjectNull = (signInViewModelUserGetValue) != (null);
                    if (signInViewModelUserGetValueJavaLangObjectNull) {




                        signInViewModelUserGetValue.setPassword(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivitySignInBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivitySignInBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageButton) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[15]
            );
        this.btnSignIn.setTag(null);
        this.edtEmail.setTag(null);
        this.edtPassword.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.team10.generated.callback.OnClickListener(this, 1);
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
        if (BR.signInViewModel == variableId) {
            setSignInViewModel((com.example.team10.activity.signin.SignInViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSignInViewModel(@Nullable com.example.team10.activity.signin.SignInViewModel SignInViewModel) {
        this.mSignInViewModel = SignInViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.signInViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSignInViewModelUser((androidx.lifecycle.MutableLiveData<com.example.team10.User>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSignInViewModelUser(androidx.lifecycle.MutableLiveData<com.example.team10.User> SignInViewModelUser, int fieldId) {
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
        java.lang.String signInViewModelUserEmail = null;
        com.example.team10.User signInViewModelUserGetValue = null;
        androidx.lifecycle.MutableLiveData<com.example.team10.User> signInViewModelUser = null;
        java.lang.String signInViewModelUserPassword = null;
        com.example.team10.activity.signin.SignInViewModel signInViewModel = mSignInViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (signInViewModel != null) {
                    // read signInViewModel.user
                    signInViewModelUser = signInViewModel.getUser();
                }
                updateLiveDataRegistration(0, signInViewModelUser);


                if (signInViewModelUser != null) {
                    // read signInViewModel.user.getValue()
                    signInViewModelUserGetValue = signInViewModelUser.getValue();
                }


                if (signInViewModelUserGetValue != null) {
                    // read signInViewModel.user.getValue().email
                    signInViewModelUserEmail = signInViewModelUserGetValue.getEmail();
                    // read signInViewModel.user.getValue().password
                    signInViewModelUserPassword = signInViewModelUserGetValue.getPassword();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnSignIn.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtEmail, signInViewModelUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPassword, signInViewModelUserPassword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // signInViewModel != null
        boolean signInViewModelJavaLangObjectNull = false;
        // signInViewModel
        com.example.team10.activity.signin.SignInViewModel signInViewModel = mSignInViewModel;



        signInViewModelJavaLangObjectNull = (signInViewModel) != (null);
        if (signInViewModelJavaLangObjectNull) {


            signInViewModel.login();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signInViewModel.user
        flag 1 (0x2L): signInViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}