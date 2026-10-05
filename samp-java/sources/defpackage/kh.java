package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kh extends a31 {
    public final jh j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public kh(jh jhVar) {
        super(1, jhVar);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = jhVar;
    }

    public final void F() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.k = drawableMutate;
                if (this.n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.o) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(this.j.getDrawableState());
                }
            }
        }
    }

    public final void G(Canvas canvas) {
        if (this.k != null) {
            int max = this.j.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k.getIntrinsicWidth();
                int intrinsicHeight = this.k.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.a31
    public final void x(AttributeSet attributeSet, int i) {
        super.x(attributeSet, 2130903289);
        jh jhVar = this.j;
        Context context = jhVar.getContext();
        int[] iArr = pf2.g;
        pi piVarH = pi.H(context, attributeSet, iArr, 2130903289);
        TypedArray typedArray = (TypedArray) piVarH.g;
        mq3.h(jhVar, jhVar.getContext(), iArr, attributeSet, (TypedArray) piVarH.g, 2130903289);
        Drawable drawableQ = piVarH.q(0);
        if (drawableQ != null) {
            jhVar.setThumb(drawableQ);
        }
        Drawable drawableP = piVarH.p(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = drawableP;
        if (drawableP != null) {
            drawableP.setCallback(jhVar);
            drawableP.setLayoutDirection(jhVar.getLayoutDirection());
            if (drawableP.isStateful()) {
                drawableP.setState(jhVar.getDrawableState());
            }
            F();
        }
        jhVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = wf0.b(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = piVarH.l(2);
            this.n = true;
        }
        piVarH.J();
        F();
    }
}
