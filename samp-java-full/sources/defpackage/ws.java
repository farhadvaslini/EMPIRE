package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void l(int i, o50 o50Var) {
        int i2 = pp.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object objP = p(i);
            boolean z2 = objP instanceof or3;
            np npVar = this.g;
            if (z2 || (objP instanceof pr3)) {
                if (o(i, objP, z ? pp.j : pp.k)) {
                    r(i, null);
                    q(i, !z);
                    if (z) {
                        npVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objP == pp.j || objP == pp.k) {
                    break;
                }
                if (objP != pp.g && objP != pp.f) {
                    if (objP == pp.i || objP == pp.d || objP == pp.l) {
                        return;
                    }
                    c.h(objP, "unexpected state: ");
                    return;
                }
            }
        }
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
