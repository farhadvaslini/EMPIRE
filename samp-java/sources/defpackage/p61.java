package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p61 implements g11 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(p61.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(p61.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final gx1 f;

    static {
        Unsafe unsafe = kr.a;
        k = unsafe.objectFieldOffset(p61.class.getDeclaredField("_rootCause$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(p61.class, Object.class, "_exceptionsHolder$volatile");
        j = unsafe.objectFieldOffset(p61.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public p61(gx1 gx1Var, Throwable th) {
        this.f = gx1Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thE = e();
        if (thE == null) {
            i(th);
            return;
        }
        if (th == thE) {
            return;
        }
        Object objC = c();
        if (objC == null) {
            h(th);
            return;
        }
        if (!(objC instanceof Throwable)) {
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            } else {
                c.h(objC, "State is ");
                return;
            }
        }
        if (th == objC) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objC);
        arrayList.add(th);
        h(arrayList);
    }

    @Override // defpackage.g11
    public final boolean b() {
        return e() == null;
    }

    public final Object c() {
        i.getClass();
        return kr.a.getObjectVolatile(this, j);
    }

    @Override // defpackage.g11
    public final gx1 d() {
        return this.f;
    }

    public final Throwable e() {
        h.getClass();
        return (Throwable) kr.a.getObjectVolatile(this, k);
    }

    public final boolean f() {
        return e() != null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object objC = c();
        if (objC == null) {
            arrayList = new ArrayList(4);
        } else if (objC instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objC);
            arrayList = arrayList2;
        } else {
            if (!(objC instanceof ArrayList)) {
                c.h(objC, "State is ");
                return null;
            }
            arrayList = (ArrayList) objC;
        }
        Throwable thE = e();
        if (thE != null) {
            arrayList.add(0, thE);
        }
        if (th != null && !th.equals(thE)) {
            arrayList.add(th);
        }
        h(s51.q);
        return arrayList;
    }

    public final void h(Object obj) {
        i.getClass();
        kr.a.putObjectVolatile(this, j, obj);
    }

    public final void i(Throwable th) {
        h.getClass();
        kr.a.putObjectVolatile(this, k, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(g.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.f);
        sb.append(']');
        return sb.toString();
    }
}
