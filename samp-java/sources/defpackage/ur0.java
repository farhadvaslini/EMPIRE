package defpackage;

import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ur0 {
    public boolean A;
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public xr0 E;
    public final e7 F;
    public boolean b;
    public ArrayList d;
    public xy1 f;
    public final CopyOnWriteArrayList k;
    public final pr0 l;
    public final pr0 m;
    public final pr0 n;
    public final pr0 o;
    public final rr0 p;
    public int q;
    public kr0 r;
    public kr0 s;
    public final sr0 t;
    public y3 u;
    public y3 v;
    public y3 w;
    public ArrayDeque x;
    public boolean y;
    public boolean z;
    public final ArrayList a = new ArrayList();
    public final pl c = new pl(4);
    public final or0 e = new or0(this);
    public final tk g = new tk(1, this);
    public final AtomicInteger h = new AtomicInteger();
    public final Map i = Collections.synchronizedMap(new HashMap());
    public final Map j = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [pr0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [pr0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [pr0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [pr0] */
    public ur0() {
        Collections.synchronizedMap(new HashMap());
        new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        final int i = 0;
        this.l = new q30(this) { // from class: pr0
            public final /* synthetic */ ur0 b;

            {
                this.b = this;
            }

            @Override // defpackage.q30
            public final void accept(Object obj) {
                int i2 = i;
                ur0 ur0Var = this.b;
                switch (i2) {
                    case 0:
                        Iterator it = ur0Var.c.v().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = ur0Var.c.v().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    qn1.b();
                                    break;
                                }
                            }
                        }
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z = ((kr1) obj).a;
                        Iterator it3 = ur0Var.c.v().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((c62) obj).a;
                        Iterator it4 = ur0Var.c.v().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.m = new q30(this) { // from class: pr0
            public final /* synthetic */ ur0 b;

            {
                this.b = this;
            }

            @Override // defpackage.q30
            public final void accept(Object obj) {
                int i22 = i2;
                ur0 ur0Var = this.b;
                switch (i22) {
                    case 0:
                        Iterator it = ur0Var.c.v().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = ur0Var.c.v().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    qn1.b();
                                    break;
                                }
                            }
                        }
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z = ((kr1) obj).a;
                        Iterator it3 = ur0Var.c.v().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((c62) obj).a;
                        Iterator it4 = ur0Var.c.v().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.n = new q30(this) { // from class: pr0
            public final /* synthetic */ ur0 b;

            {
                this.b = this;
            }

            @Override // defpackage.q30
            public final void accept(Object obj) {
                int i22 = i3;
                ur0 ur0Var = this.b;
                switch (i22) {
                    case 0:
                        Iterator it = ur0Var.c.v().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = ur0Var.c.v().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    qn1.b();
                                    break;
                                }
                            }
                        }
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z = ((kr1) obj).a;
                        Iterator it3 = ur0Var.c.v().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((c62) obj).a;
                        Iterator it4 = ur0Var.c.v().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.o = new q30(this) { // from class: pr0
            public final /* synthetic */ ur0 b;

            {
                this.b = this;
            }

            @Override // defpackage.q30
            public final void accept(Object obj) {
                int i22 = i4;
                ur0 ur0Var = this.b;
                switch (i22) {
                    case 0:
                        Iterator it = ur0Var.c.v().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = ur0Var.c.v().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    qn1.b();
                                    break;
                                }
                            }
                        }
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        boolean z = ((kr1) obj).a;
                        Iterator it3 = ur0Var.c.v().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                    default:
                        boolean z2 = ((c62) obj).a;
                        Iterator it4 = ur0Var.c.v().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                qn1.b();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.p = new rr0(this);
        this.q = -1;
        this.t = new sr0(this);
        this.x = new ArrayDeque();
        this.F = new e7(3, this);
    }

    public static boolean h(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public final void a() {
        this.b = false;
        this.C.clear();
        this.B.clear();
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.u().iterator();
        if (!it.hasNext()) {
            return hashSet;
        }
        nc2.u(it.next());
        throw null;
    }

    public final void c(int i) {
        try {
            this.b = true;
            Iterator it = ((HashMap) this.c.h).values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
            }
            i(i, false);
            Iterator it2 = b().iterator();
            if (it2.hasNext()) {
                ((n83) it2.next()).a();
                throw null;
            }
            this.b = false;
            e(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void d(boolean z) {
        if (this.b) {
            c.q("FragmentManager is already executing transactions");
            return;
        }
        if (this.r == null) {
            if (this.A) {
                c.q("FragmentManager has been destroyed");
                return;
            } else {
                c.q("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.r.g.getLooper()) {
            c.q("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.y || this.z)) {
            c.q("Can not perform this action after onSaveInstanceState");
        } else if (this.B == null) {
            this.B = new ArrayList();
            this.C = new ArrayList();
        }
    }

    public final boolean e(boolean z) {
        boolean z2;
        ArrayList arrayList;
        d(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.B;
            ArrayList arrayList3 = this.C;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            ((cl) arrayList.get(i)).c(arrayList2, arrayList3);
                            i++;
                            z2 = true;
                        }
                        arrayList.clear();
                        this.r.g.removeCallbacks(this.F);
                    } finally {
                    }
                }
            }
            if (!z2) {
                k();
                ((HashMap) this.c.h).values().removeAll(Collections.singleton(null));
                return z3;
            }
            this.b = true;
            try {
                j(this.B, this.C);
                a();
                z3 = true;
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.ArrayList r19, java.util.ArrayList r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur0.f(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final void g() {
        pl plVar = this.c;
        ArrayList arrayList = (ArrayList) plVar.g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                qn1.b();
                return;
            }
        }
        Iterator it = ((HashMap) plVar.h).values().iterator();
        while (it.hasNext()) {
            nc2.u(it.next());
        }
    }

    public final void i(int i, boolean z) {
        if (this.r == null && i != -1) {
            c.q("No activity");
            return;
        }
        if (z || i != this.q) {
            this.q = i;
            pl plVar = this.c;
            Iterator it = ((ArrayList) plVar.g).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                qn1.b();
                return;
            }
            Iterator it2 = ((HashMap) plVar.h).values().iterator();
            while (it2.hasNext()) {
                if (it2.next() != null) {
                    qn1.b();
                    return;
                }
            }
            Iterator it3 = plVar.u().iterator();
            if (it3.hasNext()) {
                nc2.u(it3.next());
                throw null;
            }
        }
    }

    public final void j(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            c.q("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((cl) arrayList.get(i)).o) {
                if (i2 != i) {
                    f(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((cl) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                f(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            f(arrayList, arrayList2, i2, size);
        }
    }

    public final void k() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.g.f(true);
                    return;
                }
                tk tkVar = this.g;
                ArrayList arrayList = this.d;
                tkVar.f((arrayList != null ? arrayList.size() : 0) > 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        kr0 kr0Var = this.r;
        if (kr0Var != null) {
            sb.append(kr0Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.r)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }
}
