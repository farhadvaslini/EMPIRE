package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cc1 implements dn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn1 b;
    public final /* synthetic */ hc1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dn1 e;

    public /* synthetic */ cc1(dn1 dn1Var, hc1 hc1Var, int i, dn1 dn1Var2, int i2) {
        this.a = i2;
        this.c = hc1Var;
        this.d = i;
        this.e = dn1Var2;
        this.b = dn1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    @Override // defpackage.dn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2 = this.a;
        dn1 dn1Var = this.e;
        int i3 = this.d;
        hc1 hc1Var = this.c;
        switch (i2) {
            case 0:
                hc1Var.j = i3;
                dn1Var.a();
                qs1 qs1Var = hc1Var.r;
                is1 is1Var = hc1Var.q;
                long[] jArr = is1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = is1Var.b[i8];
                                    qa3 qa3Var = (qa3) is1Var.c[i8];
                                    int i9 = qs1Var.i(obj);
                                    if (i9 < 0 || i9 >= hc1Var.j) {
                                        if (i9 >= 0) {
                                            Object obj2 = n92.m0;
                                            i = i5;
                                            Object[] objArr = qs1Var.f;
                                            Object obj3 = objArr[i9];
                                            objArr[i9] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (hc1Var.o.b(obj)) {
                                            qa3Var.a();
                                        }
                                        is1Var.l(i8);
                                    } else {
                                        i = i5;
                                    }
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 == i5) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                hc1Var.e(hc1Var.i);
                break;
            default:
                hc1Var.i = i3;
                dn1Var.a();
                if (hc1Var.f.n == null) {
                    hc1Var.e(hc1Var.i);
                }
                break;
        }
    }

    @Override // defpackage.dn1
    public final rs0 b() {
        switch (this.a) {
        }
        return this.b.b();
    }

    @Override // defpackage.dn1
    public final Map c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.dn1
    public final int d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    @Override // defpackage.dn1
    public final ns0 e() {
        switch (this.a) {
        }
        return this.b.e();
    }

    @Override // defpackage.dn1
    public final ns0 f() {
        switch (this.a) {
        }
        return this.b.f();
    }

    @Override // defpackage.dn1
    public final int g() {
        switch (this.a) {
        }
        return this.b.g();
    }
}
