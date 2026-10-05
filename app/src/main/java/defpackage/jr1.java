package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 {
    public final is1 a;

    public static final Object a(is1 is1Var) {
        Object objG = is1Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof as1)) {
            is1Var.k(null);
            return objG;
        }
        as1 as1Var = (as1) objG;
        if (as1Var.i()) {
            c.m("List is empty.");
            return null;
        }
        int i = as1Var.b - 1;
        Object objG2 = as1Var.g(i);
        as1Var.l(i);
        objG2.getClass();
        if (as1Var.i()) {
            is1Var.k(null);
        }
        if (as1Var.b == 1) {
            is1Var.m(null, as1Var.f());
        }
        return objG2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final as1 b(is1 is1Var) {
        if (is1Var.i()) {
            as1 as1Var = cy1.b;
            as1Var.getClass();
            return as1Var;
        }
        as1 as1Var2 = new as1();
        Object[] objArr = is1Var.c;
        long[] jArr = is1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof as1) {
                                as1Var2.c((as1) obj);
                            } else {
                                obj.getClass();
                                as1Var2.b(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return as1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jr1) {
            return this.a.equals(((jr1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
