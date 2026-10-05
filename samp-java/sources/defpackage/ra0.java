package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ra0 implements Iterator, t61 {
    public int f = -1;
    public int g;
    public int h;
    public l41 i;
    public int j;
    public final /* synthetic */ sa0 k;

    public ra0(sa0 sa0Var) {
        this.k = sa0Var;
        int iH = y02.h(0, 0, sa0Var.a.length());
        this.g = iH;
        this.h = iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            sa0 r0 = r8.k
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.h
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.f = r3
            r0 = 0
            r8.i = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.j
            int r7 = r7 + r6
            r8.j = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L36
        L22:
            l41 r0 = new l41
            int r2 = r8.g
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.i = r0
            r8.h = r5
            goto L7b
        L36:
            rs0 r0 = r0.c
            int r2 = r8.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.f(r1, r2)
            r32 r0 = (defpackage.r32) r0
            if (r0 != 0) goto L5a
            l41 r0 = new l41
            int r2 = r8.g
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.i = r0
            r8.h = r5
            goto L7b
        L5a:
            java.lang.Object r1 = r0.f
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.g
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.g
            l41 r2 = defpackage.y02.S(r2, r1)
            r8.i = r2
            int r1 = r1 + r0
            r8.g = r1
            if (r0 != 0) goto L78
            r3 = r6
        L78:
            int r1 = r1 + r3
            r8.h = r1
        L7b:
            r8.f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra0.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        return this.f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 0) {
            c.n();
            return null;
        }
        l41 l41Var = this.i;
        l41Var.getClass();
        this.i = null;
        this.f = -1;
        return l41Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
