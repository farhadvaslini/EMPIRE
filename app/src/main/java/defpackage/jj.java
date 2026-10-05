package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jj implements ij, kj {
    public final float f;
    public final boolean g;
    public final c h;
    public final float i;

    public jj(float f, boolean z, c cVar) {
        this.f = f;
        this.g = z;
        this.h = cVar;
        this.i = f;
    }

    @Override // defpackage.ij, defpackage.kj
    public final float a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        return jd0.b(this.f, jjVar.f) && this.g == jjVar.g && s51.n(this.h, jjVar.h);
    }

    @Override // defpackage.ij
    public final void f(ua0 ua0Var, int i, int[] iArr, bb1 bb1Var, int[] iArr2) {
        int i2;
        int iRound;
        if (iArr.length == 0) {
            return;
        }
        int iP0 = ua0Var.p0(this.f);
        boolean z = this.g && bb1Var == bb1.g;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iP0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iP0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        c cVar = this.h;
        if (cVar == null || i2 <= 0) {
            return;
        }
        int i11 = cVar.f;
        bb1 bb1Var2 = bb1.f;
        switch (i11) {
            case 1:
                iRound = Math.round((1.0f + (bb1Var != bb1Var2 ? 1.0f : -1.0f)) * (i2 / 2.0f));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                iRound = Math.round((1.0f + (bb1Var != bb1Var2 ? 0.0f * (-1.0f) : 0.0f)) * ((i2 + 0) / 2.0f));
                break;
            default:
                iRound = Math.round((1.0f + 0.0f) * ((i2 + 0) / 2.0f));
                break;
        }
        if (z) {
            iRound -= i2;
        }
        if (iRound != 0) {
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + iRound;
            }
        }
    }

    @Override // defpackage.kj
    public final void g(ua0 ua0Var, int i, int[] iArr, int[] iArr2) {
        f(ua0Var, i, iArr, bb1.f, iArr2);
    }

    public final int hashCode() {
        int iB = by1.b(Float.hashCode(this.f) * 31, 31, this.g);
        c cVar = this.h;
        return iB + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return (this.g ? "" : "Absolute") + "Arrangement#spacedAligned(" + jd0.c(this.f) + ", " + this.h + ")";
    }
}
