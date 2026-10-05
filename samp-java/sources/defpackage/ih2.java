package defpackage;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ih2 implements e70 {
    public static final ec2 b = new ec2("instances");
    public final e70 a;

    public ih2(Application application) {
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        this.a = jh2.b.a(applicationContext, jh2.a[0]);
    }

    @Override // defpackage.e70
    public Object a(rs0 rs0Var, q40 q40Var) {
        return this.a.a(new cc2(rs0Var, null, 0), q40Var);
    }

    @Override // defpackage.e70
    public fn0 b() {
        return this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r12, int r13, java.lang.String r14, defpackage.xy2 r15, java.lang.String r16, defpackage.q40 r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.eh2
            if (r1 == 0) goto L15
            r1 = r0
            eh2 r1 = (defpackage.eh2) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.k = r2
            goto L1a
        L15:
            eh2 r1 = new eh2
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.i
            int r2 = r1.k
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.y02.Q(r0)
            goto L4a
        L27:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r11)
            r11 = 0
            return r11
        L2e:
            defpackage.y02.Q(r0)
            m9 r4 = new m9
            r10 = 0
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.k = r3
            e70 r11 = r11.a
            java.lang.Object r11 = defpackage.b32.l(r11, r4, r1)
            y50 r12 = defpackage.y50.f
            if (r11 != r12) goto L4a
            return r12
        L4a:
            dm3 r11 = defpackage.dm3.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih2.c(java.lang.String, int, java.lang.String, xy2, java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r5, int r6, defpackage.q40 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.hh2
            if (r0 == 0) goto L13
            r0 = r7
            hh2 r0 = (defpackage.hh2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            hh2 r0 = new hh2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.i
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.y02.Q(r7)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            return r2
        L2c:
            defpackage.y02.Q(r7)
            hf2 r7 = new hf2
            r7.<init>(r5, r6, r2, r3)
            r0.k = r3
            e70 r4 = r4.a
            java.lang.Object r4 = defpackage.b32.l(r4, r7, r0)
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L41
            return r5
        L41:
            dm3 r4 = defpackage.dm3.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih2.d(java.lang.String, int, q40):java.lang.Object");
    }

    public ih2(e70 e70Var) {
        this.a = e70Var;
    }
}
