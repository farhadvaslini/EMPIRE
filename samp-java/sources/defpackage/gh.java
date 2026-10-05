package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gh extends RadioButton {
    public final dg f;
    public final yf g;
    public final ci h;
    public bh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903278);
        gi3.a(context);
        ph3.a(this, getContext());
        dg dgVar = new dg(this);
        this.f = dgVar;
        dgVar.c(attributeSet, 2130903278);
        yf yfVar = new yf(this);
        this.g = yfVar;
        yfVar.d(attributeSet, 2130903278);
        ci ciVar = new ci(this);
        this.h = ciVar;
        ciVar.f(attributeSet, 2130903278);
        getEmojiTextViewHelper().a(attributeSet, 2130903278);
    }

    private bh getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new bh(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yf yfVar = this.g;
        if (yfVar != null) {
            yfVar.a();
        }
        ci ciVar = this.h;
        if (ciVar != null) {
            ciVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        yf yfVar = this.g;
        if (yfVar != null) {
            return yfVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yf yfVar = this.g;
        if (yfVar != null) {
            return yfVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        dg dgVar = this.f;
        if (dgVar != null) {
            return dgVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        dg dgVar = this.f;
        if (dgVar != null) {
            return dgVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yf yfVar = this.g;
        if (yfVar != null) {
            yfVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yf yfVar = this.g;
        if (yfVar != null) {
            yfVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        dg dgVar = this.f;
        if (dgVar != null) {
            if (dgVar.e) {
                dgVar.e = false;
            } else {
                dgVar.e = true;
                dgVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ci ciVar = this.h;
        if (ciVar != null) {
            ciVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ci ciVar = this.h;
        if (ciVar != null) {
            ciVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((gq) getEmojiTextViewHelper().b.g).G(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        yf yfVar = this.g;
        if (yfVar != null) {
            yfVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        yf yfVar = this.g;
        if (yfVar != null) {
            yfVar.k(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        dg dgVar = this.f;
        if (dgVar != null) {
            dgVar.a = colorStateList;
            dgVar.c = true;
            dgVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        dg dgVar = this.f;
        if (dgVar != null) {
            dgVar.b = mode;
            dgVar.d = true;
            dgVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ci ciVar = this.h;
        ciVar.k(colorStateList);
        ciVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ci ciVar = this.h;
        ciVar.l(mode);
        ciVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(rn.C(getContext(), i));
    }
}
