package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a51 {
    public final x50 a;
    public final rs0 b;
    public final ed c;
    public final ed d;
    public long e;
    public final db f;
    public final bq1 g;
    public final bq1 h;

    public a51(x50 x50Var, rs0 rs0Var) {
        x50Var.getClass();
        this.a = x50Var;
        this.b = rs0Var;
        this.c = gv3.a(0.0f, 0.001f);
        this.d = new ed(new gy1(0L), rn.k1, new gy1((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 8);
        this.e = 0L;
        this.f = Build.VERSION.SDK_INT >= 33 ? p1.a("\n            uniform float2 size;\n            layout(color) uniform half4 color;\n            uniform float radius;\n            uniform float2 position;\n\n            half4 main(float2 coord) {\n                float dist = distance(coord, position);\n                float intensity = smoothstep(radius, radius * 0.5, dist);\n                return color * intensity;\n            }\n            ") : null;
        x41 x41Var = new x41(this, 0);
        yp1 yp1Var = yp1.a;
        this.g = w7.M(yp1Var, x41Var);
        this.h = ob3.a(yp1Var, x50Var, new v8(3, this));
    }
}
