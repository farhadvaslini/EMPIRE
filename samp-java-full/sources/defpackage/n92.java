package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class n92 {
    public static final d00 A;
    public static final k71 N;
    public static final ai0 O;
    public static final gy X;
    public static final gy Y;
    public static final float Z;
    public static final gy a0;
    public static final gj b;
    public static final float b0;
    public static final gj c;
    public static final gy c0;
    public static final float d0;
    public static final m22 e;
    public static final gy e0;
    public static final m22 f;
    public static final float f0;
    public static final b23 g0;
    public static final float h0;
    public static final gy i0;
    public static final float j0;
    public static final float k0;
    public static final ak2 l0;
    public static final d00 m;
    public static final Object m0;
    public static final d00 n;
    public static final na n0;
    public static final d00 o;
    public static final so3 o0;
    public static final d00 p;
    public static final so3 p0;
    public static final d00 q;
    public static final so3 q0;
    public static final d00 r;
    public static w01 r0;
    public static final d00 s;
    public static final d00 t;
    public static final d00 u;
    public static final d00 x;
    public static final d00 y;
    public static final d00 z;
    public static final uc a = new uc();
    public static final hj d = new hj();
    public static final float[][] g = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] h = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] i = {95.047f, 100.0f, 108.883f};
    public static final float[][] j = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final d00 k = new d00(-1571120048, new g00(), false);
    public static final d00 l = new d00(-1455401925, new z1(14), false);
    public static final d00 v = new d00(1763851698, new p00(25), false);
    public static final d00 w = new d00(1050202840, new p00(26), false);
    public static final gy B = gy.p;
    public static final float C = 1.0f;
    public static final gy D = gy.x;
    public static final b23 E = b23.j;
    public static final gy F = gy.z;
    public static final float G = 0.38f;
    public static final float H = 6.0f;
    public static final float I = 1.0f;
    public static final double[][] J = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] K = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] L = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] M = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final StackTraceElement[] P = new StackTraceElement[0];
    public static final byte[] Q = {48, 49, 53, 0};
    public static final byte[] R = {48, 49, 48, 0};
    public static final byte[] S = {48, 48, 57, 0};
    public static final byte[] T = {48, 48, 53, 0};
    public static final byte[] U = {48, 48, 49, 0};
    public static final byte[] V = {48, 48, 49, 0};
    public static final byte[] W = {48, 48, 50, 0};

    static {
        int i2 = 3;
        b = new gj(i2);
        int i3 = 2;
        c = new gj(i3);
        int i4 = 27;
        e = new m22(i4);
        int i5 = 28;
        f = new m22(i5);
        byte b2 = 0;
        int i6 = 4;
        m = new d00(986963332, new k00(i6), false);
        n = new d00(58987177, new k00(i4), false);
        o = new d00(-937250998, new p00(i5), false);
        int i7 = 1;
        p = new d00(593334821, new q00(i7), false);
        q = new d00(-1502857760, new q00(i3), false);
        int i8 = 29;
        r = new d00(-1110036927, new p00(i8), false);
        s = new d00(904119900, new q00(i2), false);
        t = new d00(-1289121829, new q00(i6), false);
        u = new d00(350056094, new k00(i5), false);
        x = new d00(-714383985, new p00(i4), false);
        y = new d00(-2059829895, new k00(i8), false);
        z = new d00(-1584393526, new q00(b2), false);
        A = new d00(-1759434350, new z00(8, b2), false);
        int i9 = 5;
        N = new k71(b2, new h01(i9));
        O = new ai0(i7, "NO_OWNER");
        gy gyVar = gy.q;
        X = gyVar;
        gy gyVar2 = gy.m;
        Y = gyVar2;
        Z = 0.38f;
        a0 = gyVar2;
        b0 = 0.38f;
        c0 = gyVar2;
        d0 = 0.12f;
        e0 = gyVar;
        f0 = 44.0f;
        g0 = b23.i;
        h0 = 4.0f;
        i0 = gy.t;
        j0 = 16.0f;
        k0 = 4.0f;
        l0 = new ak2(11);
        m0 = new Object();
        n0 = new na(1022);
        o0 = new so3(i6);
        p0 = new so3(i9);
        q0 = new so3(6);
    }

    public static final es2 A(nv0 nv0Var) {
        Object[] objArr = new Object[0];
        boolean zD = nv0Var.d(0);
        Object objO = nv0Var.O();
        if (zD || objO == c20.a) {
            objO = new f62(11);
            nv0Var.j0(objO);
        }
        return (es2) oz2.H(objArr, es2.k, (cs0) objO, nv0Var, 0);
    }

    public static void B(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                c.p(nc2.j(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = strArr[i5];
                    i4++;
                }
            }
        }
        activity.requestPermissions(strArr, i2);
    }

    public static bq1 C(bq1 bq1Var, es2 es2Var, boolean z2) {
        t02 t02Var = t02.f;
        t02 t02Var2 = z2 ? t02Var : t02.g;
        qr1 qr1Var = es2Var.e;
        yp1 yp1Var = yp1.a;
        return bq1Var.d(t02Var2 == t02Var ? gq.t(yp1Var, wy0.c) : gq.t(yp1Var, wy0.b)).d(new fs2(null, null, null, qr1Var, t02Var2, es2Var, true, true)).d(new rs2(es2Var, z2));
    }

    public static s63 D() {
        return new s63(0);
    }

    public static jj E(float f2) {
        return new jj(f2, true, new c(1));
    }

    public static s83 F(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new s83(f2, f3, obj);
    }

    public static final CharSequence G(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? y93.E0(charSequence, 4999) : y93.E0(charSequence, 5000);
    }

    public static double H(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static zk3 I(int i2, int i3, ng0 ng0Var) {
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            ng0Var = pg0.a;
        }
        return new zk3(i2, i4, ng0Var);
    }

    public static final bq1 J(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new ac3(ns0Var));
    }

    public static float K() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, bq1 bq1Var, nv0 nv0Var, int i2) {
        List list2;
        bq1 bq1Var2;
        boolean z2;
        boolean zIsEmpty;
        yp1 yp1Var;
        gm0 gm0Var;
        int i3;
        int i4;
        ?? r1;
        boolean z3;
        nv0 nv0Var2 = nv0Var;
        z00 z00Var = f5.C;
        z00 z00Var2 = f5.F;
        z00 z00Var3 = f5.D;
        z00 z00Var4 = f5.E;
        list.getClass();
        nv0Var2.b0(-1280761908);
        int i5 = i2 | (nv0Var2.f(list) ? 4 : 2) | 432;
        if (!nv0Var2.R(i5 & 1, (i5 & 147) != 146)) {
            list2 = list;
            nv0Var2.U();
            bq1Var2 = bq1Var;
        } else if (list.isEmpty()) {
            z2 = false;
            zIsEmpty = list.isEmpty();
            yp1 yp1Var2 = yp1.a;
            x91 x91Var = tb1.Y;
            if (!zIsEmpty) {
                nv0Var2.a0(1311699788);
                gm0 gm0Var2 = j43.c;
                cn1 cn1VarD = eo.d(f5.k, false);
                int iHashCode = Long.hashCode(nv0Var2.T);
                n52 n52VarL = nv0Var2.l();
                bq1 bq1VarM = lr.M(nv0Var2, gm0Var2);
                w10.c.getClass();
                nv0Var2.d0();
                if (nv0Var2.S) {
                    nv0Var2.k(x91Var);
                } else {
                    nv0Var2.m0();
                }
                y02.F(z00Var4, nv0Var2, cn1VarD);
                y02.F(z00Var3, nv0Var2, n52VarL);
                nc2.r(iHashCode, nv0Var2, z00Var2, nv0Var2);
                y02.F(z00Var, nv0Var2, bq1VarM);
                mg3.b(oz2.M(R.string.raksamp_textdraw_empty, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).k, nv0Var, 0, 0, 131066);
                nv0Var.p(true);
                nv0Var.p(false);
                xj2 xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    xj2VarT.d = new tf2(list, yp1Var2, i2, 2);
                    return;
                }
                return;
            }
            nv0Var2.a0(1312109174);
            nv0Var2.p(false);
            gm0 gm0Var3 = j43.c;
            qy qyVarA = oy.a(d, f5.s, nv0Var2, 0);
            int iHashCode2 = Long.hashCode(nv0Var2.T);
            n52 n52VarL2 = nv0Var2.l();
            bq1 bq1VarM2 = lr.M(nv0Var2, gm0Var3);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var4, nv0Var2, qyVarA);
            y02.F(z00Var3, nv0Var2, n52VarL2);
            nc2.r(iHashCode2, nv0Var2, z00Var2, nv0Var2);
            y02.F(z00Var, nv0Var2, bq1VarM2);
            if (z2) {
                nv0Var2.a0(6265270);
                bq1 bq1VarC = j43.c(yp1Var2, 1.0f);
                r93 r93Var = hy.a;
                bq1 bq1VarK = f80.K(gv3.v(bq1VarC, ((fy) nv0Var2.j(r93Var)).l, cl3.q0), 12.0f, 6.0f);
                cn1 cn1VarD2 = eo.d(f5.g, false);
                int iHashCode3 = Long.hashCode(nv0Var2.T);
                n52 n52VarL3 = nv0Var2.l();
                bq1 bq1VarM3 = lr.M(nv0Var2, bq1VarK);
                nv0Var2.d0();
                if (nv0Var2.S) {
                    nv0Var2.k(x91Var);
                } else {
                    nv0Var2.m0();
                }
                y02.F(z00Var4, nv0Var2, cn1VarD2);
                y02.F(z00Var3, nv0Var2, n52VarL3);
                nc2.r(iHashCode3, nv0Var2, z00Var2, nv0Var2);
                y02.F(z00Var, nv0Var2, bq1VarM3);
                i3 = i5;
                yp1Var = yp1Var2;
                gm0Var = gm0Var3;
                i4 = 4;
                mg3.b("Select mode active — tap a TextDraw to select it.", null, ((fy) nv0Var2.j(r93Var)).m, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).o, nv0Var, 6, 0, 131066);
                nv0Var2 = nv0Var;
                r1 = 1;
                nv0Var2.p(true);
                z3 = false;
                nv0Var2.p(false);
            } else {
                yp1Var = yp1Var2;
                gm0Var = gm0Var3;
                i3 = i5;
                i4 = 4;
                r1 = 1;
                z3 = false;
                nv0Var2.a0(6778444);
                nv0Var2.p(false);
            }
            jj jjVar = new jj(4.0f, r1, new c(r1));
            boolean z4 = (i3 & 14) != i4 ? z3 : true;
            Object objO = nv0Var2.O();
            if (z4 || objO == c20.a) {
                list2 = list;
                objO = new xc1(19, list2);
                nv0Var2.j0(objO);
            } else {
                list2 = list;
            }
            lr.g(24582, 494, null, null, jjVar, null, (ns0) objO, nv0Var2, null, gm0Var, null, false);
            nv0Var2.p(true);
            bq1Var2 = yp1Var;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((re3) it.next()).i) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            zIsEmpty = list.isEmpty();
            yp1 yp1Var22 = yp1.a;
            x91 x91Var2 = tb1.Y;
            if (!zIsEmpty) {
            }
        }
        xj2 xj2VarT2 = nv0Var2.t();
        if (xj2VarT2 != null) {
            xj2VarT2.d = new tf2(list2, bq1Var2, i2, 3);
        }
    }

    public static final void b(bq1 bq1Var, rs0 rs0Var, nv0 nv0Var, int i2, int i3) {
        int i4;
        nv0Var.b0(-1298353104);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (nv0Var.f(bq1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.h(rs0Var) ? 32 : 16;
        }
        if (nv0Var.R(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                bq1Var = yp1.a;
            }
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new ra3(f5.g0);
                nv0Var.j0(objO);
            }
            c((ra3) objO, bq1Var, rs0Var, nv0Var, (i4 << 3) & 1008);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new e13(bq1Var, rs0Var, i2, i3);
        }
    }

    public static final void c(ra3 ra3Var, bq1 bq1Var, rs0 rs0Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.h(ra3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(nv0Var.T);
            lv0 lv0VarW = lq.W(nv0Var);
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
            n52 n52VarL = nv0Var.l();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(ra3Var.c, nv0Var, ra3Var);
            y02.F(ra3Var.d, nv0Var, lv0VarW);
            y02.F(ra3Var.e, nv0Var, rs0Var);
            w10.c.getClass();
            y02.F(f5.D, nv0Var, n52VarL);
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            nv0Var.p(true);
            if (nv0Var.D()) {
                nv0Var.a0(-1259187287);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1259245908);
                boolean zH = nv0Var.h(ra3Var);
                Object objO = nv0Var.O();
                if (zH || objO == c20.a) {
                    objO = new it1(25, ra3Var);
                    nv0Var.j0(objO);
                }
                rn.t((cs0) objO, nv0Var);
                nv0Var.p(false);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(ra3Var, bq1Var, rs0Var, i2, 17);
        }
    }

    public static final void d(re3 re3Var, cs0 cs0Var, nv0 nv0Var, int i2) {
        int i3;
        long j2;
        ye yeVar;
        int iC;
        af afVarD;
        boolean z2;
        boolean z3;
        boolean z4;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-601420655);
        int i4 = i2 | (nv0Var2.f(re3Var) ? 4 : 2) | (nv0Var2.h(cs0Var) ? 32 : 16);
        if (nv0Var2.R(i4 & 1, (i4 & 19) != 18)) {
            long j3 = ((fy) nv0Var2.j(hy.a)).p;
            int i5 = re3Var.a;
            long j4 = re3Var.e;
            boolean z5 = re3Var.i;
            long j5 = re3Var.d;
            boolean z6 = re3Var.h;
            int i6 = re3Var.c;
            boolean zD = nv0Var2.d(i5);
            Object objO = nv0Var2.O();
            zj zjVar = c20.a;
            if (zD || objO == zjVar) {
                if (i6 <= 3) {
                    uk2 uk2Var = tp2.a;
                    ArrayList arrayListC = tp2.c(j5, re3Var.b);
                    yeVar = new ye();
                    j2 = j5;
                    int size = arrayListC.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayListC.get(i7);
                        int i8 = i7 + 1;
                        ArrayList arrayList = arrayListC;
                        sp2 sp2Var = (sp2) obj;
                        int i9 = size;
                        iC = yeVar.c(new h83(sp2Var.b, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, 0L, (ne3) null, (r13) null, 65534));
                        try {
                            yeVar.f.append(sp2Var.a);
                            yeVar.b(iC);
                            size = i9;
                            arrayListC = arrayList;
                            i7 = i8;
                        } finally {
                        }
                    }
                    afVarD = yeVar.d();
                } else {
                    j2 = j5;
                    yeVar = new ye();
                    iC = yeVar.c(new h83(re3Var.d, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, 0L, (ne3) null, (r13) null, 65534));
                    try {
                        yeVar.f.append("[Non-text TextDraw: style=" + i6 + "]");
                        yeVar.b(iC);
                        afVarD = yeVar.d();
                    } finally {
                    }
                }
                objO = afVarD;
                nv0Var2.j0(objO);
            } else {
                j2 = j5;
            }
            af afVar = (af) objO;
            boolean zD2 = nv0Var2.d(i5);
            Object objO2 = nv0Var2.O();
            if (zD2 || objO2 == zjVar) {
                List list = afVar.h;
                if (list == null) {
                    list = ni0.f;
                }
                wx wxVar = new wx(list.isEmpty() ? j2 : ((h83) ((ze) qx.q0(list)).a).a.a());
                nv0Var2.j0(wxVar);
                objO2 = wxVar;
            }
            long j6 = ((wx) objO2).a;
            long jG = gq.B(nv0Var2).c;
            boolean zD3 = nv0Var2.d(i5) | nv0Var2.e(j3);
            Object objO3 = nv0Var2.O();
            if (zD3 || objO3 == zjVar) {
                if (z5 && z6) {
                    z2 = z6;
                    z3 = z5;
                } else if (!re3Var.g || wx.c(j4, wx.f)) {
                    z2 = z6;
                    z3 = z5;
                    uk2 uk2Var2 = tp2.a;
                    jG = tp2.g(j6, j3);
                } else {
                    long jB = wx.b(0.15f, j4);
                    uk2 uk2Var3 = tp2.a;
                    z2 = z6;
                    z3 = z5;
                    jG = tp2.b(j6, jB, j3) < 3.0f ? tp2.g(j6, j3) : jB;
                }
                objO3 = new wx(jG);
                nv0Var2.j0(objO3);
            } else {
                z2 = z6;
                z3 = z5;
            }
            long j7 = ((wx) objO3).a;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(gv3.v(gq.t(j43.c(yp1Var, 1.0f), uo2.a(8.0f)), j7, cl3.q0).d(cs0Var != null ? rn.y(yp1Var, false, null, cs0Var, 15) : yp1Var), 12.0f, 8.0f);
            um umVar = f5.p;
            gj gjVar = b;
            dp2 dp2VarA = cp2.a(gjVar, umVar, nv0Var2, 48);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarK);
            w10.c.getClass();
            nv0Var2.d0();
            boolean z7 = nv0Var2.S;
            x91 x91Var = tb1.Y;
            if (z7) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var2, dp2VarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var2, n52VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z00 z00Var3 = f5.F;
            y02.F(z00Var3, nv0Var2, numValueOf);
            y02.C(nv0Var2);
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var2, bq1VarM);
            jc1 jc1Var = new jc1(1.0f, true);
            qy qyVarA = oy.a(d, f5.s, nv0Var2, 0);
            int iHashCode2 = Long.hashCode(nv0Var2.T);
            n52 n52VarL2 = nv0Var2.l();
            bq1 bq1VarM2 = lr.M(nv0Var2, jc1Var);
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var, nv0Var2, qyVarA);
            y02.F(z00Var2, nv0Var2, n52VarL2);
            nc2.r(iHashCode2, nv0Var2, z00Var3, nv0Var2);
            y02.F(z00Var4, nv0Var2, bq1VarM2);
            dp2 dp2VarA2 = cp2.a(gjVar, f5.q, nv0Var2, 48);
            int iHashCode3 = Long.hashCode(nv0Var2.T);
            n52 n52VarL3 = nv0Var2.l();
            bq1 bq1VarM3 = lr.M(nv0Var2, yp1Var);
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(x91Var);
            } else {
                nv0Var2.m0();
            }
            y02.F(z00Var, nv0Var2, dp2VarA2);
            y02.F(z00Var2, nv0Var2, n52VarL3);
            nc2.r(iHashCode3, nv0Var2, z00Var3, nv0Var2);
            y02.F(z00Var4, nv0Var2, bq1VarM3);
            mg3.b("#" + i5, null, gq.B(nv0Var2).a, 0L, null, zb3.c, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).o, nv0Var, 0, 0, 130938);
            nv0 nv0Var3 = nv0Var;
            oz2.g(nv0Var3, j43.o(yp1Var, 8.0f));
            String strH = i6 == 4 ? "[SPRITE]" : i6 == 5 ? by1.h("[MODEL:", "]", re3Var.l) : z2 ? "[SEL]" : "";
            if (strH.length() > 0) {
                nv0Var3.a0(513321344);
                mg3.b(strH, null, gq.B(nv0Var3).j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var3).o, nv0Var, 0, 0, 131066);
                nv0Var3 = nv0Var;
                z4 = false;
                nv0Var3.p(false);
            } else {
                z4 = false;
                nv0Var3.a0(513538127);
                nv0Var3.p(false);
            }
            nv0Var3.p(true);
            oz2.g(nv0Var3, j43.e(yp1Var, 4.0f));
            nv0 nv0Var4 = nv0Var3;
            i3 = 1;
            mg3.c(afVar, null, 0L, 0L, 0L, 0L, 2, false, 6, 0, null, null, gq.H(nv0Var3).l, nv0Var4, 0, 241662);
            nv0Var2 = nv0Var4;
            nv0Var2.p(true);
            if (z2 && z3) {
                nv0Var2.a0(-212963091);
                oz2.g(nv0Var2, j43.o(yp1Var, 8.0f));
                mg3.b(">", new vp3(), gq.B(nv0Var2).a, 0L, xq0.k, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).m, nv0Var, 1572870, 0, 131000);
                nv0Var2 = nv0Var;
                nv0Var2.p(false);
            } else {
                nv0Var2.a0(-212617131);
                nv0Var2.p(false);
            }
            nv0Var2.p(true);
        } else {
            i3 = 1;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new nh2(i2, i3, re3Var, cs0Var);
        }
    }

    public static final void e(pq3 pq3Var, tb1 tb1Var) {
        long jK0 = tb1Var.L.c.k0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jK0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jK0 & 4294967295L)));
        pq3Var.layout(iRound, iRound2, pq3Var.getMeasuredWidth() + iRound, pq3Var.getMeasuredHeight() + iRound2);
    }

    public static final void f(s1 s1Var, vu2 vu2Var) {
        if (gv3.t(vu2Var)) {
            Object objG = vu2Var.d.f.g(pu2.i);
            if (objG == null) {
                objG = null;
            }
            y0 y0Var = (y0) objG;
            if (y0Var != null) {
                s1Var.a(new n1(null, android.R.id.accessibilityActionSetProgress, y0Var.a, null));
            }
        }
    }

    public static boolean g(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static int h(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new tx1(context).a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static double i(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static boolean j(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = j(file2) && z2;
        }
        return z2;
    }

    public static final void k(br1 br1Var, pr prVar, dp dpVar, float f2, r13 r13Var, ne3 ne3Var, rf0 rf0Var) {
        ArrayList arrayList = br1Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            t32 t32Var = (t32) arrayList.get(i2);
            t32Var.a.f(prVar, dpVar, f2, r13Var, ne3Var, rf0Var);
            prVar.g(0.0f, t32Var.a.f);
        }
    }

    public static final w01 l() {
        w01 w01Var = r0;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.BugReport", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(20.0f, 8.0f);
        tx0Var.g(-2.81f);
        tx0Var.e(-0.45f, -0.78f, -1.07f, -1.45f, -1.82f, -1.96f);
        tx0Var.h(17.0f, 4.41f);
        tx0Var.h(15.59f, 3.0f);
        tx0Var.i(-2.17f, 2.17f);
        tx0Var.d(12.96f, 5.06f, 12.49f, 5.0f, 12.0f, 5.0f);
        tx0Var.e(-0.49f, 0.0f, -0.96f, 0.06f, -1.41f, 0.17f);
        tx0Var.h(8.41f, 3.0f);
        tx0Var.h(7.0f, 4.41f);
        tx0Var.i(1.62f, 1.63f);
        tx0Var.d(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8.0f);
        tx0Var.h(4.0f, 8.0f);
        tx0Var.o(2.0f);
        tx0Var.g(2.09f);
        tx0Var.e(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1.0f);
        tx0Var.o(1.0f);
        tx0Var.h(4.0f, 12.0f);
        tx0Var.o(2.0f);
        tx0Var.g(2.0f);
        tx0Var.o(1.0f);
        tx0Var.e(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        tx0Var.h(4.0f, 16.0f);
        tx0Var.o(2.0f);
        tx0Var.g(2.81f);
        tx0Var.e(1.04f, 1.79f, 2.97f, 3.0f, 5.19f, 3.0f);
        tx0Var.l(4.15f, -1.21f, 5.19f, -3.0f);
        tx0Var.h(20.0f, 18.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(-2.09f);
        tx0Var.e(0.05f, -0.33f, 0.09f, -0.66f, 0.09f, -1.0f);
        tx0Var.o(-1.0f);
        tx0Var.g(2.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(-2.0f);
        tx0Var.o(-1.0f);
        tx0Var.e(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        tx0Var.h(20.0f, 10.0f);
        tx0Var.h(20.0f, 8.0f);
        tx0Var.c();
        tx0Var.j(14.0f, 16.0f);
        tx0Var.g(-4.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(4.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(14.0f, 12.0f);
        tx0Var.g(-4.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(4.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        r0 = w01VarB;
        return w01VarB;
    }

    public static bq1 m(bq1 bq1Var, es2 es2Var) {
        return C(bq1Var, es2Var, false);
    }

    public static double n(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = J;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double dI = i(d7);
        double dI2 = i(d8);
        double dI3 = i(d9);
        return Math.atan2(((dI + dI2) - (dI3 * 2.0d)) / 9.0d, ((((-12.0d) * dI2) + (dI * 11.0d)) + dI3) / 11.0d);
    }

    public static c21 o(jg0 jg0Var, gl2 gl2Var, int i2) {
        if ((i2 & 2) != 0) {
            gl2Var = gl2.f;
        }
        return new c21(jg0Var, gl2Var);
    }

    public static int p(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = i;
        return ny.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static double q(double d2) {
        double dAbs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1));
    }

    public static boolean r(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static final bq1 s(tc1 tc1Var, po poVar, t02 t02Var) {
        return new pc1(tc1Var, poVar, t02Var);
    }

    public static float t(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final bq1 u(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new az1(ns0Var));
    }

    public static void v(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void w(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z2 && iArr.length == 1) ? fMax : 0.0f;
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Integer x(String str) {
        str.getClass();
        o92 o92Var = (o92) xv0.b.get(str);
        String str2 = o92Var != null ? o92Var.a : null;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2106519991:
                    if (str2.equals("plugin_permission_dialog_read")) {
                        return Integer.valueOf(R.string.plugin_permission_dialog_read);
                    }
                    break;
                case -2075546936:
                    if (str2.equals("plugin_permission_audio_playback")) {
                        return Integer.valueOf(R.string.plugin_permission_audio_playback);
                    }
                    break;
                case -1912336878:
                    if (str2.equals("plugin_permission_clipboard_write")) {
                        return Integer.valueOf(R.string.plugin_permission_clipboard_write);
                    }
                    break;
                case -1654949107:
                    if (str2.equals("plugin_permission_network_intercept")) {
                        return Integer.valueOf(R.string.plugin_permission_network_intercept);
                    }
                    break;
                case -1573124016:
                    if (str2.equals("plugin_permission_player_read")) {
                        return Integer.valueOf(R.string.plugin_permission_player_read);
                    }
                    break;
                case -1517191067:
                    if (str2.equals("plugin_permission_player_write")) {
                        return Integer.valueOf(R.string.plugin_permission_player_write);
                    }
                    break;
                case -1463825368:
                    if (str2.equals("plugin_permission_physics_override")) {
                        return Integer.valueOf(R.string.plugin_permission_physics_override);
                    }
                    break;
                case -1200976344:
                    if (str2.equals("plugin_permission_vehicle_write")) {
                        return Integer.valueOf(R.string.plugin_permission_vehicle_write);
                    }
                    break;
                case -940925801:
                    if (str2.equals("plugin_permission_storage")) {
                        return Integer.valueOf(R.string.plugin_permission_storage);
                    }
                    break;
                case -848555890:
                    if (str2.equals("plugin_permission_entity_read")) {
                        return Integer.valueOf(R.string.plugin_permission_entity_read);
                    }
                    break;
                case -569200897:
                    if (str2.equals("plugin_permission_chat_intercept")) {
                        return Integer.valueOf(R.string.plugin_permission_chat_intercept);
                    }
                    break;
                case -232839001:
                    if (str2.equals("plugin_permission_camera_control")) {
                        return Integer.valueOf(R.string.plugin_permission_camera_control);
                    }
                    break;
                case -155387348:
                    if (str2.equals("plugin_permission_chat_notify")) {
                        return Integer.valueOf(R.string.plugin_permission_chat_notify);
                    }
                    break;
                case 7086656:
                    if (str2.equals("plugin_permission_textdraw_read")) {
                        return Integer.valueOf(R.string.plugin_permission_textdraw_read);
                    }
                    break;
                case 576480239:
                    if (str2.equals("plugin_permission_dialog_intercept")) {
                        return Integer.valueOf(R.string.plugin_permission_dialog_intercept);
                    }
                    break;
                case 630886659:
                    if (str2.equals("plugin_permission_clipboard_read")) {
                        return Integer.valueOf(R.string.plugin_permission_clipboard_read);
                    }
                    break;
                case 653833773:
                    if (str2.equals("plugin_permission_vehicle_read")) {
                        return Integer.valueOf(R.string.plugin_permission_vehicle_read);
                    }
                    break;
                case 725253389:
                    if (str2.equals("plugin_permission_game_state_read")) {
                        return Integer.valueOf(R.string.plugin_permission_game_state_read);
                    }
                    break;
                case 905808102:
                    if (str2.equals("plugin_permission_input")) {
                        return Integer.valueOf(R.string.plugin_permission_input);
                    }
                    break;
                case 986853976:
                    if (str2.equals("plugin_permission_textdraw_intercept")) {
                        return Integer.valueOf(R.string.plugin_permission_textdraw_intercept);
                    }
                    break;
                case 1406132526:
                    if (str2.equals("plugin_permission_server_read")) {
                        return Integer.valueOf(R.string.plugin_permission_server_read);
                    }
                    break;
                case 1445712671:
                    if (str2.equals("plugin_permission_network_inspect")) {
                        return Integer.valueOf(R.string.plugin_permission_network_inspect);
                    }
                    break;
                case 1691642024:
                    if (str2.equals("plugin_permission_draw")) {
                        return Integer.valueOf(R.string.plugin_permission_draw);
                    }
                    break;
                case 1691898051:
                    if (str2.equals("plugin_permission_menu")) {
                        return Integer.valueOf(R.string.plugin_permission_menu);
                    }
                    break;
                case 1910898666:
                    if (str2.equals("plugin_permission_command_intercept")) {
                        return Integer.valueOf(R.string.plugin_permission_command_intercept);
                    }
                    break;
                case 1939609913:
                    if (str2.equals("plugin_permission_chat_read")) {
                        return Integer.valueOf(R.string.plugin_permission_chat_read);
                    }
                    break;
                case 1939640107:
                    if (str2.equals("plugin_permission_chat_send")) {
                        return Integer.valueOf(R.string.plugin_permission_chat_send);
                    }
                    break;
                case 2010531915:
                    if (str2.equals("plugin_permission_network_stats_read")) {
                        return Integer.valueOf(R.string.plugin_permission_network_stats_read);
                    }
                    break;
            }
        }
        return null;
    }

    public static final p92 y(String str) {
        o92 o92Var = (o92) xv0.b.get(str);
        String str2 = o92Var != null ? o92Var.b : null;
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1078030475) {
                if (iHashCode != 107348) {
                    if (iHashCode == 3202466 && str2.equals("high")) {
                        return p92.h;
                    }
                } else if (str2.equals("low")) {
                    return p92.f;
                }
            } else if (str2.equals("medium")) {
                return p92.g;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (defpackage.jo3.i(r8, r8) == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent z(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        int i3 = i2 & 2;
        if (i3 == 0 && (i2 & 4) == 0) {
            c.p("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i3 != 0 && (i2 & 4) != 0) {
            c.p("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return application.registerReceiver(broadcastReceiver, intentFilter, null, null, i2);
        }
        if ((i2 & 4) == 0) {
            return application.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
        }
        String str = application.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (jo3.i(application, str) != 0) {
            if (i4 >= 29) {
                str = application.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            }
            throw new RuntimeException(nc2.i("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        }
        return application.registerReceiver(broadcastReceiver, intentFilter, str, null);
    }
}
