package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class br1 {
    public final qk a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public br1(qk qkVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iH;
        int i5;
        this.a = qkVar;
        this.b = i;
        if (m30.k(j) != 0 || m30.j(j) != 0) {
            n21.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) qkVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            u32 u32Var = (u32) arrayList2.get(i6);
            ca caVar = u32Var.a;
            int i8 = m30.i(j);
            if (m30.d(j)) {
                i4 = i6;
                iH = m30.h(j) - ((int) Math.ceil(f));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                i4 = i6;
                iH = m30.h(j);
            }
            i3 = 0;
            y9 y9Var = new y9(caVar, this.b - i7, i2, n30.b(0, i8, 0, iH, 5));
            float f2 = y9Var.f + f;
            ng3 ng3Var = y9Var.d;
            int i9 = i7 + ng3Var.g;
            arrayList.add(new t32(y9Var, u32Var.b, u32Var.c, i7, i9, f, f2));
            if (!ng3Var.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != vr.C((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = f2;
            }
            z = true;
            i7 = i9;
            f = f2;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = m30.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            t32 t32Var = (t32) arrayList.get(i10);
            List list = t32Var.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                jk2 jk2Var = (jk2) list.get(i11);
                arrayList4.add(jk2Var != null ? t32Var.a(jk2Var) : null);
            }
            vx.f0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = qx.D0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(br1 br1Var, pr prVar, long j, r13 r13Var, ne3 ne3Var, rf0 rf0Var) {
        prVar.l();
        ArrayList arrayList = br1Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t32 t32Var = (t32) arrayList.get(i);
            t32Var.a.e(prVar, j, r13Var, ne3Var, rf0Var);
            prVar.g(0.0f, t32Var.a.f);
        }
        prVar.i();
    }

    public static void j(br1 br1Var, pr prVar, dp dpVar, float f, r13 r13Var, ne3 ne3Var, rf0 rf0Var) {
        prVar.l();
        ArrayList arrayList = br1Var.h;
        if (arrayList.size() <= 1 || (dpVar instanceof w73)) {
            n92.k(br1Var, prVar, dpVar, f, r13Var, ne3Var, rf0Var);
        } else {
            if (!(dpVar instanceof o13)) {
                c.k();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                y9 y9Var = ((t32) arrayList.get(i)).a;
                f2 += y9Var.f;
                fMax = Math.max(fMax, y9Var.d());
            }
            Shader shaderB = ((o13) dpVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                y9 y9Var2 = ((t32) arrayList.get(i2)).a;
                y9Var2.f(prVar, new ep(shaderB), f, r13Var, ne3Var, rf0Var);
                prVar.g(0.0f, y9Var2.f);
                matrix.setTranslate(0.0f, -y9Var2.f);
                shaderB.setLocalMatrix(matrix);
            }
        }
        prVar.i();
    }

    public final void a(long j, float[] fArr) {
        k(yg3.f(j));
        l(yg3.e(j));
        ok2 ok2Var = new ok2();
        ok2Var.f = 0;
        lr.D(this.h, j, new in(j, fArr, ok2Var, new nk2()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        t32 t32Var = (t32) arrayList.get(lr.B(i, arrayList));
        y9 y9Var = t32Var.a;
        return y9Var.d.e(i - t32Var.d) + t32Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        m(i);
        ArrayList arrayList = this.h;
        t32 t32Var = (t32) arrayList.get(lr.B(i, arrayList));
        y9 y9Var = t32Var.a;
        int i2 = i - t32Var.d;
        ng3 ng3Var = y9Var.d;
        if (z) {
            Layout layout = ng3Var.f;
            ThreadLocal threadLocal = rg3.a;
            if (layout.getEllipsisCount(i2) <= 0 || ng3Var.b != TextUtils.TruncateAt.END) {
                qk qkVarC = ng3Var.c();
                Layout layout2 = (Layout) qkVarC.a;
                iF = qkVarC.m(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = ng3Var.f(i2);
        }
        return iF + t32Var.b;
    }

    public final int d(int i) {
        int length = ((af) this.a.a).g.length();
        ArrayList arrayList = this.h;
        t32 t32Var = (t32) arrayList.get(i >= length ? vr.C(arrayList) : i < 0 ? 0 : lr.A(i, arrayList));
        return t32Var.a.d.g(t32Var.d(i)) + t32Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        t32 t32Var = (t32) arrayList.get(lr.C(arrayList, f));
        int i = t32Var.c - t32Var.b;
        int i2 = t32Var.d;
        if (i == 0) {
            return i2;
        }
        y9 y9Var = t32Var.a;
        float f2 = f - t32Var.f;
        ng3 ng3Var = y9Var.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = ng3Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = ng3Var.f.getLineForVertical(i3 - ng3Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        t32 t32Var = (t32) arrayList.get(lr.B(i, arrayList));
        y9 y9Var = t32Var.a;
        return y9Var.d.i(i - t32Var.d) + t32Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        t32 t32Var = (t32) arrayList.get(lr.C(arrayList, fIntBitsToFloat));
        int i2 = t32Var.c;
        int i3 = t32Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        y9 y9Var = t32Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - t32Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        ng3 ng3Var = y9Var.d;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = ng3Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - ng3Var.h);
        if (lineForVertical >= ng3Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (ng3Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(jk2 jk2Var, int i, qn1 qn1Var) {
        long jB;
        long j;
        float f = jk2Var.b;
        ArrayList arrayList = this.h;
        int iC = lr.C(arrayList, f);
        float f2 = ((t32) arrayList.get(iC)).g;
        float f3 = jk2Var.d;
        if (f2 >= f3 || iC == vr.C(arrayList)) {
            t32 t32Var = (t32) arrayList.get(iC);
            return t32Var.b(t32Var.a.c(t32Var.c(jk2Var), i, qn1Var), true);
        }
        int iC2 = lr.C(arrayList, f3);
        long jB2 = yg3.b;
        while (true) {
            jB = yg3.b;
            if (!yg3.b(jB2, jB) || iC > iC2) {
                break;
            }
            t32 t32Var2 = (t32) arrayList.get(iC);
            jB2 = t32Var2.b(t32Var2.a.c(t32Var2.c(jk2Var), i, qn1Var), true);
            iC++;
        }
        if (yg3.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = yg3.b;
            if (!yg3.b(jB, j) || iC > iC2) {
                break;
            }
            t32 t32Var3 = (t32) arrayList.get(iC2);
            jB = t32Var3.b(t32Var3.a.c(t32Var3.c(jk2Var), i, qn1Var), true);
            iC2--;
        }
        return yg3.b(jB, j) ? jB2 : d32.f((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i) {
        af afVar = (af) this.a.a;
        if (i < 0 || i >= afVar.g.length()) {
            n21.a("offset(" + i + ") is out of bounds [0, " + afVar.g.length() + ")");
        }
    }

    public final void l(int i) {
        af afVar = (af) this.a.a;
        if (i < 0 || i > afVar.g.length()) {
            n21.a("offset(" + i + ") is out of bounds [0, " + afVar.g.length() + "]");
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        n21.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
