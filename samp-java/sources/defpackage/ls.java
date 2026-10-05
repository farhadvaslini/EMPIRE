package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ls implements dt0 {
    public final o50 f;
    public final int g;
    public final jp h;

    public ls(o50 o50Var, int i, jp jpVar) {
        this.f = o50Var;
        this.g = i;
        this.h = jpVar;
    }

    @Override // defpackage.fn0
    public Object a(gn0 gn0Var, p40 p40Var) {
        Object objW = ur.w(new l(gn0Var, this, null, 8), p40Var);
        return objW == y50.f ? objW : dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.dt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fn0 b(defpackage.o50 r5, int r6, defpackage.jp r7) {
        /*
            r4 = this;
            o50 r0 = r4.f
            o50 r5 = r5.k(r0)
            jp r1 = defpackage.jp.f
            jp r2 = r4.h
            int r3 = r4.g
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.s51.n(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            ls r4 = r4.e(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.b(o50, int, jp):fn0");
    }

    public String c() {
        return null;
    }

    public abstract Object d(kd2 kd2Var, p40 p40Var);

    public abstract ls e(o50 o50Var, int i, jp jpVar);

    public fn0 f() {
        return null;
    }

    public js g(x50 x50Var) {
        int i = this.g;
        if (i == -3) {
            i = -2;
        }
        rs0 jVar = new j(this, null, 8);
        kd2 kd2Var = new kd2(uq.y(x50Var, this.f), lr.a(i, 4, this.h));
        kd2Var.r0(a60.h, kd2Var, jVar);
        return kd2Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        li0 li0Var = li0.f;
        o50 o50Var = this.f;
        if (o50Var != li0Var) {
            arrayList.add("context=" + o50Var);
        }
        int i = this.g;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        jp jpVar = jp.f;
        jp jpVar2 = this.h;
        if (jpVar2 != jpVar) {
            arrayList.add("onBufferOverflow=" + jpVar2);
        }
        return getClass().getSimpleName() + '[' + qx.x0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
