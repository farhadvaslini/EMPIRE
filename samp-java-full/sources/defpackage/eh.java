package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eh extends MultiAutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final yf f;
    public final ci g;
    public final a31 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, top.th1nk.samp.R.attr.autoCompleteTextViewStyle);
        gi3.a(context);
        ph3.a(this, getContext());
        pi piVarH = pi.H(getContext(), attributeSet, i, top.th1nk.samp.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) piVarH.g).hasValue(0)) {
            setDropDownBackgroundDrawable(piVarH.p(0));
        }
        piVarH.J();
        yf yfVar = new yf(this);
        this.f = yfVar;
        yfVar.d(attributeSet, top.th1nk.samp.R.attr.autoCompleteTextViewStyle);
        ci ciVar = new ci(this);
        this.g = ciVar;
        ciVar.f(attributeSet, top.th1nk.samp.R.attr.autoCompleteTextViewStyle);
        ciVar.b();
        a31 a31Var = new a31(this, 5);
        this.h = a31Var;
        a31Var.x(attributeSet, top.th1nk.samp.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerU = a31Var.u(keyListener);
        if (keyListenerU == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerU);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.a();
        }
        ci ciVar = this.g;
        if (ciVar != null) {
            ciVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        yf yfVar = this.f;
        if (yfVar != null) {
            return yfVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yf yfVar = this.f;
        if (yfVar != null) {
            return yfVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w7.X(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.h.A(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ci ciVar = this.g;
        if (ciVar != null) {
            ciVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ci ciVar = this.g;
        if (ciVar != null) {
            ciVar.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(rn.C(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.D(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.k(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ci ciVar = this.g;
        ciVar.k(colorStateList);
        ciVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ci ciVar = this.g;
        ciVar.l(mode);
        ciVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        ci ciVar = this.g;
        if (ciVar != null) {
            ciVar.g(context, i2);
        }
    }
}
