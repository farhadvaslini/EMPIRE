package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nf extends SegmentFinder {
    public final /* synthetic */ ar2 a;

    public nf(ar2 ar2Var) {
        this.a = ar2Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.c(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.g(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.h(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.b(i);
    }
}
