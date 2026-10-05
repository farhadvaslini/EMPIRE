package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bp1 {
    public final SparseArray a;
    public jl3 b;

    public bp1(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(jl3 jl3Var, int i, int i2) {
        int iA = jl3Var.a(i);
        SparseArray sparseArray = this.a;
        bp1 bp1Var = sparseArray == null ? null : (bp1) sparseArray.get(iA);
        if (bp1Var == null) {
            bp1Var = new bp1(1);
            sparseArray.put(jl3Var.a(i), bp1Var);
        }
        if (i2 > i) {
            bp1Var.a(jl3Var, i + 1, i2);
        } else {
            bp1Var.b = jl3Var;
        }
    }
}
