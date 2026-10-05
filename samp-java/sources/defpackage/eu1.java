package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class eu1 implements Comparable {
    public final fu1 f;
    public final Bundle g;
    public final boolean h;
    public final int i;
    public final boolean j;

    public eu1(fu1 fu1Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.f = fu1Var;
        this.g = bundle;
        this.h = z;
        this.i = i;
        this.j = z2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(eu1 eu1Var) {
        eu1Var.getClass();
        boolean z = eu1Var.j;
        boolean z2 = eu1Var.h;
        Bundle bundle = eu1Var.g;
        boolean z3 = this.h;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.i - eu1Var.i;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.g;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.j;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
