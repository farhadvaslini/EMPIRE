package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n6 implements pr {
    public Canvas a = o6.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.pr
    public final void a(g9 g9Var, w9 w9Var) {
        this.a.drawBitmap(s51.o(g9Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) w9Var.b);
    }

    @Override // defpackage.pr
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.pr
    public final void c(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.pr
    public final void d(float f, long j, w9 w9Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) w9Var.b);
    }

    @Override // defpackage.pr
    public final void e(g9 g9Var, long j, long j2, long j3, w9 w9Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapO = s51.o(g9Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapO, rect, rect2, (Paint) w9Var.b);
    }

    @Override // defpackage.pr
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.pr
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.pr
    public final void h(da daVar, w9 w9Var) {
        Canvas canvas = this.a;
        if (!(daVar instanceof da)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(daVar.a, cl3.n(w9Var));
    }

    @Override // defpackage.pr
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.pr
    public final void j(float f, float f2, float f3, float f4, float f5, float f6, w9 w9Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, cl3.n(w9Var));
    }

    @Override // defpackage.pr
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.pr
    public final void m(long j, long j2, w9 w9Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) w9Var.b);
    }

    @Override // defpackage.pr
    public final void n() {
        vp.C(this.a, false);
    }

    @Override // defpackage.pr
    public final void o(jk2 jk2Var, w9 w9Var) {
        this.a.saveLayer(jk2Var.a, jk2Var.b, jk2Var.c, jk2Var.d, (Paint) w9Var.b, 31);
    }

    @Override // defpackage.pr
    public final void p(float f, float f2, float f3, float f4, w9 w9Var) {
        this.a.drawRect(f, f2, f3, f4, cl3.n(w9Var));
    }

    @Override // defpackage.pr
    public final void q(float[] fArr) {
        if (pq.G(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        vm1.O(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.pr
    public final void r() {
        vp.C(this.a, true);
    }

    @Override // defpackage.pr
    public final void s(da daVar) {
        Canvas canvas = this.a;
        if (!(daVar instanceof da)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(daVar.a, Region.Op.INTERSECT);
    }

    @Override // defpackage.pr
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, w9 w9Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) w9Var.b);
    }
}
