package defpackage;

import android.graphics.Paint;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a4 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a4(ot0 ot0Var, String str, e92 e92Var, d92 d92Var, os1 os1Var) {
        this.f = 5;
        this.g = ot0Var;
        this.i = str;
        this.h = e92Var;
        this.j = d92Var;
        this.k = os1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        List listSubList;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                t3 t3Var = (t3) obj6;
                t3Var.a = ((z3) obj5).c((String) obj4, (r3) obj3, new b4(0, (os1) obj2));
                break;
            case 1:
                ze1 ze1Var = (ze1) obj;
                te1 te1Var = ((o9) obj5).a;
                ze1Var.h = (bg3) obj6;
                ze1Var.i = (b11) obj4;
                ze1Var.c = (v1) obj3;
                ze1Var.d = (ns0) obj2;
                ze1Var.e = te1Var != null ? te1Var.u : null;
                ze1Var.f = te1Var != null ? te1Var.v : null;
                ze1Var.g = te1Var != null ? (oq3) ur.z(te1Var, s20.t) : null;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                rb2 rb2Var = (rb2) obj6;
                rb2Var.u.addView(rb2Var, rb2Var.v);
                rb2Var.o((cs0) obj5, (vb2) obj3, (String) obj4, (bb1) obj2);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                wq1 wq1Var = (wq1) obj6;
                qk2 qk2Var = (qk2) obj5;
                nk2 nk2Var = (nk2) obj4;
                ws2 ws2Var = (ws2) obj3;
                mk2 mk2Var = (mk2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                sq1 sq1VarG = wq1.g(wq1Var.g);
                if (sq1VarG != null) {
                    a31 a31Var = wq1Var.e;
                    long j = sq1VarG.b;
                    long j2 = sq1VarG.a;
                    ((np3) a31Var.g).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((np3) a31Var.h).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    sq1 sq1VarA = ((sq1) qk2Var.f).a(sq1VarG);
                    qk2Var.f = sq1VarA;
                    nk2Var.f = ws2Var.j(ws2Var.f(sq1VarA.a));
                    mk2Var.f = !br.n(r0 - fFloatValue);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ArrayList arrayList = (ArrayList) obj5;
                ok2 ok2Var = (ok2) obj4;
                wt1 wt1Var = (wt1) obj3;
                Bundle bundle = (Bundle) obj2;
                qt1 qt1Var = (qt1) obj;
                qt1Var.getClass();
                ((mk2) obj6).f = true;
                int iIndexOf = arrayList.indexOf(qt1Var);
                if (iIndexOf != -1) {
                    int i2 = iIndexOf + 1;
                    listSubList = arrayList.subList(ok2Var.f, i2);
                    ok2Var.f = i2;
                } else {
                    listSubList = ni0.f;
                }
                wt1Var.a(qt1Var.g, bundle, qt1Var, listSubList);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((os1) obj2).setValue(bool);
                ((ot0) obj6).h(new d82((String) obj4, ((e92) obj5).b, ((a92) ((d92) obj3)).a, "boolean", String.valueOf(zBooleanValue)));
                break;
            default:
                iy1 iy1Var = (iy1) obj5;
                bg3 bg3Var = (bg3) obj4;
                ye1 ye1Var = (ye1) obj3;
                w73 w73Var = (w73) obj2;
                vb1 vb1Var = (vb1) obj;
                vb1Var.c();
                rr rrVar = vb1Var.f;
                float fG = ((n60) obj6).c.g();
                if (fG != 0.0f) {
                    long j3 = bg3Var.b;
                    int i3 = yg3.c;
                    int iR = iy1Var.r((int) (j3 >> 32));
                    qg3 qg3VarD = ye1Var.d();
                    jk2 jk2VarC = qg3VarD != null ? qg3VarD.a.c(iR) : new jk2(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(vb1Var.T(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = jk2VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (rrVar.a() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(jk2VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(jk2VarC.d)) & 4294967295L);
                    pr prVar = rrVar.f.c;
                    w9 w9VarD = rrVar.i;
                    if (w9VarD == null) {
                        w9VarD = cl3.d();
                        w9VarD.p(1);
                        rrVar.i = w9VarD;
                    }
                    Paint paint = (Paint) w9VarD.b;
                    w73Var.a(fG, rrVar.a(), w9VarD);
                    if (!s51.n((yx) w9VarD.d, null)) {
                        w9VarD.i(null);
                    }
                    if (w9VarD.a != 3) {
                        w9VarD.g(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        w9VarD.o(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (w9VarD.d() != 0) {
                        w9VarD.m(0);
                    }
                    if (w9VarD.e() != 0) {
                        w9VarD.n(0);
                    }
                    if (!s51.n(null, null)) {
                        w9VarD.k(null);
                    }
                    if (!paint.isFilterBitmap()) {
                        w9VarD.j(1);
                    }
                    prVar.m(jFloatToRawIntBits, jFloatToRawIntBits2, w9VarD);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ a4(rb2 rb2Var, cs0 cs0Var, vb2 vb2Var, String str, bb1 bb1Var) {
        this.f = 2;
        this.g = rb2Var;
        this.h = cs0Var;
        this.j = vb2Var;
        this.i = str;
        this.k = bb1Var;
    }

    public /* synthetic */ a4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }
}
