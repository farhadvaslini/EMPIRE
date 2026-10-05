package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zg2 extends mb3 implements ss0 {
    public /* synthetic */ Map j;
    public /* synthetic */ boolean k;

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zg2 zg2Var = new zg2(3, (p40) obj3);
        zg2Var.j = (Map) obj;
        zg2Var.k = zBooleanValue;
        return zg2Var.o(dm3.a);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Map map = this.j;
        boolean z = this.k;
        y02.Q(obj);
        return new r32(map, Boolean.valueOf(z));
    }
}
