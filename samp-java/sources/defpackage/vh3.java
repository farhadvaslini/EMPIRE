package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vh3 {
    public final int a;
    public final lk b;
    public final i c;
    public vh3 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ wh3 h;

    public vh3(wh3 wh3Var, int i, lk lkVar, i iVar) {
        this.h = wh3Var;
        this.a = i;
        this.b = lkVar;
        this.c = iVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        xk2 xk2Var;
        xk2 xk2Var2;
        long j5 = this.h.f;
        lk lkVar = this.b;
        ex1 ex1VarU = vr.U(lkVar, 2);
        tb1 tb1VarX = vr.X(lkVar);
        boolean zI = tb1VarX.I();
        ax1 ax1Var = tb1VarX.L;
        if (zI) {
            if (ax1Var.d != ex1VarU) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = ex1VarU.h;
                ex1 ex1Var = ax1Var.d;
                ex1Var.getClass();
                long jH = uq.H(ex1Var.l0(ex1VarU, jFloatToRawIntBits, true));
                xk2Var = new xk2(jH, (4294967295L & ((long) (((int) (jH & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jH >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, lkVar);
            } else {
                xk2Var = new xk2(j, j2, j3, j4, j5, fArr, lkVar);
            }
            xk2Var2 = xk2Var;
        } else {
            xk2Var2 = null;
        }
        if (xk2Var2 == null) {
            return;
        }
        this.c.h(xk2Var2);
    }

    public final void b() {
        wh3 wh3Var = this.h;
        or1 or1Var = wh3Var.a;
        int i = this.a;
        vh3 vh3Var = (vh3) or1Var.g(i);
        if (vh3Var != null) {
            if (vh3Var == this) {
                vh3 vh3Var2 = this.d;
                this.d = null;
                if (vh3Var2 != null) {
                    int iD = or1Var.d(i);
                    Object[] objArr = or1Var.c;
                    Object obj = objArr[iD];
                    or1Var.b[iD] = i;
                    objArr[iD] = vh3Var2;
                    return;
                }
                tb1 tb1VarX = vr.X(this.b.f);
                if (tb1VarX.H()) {
                    lk2 rectManager = ((h7) wb1.a(tb1VarX)).getRectManager();
                    rectManager.getClass();
                    if (tb1VarX.l != -4) {
                        h9 h9Var = rectManager.c;
                        int iE = rectManager.e(tb1VarX);
                        long[] jArr = (long[]) h9Var.c;
                        int i2 = iE + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD2 = or1Var.d(i);
            Object[] objArr2 = or1Var.c;
            Object obj2 = objArr2[iD2];
            or1Var.b[iD2] = i;
            objArr2[iD2] = vh3Var;
            while (true) {
                vh3 vh3Var3 = vh3Var.d;
                if (vh3Var3 == null) {
                    break;
                }
                if (vh3Var3 == this) {
                    vh3Var.d = this.d;
                    this.d = null;
                    return;
                }
                vh3Var = vh3Var3;
            }
        }
        vh3 vh3Var4 = wh3Var.b;
        if (vh3Var4 == this) {
            wh3Var.b = vh3Var4.d;
            this.d = null;
            return;
        }
        vh3 vh3Var5 = vh3Var4 != null ? vh3Var4.d : null;
        while (true) {
            vh3 vh3Var6 = vh3Var4;
            vh3Var4 = vh3Var5;
            if (vh3Var4 == null) {
                return;
            }
            if (vh3Var4 == this) {
                if (vh3Var6 != null) {
                    vh3Var6.d = vh3Var4.d;
                }
                this.d = null;
                return;
            }
            vh3Var5 = vh3Var4.d;
        }
    }
}
