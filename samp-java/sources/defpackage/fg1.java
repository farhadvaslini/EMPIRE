package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fg1 implements LineHeightSpan {
    public final float f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final float j;
    public final int k;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;
    public int n = Integer.MIN_VALUE;
    public int o = Integer.MIN_VALUE;
    public int p;
    public int q;

    public fg1(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f = f;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = f2;
        this.k = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            n21.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.g;
        int i7 = this.k;
        boolean z3 = this.i;
        boolean z4 = this.h;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.l == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.j;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.n = i11;
                int i12 = i11 - iCeil;
                this.m = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.l = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.o = i11;
                    this.p = fontMetricsInt.ascent - i12;
                    this.q = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.l = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.n;
                    this.o = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.p = 0;
                    this.q = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.m = i16;
                int i17 = fontMetricsInt.descent;
                this.n = i17;
                this.l = i16;
                this.o = i17;
                this.p = 0;
                this.q = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.l : this.m;
        fontMetricsInt.descent = z2 ? this.o : this.n;
    }
}
