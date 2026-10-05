package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fm3 {
    public static em3 a(Object obj) {
        wv0 wv0Var = (wv0) obj;
        em3 em3Var = wv0Var.unknownFields;
        if (em3Var != em3.f) {
            return em3Var;
        }
        em3 em3Var2 = new em3(0, new int[8], new Object[8], true);
        wv0Var.unknownFields = em3Var2;
        return em3Var2;
    }

    public static boolean b(int i, lx lxVar, Object obj) throws z51 {
        int i2 = lxVar.b;
        kx kxVar = (kx) lxVar.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            lxVar.A(0);
            ((em3) obj).c(i3 << 3, Long.valueOf(kxVar.s()));
            return true;
        }
        if (i4 == 1) {
            lxVar.A(1);
            ((em3) obj).c((i3 << 3) | 1, Long.valueOf(kxVar.p()));
            return true;
        }
        if (i4 == 2) {
            ((em3) obj).c((i3 << 3) | 2, lxVar.i());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw z51.b();
            }
            lxVar.A(5);
            ((em3) obj).c(5 | (i3 << 3), Integer.valueOf(kxVar.o()));
            return true;
        }
        em3 em3Var = new em3(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new z51("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (lxVar.c() != Integer.MAX_VALUE && b(i7, lxVar, em3Var)) {
        }
        if (i6 != lxVar.b) {
            throw new z51("Protocol message end-group tag did not match expected tag.");
        }
        if (em3Var.e) {
            em3Var.e = false;
        }
        ((em3) obj).c(i5 | 3, em3Var);
        return true;
    }
}
