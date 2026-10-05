package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class i93 extends w0 implements fn0, dt0, g93, ms1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(i93.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long l = kr.a.objectFieldOffset(i93.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int j;

    public i93(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x006d, code lost:
    
        if (r15 != r2) goto L28;
     */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:38:0x0089], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0089, B:36:0x0083], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0089, B:46:0x00a4], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:58:0x00e6, B:59:0x00e7], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0083, B:46:0x00a4, B:49:0x00b4, B:50:0x00d0, B:56:0x00e0, B:53:0x00d7, B:55:0x00dd, B:38:0x0089, B:42:0x0090, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b3 -> B:28:0x006d). Please report as a decompilation issue!!! */
    @Override // defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.gn0 r14, defpackage.p40 r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i93.a(gn0, p40):java.lang.Object");
    }

    @Override // defpackage.dt0
    public final fn0 b(o50 o50Var, int i, jp jpVar) {
        return ((((i < 0 || i >= 2) && i != -2) || jpVar != jp.g) && !((i == 0 || i == -3) && jpVar == jp.f)) ? new os(this, o50Var, i, jpVar) : this;
    }

    @Override // defpackage.w0
    public final x0 d() {
        return new j93();
    }

    @Override // defpackage.w0
    public final x0[] e() {
        return new j93[2];
    }

    @Override // defpackage.g93
    public final Object getValue() {
        ai0 ai0Var = vm1.b0;
        k.getClass();
        Object objectVolatile = kr.a.getObjectVolatile(this, l);
        if (objectVolatile == ai0Var) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean h(Object obj, Object obj2) {
        ai0 ai0Var = vm1.b0;
        if (obj == null) {
            obj = ai0Var;
        }
        if (obj2 == null) {
            obj2 = ai0Var;
        }
        return j(obj, obj2);
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = vm1.b0;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i;
        x0[] x0VarArr;
        ai0 ai0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !s51.n(obj3, obj)) {
                return false;
            }
            if (s51.n(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.j;
            if ((i2 & 1) != 0) {
                this.j = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.j = i3;
            x0[] x0VarArr2 = this.f;
            while (true) {
                j93[] j93VarArr = (j93[]) x0VarArr2;
                if (j93VarArr != null) {
                    for (j93 j93Var : j93VarArr) {
                        if (j93Var != null) {
                            AtomicReference atomicReference = j93Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (ai0Var = s51.P)) {
                                    ai0 ai0Var2 = s51.O;
                                    if (obj4 != ai0Var2) {
                                        while (!atomicReference.compareAndSet(obj4, ai0Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((jr) obj4).t(dm3.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, ai0Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.j;
                    if (i == i3) {
                        this.j = i3 + 1;
                        return true;
                    }
                    x0VarArr = this.f;
                }
                x0VarArr2 = x0VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.gn0
    public final Object k(Object obj, p40 p40Var) {
        i(obj);
        return dm3.a;
    }
}
