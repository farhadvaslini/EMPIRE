package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class uu1 extends mb3 implements rs0 {
    public final /* synthetic */ gk3 j;
    public final /* synthetic */ nu1 k;
    public final /* synthetic */ qt1 l;
    public final /* synthetic */ vr1 m;
    public final /* synthetic */ e93 n;
    public final /* synthetic */ h10 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu1(gk3 gk3Var, nu1 nu1Var, qt1 qt1Var, vr1 vr1Var, e93 e93Var, h10 h10Var, p40 p40Var) {
        super(2, p40Var);
        this.j = gk3Var;
        this.k = nu1Var;
        this.l = qt1Var;
        this.m = vr1Var;
        this.n = e93Var;
        this.o = h10Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        uu1 uu1Var = (uu1) m((p40) obj2, (x50) obj);
        dm3 dm3Var = dm3.a;
        uu1Var.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new uu1(this.j, this.k, this.l, this.m, this.n, this.o, p40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        y02.Q(obj);
        gk3 gk3Var = this.j;
        Object objH = gk3Var.a.h();
        d42 d42Var = gk3Var.d;
        if (s51.n(objH, d42Var.getValue()) && (((qt1) this.k.b.f.h()) == null || s51.n(d42Var.getValue(), this.l))) {
            Iterator it = ((List) this.n.getValue()).iterator();
            while (it.hasNext()) {
                this.o.b().c((qt1) it.next());
            }
            vr1 vr1Var = this.m;
            long[] jArr = vr1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = vr1Var.b[i4];
                                float f = vr1Var.c[i4];
                                if (!s51.n((String) obj2, ((qt1) d42Var.getValue()).k)) {
                                    vr1Var.e--;
                                    long[] jArr2 = vr1Var.a;
                                    int i5 = vr1Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    vr1Var.b[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return dm3.a;
    }
}
