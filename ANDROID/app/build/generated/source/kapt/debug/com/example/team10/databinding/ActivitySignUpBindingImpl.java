package com.example.team10.databinding;
import com.example.team10.R;
import com.example.team10.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignUpBindingImpl extends ActivitySignUpBinding implements com.example.team10.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_sign_up, 5);
        sViewsWithIds.put(R.id.tv_full_name, 6);
        sViewsWithIds.put(R.id.tv_email, 7);
        sViewsWithIds.put(R.id.tv_password, 8);
        sViewsWithIds.put(R.id.til_full_name, 9);
        sViewsWithIds.put(R.id.til_email, 10);
        sViewsWithIds.put(R.id.til_password, 11);
        sViewsWithIds.put(R.id.tv_have_account, 12);
        sViewsWithIds.put(R.id.btn_sign_in, 13);
        sViewsWithIds.put(R.id.tv_sign_up_with, 14);
        sViewsWithIds.put(R.id.view_left_bar, 15);
        sViewsWithIds.put(R.id.view_right_bar, 16);
        sViewsWithIds.put(R.id.btn_facebook, 17);
        sViewsWithIds.put(R.id.btn_google, 18);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpViewModel.user.getValue().email
            //         is signUpViewModel.user.getValue().setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtEmail);
            // localize variables for thread safety
            // signUpViewModel.user.getValue().email
            java.lang.String signUpViewModelUserEmail = null;
            // signUpViewModel.user.getValue() != null
            boolean signUpViewModelUserGetValueJavaLangObjectNull = false;
            // signUpViewModel.user
            androidx.lifecycle.MutableLiveData<com.example.team10.User> signUpViewModelUser = null;
            // signUpViewModel.user != null
            boolean signUpViewModelUserJavaLangObjectNull = false;
            // signUpViewModel
            com.example.team10.activity.signup.SignUpViewModel signUpViewModel = mSignUpViewModel;
            // signUpViewModel.user.getValue()
            com.example.team10.User signUpViewModelUserGetValue = null;
            // signUpViewModel != null
            boolean signUpViewModelJavaLangObjectNull = false;



            signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
            if (signUpViewModelJavaLangObjectNull) {


                signUpViewModelUser = signUpViewModel.getUser();

                signUpViewModelUserJavaLangObjectNull = (signUpViewModelUser) != (null);
                if (signUpViewModelUserJavaLangObjectNull) {


                    signUpViewModelUserGetValue = signUpViewModelUser.getValue();

                    signUpViewModelUserGetValueJavaLangObjectNull = (signUpViewModelUserGetValue) != (null);
                    if (signUpViewModelUserGetValueJavaLangObjectNull) {




                        signUpViewModelUserGetValue.setEmail(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtFullNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpViewModel.user.getValue().fullName
            //         is signUpViewModel.user.getValue().setFullName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtFullName);
            // localize variables for thread safety
            // signUpViewModel.user.getValue() != null
            boolean signUpViewModelUserGetValueJavaLangObjectNull = false;
            // signUpViewModel.user.getValue().fullName
            java.lang.String signUpViewModelUserFullName = null;
            // signUpViewModel.user
            androidx.lifecycle.MutableLiveData<com.example.team10.User> signUpViewModelUser = null;
            // signUpViewModel.user != null
            boolean signUpViewModelUserJavaLangObjectNull = false;
            // signUpViewModel
            com.example.team10.activity.signup.SignUpViewModel signUpViewModel = mSignUpViewModel;
            // signUpViewModel.user.getValue()
            com.example.team10.User signUpViewModelUserGetValue = null;
            // signUpViewModel != null
            boolean signUpViewModelJavaLangObjectNull = false;



            signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
            if (signUpViewModelJavaLangObjectNull) {


                signUpViewModelUser = signUpViewModel.getUser();

                signUpViewModelUserJavaLangObjectNull = (signUpViewModelUser) != (null);
                if (signUpViewModelUserJavaLangObjectNull) {


                    signUpViewModelUserGetValue = signUpViewModelUser.getValue();

                    signUpViewModelUserGetValueJavaLangObjectNull = (signUpViewModelUserGetValue) != (null);
                    if (signUpViewModelUserGetValueJavaLangObjectNull) {




                        signUpViewModelUserGetValue.setFullName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpViewModel.user.getValue().password
            //         is signUpViewModel.user.getValue().setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtPassword);
            // localize variables for thread safety
            // signUpViewModel.user.getValue() != null
            boolean signUpViewModelUserGetValueJavaLangObjectNull = false;
            // signUpViewModel.user
            androidx.lifecycle.MutableLiveData<com.example.team10.User> signUpViewModelUser = null;
            // signUpViewModel.user != null
            boolean signUpViewModelUserJavaLangObjectNull = false;
            // signUpViewModel.user.getValue().password
            java.lang.String signUpViewModelUserPassword = null;
            // signUpViewModel
            com.example.team10.activity.signup.SignUpViewModel signUpViewModel = mSignUpViewModel;
            // signUpViewModel.user.getValue()
            com.example.team10.User signUpViewModelUserGetValue = null;
            // signUpViewModel != null
            boolean signUpViewModelJavaLangObjectNull = false;



            signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
            if (signUpViewModelJavaLangObjectNull) {


                signUpViewModelUser = signUpViewModel.getUser();

                signUpViewModelUserJavaLangObjectNull = (signUpViewModelUser) != (null);
                if (signUpViewModelUserJavaLangObjectNull) {


                    signUpViewModelUserGetValue = signUpViewModelUser.getValue();

                    signUpViewModelUserGetValueJavaLangObjectNull = (signUpViewModelUserGetValue) != (null);
                    if (signUpViewModelUserGetValueJavaLangObjectNull) {




                        signUpViewModelUserGetValue.setPassword(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivitySignUpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivitySignUpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[18]
            , (android.widget.TextView) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[16]
            );
        this.btnSignUp.setTag(null);
        this.edtEmail.setTag(null);
        this.edtFullName.setTag(null);
        this.edtPassword.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.team10.generated.callback.OnClickListener(this, 1);
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
        if (BR.signUpViewModel == variableId) {
            setSignUpViewModel((com.example.team10.activity.signup.SignUpViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSignUpViewModel(@Nullable com.example.team10.activity.signup.SignUpViewModel SignUpViewModel) {
        this.mSignUpViewModel = SignUpViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.signUpViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSignUpViewModelUser((androidx.lifecycle.MutableLiveData<com.example.team10.User>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSignUpViewModelUser(androidx.lifecycle.MutableLiveData<com.example.team10.User> SignUpViewModelUser, int fieldId) {
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
        java.lang.String signUpViewModelUserEmail = null;
        androidx.lifecycle.MutableLiveData<com.example.team10.User> signUpViewModelUser = null;
        com.example.team10.User signUpViewModelUserGetValue = null;
        java.lang.String signUpViewModelUserPassword = null;
        com.example.team10.activity.signup.SignUpViewModel signUpViewModel = mSignUpViewModel;
        java.lang.String signUpViewModelUserFullName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (signUpViewModel != null) {
                    // read signUpViewModel.user
                    signUpViewModelUser = signUpViewModel.getUser();
                }
                updateLiveDataRegistration(0, signUpViewModelUser);


                if (signUpViewModelUser != null) {
                    // read signUpViewModel.user.getValue()
                    signUpViewModelUserGetValue = signUpViewModelUser.getValue();
                }


                if (signUpViewModelUserGetValue != null) {
                    // read signUpViewModel.user.getValue().email
                    signUpViewModelUserEmail = signUpViewModelUserGetValue.getEmail();
                    // read signUpViewModel.user.getValue().password
                    signUpViewModelUserPassword = signUpViewModelUserGetValue.getPassword();
                    // read signUpViewModel.user.getValue().fullName
                    signUpViewModelUserFullName = signUpViewModelUserGetValue.getFullName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnSignUp.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtFullName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtFullNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtEmail, signUpViewModelUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtFullName, signUpViewModelUserFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPassword, signUpViewModelUserPassword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // signUpViewModel
        com.example.team10.activity.signup.SignUpViewModel signUpViewModel = mSignUpViewModel;
        // signUpViewModel != null
        boolean signUpViewModelJavaLangObjectNull = false;



        signUpViewModelJavaLangObjectNull = (signUpViewModel) != (null);
        if (signUpViewModelJavaLangObjectNull) {


            signUpViewModel.signUp();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signUpViewModel.user
        flag 1 (0x2L): signUpViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}