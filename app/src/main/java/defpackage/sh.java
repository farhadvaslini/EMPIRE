package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sh extends wi1 implements uh {
    public CharSequence G;
    public ph H;
    public final Rect I;
    public int J;
    public final /* synthetic */ vh K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(vh vhVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.K = vhVar;
        this.I = new Rect();
        this.t = vhVar;
        this.C = true;
        this.D.setFocusable(true);
        this.u = new qh(this);
    }

    @Override // defpackage.uh
    public final void e(CharSequence charSequence) {
        this.G = charSequence;
    }

    @Override // defpackage.uh
    public final void k(int i) {
        this.J = i;
    }

    @Override // defpackage.uh
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        fh fhVar = this.D;
        boolean zIsShowing = fhVar.isShowing();
        s();
        fhVar.setInputMethodMode(2);
        c();
        cg0 cg0Var = this.h;
        cg0Var.setChoiceMode(1);
        cg0Var.setTextDirection(i);
        cg0Var.setTextAlignment(i2);
        vh vhVar = this.K;
        int selectedItemPosition = vhVar.getSelectedItemPosition();
        cg0 cg0Var2 = this.h;
        if (fhVar.isShowing() && cg0Var2 != null) {
            cg0Var2.setListSelectionHidden(false);
            cg0Var2.setSelection(selectedItemPosition);
            if (cg0Var2.getChoiceMode() != 0) {
                cg0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = vhVar.getViewTreeObserver()) == null) {
            return;
        }
        mh mhVar = new mh(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(mhVar);
        fhVar.setOnDismissListener(new rh(this, mhVar));
    }

    @Override // defpackage.uh
    public final CharSequence o() {
        return this.G;
    }

    @Override // defpackage.wi1, defpackage.uh
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.H = (ph) listAdapter;
    }

    public final void s() {
        int i;
        fh fhVar = this.D;
        Drawable background = fhVar.getBackground();
        vh vhVar = this.K;
        Rect rect = vhVar.m;
        if (background != null) {
            background.getPadding(rect);
            boolean z = kr3.a;
            i = vhVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = vhVar.getPaddingLeft();
        int paddingRight = vhVar.getPaddingRight();
        int width = vhVar.getWidth();
        int i2 = vhVar.l;
        if (i2 == -2) {
            int iA = vhVar.a(this.H, fhVar.getBackground());
            int i3 = (vhVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = kr3.a;
        this.k = vhVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.J) + i : paddingLeft + this.J + i;
    }
}
