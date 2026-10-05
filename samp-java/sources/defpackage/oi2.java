package defpackage;

import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class oi2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi2(g83 g83Var, boolean z, String str, os1 os1Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.k = g83Var;
        this.m = z;
        this.l = str;
        this.n = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((oi2) m(p40Var, x50Var)).o(dm3Var);
                break;
            case 1:
                ((oi2) m(p40Var, x50Var)).o(dm3Var);
                break;
            default:
                ((oi2) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                return new oi2((lj0) obj4, (i90) obj3, this.m, (vi2) obj2, p40Var, 0);
            case 1:
                return new oi2((lj0) obj4, (i90) obj3, this.m, (vi2) obj2, p40Var, 1);
            default:
                return new oi2((g83) obj4, this.m, (String) obj3, (os1) obj2, p40Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.n;
        Object obj3 = this.l;
        boolean z = this.m;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                if (((mj0) ((lj0) obj4)).get(((i90) obj3).k()) == si2.h && z) {
                    RaksampNativeBridge.INSTANCE.nativeRefreshPlayerList(((vi2) obj2).c);
                }
                break;
            case 1:
                y02.Q(obj);
                RaksampNativeBridge.INSTANCE.nativeSetNearbyScanEnabled(((vi2) obj2).c, ((mj0) ((lj0) obj4)).get(((i90) obj3).k()) == si2.i && z);
                break;
            default:
                y02.Q(obj);
                g83 g83Var = (g83) obj4;
                if ((g83Var instanceof f83) && !z && s51.n(((f83) g83Var).b, y93.G0((String) obj3).toString())) {
                    ((os1) obj2).setValue(Boolean.FALSE);
                }
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi2(lj0 lj0Var, i90 i90Var, boolean z, vi2 vi2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = lj0Var;
        this.l = i90Var;
        this.m = z;
        this.n = vi2Var;
    }
}
