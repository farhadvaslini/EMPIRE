package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class da {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public da(Path path) {
        this.a = path;
    }

    public static void a(da daVar, da daVar2) {
        Path path = daVar.a;
        if (!(daVar2 instanceof da)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(daVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(da daVar, ro2 ro2Var) {
        if (daVar.b == null) {
            daVar.b = new RectF();
        }
        RectF rectF = daVar.b;
        rectF.getClass();
        float f = ro2Var.a;
        long j = ro2Var.h;
        long j2 = ro2Var.g;
        long j3 = ro2Var.f;
        long j4 = ro2Var.e;
        rectF.set(f, ro2Var.b, ro2Var.c, ro2Var.d);
        if (daVar.c == null) {
            daVar.c = new float[8];
        }
        float[] fArr = daVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = daVar.a;
        RectF rectF2 = daVar.b;
        rectF2.getClass();
        float[] fArr2 = daVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final jk2 d() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new jk2(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(da daVar, da daVar2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(daVar instanceof da)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = daVar.a;
        if (daVar2 instanceof da) {
            return this.a.op(path, daVar2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void g() {
        this.a.reset();
    }

    public final void h() {
        this.a.rewind();
    }

    public final void i(int i) {
        this.a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void j(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
