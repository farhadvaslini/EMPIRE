package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pq3 extends tc {
    public final View G;
    public final gw1 H;
    public fq2 I;
    public ns0 J;
    public ns0 K;
    public ns0 L;

    public pq3(Context context, ns0 ns0Var, lv0 lv0Var, gq2 gq2Var, int i, q12 q12Var) {
        View view = (View) ns0Var.h(context);
        gw1 gw1Var = new gw1();
        super(context, lv0Var, i, gw1Var, view, q12Var);
        this.G = view;
        this.H = gw1Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objD = gq2Var != null ? gq2Var.d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (gq2Var != null) {
            setSavableRegistryEntry(gq2Var.a(strValueOf, new oc(this, 2)));
        }
        u0 u0Var = cl3.a;
        this.J = u0Var;
        this.K = u0Var;
        this.L = u0Var;
    }

    public static void n(pq3 pq3Var) {
        pq3Var.L.h(pq3Var.G);
        pq3Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(fq2 fq2Var) {
        fq2 fq2Var2 = this.I;
        if (fq2Var2 != null) {
            ((pi) fq2Var2).S();
        }
        this.I = fq2Var;
    }

    public final gw1 getDispatcher() {
        return this.H;
    }

    public final ns0 getReleaseBlock() {
        return this.L;
    }

    public final ns0 getResetBlock() {
        return this.K;
    }

    public /* bridge */ /* synthetic */ w getSubCompositionView() {
        return null;
    }

    public final ns0 getUpdateBlock() {
        return this.J;
    }

    public final void setReleaseBlock(ns0 ns0Var) {
        this.L = ns0Var;
        setRelease(new oc(this, 3));
    }

    public final void setResetBlock(ns0 ns0Var) {
        this.K = ns0Var;
        setReset(new oc(this, 4));
    }

    public final void setUpdateBlock(ns0 ns0Var) {
        this.J = ns0Var;
        setUpdate(new oc(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
