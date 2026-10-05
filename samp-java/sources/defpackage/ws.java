package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ws extends kt2 {
    public final np g;
    public final /* synthetic */ AtomicReferenceArray h;

    public ws(long j, ws wsVar, np npVar, int i) {
        super(j, wsVar, i);
        this.g = npVar;
        this.h = new AtomicReferenceArray(pp.b * 2);
    }

    @Override // defpackage.kt2
    public final int k() {
        return pp.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        r(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.kt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r5, defpackage.o50 r6) {
        /*
            r4 = this;
            int r6 = defpackage.pp.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.h
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.p(r5)
            boolean r1 = r6 instanceof defpackage.or3
            np r2 = r4.g
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof defpackage.pr3
            if (r1 == 0) goto L21
            goto L50
        L21:
            ai0 r1 = defpackage.pp.j
            if (r6 == r1) goto L47
            ai0 r1 = defpackage.pp.k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            ai0 r1 = defpackage.pp.g
            if (r6 == r1) goto L11
            ai0 r1 = defpackage.pp.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            ai0 r4 = defpackage.pp.i
            if (r6 == r4) goto L6a
            ai0 r4 = defpackage.pp.d
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            ai0 r4 = defpackage.pp.l
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            defpackage.c.h(r6, r4)
            return
        L47:
            r4.r(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            ai0 r1 = defpackage.pp.j
            goto L57
        L55:
            ai0 r1 = defpackage.pp.k
        L57:
            boolean r6 = r4.o(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.r(r5, r3)
            r6 = r0 ^ 1
            r4.q(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.l(int, o50):void");
    }

    public final boolean o(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            np npVar = this.g;
            npVar.getClass();
            npVar.P((this.e * ((long) pp.b)) + ((long) i));
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
