package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wc1 {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public wc1(int i) {
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.a = b32.w(bool);
                this.b = new z32(1.0f);
                this.c = b32.w(bool);
                this.d = new z32(1.0f);
                this.e = b32.w(bool);
                this.f = b32.w(new wj3(wj3.b));
                this.g = b32.w(bool);
                this.h = b32.w(new wx(wx.f));
                break;
            default:
                long[] jArr = nr2.a;
                this.a = new is1();
                js1 js1Var = or2.a;
                this.c = new js1();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                this.g = new ArrayList();
                this.h = new ArrayList();
                break;
        }
    }

    public static int e(int[] iArr, fe1 fe1Var) {
        fe1Var.getClass();
        int i = fe1Var.l + fe1Var.m + iArr[0];
        iArr[0] = i;
        return Math.max(0, i);
    }

    public long a() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        nc2.u(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r30, int r31, java.util.ArrayList r32, defpackage.h9 r33, defpackage.ce1 r34, boolean r35, boolean r36, int r37, int r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc1.b(int, int, java.util.ArrayList, h9, ce1, boolean, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r14 = this;
            java.lang.Object r14 = r14.a
            is1 r14 = (defpackage.is1) r14
            boolean r0 = r14.j()
            if (r0 == 0) goto L52
            java.lang.Object[] r0 = r14.c
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L4f
            r3 = 0
            r4 = r3
        L15:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4a
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L48
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L3e
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L3e:
            int r14 = r4 << 3
            int r14 = r14 + r9
            r14 = r0[r14]
            defpackage.nc2.u(r14)
            r14 = 0
            throw r14
        L48:
            if (r7 != r8) goto L4f
        L4a:
            if (r4 == r2) goto L4f
            int r4 = r4 + 1
            goto L15
        L4f:
            r14.a()
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc1.c():void");
    }

    public void d(fe1 fe1Var, boolean z) {
        Object objG = ((is1) this.a).g(fe1Var.g);
        objG.getClass();
        nc2.u(objG);
        throw null;
    }
}
