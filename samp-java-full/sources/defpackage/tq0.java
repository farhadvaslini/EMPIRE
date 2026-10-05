package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq0 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile l83 b = new l83(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(115, new uq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new uq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new uq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new uq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(200, new uq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        o21.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static sq0 a(float f) {
        float fC;
        sq0 uq0Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        sq0 sq0Var = (sq0) b.b(i);
        if (sq0Var != null) {
            return sq0Var;
        }
        l83 l83Var = b;
        if (l83Var.f) {
            r51.j(l83Var);
        }
        int iD = w7.D(l83Var.i, i, l83Var.g);
        if (iD >= 0) {
            return (sq0) b.f(iD);
        }
        int i2 = -(iD + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            uq0 uq0Var2 = new uq0(new float[]{1.0f}, new float[]{f});
            b(f, uq0Var2);
            return uq0Var2;
        }
        if (i3 < 0) {
            uq0Var = new uq0(fArr, fArr);
            fC = 1.0f;
        } else {
            fC = b.c(i3) / 100.0f;
            uq0Var = (sq0) b.f(i3);
        }
        float fC2 = b.c(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fC == fC2 ? 0.0f : (f - fC) / (fC2 - fC))) * 1.0f) + 0.0f;
        sq0 sq0Var2 = (sq0) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB = uq0Var.b(f2);
            fArr2[i4] = ((sq0Var2.b(f2) - fB) * fMax) + fB;
        }
        uq0 uq0Var3 = new uq0(fArr, fArr2);
        b(f, uq0Var3);
        return uq0Var3;
    }

    public static void b(float f, uq0 uq0Var) {
        synchronized (c) {
            l83 l83VarClone = b.clone();
            l83VarClone.d((int) (f * 100.0f), uq0Var);
            b = l83VarClone;
        }
    }
}
