package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l80 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l80(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((l80) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return ((l80) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new l80((m80) obj2, p40Var, 0);
            case 1:
                return new l80((on0) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new l80((wp0) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new l80((GameActivity) obj2, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new l80((a31) obj2, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new l80((rl1) obj2, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new l80((ip1) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new l80((wq1) obj2, p40Var, 7);
            case 8:
                return new l80((oa2) obj2, p40Var, 8);
            case vr.g /* 9 */:
                return new l80((vg2) obj2, p40Var, 9);
            case vr.h /* 10 */:
                return new l80((sm2) obj2, p40Var, 10);
            case 11:
                return new l80((it2) obj2, p40Var, 11);
            case vr.i /* 12 */:
                return new l80((sz2) obj2, p40Var, 12);
            case 13:
                return new l80((sb3) obj2, p40Var, 13);
            case 14:
                return new l80((n60) obj2, p40Var, 14);
            case jo3.g /* 15 */:
                return new l80((ns0) obj2, p40Var, 15);
            case 16:
                return new l80((pg1) obj2, p40Var, 16);
            case 17:
                return new l80((ai3) obj2, p40Var, 17);
            default:
                return new l80((r70) obj2, p40Var, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x032b, code lost:
    
        if (defpackage.lq.I(r5).a(new defpackage.gw0(r1, r6), r14) == r8) goto L192;
     */
    /* JADX WARN: Path cross not found for [B:185:0x0305, B:188:0x030e], limit reached: 294 */
    /* JADX WARN: Path cross not found for [B:188:0x030e, B:185:0x0305], limit reached: 294 */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0312  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x0310 -> B:183:0x0301). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x032b -> B:194:0x032f). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        np npVar;
        int i = 6;
        int i2 = 1;
        p40 p40Var = null;
        switch (this.j) {
            case 0:
                m80 m80Var = (m80) this.l;
                y50 y50Var = y50.f;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    ok2 ok2Var = new ok2();
                    ok2 ok2Var2 = new ok2();
                    ok2 ok2Var3 = new ok2();
                    fn0 fn0VarA = m80Var.t.a();
                    rs rsVar = new rs(ok2Var, ok2Var2, ok2Var3, m80Var, 2);
                    this.k = 1;
                    if (fn0VarA.a(rsVar, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 1:
                dm3 dm3Var = dm3.a;
                y50 y50Var2 = y50.f;
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    on0 on0Var = (on0) this.l;
                    this.k = 1;
                    Object objA = on0Var.a(px1.f, this);
                    if (objA != y50Var2) {
                        objA = dm3Var;
                    }
                    if (objA == y50Var2) {
                        return y50Var2;
                    }
                } else {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y50 y50Var3 = y50.f;
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    wp0 wp0Var = (wp0) this.l;
                    this.k = 1;
                    if (vm1.q(wp0Var, null, this) == y50Var3) {
                        return y50Var3;
                    }
                } else {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                GameActivity gameActivity = (GameActivity) this.l;
                y50 y50Var4 = y50.f;
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    y92 y92Var = gameActivity.pluginRepository;
                    if (y92Var == null) {
                        s51.F("pluginRepository");
                        throw null;
                    }
                    this.k = 1;
                    if (y92Var.c(this) == y50Var4) {
                        return y50Var4;
                    }
                } else {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                if (!gameActivity.isFinishing() && !gameActivity.isDestroyed()) {
                    gameActivity.initializePluginRuntimeAndSamp();
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y50 y50Var5 = y50.f;
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    pe peVar = (pe) ((a31) this.l).h;
                    Float f = new Float(0.0f);
                    s83 s83VarF = n92.F(0.0f, 400.0f, new Float(0.5f), 1);
                    this.k = 1;
                    if (t22.o(peVar, f, s83VarF, true, new db3(i2), this) == y50Var5) {
                        return y50Var5;
                    }
                } else {
                    if (i7 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                rl1 rl1Var = (rl1) this.l;
                y50 y50Var6 = y50.f;
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    npVar = rl1Var.D;
                    if (npVar != null) {
                    }
                    if (rl1Var.y == null) {
                    }
                    return y50Var6;
                }
                if (i8 == 1) {
                    y02.Q(obj);
                    if (rl1Var.y == null) {
                    }
                    return y50Var6;
                }
                if (i8 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                q62 q62Var = rl1Var.y;
                if (q62Var != null) {
                    ((s62) q62Var).d();
                }
                npVar = rl1Var.D;
                if (npVar != null) {
                    this.k = 1;
                    if (np.G(npVar, this) != y50Var6) {
                    }
                    return y50Var6;
                }
                if (rl1Var.y == null) {
                    fi1 fi1Var = new fi1(i);
                    this.k = 2;
                    o50 o50Var = this.g;
                    o50Var.getClass();
                    break;
                } else {
                    npVar = rl1Var.D;
                    if (npVar != null) {
                    }
                    if (rl1Var.y == null) {
                    }
                }
                return y50Var6;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                y50 y50Var7 = y50.f;
                int i9 = this.k;
                if (i9 == 0) {
                    y02.Q(obj);
                    ed edVar = ((ip1) this.l).e;
                    Float f2 = new Float(0.0f);
                    this.k = 1;
                    if (ed.c(edVar, f2, null, null, this, 14) == y50Var7) {
                        return y50Var7;
                    }
                } else {
                    if (i9 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                y50 y50Var8 = y50.f;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y02.Q(obj);
                        return obj;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                np npVar2 = ((wq1) this.l).g;
                this.k = 1;
                Object objW = ur.w(new hd1(npVar2, p40Var, 9), this);
                return objW == y50Var8 ? y50Var8 : objW;
            case 8:
                oa2 oa2Var = (oa2) this.l;
                y50 y50Var9 = y50.f;
                int i11 = this.k;
                try {
                    if (i11 == 0) {
                        y02.Q(obj);
                        y92 y92Var2 = oa2Var.c;
                        this.k = 1;
                        if (y92Var2.c(this) == y50Var9) {
                            return y50Var9;
                        }
                    } else {
                        if (i11 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    oa2Var.c.k();
                    i93 i93Var = oa2Var.i;
                    Boolean bool = Boolean.FALSE;
                    i93Var.getClass();
                    i93Var.j(null, bool);
                    return dm3.a;
                } catch (Throwable th) {
                    i93 i93Var2 = oa2Var.i;
                    Boolean bool2 = Boolean.FALSE;
                    i93Var2.getClass();
                    i93Var2.j(null, bool2);
                    throw th;
                }
            case vr.g /* 9 */:
                y50 y50Var10 = y50.f;
                int i12 = this.k;
                if (i12 == 0) {
                    y02.Q(obj);
                    ih2 ih2Var = dh2.e;
                    if (ih2Var != null) {
                        vg2 vg2Var = (vg2) this.l;
                        String str = vg2Var.b;
                        int i13 = vg2Var.c;
                        this.k = 1;
                        if (ih2Var.d(str, i13, this) == y50Var10) {
                            return y50Var10;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case vr.h /* 10 */:
                y50 y50Var11 = y50.f;
                int i14 = this.k;
                try {
                    if (i14 == 0) {
                        y02.Q(obj);
                        sm2 sm2Var = (sm2) this.l;
                        t92 t92Var = sm2Var.d.m;
                        k9 k9Var = new k9(i, sm2Var);
                        this.k = 1;
                        if (t92Var.a(k9Var, this) == y50Var11) {
                            return y50Var11;
                        }
                    } else {
                        if (i14 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "ResourceViewModel", "Unable to observe resource source settings", e2);
                }
                return dm3.a;
            case 11:
                y50 y50Var12 = y50.f;
                int i15 = this.k;
                if (i15 == 0) {
                    y02.Q(obj);
                    it2 it2Var = (it2) this.l;
                    this.k = 1;
                    if (it2.q(it2Var, this) == y50Var12) {
                        return y50Var12;
                    }
                } else {
                    if (i15 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case vr.i /* 12 */:
                sz2 sz2Var = (sz2) this.l;
                y50 y50Var13 = y50.f;
                int i16 = this.k;
                if (i16 != 0 && i16 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                while (sz2Var.b()) {
                    l22 l22VarA = sz2Var.a();
                    e22 e22Var = e22.a;
                    if (!s51.n(l22VarA, e22Var) && !s51.n(sz2Var.a(), i22.a) && !(sz2Var.a() instanceof h22)) {
                        return dm3.a;
                    }
                    if (s51.n(sz2Var.a(), e22Var)) {
                        sz2Var.w.setValue(GameActivity.initializePluginRuntimeAndSamp$lambda$7(sz2Var.h.g));
                    } else {
                        long jLongValue = ((Number) sz2Var.l.a()).longValue();
                        if (jLongValue != sz2Var.u) {
                            sz2Var.t.setValue(GameActivity.initializePluginRuntimeAndSamp$lambda$10(sz2Var.k.g));
                            sz2Var.u = jLongValue;
                        }
                        sz2Var.v.setValue(GameActivity.initializePluginRuntimeAndSamp$lambda$12(sz2Var.m.g));
                    }
                    long jMin = Math.min(250L, 500L);
                    this.k = 1;
                    if (ur.A(jMin, this) == y50Var13) {
                        return y50Var13;
                    }
                }
                return dm3.a;
            case 13:
                sb3 sb3Var = (sb3) this.l;
                y50 y50Var14 = y50.f;
                int i17 = this.k;
                if (i17 == 0) {
                    y02.Q(obj);
                    PointerInputEventHandler pointerInputEventHandler = sb3Var.w;
                    this.k = 2;
                    if (pointerInputEventHandler.invoke(sb3Var, this) == y50Var14) {
                        return y50Var14;
                    }
                } else {
                    if (i17 != 1 && i17 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 14:
                dm3 dm3Var2 = dm3.a;
                y50 y50Var15 = y50.f;
                int i18 = this.k;
                if (i18 == 0) {
                    y02.Q(obj);
                    n60 n60Var = (n60) this.l;
                    this.k = 1;
                    n60Var.getClass();
                    Object objW2 = ur.w(new pw(n60Var, p40Var, 3), this);
                    if (objW2 != y50Var15) {
                        objW2 = dm3Var2;
                    }
                    if (objW2 == y50Var15) {
                        return y50Var15;
                    }
                } else {
                    if (i18 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var2;
            case jo3.g /* 15 */:
                y50 y50Var16 = y50.f;
                int i19 = this.k;
                if (i19 == 0) {
                    y02.Q(obj);
                    ns0 ns0Var = (ns0) this.l;
                    this.k = 1;
                    if (ns0Var.h(this) == y50Var16) {
                        return y50Var16;
                    }
                } else {
                    if (i19 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 16:
                dm3 dm3Var3 = dm3.a;
                y50 y50Var17 = y50.f;
                int i20 = this.k;
                if (i20 == 0) {
                    y02.Q(obj);
                    pg1 pg1Var = (pg1) this.l;
                    this.k = 1;
                    pg1Var.getClass();
                    Object objA2 = pg1Var.a.a().a(new yn0(5, new as1(), pg1Var), this);
                    if (objA2 != y50Var17) {
                        objA2 = dm3Var3;
                    }
                    if (objA2 == y50Var17) {
                        return y50Var17;
                    }
                } else {
                    if (i20 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var3;
            case 17:
                ai3 ai3Var = (ai3) this.l;
                y50 y50Var18 = y50.f;
                int i21 = this.k;
                if (i21 == 0) {
                    y02.Q(obj);
                    ok2 ok2Var4 = new ok2();
                    fn0 fn0VarA2 = ai3Var.t.a();
                    yn0 yn0Var = new yn0(13, ok2Var4, ai3Var);
                    this.k = 1;
                    if (fn0VarA2.a(yn0Var, this) == y50Var18) {
                        return y50Var18;
                    }
                } else {
                    if (i21 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            default:
                y50 y50Var19 = y50.f;
                int i22 = this.k;
                if (i22 == 0) {
                    y02.Q(obj);
                    r70 r70Var = (r70) this.l;
                    this.k = 1;
                    if (r70Var.h(this) == y50Var19) {
                        return y50Var19;
                    }
                } else {
                    if (i22 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
        }
    }
}
