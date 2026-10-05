package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d20 {
    public final nv0 a;
    public gs b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final q41 d = new q41();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public d20(nv0 nv0Var, gs gsVar) {
        this.a = nv0Var;
        this.b = gsVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            q02 q02Var = this.b.k;
            q02Var.S(m02.c);
            q02Var.m[q02Var.n - q02Var.k[q02Var.l - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        gs gsVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        gsVar.getClass();
        if (size != 0) {
            q02 q02Var2 = gsVar.k;
            q02Var2.S(pz1.c);
            uq.I(q02Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                q02 q02Var = this.b.k;
                q02Var.S(e02.c);
                int i3 = q02Var.n - q02Var.k[q02Var.l - 1].a;
                int[] iArr = q02Var.m;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                q02 q02Var2 = this.b.k;
                q02Var2.S(a02.c);
                int i6 = q02Var2.n - q02Var2.k[q02Var2.l - 1].a;
                int[] iArr2 = q02Var2.m;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        i53 i53Var = this.a.G;
        int i = z ? i53Var.i : i53Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            e20.a("Tried to seek backward");
        }
        if (i2 > 0) {
            q02 q02Var = this.b.k;
            q02Var.S(iz1.c);
            q02Var.m[q02Var.n - q02Var.k[q02Var.l - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                e20.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
