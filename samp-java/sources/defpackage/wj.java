package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wj {
    public final float a;
    public final float b;

    public wj(float f, ua0 ua0Var) {
        this.a = f;
        float fH = ua0Var.h();
        float f2 = tm0.a;
        this.b = fH * 386.0878f * 160.0f * 0.84f;
    }

    public sm0 a(float f) {
        double dB = b(f);
        double d = tm0.a;
        double d2 = d - 1.0d;
        return new sm0(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = b9.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }

    public wj(float f, float f2, float f3, float f4) {
        this.a = f3;
        this.b = f4;
    }
}
