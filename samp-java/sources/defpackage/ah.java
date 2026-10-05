package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ah extends EditText implements dz1 {
    public final yf f;
    public final ci g;
    public final a31 h;
    public final mh3 i;
    public final a31 j;
    public zg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903176);
        gi3.a(context);
        ph3.a(this, getContext());
        yf yfVar = new yf(this);
        this.f = yfVar;
        yfVar.d(attributeSet, 2130903176);
        ci ciVar = new ci(this);
        this.g = ciVar;
        ciVar.f(attributeSet, 2130903176);
        ciVar.b();
        a31 a31Var = new a31(6, false);
        a31Var.g = this;
        this.h = a31Var;
        this.i = new mh3();
        a31 a31Var2 = new a31(this, 5);
        this.j = a31Var2;
        a31Var2.x(attributeSet, 2130903176);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerU = a31Var2.u(keyListener);
        if (keyListenerU == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerU);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private zg getSuperCaller() {
        if (this.k == null) {
            this.k = new zg(this);
        }
        return this.k;
    }

    @Override // defpackage.dz1
    public final c40 a(c40 c40Var) {
        this.i.getClass();
        return mh3.a(this, c40Var);
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof lh3 ? ((lh3) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a31 a31Var;
        if (Build.VERSION.SDK_INT >= 28 || (a31Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a31Var.h;
        return textClassifier == null ? wh.a((TextView) a31Var.g) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            ur.P(editorInfo, getText());
        }
        w7.X(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrE = mq3.e(this)) != null) {
            editorInfo.contentMimeTypes = strArrE;
            inputConnectionOnCreateInputConnection = new z21(inputConnectionOnCreateInputConnection, new b4(2, this));
        }
        return this.j.A(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && mq3.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = ih.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        z30 yl1Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || mq3.e(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                yl1Var = new yl1(primaryClip, 1);
            } else {
                a40 a40Var = new a40();
                a40Var.g = primaryClip;
                a40Var.h = 1;
                yl1Var = a40Var;
            }
            yl1Var.q(i == 16908322 ? 0 : 1);
            mq3.g(this, yl1Var.build());
        }
        return true;
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
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yf yfVar = this.f;
        if (yfVar != null) {
            yfVar.g(i);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y02.T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.D(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.u(keyListener));
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ci ciVar = this.g;
        if (ciVar != null) {
            ciVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a31 a31Var;
        if (Build.VERSION.SDK_INT >= 28 || (a31Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a31Var.h = textClassifier;
        }
    }
}
