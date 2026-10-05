package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tq3 extends View {
    public static final ob0 r = new ob0(3);
    public final mf0 f;
    public final sr g;
    public final rr h;
    public boolean i;
    public Outline j;
    public boolean k;
    public ua0 l;
    public bb1 m;
    public ns0 n;
    public qw0 o;
    public float p;
    public float q;

    public tq3(mf0 mf0Var, sr srVar, rr rrVar) {
        super(mf0Var.getContext());
        this.f = mf0Var;
        this.g = srVar;
        this.h = rrVar;
        setOutlineProvider(r);
        this.k = true;
        this.l = gv3.s;
        this.m = bb1.f;
        sw0.a.getClass();
        this.n = hd.v;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n6 n6Var;
        ua0 ua0VarO;
        bb1 bb1VarW;
        pr prVarK;
        long jA;
        qw0 qw0Var;
        float f = this.p;
        rr rrVar = this.h;
        sr srVar = this.g;
        if (f > 0.0f || this.q > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.p, this.q);
            n6Var = srVar.a;
            Canvas canvas2 = n6Var.a;
            n6Var.a = canvas;
            ua0 ua0Var = this.l;
            bb1 bb1Var = this.m;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            qw0 qw0Var2 = this.o;
            ns0 ns0Var = this.n;
            ua0VarO = rrVar.Z().o();
            bb1VarW = rrVar.Z().w();
            prVarK = rrVar.Z().k();
            jA = rrVar.Z().A();
            qw0Var = (qw0) rrVar.Z().h;
            pi piVarZ = rrVar.Z();
            piVarZ.N(ua0Var);
            piVarZ.O(bb1Var);
            piVarZ.M(n6Var);
            piVarZ.Q(jFloatToRawIntBits);
            piVarZ.h = qw0Var2;
            n6Var.l();
            try {
                ns0Var.h(rrVar);
                n6Var.i();
                pi piVarZ2 = rrVar.Z();
                piVarZ2.N(ua0VarO);
                piVarZ2.O(bb1VarW);
                piVarZ2.M(prVarK);
                piVarZ2.Q(jA);
                piVarZ2.h = qw0Var;
                srVar.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } finally {
            }
        } else {
            n6Var = srVar.a;
            Canvas canvas3 = n6Var.a;
            n6Var.a = canvas;
            ua0 ua0Var2 = this.l;
            bb1 bb1Var2 = this.m;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            qw0 qw0Var3 = this.o;
            ns0 ns0Var2 = this.n;
            ua0VarO = rrVar.Z().o();
            bb1VarW = rrVar.Z().w();
            prVarK = rrVar.Z().k();
            jA = rrVar.Z().A();
            qw0Var = (qw0) rrVar.Z().h;
            pi piVarZ3 = rrVar.Z();
            piVarZ3.N(ua0Var2);
            piVarZ3.O(bb1Var2);
            piVarZ3.M(n6Var);
            piVarZ3.Q(jFloatToRawIntBits2);
            piVarZ3.h = qw0Var3;
            n6Var.l();
            try {
                ns0Var2.h(rrVar);
                n6Var.i();
                pi piVarZ4 = rrVar.Z();
                piVarZ4.N(ua0VarO);
                piVarZ4.O(bb1VarW);
                piVarZ4.M(prVarK);
                piVarZ4.Q(jA);
                piVarZ4.h = qw0Var;
                srVar.a.a = canvas3;
            } finally {
            }
        }
        this.i = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.k;
    }

    public final sr getCanvasHolder() {
        return this.g;
    }

    public final View getOwnerView() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.k;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.i) {
            return;
        }
        this.i = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.i = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
