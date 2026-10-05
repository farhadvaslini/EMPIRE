package defpackage;

import android.app.Application;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import top.th1nk.samp.R;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws Throwable {
        int i = this.j;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((j) m((p40) obj2, (b31) obj)).o(dm3Var);
                return y50Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 8:
                return ((j) m((p40) obj2, (kd2) obj)).o(dm3Var);
            case vr.g /* 9 */:
                return ((j) m((p40) obj2, (gn0) obj)).o(dm3Var);
            case vr.h /* 10 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 11:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.i /* 12 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 13:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 14:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case jo3.g /* 15 */:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 16:
                ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
                return y50Var;
            case 17:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 18:
                return ((j) m((p40) obj2, (i70) obj)).o(dm3Var);
            case 19:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 20:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 21:
                return ((j) m((p40) obj2, (uo1) obj)).o(dm3Var);
            case 22:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 23:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 24:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 25:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 26:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 27:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 28:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((j) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new j((qr1) this.l, (zy0) obj2, p40Var, 0);
            case 1:
                return new j((qr1) this.l, (az0) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new j((o9) this.l, (a31) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                j jVar = new j((ma) obj2, p40Var, 3);
                jVar.l = obj;
                return jVar;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                j jVar2 = new j((rb2) obj2, p40Var, 4);
                jVar2.l = obj;
                return jVar2;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new j((mp0) this.l, (jj3) obj2, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new j((oo) this.l, (jk2) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new j((wo) this.l, (ok) obj2, p40Var, 7);
            case 8:
                j jVar3 = new j((ls) obj2, p40Var, 8);
                jVar3.l = obj;
                return jVar3;
            case vr.g /* 9 */:
                j jVar4 = new j((ns) obj2, p40Var, 9);
                jVar4.l = obj;
                return jVar4;
            case vr.h /* 10 */:
                return new j((tw) this.l, (x31) obj2, p40Var, 10);
            case 11:
                return new j((tw) this.l, (Uri) obj2, p40Var, 11);
            case vr.i /* 12 */:
                return new j((n10) obj2, p40Var, 12);
            case 13:
                return new j((r10) this.l, (Runnable) obj2, p40Var, 13);
            case 14:
                return new j((sf3) this.l, (so) obj2, p40Var, 14);
            case jo3.g /* 15 */:
                return new j((kb2) this.l, (sf3) obj2, p40Var, 15);
            case 16:
                return new j((j61) this.l, (n60) obj2, p40Var, 16);
            case 17:
                j jVar5 = new j((z60) obj2, p40Var, 17);
                jVar5.l = obj;
                return jVar5;
            case 18:
                j jVar6 = new j((List) obj2, p40Var, 18);
                jVar6.l = obj;
                return jVar6;
            case 19:
                return new j((b80) this.l, (uo1) obj2, p40Var, 19);
            case 20:
                return new j((rs0) this.l, (a70) obj2, p40Var, 20);
            case 21:
                j jVar7 = new j((b80) obj2, p40Var, 21);
                jVar7.l = obj;
                return jVar7;
            case 22:
                return new j((t41) this.l, (os1) obj2, p40Var, 22);
            case 23:
                return new j((GameActivity) this.l, (Uri) obj2, p40Var, 23);
            case 24:
                return new j((GameActivity) obj2, p40Var, 24);
            case 25:
                return new j((a51) this.l, (gb2) obj2, p40Var, 25);
            case 26:
                return new j((sa1) this.l, (qp2) obj2, p40Var, 26);
            case 27:
                return new j((sa1) this.l, (qf2) obj2, p40Var, 27);
            case 28:
                return new j((sa1) this.l, (wv2) obj2, p40Var, 28);
            default:
                return new j((sa1) this.l, (oh3) obj2, p40Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0393, code lost:
    
        if (defpackage.lr.E(r8, r13) == r7) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0422, code lost:
    
        if (defpackage.ur.A(500, r13) != r1) goto L219;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0417 A[Catch: all -> 0x03cd, TryCatch #0 {all -> 0x03cd, blocks: (B:191:0x03c9, B:219:0x0426, B:212:0x040e, B:215:0x0417, B:196:0x03d3, B:197:0x03d7, B:198:0x03df, B:208:0x03fe, B:210:0x0407), top: B:430:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:458:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x0422 -> B:219:0x0426). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x077e -> B:374:0x0782). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        x50 x50Var;
        mk2 mk2Var;
        Object objB;
        GameActivity gameActivity;
        int i = 4;
        int i2 = 3;
        int i3 = 6;
        int i4 = 0;
        int i5 = 1;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.j) {
            case 0:
                y50 y50Var = y50.f;
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    qr1 qr1Var = (qr1) this.l;
                    zy0 zy0Var = (zy0) this.m;
                    this.k = 1;
                    if (qr1Var.b(zy0Var, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    qr1 qr1Var2 = (qr1) this.l;
                    az0 az0Var = (az0) this.m;
                    this.k = 1;
                    if (qr1Var2.b(az0Var, this) == y50Var2) {
                        return y50Var2;
                    }
                } else {
                    if (i7 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y50 y50Var3 = y50.f;
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    fi1 fi1Var = new fi1(6);
                    this.k = 1;
                    o50 o50Var = this.g;
                    o50Var.getClass();
                    if (lq.I(o50Var).a(new gw0(fi1Var, 1), this) != y50Var3) {
                    }
                    return y50Var3;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    c.d();
                    return null;
                }
                y02.Q(obj);
                ms1 ms1VarI = ((o9) this.l).i();
                if (ms1VarI == null) {
                    return dm3.a;
                }
                k9 k9Var = new k9(i4, (a31) this.m);
                this.k = 2;
                s23.j((s23) ms1VarI, k9Var, this);
                return y50Var3;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y50 y50Var4 = y50.f;
                int i9 = this.k;
                if (i9 == 0) {
                    y02.Q(obj);
                    b31 b31Var = (b31) this.l;
                    ma maVar = (ma) this.m;
                    this.l = b31Var;
                    this.k = 1;
                    jr jrVar = new jr(1, vr.I(this));
                    jrVar.s();
                    gg3 gg3Var = maVar.g;
                    j72 j72Var = gg3Var.a;
                    j72Var.b();
                    gg3Var.b.set(new jg3(gg3Var, j72Var));
                    jrVar.v(new la(i4, b31Var, maVar));
                    if (jrVar.q() == y50Var4) {
                        return y50Var4;
                    }
                } else {
                    if (i9 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                c.d();
                return null;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                o50 o50Var2 = this.g;
                y50 y50Var5 = y50.f;
                int i10 = this.k;
                if (i10 == 0) {
                    y02.Q(obj);
                    x50Var = (x50) this.l;
                    if (ur.H(x50Var)) {
                    }
                } else {
                    if (i10 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x50Var = (x50) this.l;
                    y02.Q(obj);
                    rb2 rb2Var = (rb2) this.m;
                    int[] iArr = rb2Var.H;
                    if (rb2Var.isAttachedToWindow()) {
                        int i11 = iArr[0];
                        int i12 = iArr[1];
                        rb2Var.r.getLocationOnScreen(iArr);
                        if (i11 != iArr[0] || i12 != iArr[1]) {
                            rb2Var.p();
                        }
                    }
                    if (ur.H(x50Var)) {
                        fi1 fi1Var2 = new fi1(6);
                        this.l = x50Var;
                        this.k = 1;
                        o50Var2.getClass();
                        if (o50Var2.m(f5.a0) != null) {
                            qn1.b();
                            return null;
                        }
                        o50Var2.getClass();
                        if (lq.I(o50Var2).a(fi1Var2, this) == y50Var5) {
                            return y50Var5;
                        }
                        rb2 rb2Var2 = (rb2) this.m;
                        int[] iArr2 = rb2Var2.H;
                        if (rb2Var2.isAttachedToWindow()) {
                        }
                        if (ur.H(x50Var)) {
                            return dm3.a;
                        }
                    }
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                mp0 mp0Var = (mp0) this.l;
                jj3 jj3Var = (jj3) this.m;
                y50 y50Var6 = y50.f;
                int i13 = this.k;
                if (i13 == 0) {
                    y02.Q(obj);
                    if (mp0Var.a()) {
                        ts1 ts1Var = ts1.h;
                        this.k = 1;
                        if (jj3Var.c(ts1Var, this) == y50Var6) {
                            return y50Var6;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                if (jj3Var.b() && !mp0Var.a()) {
                    jj3Var.a();
                }
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                y50 y50Var7 = y50.f;
                int i14 = this.k;
                if (i14 == 0) {
                    y02.Q(obj);
                    oo ooVar = (oo) this.l;
                    ja jaVar = new ja(i3, (jk2) this.m);
                    this.k = 1;
                    if (vm1.q(ooVar, jaVar, this) == y50Var7) {
                        return y50Var7;
                    }
                } else {
                    if (i14 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                y50 y50Var8 = y50.f;
                int i15 = this.k;
                if (i15 == 0) {
                    y02.Q(obj);
                    wo woVar = (wo) this.l;
                    ok okVar = (ok) this.m;
                    this.k = 1;
                    if (vm1.q(woVar, okVar, this) == y50Var8) {
                        return y50Var8;
                    }
                } else {
                    if (i15 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 8:
                kd2 kd2Var = (kd2) this.l;
                y50 y50Var9 = y50.f;
                int i16 = this.k;
                if (i16 == 0) {
                    y02.Q(obj);
                    ls lsVar = (ls) this.m;
                    this.l = null;
                    this.k = 1;
                    if (lsVar.d(kd2Var, this) == y50Var9) {
                        return y50Var9;
                    }
                } else {
                    if (i16 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case vr.g /* 9 */:
                gn0 gn0Var = (gn0) this.l;
                y50 y50Var10 = y50.f;
                int i17 = this.k;
                if (i17 == 0) {
                    y02.Q(obj);
                    ns nsVar = (ns) this.m;
                    this.l = null;
                    this.k = 1;
                    if (nsVar.h(gn0Var, this) == y50Var10) {
                        return y50Var10;
                    }
                } else {
                    if (i17 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case vr.h /* 10 */:
                tw twVar = (tw) this.l;
                i93 i93Var = twVar.p;
                y50 y50Var11 = y50.f;
                int i18 = this.k;
                if (i18 == 0) {
                    y02.Q(obj);
                    j90 j90Var = ac0.a;
                    x80 x80Var = x80.h;
                    pw pwVar = new pw(twVar, (x31) this.m, objArr == true ? 1 : 0, i4);
                    this.k = 1;
                    obj = cl3.G(x80Var, pwVar, this);
                    if (obj == y50Var11) {
                        return y50Var11;
                    }
                } else {
                    if (i18 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                Object obj2 = ((rn2) obj).f;
                Throwable thA = rn2.a(obj2);
                if (thA == null) {
                    ((Number) obj2).intValue();
                    twVar.j();
                    Application application = twVar.b;
                    application.getClass();
                    String string = application.getString(R.string.launcher_cleo_message_deleted);
                    string.getClass();
                    iv ivVar = new iv(string);
                    i93Var.getClass();
                    i93Var.j(null, ivVar);
                } else {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "CleoViewModel", "CLEO deletion failed", thA);
                    fv fvVar = new fv(twVar.h(thA, R.string.launcher_cleo_error_delete));
                    i93Var.getClass();
                    i93Var.j(null, fvVar);
                }
                return dm3.a;
            case 11:
                tw twVar2 = (tw) this.l;
                i93 i93Var2 = twVar2.p;
                y50 y50Var12 = y50.f;
                int i19 = this.k;
                if (i19 == 0) {
                    y02.Q(obj);
                    j90 j90Var2 = ac0.a;
                    x80 x80Var2 = x80.h;
                    pw pwVar2 = new pw(twVar2, (Uri) this.m, objArr2 == true ? 1 : 0, c == true ? 1 : 0);
                    this.k = 1;
                    obj = cl3.G(x80Var2, pwVar2, this);
                    if (obj == y50Var12) {
                        return y50Var12;
                    }
                } else {
                    if (i19 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                Object obj3 = ((rn2) obj).f;
                Throwable thA2 = rn2.a(obj3);
                if (thA2 == null) {
                    int iIntValue = ((Number) obj3).intValue();
                    twVar2.j();
                    Application application2 = twVar2.b;
                    application2.getClass();
                    String quantityString = application2.getResources().getQuantityString(R.plurals.launcher_cleo_message_imported, iIntValue, new Integer(iIntValue));
                    quantityString.getClass();
                    iv ivVar2 = new iv(quantityString);
                    i93Var2.getClass();
                    i93Var2.j(null, ivVar2);
                } else {
                    ti tiVar2 = ui.a;
                    ui.c(ti.i, "CleoViewModel", "CLEO import failed", thA2);
                    fv fvVar2 = new fv(twVar2.h(thA2, R.string.launcher_cleo_error_import));
                    i93Var2.getClass();
                    i93Var2.j(null, fvVar2);
                }
                return dm3.a;
            case vr.i /* 12 */:
                n10 n10Var = (n10) this.m;
                y50 y50Var13 = y50.f;
                int i20 = this.k;
                if (i20 == 0) {
                    y02.Q(obj);
                    if (n10Var.j()) {
                        mk2 mk2Var2 = new mk2();
                        rs0 rs0Var = n10Var.d;
                        np npVar = n10Var.e;
                        npVar.getClass();
                        on0 on0Var = new on0(new ks(npVar, c2 == true ? 1 : 0), new m10(mk2Var2, objArr3 == true ? 1 : 0, i4), 0);
                        this.l = mk2Var2;
                        this.k = 1;
                        if (rs0Var.f(on0Var, this) == y50Var13) {
                            return y50Var13;
                        }
                        mk2Var = mk2Var2;
                    }
                    return dm3.a;
                }
                if (i20 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mk2Var = (mk2) this.l;
                y02.Q(obj);
                if (!mk2Var.f) {
                    c.q("You must collect the progress flow");
                    return null;
                }
                return dm3.a;
            case 13:
                dm3 dm3Var = dm3.a;
                r10 r10Var = (r10) this.l;
                y50 y50Var14 = y50.f;
                int i21 = this.k;
                if (i21 == 0) {
                    y02.Q(obj);
                    sy0 sy0Var = r10Var.f;
                    this.k = 1;
                    Object objB2 = sy0Var.b(0.0f - sy0Var.b, this);
                    if (objB2 != y50Var14) {
                        objB2 = dm3Var;
                    }
                    if (objB2 == y50Var14) {
                        return y50Var14;
                    }
                } else {
                    if (i21 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                ((d42) r10Var.c.g).setValue(Boolean.FALSE);
                ((Runnable) this.m).run();
                return dm3Var;
            case 14:
                y50 y50Var15 = y50.f;
                int i22 = this.k;
                if (i22 == 0) {
                    y02.Q(obj);
                    sf3 sf3Var = (sf3) this.l;
                    iy1 iy1Var = sf3Var.b;
                    long j = sf3Var.n().b;
                    int i23 = yg3.c;
                    int iR = iy1Var.r((int) (j >> 32));
                    ye1 ye1Var = sf3Var.d;
                    qg3 qg3VarD = ye1Var != null ? ye1Var.d() : null;
                    qg3VarD.getClass();
                    pg3 pg3Var = qg3VarD.a;
                    jk2 jk2VarC = pg3Var.c(y02.h(iR, 0, pg3Var.a.a.g.length()));
                    so soVar = (so) this.m;
                    this.k = 1;
                    if (soVar.a(jk2VarC, this) == y50Var15) {
                        return y50Var15;
                    }
                } else {
                    if (i22 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case jo3.g /* 15 */:
                y50 y50Var16 = y50.f;
                int i24 = this.k;
                if (i24 == 0) {
                    y02.Q(obj);
                    kb2 kb2Var = (kb2) this.l;
                    b50 b50Var = new b50((sf3) this.m, c3 == true ? 1 : 0);
                    this.k = 1;
                    if (cd3.d(kb2Var, null, b50Var, this, 7) == y50Var16) {
                        return y50Var16;
                    }
                } else {
                    if (i24 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 16:
                n60 n60Var = (n60) this.m;
                y50 y50Var17 = y50.f;
                int i25 = this.k;
                try {
                    if (i25 != 0) {
                        if (i25 == 1) {
                            y02.Q(obj);
                        } else {
                            if (i25 == 2) {
                                y02.Q(obj);
                                throw new kz();
                            }
                            if (i25 != 3) {
                                if (i25 != 4) {
                                    c.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y02.Q(obj);
                                n60Var.c.h(1.0f);
                                this.k = 3;
                                if (ur.A(500L, this) == y50Var17) {
                                    n60Var.c.h(0.0f);
                                    this.k = 4;
                                    break;
                                }
                                return y50Var17;
                            }
                            y02.Q(obj);
                            n60Var.c.h(0.0f);
                            this.k = 4;
                        }
                        break;
                    } else {
                        y02.Q(obj);
                        j61 j61Var = (j61) this.l;
                        if (j61Var != null) {
                            this.k = 1;
                            j61Var.c(null);
                            Object objX = j61Var.x(this);
                            if (objX != y50Var17) {
                                objX = dm3.a;
                            }
                            if (objX == y50Var17) {
                            }
                            return y50Var17;
                        }
                    }
                    n60Var.c.h(1.0f);
                    if (!n60Var.a) {
                        this.k = 2;
                        ur.m(this);
                        return y50Var17;
                    }
                    this.k = 3;
                    if (ur.A(500L, this) == y50Var17) {
                    }
                    return y50Var17;
                } catch (Throwable th) {
                    n60Var.c.h(0.0f);
                    throw th;
                }
            case 17:
                z60 z60Var = (z60) this.m;
                fx fxVar = z60Var.b;
                x50 x50Var2 = (x50) this.l;
                y50 y50Var18 = y50.f;
                int i26 = this.k;
                if (i26 == 0) {
                    y02.Q(obj);
                    fi1 fi1Var3 = new fi1(6);
                    this.l = x50Var2;
                    this.k = 1;
                    o50 o50Var3 = this.g;
                    o50Var3.getClass();
                    if (lq.I(o50Var3).a(fi1Var3, this) != y50Var18) {
                    }
                    return y50Var18;
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    cl3.t(x50Var2, null, new q60(z60Var, objArr6 == true ? 1 : 0, i), 3);
                    cl3.t(x50Var2, null, new q60(z60Var, objArr5 == true ? 1 : 0, 5), 3);
                    cl3.t(x50Var2, null, new q60(z60Var, objArr4 == true ? 1 : 0, i3), 3);
                    return dm3.a;
                }
                y02.Q(obj);
                if (z60Var.e() != z60Var.d()) {
                    y60 y60Var = new y60(b32.B(new u60(z60Var, i5)), z60Var, (((Number) fxVar.b()).floatValue() - ((Number) fxVar.a()).floatValue()) * 0.025f);
                    this.l = x50Var2;
                    this.k = 2;
                    break;
                }
                cl3.t(x50Var2, null, new q60(z60Var, objArr6 == true ? 1 : 0, i), 3);
                cl3.t(x50Var2, null, new q60(z60Var, objArr5 == true ? 1 : 0, 5), 3);
                cl3.t(x50Var2, null, new q60(z60Var, objArr4 == true ? 1 : 0, i3), 3);
                return dm3.a;
            case 18:
                y50 y50Var19 = y50.f;
                int i27 = this.k;
                if (i27 == 0) {
                    y02.Q(obj);
                    i70 i70Var = (i70) this.l;
                    List list = (List) this.m;
                    this.k = 1;
                    if (uq.i(list, i70Var, this) == y50Var19) {
                        return y50Var19;
                    }
                } else {
                    if (i27 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 19:
                uo1 uo1Var = (uo1) this.m;
                b80 b80Var = (b80) this.l;
                y50 y50Var20 = y50.f;
                int i28 = this.k;
                if (i28 != 0) {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            y02.Q(obj);
                            rs0 rs0Var2 = uo1Var.a;
                            o50 o50Var4 = uo1Var.d;
                            this.k = 3;
                            objB = b80Var.i().b(new y70(b80Var, o50Var4, rs0Var2, (p40) null), this);
                            if (objB != y50Var20) {
                                return objB;
                            }
                        } else if (i28 != 3) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    y02.Q(obj);
                    return obj;
                }
                y02.Q(obj);
                d93 d93VarA = b80Var.g.A();
                if (d93VarA instanceof a70) {
                    rs0 rs0Var3 = uo1Var.a;
                    o50 o50Var5 = uo1Var.d;
                    this.k = 1;
                    Object objB3 = b80Var.i().b(new y70(b80Var, o50Var5, rs0Var3, (p40) null), this);
                    if (objB3 != y50Var20) {
                        return objB3;
                    }
                } else {
                    if (!(d93VarA instanceof zi2) && !(d93VarA instanceof ul3)) {
                        if (d93VarA instanceof km0) {
                            throw ((km0) d93VarA).b;
                        }
                        if (d93VarA instanceof ww1) {
                            c.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        } else {
                            c.k();
                        }
                        return null;
                    }
                    if (d93VarA != uo1Var.c) {
                        throw ((zi2) d93VarA).b;
                    }
                    this.k = 2;
                    if (b80.f(b80Var, this) != y50Var20) {
                        rs0 rs0Var22 = uo1Var.a;
                        o50 o50Var42 = uo1Var.d;
                        this.k = 3;
                        objB = b80Var.i().b(new y70(b80Var, o50Var42, rs0Var22, (p40) null), this);
                        if (objB != y50Var20) {
                        }
                    }
                }
                return y50Var20;
            case 20:
                y50 y50Var21 = y50.f;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        y02.Q(obj);
                        return obj;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                rs0 rs0Var4 = (rs0) this.l;
                Object obj4 = ((a70) this.m).b;
                this.k = 1;
                Object objF = rs0Var4.f(obj4, this);
                return objF == y50Var21 ? y50Var21 : objF;
            case 21:
                y50 y50Var22 = y50.f;
                int i30 = this.k;
                if (i30 == 0) {
                    y02.Q(obj);
                    uo1 uo1Var2 = (uo1) this.l;
                    b80 b80Var2 = (b80) this.m;
                    this.k = 1;
                    if (b80.d(b80Var2, uo1Var2, this) == y50Var22) {
                        return y50Var22;
                    }
                } else {
                    if (i30 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 22:
                y50 y50Var23 = y50.f;
                int i31 = this.k;
                if (i31 == 0) {
                    y02.Q(obj);
                    ArrayList arrayList = new ArrayList();
                    fn0 fn0VarA = ((t41) this.l).a();
                    yn0 yn0Var = new yn0(i2, arrayList, (os1) this.m);
                    this.k = 1;
                    if (fn0VarA.a(yn0Var, this) == y50Var23) {
                        return y50Var23;
                    }
                } else {
                    if (i31 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 23:
                GameActivity gameActivity2 = (GameActivity) this.l;
                y50 y50Var24 = y50.f;
                int i32 = this.k;
                if (i32 == 0) {
                    y02.Q(obj);
                    boolean zImportCleoScript = gameActivity2.importCleoScript((Uri) this.m);
                    j90 j90Var3 = ac0.a;
                    jx0 jx0Var = tl1.a;
                    km kmVar = new km(gameActivity2, zImportCleoScript, null);
                    this.k = 1;
                    if (cl3.G(jx0Var, kmVar, this) == y50Var24) {
                        return y50Var24;
                    }
                } else {
                    if (i32 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 24:
                GameActivity gameActivity3 = (GameActivity) this.m;
                y50 y50Var25 = y50.f;
                int i33 = this.k;
                if (i33 == 0) {
                    y02.Q(obj);
                    t92 t92Var = gameActivity3.getServerRepository().s;
                    this.l = gameActivity3;
                    this.k = 1;
                    obj = lr.E(t92Var, this);
                    if (obj == y50Var25) {
                        return y50Var25;
                    }
                    gameActivity = gameActivity3;
                } else {
                    if (i33 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gameActivity = (GameActivity) this.l;
                    y02.Q(obj);
                }
                gameActivity.showServerNotificationEnabled = ((Boolean) obj).booleanValue();
                if (gameActivity3.showServerNotificationEnabled) {
                    GameActivity.updateServerNotification$default(gameActivity3, 0, 1, null);
                }
                return dm3.a;
            case 25:
                y50 y50Var26 = y50.f;
                int i34 = this.k;
                if (i34 == 0) {
                    y02.Q(obj);
                    ed edVar = ((a51) this.l).d;
                    gy1 gy1Var = new gy1(((gb2) this.m).c);
                    this.k = 1;
                    if (edVar.f(this, gy1Var) == y50Var26) {
                        return y50Var26;
                    }
                } else {
                    if (i34 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 26:
                y50 y50Var27 = y50.f;
                int i35 = this.k;
                if (i35 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var = ((sa1) this.l).c;
                    qp2 qp2Var = (qp2) this.m;
                    this.k = 1;
                    if (qy2Var.j(qp2Var, this) == y50Var27) {
                        return y50Var27;
                    }
                } else {
                    if (i35 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 27:
                y50 y50Var28 = y50.f;
                int i36 = this.k;
                if (i36 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var2 = ((sa1) this.l).c;
                    qf2 qf2Var = (qf2) this.m;
                    this.k = 1;
                    if (qy2Var2.t(qf2Var, this) == y50Var28) {
                        return y50Var28;
                    }
                } else {
                    if (i36 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 28:
                dm3 dm3Var2 = dm3.a;
                sv2 sv2Var = ((wv2) this.m).a;
                sa1 sa1Var = (sa1) this.l;
                y50 y50Var29 = y50.f;
                int i37 = this.k;
                if (i37 == 0) {
                    y02.Q(obj);
                    Iterable iterable = (Iterable) sa1Var.j0.f.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            String str = ((yv2) it.next()).a.e;
                            String lowerCase = sv2Var.c.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (s51.n(str, lowerCase)) {
                                sa1Var.x(h4.i);
                                return dm3Var2;
                            }
                        }
                    }
                    qy2 qy2Var3 = sa1Var.c;
                    ak2 ak2Var = xy2.h;
                    String str2 = (String) sa1Var.z.getValue();
                    ak2Var.getClass();
                    xy2 xy2VarM = ak2.m(str2);
                    this.k = 1;
                    if (qy2Var3.d(sv2Var, xy2VarM, this) == y50Var29) {
                        return y50Var29;
                    }
                } else {
                    if (i37 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                i93 i93Var3 = sa1Var.o;
                g4 g4Var = new g4(15);
                i93Var3.getClass();
                i93Var3.j(null, g4Var);
                LinkedHashSet linkedHashSet = sa1Var.J;
                String lowerCase2 = sv2Var.c.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                linkedHashSet.add(lowerCase2);
                sa1Var.t(sv2Var);
                return dm3Var2;
            default:
                y50 y50Var30 = y50.f;
                int i38 = this.k;
                if (i38 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var4 = ((sa1) this.l).c;
                    oh3 oh3Var = (oh3) this.m;
                    this.k = 1;
                    if (qy2Var4.B(oh3Var, this) == y50Var30) {
                        return y50Var30;
                    }
                } else {
                    if (i38 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
    }
}
