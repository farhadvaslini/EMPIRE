package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cg extends CheckedTextView {
    public final dg f;
    public final yf g;
    public final ci h;
    public bh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, 2130903121);
        gi3.a(context);
        ph3.a(this, getContext());
        ci ciVar = new ci(this);
        this.h = ciVar;
        ciVar.f(attributeSet, 2130903121);
        ciVar.b();
        yf yfVar = new yf(this);
        this.g = yfVar;
        yfVar.d(attributeSet, 2130903121);
        this.f = new dg(this);
        Context context2 = getContext();
        int[] iArr = pf2.l;
        pi piVarH = pi.H(context2, attributeSet, iArr, 2130903121);
        TypedArray typedArray = (TypedArray) piVarH.g;
        mq3.h(this, getContext(), iArr, attributeSet, (TypedArray) piVarH.g, 2130903121);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(rn.C(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(rn.C(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(rn.C(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(piVarH.l(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(wf0.b(typedArray.getInt(3, -1), null));
            }
            piVarH.J();
            getEmojiTextViewHelper().a(attributeSet, 2130903121);
        } catch (Throwable th) {
            piVarH.J();
            throw th;
        }
    }

    private bh getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new bh(this);
        }
        return this.i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ci ciVar = this.h;
        if (ciVar != null) {
            ciVar.b();
        }
        yf yfVar = this.g;
        if (yfVar != null) {
            yfVar.a();
        }
        dg dgVar = this.f;
        if (dgVar != null) {
            dgVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof lh3 ? ((lh3) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    public ColorStateList getSupportCheckMarkTintList() {
        dg dgVar = this.f;
        if (dgVar != null) {
            return dgVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w7.X(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        dg dgVar = this.f;
        if (dgVar != null) {
            if (dgVar.e) {
                dgVar.e = false;
            } else {
                dgVar.e = true;
                dgVar.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y02.T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        dg dgVar = this.f;
        if (dgVar != null) {
            dgVar.a = colorStateList;
            dgVar.c = true;
            dgVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        dg dgVar = this.f;
        if (dgVar != null) {
            dgVar.b = mode;
            dgVar.d = true;
            dgVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ci ciVar = this.h;
        if (ciVar != null) {
            ciVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(rn.C(getContext(), i));
    }
}
