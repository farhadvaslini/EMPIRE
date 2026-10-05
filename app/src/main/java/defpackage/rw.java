package defpackage;

import android.app.Application;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import top.th1nk.samp.R;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rw extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(Application application, Uri uri, File file, p40 p40Var) {
        super(2, p40Var);
        this.j = 7;
        this.k = application;
        this.m = uri;
        this.l = file;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws IOException {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((rw) m((p40) obj2, (x50) obj)).o(dm3Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((rw) m((p40) obj2, (x50) obj)).o(dm3Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 8:
                break;
            case vr.g /* 9 */:
                ((rw) m((p40) obj2, (es1) obj)).o(dm3Var);
                break;
            default:
                ((rw) m((p40) obj2, (x50) obj)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new rw((tw) this.k, (File) this.l, (vu) obj2, p40Var, 0);
            case 1:
                rw rwVar = new rw((tw) this.k, (xu) obj2, p40Var);
                rwVar.l = obj;
                return rwVar;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new rw((os1) this.k, (mb0) this.l, (l73) obj2, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                rw rwVar2 = new rw((GameActivity) this.l, (String) obj2, p40Var, 3);
                rwVar2.k = obj;
                return rwVar2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new rw((String) this.k, (String) this.l, (String) obj2, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                rw rwVar3 = new rw((kb2) this.l, (qe3) obj2, p40Var, 5);
                rwVar3.k = obj;
                return rwVar3;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                rw rwVar4 = new rw((oa2) this.l, (y72) obj2, p40Var, 6);
                rwVar4.k = obj;
                return rwVar4;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new rw((Application) this.k, (Uri) obj2, (File) this.l, p40Var);
            case 8:
                return new rw((ak2) this.k, (sv2) this.l, (xy2) obj2, p40Var, 8);
            case vr.g /* 9 */:
                rw rwVar5 = new rw((String) this.l, (String) obj2, p40Var, 9);
                rwVar5.k = obj;
                return rwVar5;
            default:
                return new rw((bp0) this.k, (cs0) this.l, (os1) obj2, p40Var, 10);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws IOException {
        Serializable qn2Var;
        Object objO;
        Object qn2Var2;
        Object qn2Var3;
        String strG;
        Object qn2Var4;
        p40 p40Var = null;
        long j = 0;
        int i = 1;
        switch (this.j) {
            case 0:
                y02.Q(obj);
                nw nwVar = ((tw) this.k).c;
                File file = (File) this.l;
                vu vuVar = (vu) this.m;
                String str = vuVar.a;
                String str2 = vuVar.c;
                lw lwVar = vuVar.d;
                nwVar.getClass();
                file.getClass();
                str.getClass();
                str2.getClass();
                synchronized (nwVar.e) {
                    try {
                        qn2Var = Integer.valueOf(nwVar.h(file, str, str2, lwVar));
                    } catch (Throwable th) {
                        qn2Var = new qn2(th);
                    }
                    objO = nw.o(qn2Var);
                    break;
                }
                return new rn2(objO);
            case 1:
                y02.Q(obj);
                try {
                    ((tw) this.k).d.a(((xu) this.m).b);
                    qn2Var2 = dm3.a;
                    break;
                } catch (Throwable th2) {
                    qn2Var2 = new qn2(th2);
                }
                Throwable thA = rn2.a(qn2Var2);
                if (thA != null) {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "CleoViewModel", "Unable to cache CLEO catalog", thA);
                }
                return new rn2(qn2Var2);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                Set<qt1> set = (Set) ((os1) this.k).getValue();
                mb0 mb0Var = (mb0) this.l;
                l73 l73Var = (l73) this.m;
                for (qt1 qt1Var : set) {
                    if (!((List) mb0Var.b().e.f.getValue()).contains(qt1Var) && !l73Var.contains(qt1Var)) {
                        mb0Var.b().c(qt1Var);
                    }
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y02.Q(obj);
                try {
                    qn2Var3 = ((GameActivity) this.l).decodePluginImageFile((String) this.m);
                    break;
                } catch (Throwable th3) {
                    qn2Var3 = new qn2(th3);
                }
                byte[] bArr = su0.c;
                if (qn2Var3 instanceof qn2) {
                    qn2Var3 = bArr;
                }
                byte[] bArr2 = (byte[]) qn2Var3;
                Object obj2 = ((GameActivity) this.l).pluginImageDecodeLock;
                GameActivity gameActivity = (GameActivity) this.l;
                String str3 = (String) this.m;
                synchronized (obj2) {
                    try {
                        gameActivity.pendingPluginImageDecodes.remove(str3);
                        if (bArr2.length >= 8) {
                            gameActivity.completedPluginImageDecodes.put(str3, bArr2);
                        } else {
                            gameActivity.failedPluginImageDecodes.add(str3);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y02.Q(obj);
                String str4 = (String) this.k;
                String str5 = (String) this.l;
                String str6 = (String) this.m;
                if (str4 != null) {
                    try {
                        File file2 = new File(str4);
                        return !file2.exists() ? new zj1(0L, vr.K(str5), false) : uq.G(file2, file2.length());
                    } catch (Exception e) {
                        Locale locale = Locale.getDefault();
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        return new zj1(0L, vr.K(String.format(locale, str6, Arrays.copyOf(new Object[]{message}, 1))), false);
                    }
                }
                ti tiVar2 = ui.a;
                try {
                    File file3 = ui.b;
                    if (file3 != null && file3.exists()) {
                        strG = em0.Z(file3, ys.a);
                        if (strG.length() > 50000) {
                            int length = strG.length();
                            strG = strG.substring(length - (50000 > length ? length : 50000));
                        }
                    } else {
                        strG = "Log file not created yet";
                    }
                    break;
                } catch (Exception e2) {
                    strG = by1.g("Error reading log: ", e2.getMessage());
                }
                return new zj1(0L, qx.J0(200, y93.s0(strG)), false);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                y02.Q(obj);
                x50 x50Var = (x50) this.k;
                kb2 kb2Var = (kb2) this.l;
                qe3 qe3Var = (qe3) this.m;
                cl3.t(x50Var, null, new e50(kb2Var, qe3Var, p40Var, i), 1);
                return cl3.t(x50Var, null, new e50(kb2Var, qe3Var, p40Var, 2), 1);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                y02.Q(obj);
                try {
                    ((oa2) this.l).d.a(((y72) this.m).b);
                    qn2Var4 = dm3.a;
                    break;
                } catch (Throwable th5) {
                    qn2Var4 = new qn2(th5);
                }
                Throwable thA2 = rn2.a(qn2Var4);
                if (thA2 != null) {
                    ti tiVar3 = ui.a;
                    ui.c(ti.i, "PluginViewModel", "Unable to cache plugin catalog", thA2);
                }
                return new rn2(qn2Var4);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                y02.Q(obj);
                Application application = (Application) this.k;
                InputStream inputStreamOpenInputStream = application.getContentResolver().openInputStream((Uri) this.m);
                if (inputStreamOpenInputStream == null) {
                    c.q(application.getString(R.string.download_snackbar_cannot_read_file));
                    return null;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) this.l);
                    try {
                        byte[] bArr3 = new byte[8192];
                        for (int i2 = inputStreamOpenInputStream.read(bArr3); i2 >= 0; i2 = inputStreamOpenInputStream.read(bArr3)) {
                            fileOutputStream.write(bArr3, 0, i2);
                            j += (long) i2;
                        }
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return new Long(j);
                    } finally {
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        uq.l(inputStreamOpenInputStream, th6);
                        throw th7;
                    }
                }
            case 8:
                y02.Q(obj);
                ak2 ak2Var = (ak2) this.k;
                sv2 sv2Var = (sv2) this.l;
                h9 h9Var = new h9(ak2Var.l(sv2Var, ak2.a(ak2Var, sv2Var.a), 'c', new byte[0]).a, oz2.i((xy2) this.m));
                byte[] bArr4 = (byte[]) h9Var.c;
                int i3 = h9Var.i();
                ai1 ai1VarX = vr.x();
                for (int i4 = 0; i4 < i3; i4++) {
                    h9Var.c(1);
                    int i5 = h9Var.b;
                    h9Var.b = i5 + 1;
                    String strH = h9Var.h(bArr4[i5] & 255);
                    h9Var.c(4);
                    int i6 = ByteBuffer.wrap(bArr4, h9Var.b, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
                    h9Var.b += 4;
                    ai1VarX.add(new up2(i6, strH));
                }
                return vr.r(ai1VarX);
            case vr.g /* 9 */:
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                es1Var.d(qy2.P, (String) this.l);
                es1Var.d(qy2.O, (String) this.m);
                return dm3.a;
            default:
                y02.Q(obj);
                ((ep0) ((bp0) this.k)).b(8, true, true);
                if (((jz2) ((os1) this.m).getValue()) == jz2.g) {
                    ((cs0) this.l).a();
                }
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(tw twVar, xu xuVar, p40 p40Var) {
        super(2, p40Var);
        this.j = 1;
        this.k = twVar;
        this.m = xuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
