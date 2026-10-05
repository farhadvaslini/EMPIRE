package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c8 implements a90, View.OnAttachStateChangeListener {
    public final h7 f;
    public final c7 g;
    public a31 h;
    public final ArrayList i = new ArrayList();
    public final long j = 100;
    public z7 k = z7.f;
    public boolean l = true;
    public final np m = lr.a(1, 6, null);
    public or1 n;
    public long o;
    public final or1 p;
    public wu2 q;
    public boolean r;
    public final v s;

    public c8(h7 h7Var, c7 c7Var) {
        this.f = h7Var;
        this.g = c7Var;
        new Handler(Looper.getMainLooper());
        or1 or1Var = h41.a;
        or1Var.getClass();
        this.n = or1Var;
        this.p = new or1();
        this.q = new wu2(h7Var.getSemanticsOwner().a(), or1Var);
        this.s = new v(3, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q40 q40Var) {
        b8 b8Var;
        kp kpVar;
        if (q40Var instanceof b8) {
            b8Var = (b8) q40Var;
            int i = b8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                b8Var.l = i - Integer.MIN_VALUE;
            } else {
                b8Var = new b8(this, q40Var);
            }
        }
        Object objB = b8Var.j;
        int i2 = b8Var.l;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(objB);
            np npVar = this.m;
            npVar.getClass();
            kpVar = new kp(npVar);
        } else {
            if (i2 == 1) {
                kpVar = b8Var.i;
                y02.Q(objB);
                if (((Boolean) objB).booleanValue()) {
                    return dm3.a;
                }
                kpVar.c();
                if (g()) {
                    h();
                }
                Handler handler = this.f.getHandler();
                if (!this.r && handler != null) {
                    this.r = true;
                    handler.post(this.s);
                }
                b8Var.i = kpVar;
                b8Var.l = 2;
                if (ur.A(this.j, b8Var) != y50Var) {
                }
                return y50Var;
            }
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kpVar = b8Var.i;
            y02.Q(objB);
        }
        b8Var.i = kpVar;
        b8Var.l = 1;
        objB = kpVar.b(b8Var);
        if (objB != y50Var) {
            if (((Boolean) objB).booleanValue()) {
            }
        }
        return y50Var;
    }

    @Override // defpackage.a90
    public final void b(of1 of1Var) {
        m(this.f.getSemanticsOwner().a());
        h();
        this.h = null;
    }

    @Override // defpackage.a90
    public final void c(of1 of1Var) {
        this.h = (a31) this.g.a();
        l(-1, this.f.getSemanticsOwner().a());
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(g41 g41Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        g41 g41Var2 = g41Var;
        int[] iArr3 = g41Var2.b;
        long[] jArr = g41Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        wu2 wu2Var = (wu2) this.p.b(i7);
                        xu2 xu2Var = (xu2) g41Var2.b(i7);
                        vu2 vu2Var = xu2Var != null ? xu2Var.a : null;
                        if (vu2Var == null) {
                            throw nc2.d("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = vu2Var.f;
                        is1 is1Var = vu2Var.d.f;
                        if (wu2Var == null) {
                            Object[] objArr = is1Var.b;
                            long[] jArr2 = is1Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                cv2 cv2Var = (cv2) objArr[(i10 << 3) + i12];
                                                cv2 cv2Var2 = zu2.C;
                                                if (s51.n(cv2Var, cv2Var2)) {
                                                    Object objG = is1Var.g(cv2Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    k(i8, String.valueOf(list != null ? (af) qx.r0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = is1Var.b;
                            long[] jArr3 = is1Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                cv2 cv2Var3 = (cv2) objArr2[(i13 << 3) + i15];
                                                cv2 cv2Var4 = zu2.C;
                                                if (s51.n(cv2Var3, cv2Var4)) {
                                                    Object objG2 = wu2Var.a.f.g(cv2Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    af afVar = list2 != null ? (af) qx.r0(list2) : null;
                                                    Object objG3 = is1Var.g(cv2Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    af afVar2 = list3 != null ? (af) qx.r0(list3) : null;
                                                    if (!s51.n(afVar, afVar2)) {
                                                        k(i8, String.valueOf(afVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 == length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    g41Var2 = g41Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            g41Var2 = g41Var;
            iArr3 = iArr;
        }
    }

    public final g41 e() {
        if (this.l) {
            this.l = false;
            this.n = w7.N(this.f.getSemanticsOwner(), new u0(7));
            this.o = System.currentTimeMillis();
        }
        return this.n;
    }

    public final boolean g() {
        return this.h != null;
    }

    public final void h() {
        a31 a31Var = this.h;
        if (a31Var == null) {
            return;
        }
        Object obj = a31Var.h;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r30 r30Var = (r30) arrayList.get(i);
            int iOrdinal = r30Var.c.ordinal();
            if (iOrdinal == 0) {
                op3 op3Var = r30Var.d;
                if (op3Var != null) {
                    ViewStructure viewStructure = (ViewStructure) op3Var.a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        gf.f(m6.e(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    c.k();
                    return;
                }
                AutofillId autofillIdY = a31Var.y(r30Var.a);
                if (autofillIdY != null && Build.VERSION.SDK_INT >= 29) {
                    gf.g(m6.e(obj), autofillIdY);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            gf.i(m6.e(obj), ((View) a31Var.g).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(vu2 vu2Var, wu2 wu2Var) {
        int i = 0;
        y7 y7Var = new y7(i, wu2Var, this);
        vu2Var.getClass();
        List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listI.get(i3);
            if (e().a(((vu2) obj).f)) {
                y7Var.f(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listI2 = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        while (i < size2) {
            vu2 vu2Var2 = (vu2) listI2.get(i);
            g41 g41VarE = e();
            int i4 = vu2Var2.f;
            if (g41VarE.a(i4)) {
                or1 or1Var = this.p;
                if (or1Var.a(i4)) {
                    Object objB = or1Var.b(i4);
                    if (objB == null) {
                        throw nc2.d("node not present in pruned tree before this change");
                    }
                    j(vu2Var2, (wu2) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void k(int i, String str) {
        a31 a31Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (a31Var = this.h) != null) {
            AutofillId autofillIdY = a31Var.y(i);
            if (autofillIdY == null) {
                throw nc2.d("Invalid content capture ID");
            }
            if (i2 >= 29) {
                gf.h(m6.e(a31Var.h), autofillIdY, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, vu2 vu2Var) {
        ns0 ns0Var;
        int i2;
        jk2 jk2VarA;
        op3 op3Var;
        String strN;
        ns0 ns0Var2;
        if (g()) {
            is1 is1Var = vu2Var.d.f;
            Object objG = is1Var.g(zu2.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.k == z7.f && s51.n(bool, Boolean.TRUE)) {
                Object objG2 = is1Var.g(pu2.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                y0 y0Var = (y0) objG2;
                if (y0Var != null && (ns0Var2 = (ns0) y0Var.b) != null) {
                }
            } else if (this.k == z7.g && s51.n(bool, Boolean.FALSE)) {
                Object objG3 = is1Var.g(pu2.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                y0 y0Var2 = (y0) objG3;
                if (y0Var2 != null && (ns0Var = (ns0) y0Var2.b) != null) {
                }
            }
            int i3 = vu2Var.f;
            a31 a31Var = this.h;
            if (a31Var != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f.getAutofillId();
                vu2 vu2VarL = vu2Var.l();
                int i4 = vu2Var.f;
                if (vu2VarL == null || (autofillId = a31Var.y(vu2VarL.f)) != null) {
                    op3 op3Var2 = i2 >= 29 ? new op3(gf.e(m6.e(a31Var.h), autofillId, i4)) : null;
                    if (op3Var2 == null) {
                        op3Var = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) op3Var2.a;
                        qu2 qu2Var = vu2Var.d;
                        cv2 cv2Var = zu2.N;
                        is1 is1Var2 = qu2Var.f;
                        if (!is1Var2.c(cv2Var)) {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.o);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objG4 = is1Var2.g(zu2.A);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            String str = (String) objG4;
                            if (str != null) {
                                viewStructure.setId(i4, null, null, str);
                            }
                            Object objG5 = is1Var2.g(zu2.n);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (((Boolean) objG5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objG6 = is1Var2.g(zu2.C);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            List list = (List) objG6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(yi1.a(list, "\n", null, 62));
                            }
                            Object objG7 = is1Var2.g(zu2.G);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            af afVar = (af) objG7;
                            if (afVar != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(afVar);
                            }
                            Object objG8 = is1Var2.g(zu2.a);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            List list2 = (List) objG8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(yi1.a(list2, "\n", null, 62));
                            }
                            Object objG9 = is1Var2.g(zu2.z);
                            if (objG9 == null) {
                                objG9 = null;
                            }
                            no2 no2Var = (no2) objG9;
                            if (no2Var != null && (strN = t22.N(no2Var.a)) != null) {
                                viewStructure.setClassName(strN);
                            }
                            pg3 pg3VarD = t22.D(qu2Var);
                            if (pg3VarD != null) {
                                og3 og3Var = pg3VarD.a;
                                gh3 gh3Var = og3Var.b;
                                ua0 ua0Var = og3Var.g;
                                viewStructure.setTextStyle(ua0Var.G() * ua0Var.h() * jh3.c(gh3Var.a.b), 0, 0, 0);
                            }
                            ex1 ex1VarD = vu2Var.d();
                            if (ex1VarD == null) {
                                jk2VarA = jk2.e;
                                float f = jk2VarA.a;
                                float f2 = jk2VarA.b;
                                viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (jk2VarA.c - f), (int) (jk2VarA.d - f2));
                                op3Var = op3Var2;
                            } else {
                                ex1 ex1Var = ex1VarD.w1().s ? ex1VarD : null;
                                if (ex1Var != null) {
                                    jk2VarA = vu2Var.a(ex1Var);
                                }
                                float f3 = jk2VarA.a;
                                float f22 = jk2VarA.b;
                                viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (jk2VarA.c - f3), (int) (jk2VarA.d - f22));
                                op3Var = op3Var2;
                            }
                        }
                    }
                }
            }
            if (op3Var != null) {
                this.i.add(new r30(i3, this.o, s30.f, op3Var));
            }
            List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listI.get(i6);
                if (e().a(((vu2) obj).f)) {
                    l(i5, (vu2) obj);
                    i5++;
                }
            }
        }
    }

    public final void m(vu2 vu2Var) {
        if (g()) {
            this.i.add(new r30(vu2Var.f, this.o, s30.g, null));
            List listI = vu2Var.i((4 & 1) != 0 ? !vu2Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                m((vu2) listI.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        or1 or1Var = this.p;
        or1Var.c();
        g41 g41VarE = e();
        int[] iArr = g41VarE.b;
        Object[] objArr = g41VarE.c;
        long[] jArr = g41VarE.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            or1Var.i(iArr[i4], new wu2(((xu2) objArr[i4]).a, e()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.q = new wu2(this.f.getSemanticsOwner().a(), e());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.s);
        this.h = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
