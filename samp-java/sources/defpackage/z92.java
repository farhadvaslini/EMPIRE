package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z92 implements Comparator {
    public final /* synthetic */ w92 a;
    public final /* synthetic */ s12 b;

    public z92(w92 w92Var, s12 s12Var) {
        this.a = w92Var;
        this.b = s12Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        s12 s12Var = this.b;
        return ur.t((Comparable) s12Var.h(obj), (Comparable) s12Var.h(obj2));
    }
}
