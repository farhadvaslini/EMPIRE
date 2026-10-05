package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 implements Iterator, t61 {
    public int f = -1;
    public int g;
    public int h;
    public l41 i;
    public int j;
    public final /* synthetic */ sa0 k;

    public ra0(sa0 sa0Var) {
        this.k = sa0Var;
        int iH = y02.h(0, 0, sa0Var.a.length());
        this.g = iH;
        this.h = iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        sa0 sa0Var = this.k;
        CharSequence charSequence = sa0Var.a;
        int i = this.h;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        int i2 = sa0Var.b;
        if (i2 > 0) {
            int i3 = this.j + 1;
            this.j = i3;
            if (i3 < i2) {
                if (i > charSequence.length()) {
                    int i4 = this.g;
                    charSequence.getClass();
                    this.i = new l41(i4, charSequence.length() - 1, 1);
                    this.h = -1;
                } else {
                    r32 r32Var = (r32) sa0Var.c.f(charSequence, Integer.valueOf(this.h));
                    if (r32Var == null) {
                        int i5 = this.g;
                        charSequence.getClass();
                        this.i = new l41(i5, charSequence.length() - 1, 1);
                        this.h = -1;
                    } else {
                        int iIntValue = ((Number) r32Var.f).intValue();
                        int iIntValue2 = ((Number) r32Var.g).intValue();
                        this.i = y02.S(this.g, iIntValue);
                        int i6 = iIntValue + iIntValue2;
                        this.g = i6;
                        this.h = i6 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        this.f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        return this.f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 0) {
            c.n();
            return null;
        }
        l41 l41Var = this.i;
        l41Var.getClass();
        this.i = null;
        this.f = -1;
        return l41Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
