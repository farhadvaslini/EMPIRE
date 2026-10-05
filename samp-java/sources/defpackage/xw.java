package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class xw extends r {
    public gb2 P;
    public q11 Q;

    @Override // defpackage.r
    public final boolean C1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.r
    public final void D1(KeyEvent keyEvent) {
        E1();
    }

    public final void G1(boolean z) {
        if (z) {
            this.Q = null;
        } else {
            this.P = null;
        }
        w1(z);
        this.F = "idle";
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
            if (ab2Var == ab2.h) {
                if (this.Q != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        q11 q11Var = (q11) arrayList.get(i);
                        if (q11Var.i && q11Var != this.Q) {
                            G1(true);
                            break;
                        }
                        i++;
                    }
                }
                if (s51.n(this.F, "recognized")) {
                    this.F = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.Q == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (lr.q((q11) arrayList.get(i2))) {
                    q11 q11Var2 = (q11) arrayList.get(0);
                    q11Var2.i = true;
                    this.Q = q11Var2;
                    if (this.A) {
                        this.F = "waiting";
                        y1(q11Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            q11 q11Var3 = (q11) arrayList.get(i3);
            if (q11Var3.i || !q11Var3.h || q11Var3.d) {
                float fD = ((oq3) ur.z(this, s20.t)).d();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    q11 q11Var4 = (q11) arrayList.get(i4);
                    long j = q11Var4.c;
                    q11 q11Var5 = this.Q;
                    q11Var5.getClass();
                    boolean z = Math.abs(gy1.c(gy1.d(j, q11Var5.c))) > fD;
                    if (q11Var4.i || z) {
                        G1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((q11) arrayList.get(0)).i = true;
        if (this.A) {
            this.F = "recognized";
            q11 q11Var6 = this.Q;
            q11Var6.getClass();
            x1(q11Var6.c, true);
            E1();
        }
        this.Q = null;
    }

    @Override // defpackage.r, defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        super.i0(za2Var, ab2Var, j);
        if (ab2Var != ab2.g) {
            if (ab2Var == ab2.h) {
                if (this.P != null) {
                    List list = za2Var.a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        gb2 gb2Var = (gb2) list.get(i);
                        if (gb2Var.c() && gb2Var != this.P) {
                            G1(false);
                            break;
                        }
                        i++;
                    }
                }
                if (s51.n(this.F, "recognized")) {
                    this.F = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.P == null) {
            if (cd3.e(za2Var, true)) {
                gb2 gb2Var2 = (gb2) za2Var.a.get(0);
                gb2Var2.a();
                this.P = gb2Var2;
                if (this.A) {
                    this.F = "waiting";
                    z1(gb2Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = za2Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!w22.m((gb2) list2.get(i2))) {
                long jV1 = v1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    gb2 gb2Var3 = (gb2) list2.get(i3);
                    if (gb2Var3.c() || w22.y(gb2Var3, j, jV1)) {
                        G1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((gb2) list2.get(0)).a();
        if (this.A) {
            this.F = "recognized";
            gb2 gb2Var4 = this.P;
            gb2Var4.getClass();
            x1(gb2Var4.c, false);
            E1();
        }
        this.P = null;
    }
}
