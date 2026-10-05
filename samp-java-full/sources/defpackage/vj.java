package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vj implements nv2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new a0(1, (Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new lg1(this);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return (Iterator) obj;
            default:
                return new kg1((String) obj);
        }
    }
}
