package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pk0 implements ub2 {
    public final int f;
    public final os1 g;
    public final l8 h;
    public final n5 i;
    public final n5 j;
    public final yr3 k;
    public final yr3 l;
    public final o5 m;
    public final o5 n;
    public final zr3 o;
    public final zr3 p;

    public pk0(ua0 ua0Var, int i, os1 os1Var, l8 l8Var) {
        int iP0 = ua0Var.p0(48.0f);
        this.f = i;
        this.g = os1Var;
        this.h = l8Var;
        tm tmVar = f5.s;
        this.i = new n5(tmVar, tmVar, 0);
        tm tmVar2 = f5.u;
        this.j = new n5(tmVar2, tmVar2, 0);
        this.k = new yr3(rn.c);
        this.l = new yr3(rn.d);
        um umVar = f5.p;
        um umVar2 = f5.r;
        this.m = new o5(umVar, umVar2, 0);
        this.n = new o5(umVar2, umVar, 0);
        this.o = new zr3(umVar, iP0);
        this.p = new zr3(umVar2, iP0);
    }

    @Override // defpackage.ub2
    public final long a(m41 m41Var, long j, bb1 bb1Var, long j2) {
        m41 m41Var2;
        char c;
        long j3;
        int iA;
        os1 os1Var = this.g;
        if (os1Var != null) {
            os1Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.f)) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listL = vr.L(this.i, this.j, ((int) (m41Var.a() >> 32)) < i / 2 ? this.k : this.l);
        int size = listL.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                m41Var2 = m41Var;
                c = c2;
                j3 = j4;
                iA = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            m41Var2 = m41Var;
            List list = listL;
            iA = ((mo1) listL.get(i3)).a(m41Var2, j5, i4, bb1Var);
            if (i6 == list.size() - 1 || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listL = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listL2 = vr.L(this.m, this.n, ((int) (m41Var2.a() & j3)) < i7 / 2 ? this.o : this.p);
        int size2 = listL2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iA2 = ((no1) listL2.get(i8)).a(m41Var2, j5, i9);
            if (i8 == listL2.size() - 1 || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long j6 = (((long) iA) << c) | (((long) i2) & j3);
        this.h.f(m41Var2, br.d(j6, j2));
        return j6;
    }
}
