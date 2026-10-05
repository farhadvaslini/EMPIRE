package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d6 {
    public final rf a;
    public final cs0 b;
    public final it1 c;
    public final ns0 d;
    public final d42 g;
    public final z32 k;
    public final d42 l;
    public final d42 m;
    public final a6 n;
    public final f51 e = new f51();
    public final a31 f = new a31(this);
    public final cb0 h = b32.j(new v5(this, 0));
    public final cb0 i = b32.j(new v5(this, 1));
    public final z32 j = new z32(Float.NaN);

    public d6(t33 t33Var, rf rfVar, cs0 cs0Var, it1 it1Var, ns0 ns0Var) {
        this.a = rfVar;
        this.b = cs0Var;
        this.c = it1Var;
        this.d = ns0Var;
        this.g = b32.w(t33Var);
        b32.k(new v5(this, 2), m22.u);
        this.k = new z32(0.0f);
        this.l = b32.w(null);
        this.m = b32.w(new fm1(oi0.f));
        this.n = new a6(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ts1 r13, defpackage.b6 r14, defpackage.q40 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.w5
            if (r0 == 0) goto L13
            r0 = r15
            w5 r0 = (defpackage.w5) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            w5 r0 = new w5
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.i
            int r1 = r0.k
            ns0 r2 = r12.d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            z32 r5 = r12.j
            if (r1 == 0) goto L35
            if (r1 != r4) goto L2e
            defpackage.y02.Q(r15)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r0 = move-exception
            r13 = r0
            goto L8b
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r12)
            r12 = 0
            return r12
        L35:
            defpackage.y02.Q(r15)
            f51 r8 = r12.e     // Catch: java.lang.Throwable -> L2b
            x5 r9 = new x5     // Catch: java.lang.Throwable -> L2b
            r15 = 0
            r10 = 0
            r9.<init>(r12, r14, r10, r15)     // Catch: java.lang.Throwable -> L2b
            r0.k = r4     // Catch: java.lang.Throwable -> L2b
            r8.getClass()     // Catch: java.lang.Throwable -> L2b
            e51 r6 = new e51     // Catch: java.lang.Throwable -> L2b
            r11 = 0
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r13 = defpackage.ur.w(r6, r0)     // Catch: java.lang.Throwable -> L2b
            y50 r14 = defpackage.y50.f
            if (r13 != r14) goto L56
            return r14
        L56:
            fm1 r13 = r12.d()
            float r14 = r5.g()
            java.lang.Object r13 = r13.a(r14)
            if (r13 == 0) goto L88
            float r14 = r5.g()
            fm1 r15 = r12.d()
            float r15 = r15.d(r13)
            float r14 = r14 - r15
            float r14 = java.lang.Math.abs(r14)
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 > 0) goto L88
            java.lang.Object r14 = r2.h(r13)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L88
            r12.g(r13)
        L88:
            dm3 r12 = defpackage.dm3.a
            return r12
        L8b:
            fm1 r14 = r12.d()
            float r15 = r5.g()
            java.lang.Object r14 = r14.a(r15)
            if (r14 == 0) goto Lbd
            float r15 = r5.g()
            fm1 r0 = r12.d()
            float r0 = r0.d(r14)
            float r15 = r15 - r0
            float r15 = java.lang.Math.abs(r15)
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 > 0) goto Lbd
            java.lang.Object r15 = r2.h(r14)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lbd
            r12.g(r14)
        Lbd:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.a(ts1, b6, q40):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17, defpackage.ts1 r18, defpackage.ts0 r19, defpackage.q40 r20) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.b(java.lang.Object, ts1, ts0, q40):java.lang.Object");
    }

    public final Object c(float f, float f2, Object obj) {
        fm1 fm1VarD = d();
        float fD = fm1VarD.d(obj);
        float fFloatValue = ((Number) this.b.a()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            rf rfVar = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = fm1VarD.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = fm1VarD.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) rfVar.h(Float.valueOf(Math.abs(fm1VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = fm1VarD.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = fm1VarD.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) rfVar.h(Float.valueOf(Math.abs(fD - fm1VarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final fm1 d() {
        return (fm1) this.m.getValue();
    }

    public final float e(float f) {
        Float fValueOf;
        z32 z32Var = this.j;
        float fG = (Float.isNaN(z32Var.g()) ? 0.0f : z32Var.g()) + f;
        float fC = d().c();
        Collection collectionValues = d().a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return y02.g(fG, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        z32 z32Var = this.j;
        if (!Float.isNaN(z32Var.g())) {
            return z32Var.g();
        }
        c.q("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }

    public final void h(Object obj) {
        this.l.setValue(obj);
    }
}
