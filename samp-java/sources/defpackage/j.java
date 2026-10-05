package defpackage;

import android.net.Uri;
import java.util.List;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
    }
}
