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
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void f(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        boolean z2 = ((cl) arrayList.get(i)).o;
        ArrayList arrayList3 = this.D;
        if (arrayList3 == null) {
            this.D = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.D.addAll(this.c.v());
        int i3 = i;
        boolean z3 = false;
        while (true) {
            int i4 = 1;
            if (i3 >= i2) {
                this.D.clear();
                if (!z2 && this.q >= 1) {
                    for (int i5 = i; i5 < i2; i5++) {
                        ArrayList arrayList4 = ((cl) arrayList.get(i5)).a;
                        int size = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList4.get(i6);
                            i6++;
                            ((zr0) obj).getClass();
                        }
                    }
                }
                for (int i7 = i; i7 < i2; i7++) {
                    cl clVar = (cl) arrayList.get(i7);
                    if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                        clVar.a(-1);
                        ur0 ur0Var = clVar.p;
                        ArrayList arrayList5 = clVar.a;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            zr0 zr0Var = (zr0) arrayList5.get(size2);
                            zr0Var.getClass();
                            switch (zr0Var.a) {
                                case 1:
                                    throw null;
                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + zr0Var.a);
                                case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                                    throw null;
                                case oc2.LONG_FIELD_NUMBER /* 4 */:
                                    throw null;
                                case oc2.STRING_FIELD_NUMBER /* 5 */:
                                    throw null;
                                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                                    throw null;
                                case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                                    throw null;
                                case 8:
                                    ur0Var.getClass();
                                    break;
                                case vr.g /* 9 */:
                                    ur0Var.getClass();
                                    break;
                                case vr.h /* 10 */:
                                    ur0Var.getClass();
                                    throw null;
                            }
                        }
                    } else {
                        clVar.a(1);
                        ur0 ur0Var2 = clVar.p;
                        ArrayList arrayList6 = clVar.a;
                        int size3 = arrayList6.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            zr0 zr0Var2 = (zr0) arrayList6.get(i8);
                            zr0Var2.getClass();
                            switch (zr0Var2.a) {
                                case 1:
                                    throw null;
                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + zr0Var2.a);
                                case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                                    throw null;
                                case oc2.LONG_FIELD_NUMBER /* 4 */:
                                    throw null;
                                case oc2.STRING_FIELD_NUMBER /* 5 */:
                                    throw null;
                                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                                    throw null;
                                case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                                    throw null;
                                case 8:
                                    ur0Var2.getClass();
                                    break;
                                case vr.g /* 9 */:
                                    ur0Var2.getClass();
                                    break;
                                case vr.h /* 10 */:
                                    ur0Var2.getClass();
                                    throw null;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i9 = i; i9 < i2; i9++) {
                    cl clVar2 = (cl) arrayList.get(i9);
                    if (zBooleanValue) {
                        for (int size4 = clVar2.a.size() - 1; size4 >= 0; size4--) {
                            ((zr0) clVar2.a.get(size4)).getClass();
                        }
                    } else {
                        ArrayList arrayList7 = clVar2.a;
                        int size5 = arrayList7.size();
                        int i10 = 0;
                        while (i10 < size5) {
                            Object obj2 = arrayList7.get(i10);
                            i10++;
                            ((zr0) obj2).getClass();
                        }
                    }
                }
                i(this.q, true);
                HashSet hashSet = new HashSet();
                for (int i11 = i; i11 < i2; i11++) {
                    ArrayList arrayList8 = ((cl) arrayList.get(i11)).a;
                    int size6 = arrayList8.size();
                    int i12 = 0;
                    while (i12 < size6) {
                        Object obj3 = arrayList8.get(i12);
                        i12++;
                        ((zr0) obj3).getClass();
                    }
                }
                Iterator it = hashSet.iterator();
                if (it.hasNext()) {
                    ((n83) it.next()).getClass();
                    throw null;
                }
                for (int i13 = i; i13 < i2; i13++) {
                    cl clVar3 = (cl) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue() && clVar3.q >= 0) {
                        clVar3.q = -1;
                    }
                    clVar3.getClass();
                }
                return;
            }
            cl clVar4 = (cl) arrayList.get(i3);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i3)).booleanValue();
            ArrayList arrayList9 = this.D;
            int i14 = 3;
            if (zBooleanValue2) {
                int i15 = 1;
                z = false;
                ArrayList arrayList10 = clVar4.a;
                int size7 = arrayList10.size() - 1;
                while (size7 >= 0) {
                    zr0 zr0Var3 = (zr0) arrayList10.get(size7);
                    int i16 = zr0Var3.a;
                    if (i16 != i15) {
                        if (i16 != 3) {
                            switch (i16) {
                                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                                    arrayList9.add(null);
                                    break;
                                case vr.h /* 10 */:
                                    zr0Var3.h = zr0Var3.g;
                                    break;
                            }
                        }
                        size7--;
                        i15 = 1;
                    }
                    arrayList9.remove((Object) null);
                    size7--;
                    i15 = 1;
                }
            } else {
                ArrayList arrayList11 = clVar4.a;
                int i17 = 0;
                while (i17 < arrayList11.size()) {
                    zr0 zr0Var4 = (zr0) arrayList11.get(i17);
                    int i18 = zr0Var4.a;
                    if (i18 == i4) {
                        arrayList9.add(null);
                    } else {
                        if (i18 == 2) {
                            throw null;
                        }
                        ff1 ff1Var = ff1.j;
                        if (i18 == i14 || i18 == 6) {
                            arrayList9.remove((Object) null);
                            zr0 zr0Var5 = new zr0();
                            zr0Var5.a = 9;
                            zr0Var5.b = false;
                            zr0Var5.g = ff1Var;
                            zr0Var5.h = ff1Var;
                            arrayList11.add(i17, zr0Var5);
                            i17++;
                        } else if (i18 != 7) {
                            if (i18 == 8) {
                                zr0 zr0Var6 = new zr0();
                                zr0Var6.a = 9;
                                zr0Var6.b = true;
                                zr0Var6.g = ff1Var;
                                zr0Var6.h = ff1Var;
                                arrayList11.add(i17, zr0Var6);
                                zr0Var4.b = true;
                                i17++;
                            }
                        }
                    }
                    i17++;
                    i4 = 1;
                    i14 = 3;
                }
                z = false;
            }
            z3 = (z3 || clVar4.g) ? true : z;
            i3++;
        }
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
