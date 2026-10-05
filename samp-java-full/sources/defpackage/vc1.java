package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ vc1(h9 h9Var, int i) {
        this.a = i;
        this.b = h9Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        h9 h9Var = this.b;
        switch (i) {
        }
        return Integer.valueOf(h9Var.e(((fe1) obj2).g)).compareTo(Integer.valueOf(h9Var.e(((fe1) obj).g)));
    }
}
