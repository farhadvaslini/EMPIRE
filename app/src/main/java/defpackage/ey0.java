package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 implements gy0 {
    public final long b = wx.b(0.5f, wx.c);
    public final int c = 12;
    public final float d = 45.0f;
    public final float e = 1.0f;

    @Override // defpackage.gy0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.gy0
    public final db b(vb1 vb1Var, c23 c23Var, jp2 jp2Var) {
        rr rrVar = vb1Var.f;
        jp2Var.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        db dbVarC = jp2Var.c("Default", "\nuniform float2 size;\nuniform float4 cornerRadii;\nlayout(color) uniform half4 color;\nuniform float angle;\nuniform float falloff;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = coord - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n    \n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = gradSdRoundedRect(centeredCoord, halfSize, gradRadius);\n    float2 normal = float2(cos(angle), sin(angle));\n    float d = dot(grad, normal);\n    float intensity = pow(abs(d), falloff);\n    return color * intensity;\n}");
        dbVarC.a.setFloatUniform("size", Float.intBitsToFloat((int) (rrVar.a() >> 32)), Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)));
        dbVarC.a.setFloatUniform("cornerRadii", br.m(vb1Var, c23Var));
        dbVarC.a.setColorUniform("color", vp.T(wx.b(1.0f, this.b)));
        dbVarC.a.setFloatUniform("angle", this.d * 0.017453292f);
        dbVarC.a.setFloatUniform("falloff", this.e);
        return dbVarC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey0)) {
            return false;
        }
        ey0 ey0Var = (ey0) obj;
        return wx.c(this.b, ey0Var.b) && this.c == ey0Var.c && Float.compare(this.d, ey0Var.d) == 0 && Float.compare(this.e, ey0Var.e) == 0;
    }

    public final int hashCode() {
        int i = wx.h;
        return Float.hashCode(this.e) + nc2.a(nc2.b(this.c, Long.hashCode(this.b) * 31, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Default(color=", wx.i(this.b), ", blendMode=", w7.b0(this.c), ", angle=");
        sbN.append(this.d);
        sbN.append(", falloff=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // defpackage.gy0
    public final int x() {
        return this.c;
    }
}
