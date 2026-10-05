package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class az extends r {
    public cs0 P;
    public boolean Q;
    public final sr1 R;
    public final sr1 S;
    public gb2 T;
    public w83 U;
    public w83 V;
    public boolean W;
    public boolean X;
    public long Y;
    public boolean Z;
    public q11 a0;
    public w83 b0;
    public w83 c0;
    public boolean d0;
    public boolean e0;
    public long f0;
    public boolean g0;

    public az(cs0 cs0Var, cs0 cs0Var2, qr1 qr1Var) {
        super(qr1Var, null, false, true, null, null, cs0Var);
        this.P = cs0Var2;
        this.Q = true;
        int i = pk1.a;
        this.R = new sr1(6);
        this.S = new sr1(6);
        this.Y = -1L;
        this.f0 = -1L;
    }

    @Override // defpackage.r
    public final void B1() {
        J1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // defpackage.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C1(KeyEvent keyEvent) {
        boolean z;
        long jE = ur.E(keyEvent);
        if (this.P != null) {
            sr1 sr1Var = this.R;
            if (sr1Var.d(jE) == null) {
                sr1Var.g(jE, cl3.t(d1(), null, new zy(this, null, 2), 3));
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.r
    public final void D1(KeyEvent keyEvent) {
        long jE = ur.E(keyEvent);
        sr1 sr1Var = this.R;
        boolean z = false;
        if (sr1Var.d(jE) != null) {
            j61 j61Var = (j61) sr1Var.d(jE);
            if (j61Var != null) {
                if (j61Var.b()) {
                    j61Var.c(null);
                } else {
                    z = true;
                }
            }
            sr1Var.f(jE);
        }
        if (z) {
            return;
        }
        E1();
    }

    public final void G1(boolean z) {
        if (z) {
            this.a0 = null;
            w83 w83Var = this.b0;
            if (w83Var != null) {
                w83Var.c(null);
            }
            this.b0 = null;
            w83 w83Var2 = this.c0;
            if (w83Var2 != null) {
                w83Var2.c(null);
            }
            this.c0 = null;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1L;
            this.g0 = false;
        } else {
            this.T = null;
            w83 w83Var3 = this.U;
            if (w83Var3 != null) {
                w83Var3.c(null);
            }
            this.U = null;
            w83 w83Var4 = this.V;
            if (w83Var4 != null) {
                w83Var4.c(null);
            }
            this.V = null;
            this.W = false;
            this.X = false;
            this.Y = -1L;
            this.Z = false;
        }
        w1(z);
    }

    public final void H1(long j, q11 q11Var) {
        if (this.A && !this.g0) {
            x1(q11Var.c, true);
            this.f0 = j;
            if (!this.e0 && !this.d0) {
                E1();
            }
        }
        this.a0 = null;
        this.g0 = false;
        this.d0 = false;
        w83 w83Var = this.b0;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.b0 = null;
        this.e0 = false;
    }

    public final void I1(long j, gb2 gb2Var) {
        if (this.A && !this.Z) {
            x1(gb2Var.c, false);
            this.Y = j;
            if (!this.X && !this.W) {
                E1();
            }
        }
        this.T = null;
        this.Z = false;
        this.W = false;
        w83 w83Var = this.U;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.U = null;
        this.X = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J1() {
        char c;
        long j;
        long j2;
        char c2;
        sr1 sr1Var = this.R;
        Object[] objArr = sr1Var.c;
        long[] jArr = sr1Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((j61) objArr[(i << 3) + i3]).c(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        sr1Var.a();
        sr1 sr1Var2 = this.S;
        Object[] objArr2 = sr1Var2.c;
        long[] jArr2 = sr1Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((yy) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 == length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        sr1Var2.a();
    }

    @Override // defpackage.jb2
    public final void L0() {
        zy0 zy0Var;
        qr1 qr1Var = this.v;
        if (qr1Var != null && (zy0Var = this.I) != null) {
            qr1Var.c(new az0(zy0Var));
        }
        this.I = null;
        G1(false);
    }

    @Override // defpackage.y11
    public final void V() {
        G1(true);
    }

    @Override // defpackage.y11
    public final void c0(h9 h9Var, ab2 ab2Var) {
        ArrayList arrayList = (ArrayList) h9Var.c;
        A1();
        if (this.A && this.E == null) {
            bw0 bw0Var = new bw0(this);
            p1(bw0Var);
            this.E = bw0Var;
        }
        int i = 0;
        if (ab2Var != ab2.g) {
            if (ab2Var != ab2.h || this.a0 == null || this.e0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                q11 q11Var = (q11) arrayList.get(i);
                if (q11Var.i && q11Var != this.a0) {
                    G1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.a0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (lr.q((q11) arrayList.get(i2))) {
                    q11 q11Var2 = (q11) arrayList.get(0);
                    q11Var2.i = true;
                    this.a0 = q11Var2;
                    if (this.A) {
                        w83 w83Var = this.c0;
                        if (w83Var != null && w83Var.b()) {
                            ((oq3) ur.z(this, s20.t)).getClass();
                            if (q11Var2.b - this.f0 < 40) {
                                this.g0 = true;
                                return;
                            }
                            this.d0 = true;
                            w83 w83Var2 = this.c0;
                            if (w83Var2 != null) {
                                w83Var2.c(null);
                            }
                            this.c0 = null;
                        }
                        this.e0 = false;
                        y1(q11Var2);
                        if (this.P != null) {
                            this.b0 = cl3.t(d1(), null, new zy(this, null, 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.e0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                q11 q11Var3 = (q11) arrayList.get(i3);
                if (!q11Var3.h || q11Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((q11) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            q11 q11Var4 = (q11) arrayList.get(0);
            q11Var4.i = true;
            long j = q11Var4.b;
            q11 q11Var5 = this.a0;
            q11Var5.getClass();
            H1(j, q11Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            q11 q11Var6 = (q11) arrayList.get(i4);
            if (q11Var6.i || !q11Var6.h || q11Var6.d) {
                float fD = ((oq3) ur.z(this, s20.t)).d();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    q11 q11Var7 = (q11) arrayList.get(i5);
                    long j2 = q11Var7.c;
                    q11 q11Var8 = this.a0;
                    q11Var8.getClass();
                    boolean z = Math.abs(gy1.c(gy1.d(j2, q11Var8.c))) > fD;
                    if (q11Var7.i || z) {
                        G1(true);
                        return;
                    }
                }
                return;
            }
        }
        q11 q11Var9 = (q11) arrayList.get(0);
        q11Var9.i = true;
        long j3 = q11Var9.b;
        q11 q11Var10 = this.a0;
        q11Var10.getClass();
        H1(j3, q11Var10);
    }

    @Override // defpackage.r, defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        super.i0(za2Var, ab2Var, j);
        if (ab2Var != ab2.g) {
            if (ab2Var != ab2.h || this.T == null || this.X) {
                return;
            }
            List list = za2Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                gb2 gb2Var = (gb2) list.get(i);
                if (gb2Var.c() && gb2Var != this.T) {
                    G1(false);
                    return;
                }
            }
            return;
        }
        if (this.T == null) {
            if (cd3.e(za2Var, true)) {
                gb2 gb2Var2 = (gb2) za2Var.a.get(0);
                gb2Var2.a();
                this.T = gb2Var2;
                if (this.A) {
                    w83 w83Var = this.V;
                    if (w83Var != null && w83Var.b()) {
                        ((oq3) ur.z(this, s20.t)).getClass();
                        if (gb2Var2.b - this.Y < 40) {
                            this.Z = true;
                            return;
                        }
                        this.W = true;
                        w83 w83Var2 = this.V;
                        if (w83Var2 != null) {
                            w83Var2.c(null);
                        }
                        this.V = null;
                    }
                    this.X = false;
                    z1(gb2Var2);
                    if (this.P != null) {
                        this.U = cl3.t(d1(), null, new zy(this, null, 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = za2Var.c == 2;
        List list2 = za2Var.a;
        if (z && !this.X && this.A && this.P != null) {
            w83 w83Var3 = this.U;
            if (w83Var3 != null) {
                w83Var3.c(null);
            }
            this.U = null;
            cs0 cs0Var = this.P;
            if (cs0Var != null) {
                cs0Var.a();
            }
            if (this.Q) {
                ((n62) ((px0) ur.z(this, s20.l))).a(0);
            }
            this.X = true;
        }
        if (this.X) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!w22.n((gb2) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((gb2) list2.get(i3)).a();
                    }
                    return;
                }
            }
            gb2 gb2Var3 = (gb2) list2.get(0);
            gb2Var3.a();
            long j2 = gb2Var3.b;
            gb2 gb2Var4 = this.T;
            gb2Var4.getClass();
            I1(j2, gb2Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!w22.m((gb2) list2.get(i4))) {
                long jV1 = v1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    gb2 gb2Var5 = (gb2) list2.get(i5);
                    if (gb2Var5.c() || w22.y(gb2Var5, j, jV1)) {
                        G1(false);
                        return;
                    }
                }
                return;
            }
        }
        gb2 gb2Var6 = (gb2) list2.get(0);
        gb2Var6.a();
        long j3 = gb2Var6.b;
        gb2 gb2Var7 = this.T;
        gb2Var7.getClass();
        I1(j3, gb2Var7);
    }

    @Override // defpackage.aq1
    public final void j1() {
        J1();
    }

    @Override // defpackage.r
    public final void s1(dv2 dv2Var) {
        if (this.P != null) {
            ja jaVar = new ja(7, this);
            a71[] a71VarArr = bv2.a;
            dv2Var.a(pu2.c, new y0(null, jaVar));
        }
    }
}
