package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q02 extends br {
    public int l;
    public int n;
    public int p;
    public o02[] k = new o02[16];
    public int[] m = new int[16];
    public Object[] o = new Object[16];

    public final void P() {
        this.l = 0;
        this.n = 0;
        Arrays.fill(this.o, 0, this.p, (Object) null);
        this.p = 0;
    }

    public final void Q(wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) throws IllegalAccessException, InvocationTargetException {
        if (this.l != 0) {
            lx lxVar = new lx(this);
            q02 q02Var = (q02) lxVar.e;
            while (true) {
                o02 o02Var = q02Var.k[lxVar.b];
                iv0 iv0VarB = o02Var.b(lxVar);
                wi wiVar2 = wiVar;
                m53 m53Var2 = m53Var;
                zk2 zk2Var2 = zk2Var;
                p02 p02Var2 = p02Var;
                try {
                    o02Var.a(lxVar, wiVar2, m53Var2, zk2Var2, p02Var2);
                    int i = lxVar.b;
                    int i2 = q02Var.l;
                    if (i < i2) {
                        o02 o02Var2 = q02Var.k[i];
                        lxVar.c += o02Var2.a;
                        lxVar.d += o02Var2.b;
                        int i3 = i + 1;
                        lxVar.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        wiVar = wiVar2;
                        m53Var = m53Var2;
                        zk2Var = zk2Var2;
                        p02Var = p02Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        P();
    }

    public final boolean R() {
        return this.l == 0;
    }

    public final void S(o02 o02Var) {
        int i = this.l;
        o02[] o02VarArr = this.k;
        if (i == o02VarArr.length) {
            o02[] o02VarArr2 = new o02[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(o02VarArr, 0, o02VarArr2, 0, i);
            this.k = o02VarArr2;
        }
        int i2 = this.n;
        int i3 = o02Var.a;
        int i4 = o02Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.m;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            uj.G(0, 0, length, iArr, iArr2);
            this.m = iArr2;
        }
        int i7 = this.p + i4;
        Object[] objArr = this.o;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.o = objArr2;
        }
        o02[] o02VarArr3 = this.k;
        int i9 = this.l;
        this.l = i9 + 1;
        o02VarArr3[i9] = o02Var;
        this.n += o02Var.a;
        this.p += i4;
    }
}
