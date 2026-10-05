package defpackage;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public /* synthetic */ cr(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static cr a(int i) {
        lr3 lr3Var = lr3.k;
        float fT = n92.t(Color.red(i));
        float fT2 = n92.t(Color.green(i));
        float fT3 = n92.t(Color.blue(i));
        float[][] fArr = n92.j;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fT3) + (fArr2[1] * fT2) + (fArr2[0] * fT);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fT3) + (fArr3[1] * fT2) + (fArr3[0] * fT);
        float[] fArr4 = fArr[2];
        float f3 = (fT3 * fArr4[2]) + (fT2 * fArr4[1]) + (fT * fArr4[0]);
        float[][] fArr5 = n92.g;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = lr3Var.g;
        float f7 = lr3Var.i;
        float f8 = lr3Var.d;
        float f9 = lr3Var.a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = lr3Var.h;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * lr3Var.b) / f9, lr3Var.j * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lr3Var.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lr3Var.e) * lr3Var.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new cr(fAtan2, fPow5, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static cr b(float f, float f2, float f3) {
        lr3 lr3Var = lr3.k;
        float f4 = lr3Var.d;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = lr3Var.a + 4.0f;
        float f6 = lr3Var.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * lr3Var.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new cr(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    public int c(as0 as0Var) {
        float f = this.b;
        float fSqrt = (f == 0.0f || this.c == 0.0f) ? 0.0f : f / ((float) Math.sqrt(r3 / 100.0f));
        float f2 = as0Var.a;
        float f3 = as0Var.h;
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, f2), 0.7300000190734863d)), 1.1111111640930176d));
        float f4 = (this.a * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f4)) + 3.8f) * 0.25f;
        float fPow2 = as0Var.b * ((float) Math.pow(r3 / 100.0f, (1.0f / as0Var.e) / as0Var.j));
        float f5 = fCos * 3846.1538f * as0Var.f * as0Var.d;
        float f6 = fPow2 / as0Var.c;
        double d = f4;
        float fSin = (float) Math.sin(d);
        float fCos2 = (float) Math.cos(d);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = 100.0f / f3;
        float fSignum = Math.signum(f11) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f11) * 27.13f) / (400.0f - Math.abs(f11))), 2.3809523582458496d));
        float fSignum2 = Math.signum(f12) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f12) * 27.13f) / (400.0f - Math.abs(f12))), 2.3809523582458496d));
        float fSignum3 = Math.signum(((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(r6) * 27.13f) / (400.0f - Math.abs(r6))), 2.3809523582458496d));
        float[] fArr = as0Var.g;
        float f14 = fSignum / fArr[0];
        float f15 = fSignum2 / fArr[1];
        float f16 = fSignum3 / fArr[2];
        float[][] fArr2 = cl3.p;
        float[] fArr3 = fArr2[0];
        float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        return ny.a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(defpackage.lr3 r20) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr.d(lr3):int");
    }
}
