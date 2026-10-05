package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ky {
    public static final float[] a;
    public static final float[] b;
    public static final vj3 c;
    public static final vj3 d;
    public static final eo2 e;
    public static final eo2 f;
    public static final eo2 g;
    public static final eo2 h;
    public static final eo2 i;
    public static final eo2 j;
    public static final eo2 k;
    public static final eo2 l;
    public static final eo2 m;
    public static final eo2 n;
    public static final eo2 o;
    public static final eo2 p;
    public static final eo2 q;
    public static final eo2 r;
    public static final t71 s;
    public static final t71 t;
    public static final eo2 u;
    public static final eo2 v;
    public static final eo2 w;
    public static final ny1 x;
    public static final iy[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        vj3 vj3Var = new vj3(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        vj3 vj3Var2 = new vj3(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        vj3 vj3Var3 = new vj3(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = vj3Var3;
        vj3 vj3Var4 = new vj3(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = vj3Var4;
        xr3 xr3Var = rn.m0;
        eo2 eo2Var = new eo2("sRGB IEC61966-2.1", fArr, xr3Var, vj3Var, 0);
        e = eo2Var;
        eo2 eo2Var2 = new eo2("sRGB IEC61966-2.1 (Linear)", fArr, xr3Var, 1.0d, 0.0f, 1.0f, 1);
        f = eo2Var2;
        eo2 eo2Var3 = new eo2("scRGB-nl IEC 61966-2-2:2003", fArr, xr3Var, null, new c(11), new c(12), -0.799f, 2.399f, vj3Var, 2);
        g = eo2Var3;
        eo2 eo2Var4 = new eo2("scRGB IEC 61966-2-2:2003", fArr, xr3Var, 1.0d, -0.5f, 7.499f, 3);
        h = eo2Var4;
        eo2 eo2Var5 = new eo2("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, xr3Var, new vj3(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = eo2Var5;
        eo2 eo2Var6 = new eo2("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, xr3Var, new vj3(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = eo2Var6;
        eo2 eo2Var7 = new eo2("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new xr3(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = eo2Var7;
        eo2 eo2Var8 = new eo2("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, xr3Var, vj3Var, 7);
        l = eo2Var8;
        eo2 eo2Var9 = new eo2("NTSC (1953)", fArr2, rn.j0, new vj3(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = eo2Var9;
        eo2 eo2Var10 = new eo2("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, xr3Var, new vj3(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = eo2Var10;
        eo2 eo2Var11 = new eo2("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, xr3Var, 2.2d, 0.0f, 1.0f, 10);
        o = eo2Var11;
        eo2 eo2Var12 = new eo2("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, rn.k0, new vj3(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = eo2Var12;
        xr3 xr3Var2 = rn.l0;
        eo2 eo2Var13 = new eo2("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, xr3Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = eo2Var13;
        eo2 eo2Var14 = new eo2("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, xr3Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = eo2Var14;
        t71 t71Var = new t71(14, 1, 12884901889L, "Generic XYZ");
        s = t71Var;
        t71 t71Var2 = new t71(15, 0, 12884901890L, "Generic L*a*b*");
        t = t71Var2;
        eo2 eo2Var15 = new eo2("None", fArr, xr3Var, vj3Var2, 16);
        u = eo2Var15;
        eo2 eo2Var16 = new eo2("Hybrid Log Gamma encoding", fArr3, xr3Var, null, new c(13), new c(14), 0.0f, 1.0f, vj3Var3, 17);
        v = eo2Var16;
        eo2 eo2Var17 = new eo2("Perceptual Quantizer encoding", fArr3, xr3Var, null, new c(15), new c(16), 0.0f, 1.0f, vj3Var4, 18);
        w = eo2Var17;
        ny1 ny1Var = new ny1("Oklab", 12884901890L, 19);
        x = ny1Var;
        y = new iy[]{eo2Var, eo2Var2, eo2Var3, eo2Var4, eo2Var5, eo2Var6, eo2Var7, eo2Var8, eo2Var9, eo2Var10, eo2Var11, eo2Var12, eo2Var13, eo2Var14, t71Var, t71Var2, eo2Var15, eo2Var16, eo2Var17, ny1Var};
    }

    public static double a(vj3 vj3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = vj3Var.b;
        double d6 = vj3Var.c;
        double d7 = vj3Var.d;
        double d8 = vj3Var.e;
        double d9 = vj3Var.f;
        double d10 = d5 * d4;
        return (vj3Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(vj3 vj3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / vj3Var.b;
        double d5 = 1.0d / vj3Var.c;
        double d6 = 1.0d / vj3Var.d;
        double d7 = vj3Var.e;
        double d8 = vj3Var.f;
        double d9 = (d2 * d3) / (vj3Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(vj3 vj3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = vj3Var.b;
        double d6 = vj3Var.d;
        double dPow = (Math.pow(d4, d6) * vj3Var.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * vj3Var.f) + vj3Var.e), vj3Var.g) * d3;
    }

    public static double d(vj3 vj3Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -vj3Var.b;
        double d6 = vj3Var.e;
        double d7 = 1.0d / vj3Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-vj3Var.f)) + vj3Var.c), 1.0d / vj3Var.d) * d3;
    }
}
