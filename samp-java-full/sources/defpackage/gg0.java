package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements ub2 {
    public final long f;
    public final ua0 g;
    public final int h;
    public final l8 i;
    public final n5 j;
    public final n5 k;
    public final yr3 l;
    public final yr3 m;
    public final o5 n;
    public final o5 o;
    public final o5 p;
    public final zr3 q;
    public final zr3 r;

    public gg0(long j, ua0 ua0Var, l8 l8Var) {
        int iP0 = ua0Var.p0(48.0f);
        this.f = j;
        this.g = ua0Var;
        this.h = iP0;
        this.i = l8Var;
        int iP02 = ua0Var.p0(Float.intBitsToFloat((int) (j >> 32)));
        tm tmVar = f5.s;
        this.j = new n5(tmVar, tmVar, iP02);
        tm tmVar2 = f5.u;
        this.k = new n5(tmVar2, tmVar2, iP02);
        this.l = new yr3(rn.c);
        this.m = new yr3(rn.d);
        int iP03 = ua0Var.p0(Float.intBitsToFloat((int) (j & 4294967295L)));
        um umVar = f5.p;
        um umVar2 = f5.r;
        this.n = new o5(umVar, umVar2, iP03);
        this.o = new o5(umVar2, umVar, iP03);
        this.p = new o5(f5.q, umVar, iP03);
        this.q = new zr3(umVar, iP0);
        this.r = new zr3(umVar2, iP0);
    }

    @Override // defpackage.ub2
    public final long a(m41 m41Var, long j, bb1 bb1Var, long j2) {
        m41 m41Var2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listL = vr.L(this.j, this.k, ((int) (m41Var.a() >> 32)) < i3 / 2 ? this.l : this.m);
        int size = listL.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                m41Var2 = m41Var;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            mo1 mo1Var = (mo1) listL.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            m41Var2 = m41Var;
            iA = mo1Var.a(m41Var2, j3, i5, bb1Var);
            if (i7 == listL.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listL2 = vr.L(this.n, this.o, this.p, ((int) (m41Var2.a() & 4294967295L)) < i8 / 2 ? this.q : this.r);
        int size2 = listL2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((no1) listL2.get(i9)).a(m41Var2, j3, i10);
            if (i9 == listL2.size() - 1 || (iA2 >= (i2 = this.h) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                break;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.i.f(m41Var2, br.d(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gg0) {
            gg0 gg0Var = (gg0) obj;
            if (this.f == gg0Var.f && s51.n(this.g, gg0Var.g) && this.h == gg0Var.h && s51.n(this.i, gg0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + nc2.b(this.h, (this.g.hashCode() + (Long.hashCode(this.f) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) ld0.a(this.f)) + ", density=" + this.g + ", verticalMargin=" + this.h + ", onPositionCalculated=" + this.i + ')';
    }
}
