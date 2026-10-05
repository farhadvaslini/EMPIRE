package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cm1 implements Map, Serializable, w61 {
    public static final cm1 s;
    public Object[] f;
    public Object[] g;
    public int[] h;
    public int[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public dm1 o;
    public em1 p;
    public dm1 q;
    public boolean r;

    static {
        cm1 cm1Var = new cm1(0);
        cm1Var.r = true;
        s = cm1Var;
    }

    public cm1(int i) {
        if (i < 0) {
            c.p("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f = objArr;
        this.g = null;
        this.h = iArr;
        this.i = new int[iHighestOneBit];
        this.j = 2;
        this.k = 0;
        this.l = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int iH = h(obj);
            int i = this.j * 2;
            int length = this.i.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.i;
                int i3 = iArr[iH];
                if (i3 == 0) {
                    int i4 = this.k;
                    Object[] objArr = this.f;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.k = i5;
                        objArr[i4] = obj;
                        this.h[i4] = iH;
                        iArr[iH] = i5;
                        this.n++;
                        this.m++;
                        if (i2 > this.j) {
                            this.j = i2;
                        }
                        return i4;
                    }
                    e(1);
                } else {
                    if (s51.n(this.f[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.i.length * 2);
                        break;
                    }
                    iH = iH == 0 ? this.i.length - 1 : iH - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.r) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.g;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.h;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        lr.P(this.f, i3, i);
        if (objArr != null) {
            lr.P(objArr, i3, this.k);
        }
        this.k = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.k - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        lr.P(this.f, 0, this.k);
        Object[] objArr = this.g;
        if (objArr != null) {
            lr.P(objArr, 0, this.k);
        }
        this.n = 0;
        this.k = 0;
        this.m++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean zN;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = f(entry.getKey());
                    if (iF < 0) {
                        zN = false;
                    } else {
                        Object[] objArr = this.g;
                        objArr.getClass();
                        zN = s51.n(objArr[iF], entry.getValue());
                    }
                    if (!zN) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.f;
        int length = objArr.length;
        int i2 = this.k;
        int i3 = length - i2;
        int i4 = i2 - this.n;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.g;
            this.g = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.h = Arrays.copyOf(this.h, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.i.length) {
                i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        dm1 dm1Var = this.q;
        if (dm1Var != null) {
            return dm1Var;
        }
        dm1 dm1Var2 = new dm1(this, 0);
        this.q = dm1Var2;
        return dm1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.n == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int iH = h(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[iH];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (s51.n(this.f[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.i.length - 1 : iH - 1;
        }
    }

    public final int g(Object obj) {
        int i = this.k;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.h[i] >= 0) {
                Object[] objArr = this.g;
                objArr.getClass();
                if (s51.n(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.g;
        objArr.getClass();
        return objArr[iF];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.l;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zl1 zl1Var = new zl1(this, 0);
        int i = 0;
        while (zl1Var.hasNext()) {
            int i2 = zl1Var.f;
            cm1 cm1Var = (cm1) zl1Var.i;
            if (i2 >= cm1Var.k) {
                c.n();
                return 0;
            }
            zl1Var.f = i2 + 1;
            zl1Var.g = i2;
            Object obj = cm1Var.f[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = cm1Var.g;
            objArr.getClass();
            Object obj2 = objArr[zl1Var.g];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            zl1Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.h[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r6) {
        /*
            r5 = this;
            int r0 = r5.m
            int r0 = r0 + 1
            r5.m = r0
            int r0 = r5.k
            int r1 = r5.n
            r2 = 0
            if (r0 <= r1) goto L10
            r5.c(r2)
        L10:
            int[] r0 = new int[r6]
            r5.i = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.l = r6
        L1c:
            int r6 = r5.k
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f
            r0 = r0[r2]
            int r0 = r5.h(r0)
            int r1 = r5.j
        L2c:
            int[] r3 = r5.i
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.h
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.c.q(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.i(int):void");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.n == 0;
    }

    public final void j(int i) {
        int i2;
        int i3;
        int iH;
        int[] iArr;
        Object[] objArr = this.f;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.g;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.h[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.i.length - 1 : length - 1;
                int[] iArr2 = this.i;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.j) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iH = h(this.f[i3]) - length;
                    iArr = this.i;
                }
            } while ((iH & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.h[i3] = i4;
        }
        this.h[i] = -1;
        this.n--;
        this.m++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        dm1 dm1Var = this.o;
        if (dm1Var != null) {
            return dm1Var;
        }
        dm1 dm1Var2 = new dm1(this, 1);
        this.o = dm1Var2;
        return dm1Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.g;
        if (objArr == null) {
            int length = this.f.length;
            if (length < 0) {
                c.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.g = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.g;
            if (objArr == null) {
                int length = this.f.length;
                if (length < 0) {
                    c.p("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.g = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!s51.n(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.g;
        objArr.getClass();
        Object obj2 = objArr[iF];
        j(iF);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.n * 3) + 2);
        sb.append("{");
        int i = 0;
        zl1 zl1Var = new zl1(this, 0);
        while (zl1Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = zl1Var.f;
            cm1 cm1Var = (cm1) zl1Var.i;
            if (i2 >= cm1Var.k) {
                c.n();
                return null;
            }
            zl1Var.f = i2 + 1;
            zl1Var.g = i2;
            Object obj = cm1Var.f[i2];
            if (obj == cm1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = cm1Var.g;
            objArr.getClass();
            Object obj2 = objArr[zl1Var.g];
            if (obj2 == cm1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            zl1Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        em1 em1Var = this.p;
        if (em1Var != null) {
            return em1Var;
        }
        em1 em1Var2 = new em1(0, this);
        this.p = em1Var2;
        return em1Var2;
    }
}
