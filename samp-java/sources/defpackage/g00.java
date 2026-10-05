package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class g00 implements xs0 {
    @Override // defpackage.xs0
    public final Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, nv0 nv0Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        j40 j40Var = (j40) obj2;
        ss0 ss0Var = (ss0) obj3;
        cs0 cs0Var = (cs0) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        yp1 yp1Var = yp1.a;
        if (i2 == 0) {
            i = (nv0Var.f(yp1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= nv0Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= nv0Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= nv0Var.f(j40Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= nv0Var.h(ss0Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= nv0Var.h(cs0Var) ? 131072 : 65536;
        }
        if (nv0Var.R(i & 1, (599187 & i) != 599186)) {
            m40.c(str, zBooleanValue, j40Var, yp1Var, ss0Var, cs0Var, nv0Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
