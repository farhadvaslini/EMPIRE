package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c8 implements a90, View.OnAttachStateChangeListener {
    public final h7 f;
    public final c7 g;
    public a31 h;
    public final ArrayList i = new ArrayList();
    public final long j = 100;
    public z7 k = z7.f;
    public boolean l = true;
    public final np m = lr.a(1, 6, null);
    public or1 n;
    public long o;
    public final or1 p;
    public wu2 q;
    public boolean r;
    public final v s;

    public c8(h7 h7Var, c7 c7Var) {
        this.f = h7Var;
        this.g = c7Var;
        new Handler(Looper.getMainLooper());
        or1 or1Var = h41.a;
        or1Var.getClass();
        this.n = or1Var;
        this.p = new or1();
        this.q = new wu2(h7Var.getSemanticsOwner().a(), or1Var);
        this.s = new v(3, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.q40 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.b8
            if (r0 == 0) goto L13
            r0 = r8
            b8 r0 = (defpackage.b8) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            b8 r0 = new b8
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.j
            int r1 = r0.l
            r2 = 2
            r3 = 1
            y50 r4 = defpackage.y50.f
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            kp r1 = r0.i
            defpackage.y02.Q(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            r7 = 0
            return r7
        L33:
            kp r1 = r0.i
            defpackage.y02.Q(r8)
            goto L51
        L39:
            defpackage.y02.Q(r8)
            np r8 = r7.m
            r8.getClass()
            kp r1 = new kp
            r1.<init>(r8)
        L46:
            r0.i = r1
            r0.l = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r1.c()
            boolean r8 = r7.g()
            if (r8 == 0) goto L65
            r7.h()
        L65:
            h7 r8 = r7.f
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.r
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.r = r3
            v r5 = r7.s
            r8.post(r5)
        L78:
            r0.i = r1
            r0.l = r2
            long r5 = r7.j
            java.lang.Object r8 = defpackage.ur.A(r5, r0)
            if (r8 != r4) goto L46
        L84:
            return r4
        L85:
            dm3 r7 = defpackage.dm3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8.a(q40):java.lang.Object");
    }

    @Override // defpackage.a90
    public final void b(of1 of1Var) {
        m(this.f.getSemanticsOwner().a());
        h();
        this.h = null;
    }

    @Override // defpackage.a90
    public final void c(of1 of1Var) {
        this.h = (a31) this.g.a();
        l(-1, this.f.getSemanticsOwner().a());
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.g41 r34) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8.d(g41):void");
    }

    public final g41 e() {
        if (this.l) {
            this.l = false;
            this.n = w7.N(this.f.getSemanticsOwner(), new u0(7));
            this.o = System.currentTimeMillis();
        }
        return this.n;
    }

    public final boolean g() {
        return this.h != null;
    }

    public final void h() {
        a31 a31Var = this.h;
        if (a31Var == null) {
            return;
        }
        Object obj = a31Var.h;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r30 r30Var = (r30) arrayList.get(i);
            int iOrdinal = r30Var.c.ordinal();
            if (iOrdinal == 0) {
                op3 op3Var = r30Var.d;
                if (op3Var != null) {
                    ViewStructure viewStructure = (ViewStructure) op3Var.a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        gf.f(m6.e(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    c.k();
                    return;
                }
                AutofillId autofillIdY = a31Var.y(r30Var.a);
                if (autofillIdY != null && Build.VERSION.SDK_INT >= 29) {
                    gf.g(m6.e(obj), autofillIdY);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            gf.i(m6.e(obj), ((View) a31Var.g).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(vu2 vu2Var, wu2 wu2Var) {
        int i = 0;
        y7 y7Var = new y7(i, wu2Var, this);
        vu2Var.getClass();
        List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listI.get(i3);
            if (e().a(((vu2) obj).f)) {
                y7Var.f(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listI2 = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        while (i < size2) {
            vu2 vu2Var2 = (vu2) listI2.get(i);
            g41 g41VarE = e();
            int i4 = vu2Var2.f;
            if (g41VarE.a(i4)) {
                or1 or1Var = this.p;
                if (or1Var.a(i4)) {
                    Object objB = or1Var.b(i4);
                    if (objB == null) {
                        throw nc2.d("node not present in pruned tree before this change");
                    }
                    j(vu2Var2, (wu2) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void k(int i, String str) {
        a31 a31Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (a31Var = this.h) != null) {
            AutofillId autofillIdY = a31Var.y(i);
            if (autofillIdY == null) {
                throw nc2.d("Invalid content capture ID");
            }
            if (i2 >= 29) {
                gf.h(m6.e(a31Var.h), autofillIdY, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r19, defpackage.vu2 r20) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8.l(int, vu2):void");
    }

    public final void m(vu2 vu2Var) {
        if (g()) {
            this.i.add(new r30(vu2Var.f, this.o, s30.g, null));
            List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                m((vu2) listI.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r17 = this;
            r0 = r17
            or1 r1 = r0.p
            r1.c()
            g41 r2 = r0.e()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            xu2 r13 = (defpackage.xu2) r13
            wu2 r15 = new wu2
            vu2 r13 = r13.a
            g41 r6 = r0.e()
            r15.<init>(r13, r6)
            r1.i(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            wu2 r1 = new wu2
            h7 r2 = r0.f
            yu2 r2 = r2.getSemanticsOwner()
            vu2 r2 = r2.a()
            g41 r3 = r0.e()
            r1.<init>(r2, r3)
            r0.q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8.n():void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.s);
        this.h = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
