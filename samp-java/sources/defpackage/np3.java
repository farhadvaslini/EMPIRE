package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class np3 {
    public final boolean a;
    public final mp3 b;
    public final int c;
    public final d70[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public np3(boolean z, mp3 mp3Var) {
        int i;
        this.a = z;
        this.b = mp3Var;
        if (z && mp3Var.equals(mp3.f)) {
            c.q("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = mp3Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                c.k();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new d70[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        d70[] d70VarArr = this.d;
        d70 d70Var = d70VarArr[i];
        if (d70Var != null) {
            d70Var.a = j;
            d70Var.b = f;
        } else {
            d70 d70Var2 = new d70();
            d70Var2.a = j;
            d70Var2.b = f;
            d70VarArr[i] = d70Var2;
        }
    }

    public final float b() {
        boolean z;
        mp3 mp3Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        d70[] d70VarArr = this.d;
        d70 d70Var = d70VarArr[i3];
        if (d70Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        d70 d70Var2 = d70Var;
        do {
            d70 d70Var3 = d70VarArr[i3];
            z = this.a;
            mp3Var = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (d70Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = d70Var.a;
                i = i4;
                f = 0.0f;
                long j2 = d70Var3.a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - d70Var2.a);
                d70Var2 = (mp3Var == mp3.f || z) ? d70Var3 : d70Var;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = d70Var3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = mp3Var.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                n32.v(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                c.k();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            m21.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ np3() {
        this(false, mp3.f);
    }

    public np3(boolean z) {
        this(z, mp3.g);
    }
}
