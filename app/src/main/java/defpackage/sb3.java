package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sb3 extends aq1 implements kb2, ua0, jb2 {
    public final qs1 A;
    public final qs1 B;
    public za2 C;
    public long D;
    public Object t;
    public Object u;
    public Object[] v;
    public PointerInputEventHandler w;
    public w83 x;
    public za2 y = ob3.a;
    public final qs1 z;

    public sb3(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.t = obj;
        this.u = obj2;
        this.v = objArr;
        this.w = pointerInputEventHandler;
        qs1 qs1Var = new qs1(new rb3[16]);
        this.z = qs1Var;
        this.A = qs1Var;
        this.B = new qs1(new rb3[16]);
        this.D = 0L;
    }

    @Override // defpackage.jb2
    public final void F0() {
        r1();
    }

    @Override // defpackage.ua0
    public final float G() {
        return vr.X(this).E.G();
    }

    @Override // defpackage.jb2
    public final void L0() {
        za2 za2Var = this.C;
        if (za2Var == null) {
            return;
        }
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((gb2) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    gb2 gb2Var = (gb2) list.get(i2);
                    long j = gb2Var.a;
                    long j2 = gb2Var.c;
                    long j3 = gb2Var.b;
                    float f = gb2Var.e;
                    boolean z = gb2Var.d;
                    arrayList.add(new gb2(j, j3, j2, false, f, j3, j2, z, z, gb2Var.i, 0L, 1.0f, 0L));
                }
                za2 za2Var2 = new za2(arrayList, null);
                this.y = za2Var2;
                q1(za2Var2, ab2.f);
                q1(za2Var2, ab2.g);
                q1(za2Var2, ab2.h);
                this.C = null;
                return;
            }
        }
    }

    @Override // defpackage.ia0
    public final void c() {
        r1();
    }

    @Override // defpackage.ua0
    public final float h() {
        return vr.X(this).E.h();
    }

    @Override // defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        this.D = j;
        if (ab2Var == ab2.f) {
            this.y = za2Var;
        }
        p40 p40Var = null;
        if (this.x == null) {
            this.x = cl3.t(d1(), null, new l80(this, p40Var, 13), 1);
        }
        q1(za2Var, ab2Var);
        List list = za2Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                za2Var = null;
                break;
            } else if (!w22.n((gb2) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.C = za2Var;
    }

    @Override // defpackage.aq1
    public final void i1() {
        r1();
    }

    public final Object p1(rs0 rs0Var, p40 p40Var) {
        jr jrVar = new jr(1, vr.I(p40Var));
        jrVar.s();
        rb3 rb3Var = new rb3(this, jrVar);
        synchronized (this.A) {
            this.z.b(rb3Var);
            new np2(vr.I(vr.w(rb3Var, rb3Var, rs0Var))).t(dm3.a);
        }
        jrVar.v(new va(5, rb3Var));
        return jrVar.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1(za2 za2Var, ab2 ab2Var) {
        int i;
        int i2;
        jr jrVar;
        jr jrVar2;
        synchronized (this.A) {
            qs1 qs1Var = this.B;
            qs1Var.c(qs1Var.h, this.z);
        }
        try {
            int iOrdinal = ab2Var.ordinal();
            if (iOrdinal == 0) {
                qs1 qs1Var2 = this.B;
                Object[] objArr = qs1Var2.f;
                i = qs1Var2.h;
                for (i2 = 0; i2 < i; i2++) {
                    rb3 rb3Var = (rb3) objArr[i2];
                    if (ab2Var == rb3Var.i && (jrVar = rb3Var.h) != null) {
                        rb3Var.h = null;
                        jrVar.t(za2Var);
                    }
                }
            } else if (iOrdinal == 1) {
                qs1 qs1Var3 = this.B;
                int i3 = qs1Var3.h - 1;
                Object[] objArr2 = qs1Var3.f;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        rb3 rb3Var2 = (rb3) objArr2[i3];
                        if (ab2Var == rb3Var2.i && (jrVar2 = rb3Var2.h) != null) {
                            rb3Var2.h = null;
                            jrVar2.t(za2Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new kz();
                }
                qs1 qs1Var22 = this.B;
                Object[] objArr3 = qs1Var22.f;
                i = qs1Var22.h;
                while (i2 < i) {
                }
            }
            this.B.g();
        } catch (Throwable th) {
            this.B.g();
            throw th;
        }
    }

    public final void r1() {
        w83 w83Var = this.x;
        if (w83Var != null) {
            w83Var.G(new fq1(2, "Pointer input was reset"));
            this.x = null;
        }
    }
}
