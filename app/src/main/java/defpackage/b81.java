package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b81 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ lj0 g;

    public /* synthetic */ b81(lj0 lj0Var, int i) {
        this.f = i;
        this.g = lj0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int iA;
        int i = this.f;
        Collection collection = this.g;
        switch (i) {
            case 0:
                iA = ((t) collection).a();
                break;
            default:
                iA = ((t) collection).a();
                break;
        }
        return Integer.valueOf(iA);
    }
}
