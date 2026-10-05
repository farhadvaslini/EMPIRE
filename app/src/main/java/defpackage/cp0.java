package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cp0 implements ns0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cp0(int i, qk2 qk2Var) {
        this.h = qk2Var;
        this.g = i;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        boolean zX1;
        int i = this.f;
        Object obj2 = this.h;
        int i2 = this.g;
        switch (i) {
            case 0:
                zX1 = ((rp0) obj).x1(i2);
                ((qk2) obj2).f = Boolean.valueOf(zX1);
                break;
            default:
                zX1 = ((List) obj).addAll(i2, (Collection) obj2);
                break;
        }
        return Boolean.valueOf(zX1);
    }

    public /* synthetic */ cp0(int i, Collection collection) {
        this.g = i;
        this.h = collection;
    }
}
