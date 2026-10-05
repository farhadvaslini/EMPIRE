package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qc2 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ rc2 f;

    public qc2(rc2 rc2Var, List list) {
        this.f = rc2Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            p21.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
