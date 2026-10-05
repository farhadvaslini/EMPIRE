package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dh2 {
    public static final dh2 a = new dh2();
    public static final i93 b;
    public static final cj2 c;
    public static Application d;
    public static ih2 e;
    public static boolean f;
    public static volatile boolean g;
    public static final n40 h;
    public static th2 i;
    public static w83 j;
    public static final long[] k;

    static {
        i93 i93VarE = s51.e(oi0.f);
        b = i93VarE;
        c = new cj2(i93VarE, null);
        xa3 xa3VarF = jo3.f();
        j90 j90Var = ac0.a;
        h = ur.c(pq.Q(xa3VarF, x80.h));
        k = new long[]{500, 2000};
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Application application, ih2 ih2Var, q40 q40Var) {
        xg2 xg2Var;
        i93 i93Var;
        Object value;
        LinkedHashMap linkedHashMap;
        if (q40Var instanceof xg2) {
            xg2Var = (xg2) q40Var;
            int i2 = xg2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xg2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                xg2Var = new xg2(q40Var);
            }
        }
        Object objE = xg2Var.j;
        int i3 = xg2Var.k;
        if (i3 == 0) {
            y02.Q(objE);
            t92 t92Var = new t92(ih2Var.a.b(), 1);
            xg2Var.i = application;
            xg2Var.k = 1;
            objE = lr.E(t92Var, xg2Var);
            y50 y50Var = y50.f;
            if (objE == y50Var) {
                return y50Var;
            }
        } else {
            if (i3 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            application = xg2Var.i;
            y02.Q(objE);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        for (l52 l52Var : (List) objE) {
            if (hashSet.add(new r32(l52Var.a, new Integer(l52Var.b)))) {
                String string = UUID.randomUUID().toString();
                string.getClass();
                linkedHashMap2.put(string, new vg2(string, l52Var.a, l52Var.b, l52Var.c, l52Var.d, l52Var.e, new vi2(application)));
            }
        }
        do {
            i93Var = b;
            value = i93Var.getValue();
            Map map = (Map) value;
            Collection<vg2> collectionValues = map.values();
            HashSet hashSet2 = new HashSet();
            for (vg2 vg2Var : collectionValues) {
                hashSet2.add(new r32(vg2Var.b, new Integer(vg2Var.c)));
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                vg2 vg2Var2 = (vg2) entry.getValue();
                if (!hashSet2.contains(new r32(vg2Var2.b, new Integer(vg2Var2.c)))) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(linkedHashMap3);
        } while (!i93Var.h(value, linkedHashMap));
        return dm3.a;
    }

    public static void c(Application application, ih2 ih2Var) {
        if (g) {
            return;
        }
        w83 w83Var = j;
        if (w83Var == null || !w83Var.b()) {
            j = cl3.t(h, null, new yg2(application, ih2Var, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:22:0x0048, B:24:0x004e), top: B:78:0x0048, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:36:0x006a, B:38:0x0075, B:40:0x007f, B:42:0x0090, B:44:0x009f, B:47:0x00a5, B:48:0x00a8, B:50:0x00ae, B:51:0x00ba), top: B:76:0x006a, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3 A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001a, B:18:0x0036, B:20:0x003c, B:17:0x0030, B:32:0x0061, B:35:0x0068, B:54:0x00cd, B:56:0x00d3, B:61:0x00ed, B:63:0x00f3, B:68:0x010b, B:70:0x0111, B:71:0x011c, B:67:0x0105, B:60:0x00e7, B:53:0x00c7, B:31:0x005b, B:36:0x006a, B:38:0x0075, B:40:0x007f, B:42:0x0090, B:44:0x009f, B:47:0x00a5, B:48:0x00a8, B:50:0x00ae, B:51:0x00ba, B:22:0x0048, B:24:0x004e, B:64:0x00fe, B:57:0x00de, B:14:0x0027), top: B:84:0x0001, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3 A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001a, B:18:0x0036, B:20:0x003c, B:17:0x0030, B:32:0x0061, B:35:0x0068, B:54:0x00cd, B:56:0x00d3, B:61:0x00ed, B:63:0x00f3, B:68:0x010b, B:70:0x0111, B:71:0x011c, B:67:0x0105, B:60:0x00e7, B:53:0x00c7, B:31:0x005b, B:36:0x006a, B:38:0x0075, B:40:0x007f, B:42:0x0090, B:44:0x009f, B:47:0x00a5, B:48:0x00a8, B:50:0x00ae, B:51:0x00ba, B:22:0x0048, B:24:0x004e, B:64:0x00fe, B:57:0x00de, B:14:0x0027), top: B:84:0x0001, inners: #0, #1, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111 A[Catch: all -> 0x000a, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001a, B:18:0x0036, B:20:0x003c, B:17:0x0030, B:32:0x0061, B:35:0x0068, B:54:0x00cd, B:56:0x00d3, B:61:0x00ed, B:63:0x00f3, B:68:0x010b, B:70:0x0111, B:71:0x011c, B:67:0x0105, B:60:0x00e7, B:53:0x00c7, B:31:0x005b, B:36:0x006a, B:38:0x0075, B:40:0x007f, B:42:0x0090, B:44:0x009f, B:47:0x00a5, B:48:0x00a8, B:50:0x00ae, B:51:0x00ba, B:22:0x0048, B:24:0x004e, B:64:0x00fe, B:57:0x00de, B:14:0x0027), top: B:84:0x0001, inners: #0, #1, #2, #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(Application application, ih2 ih2Var) {
        Object qn2Var;
        Object qn2Var2;
        Throwable thA;
        Object qn2Var3;
        Throwable thA2;
        Object qn2Var4;
        Throwable thA3;
        File[] fileArrListFiles;
        Object qn2Var5;
        if (f) {
            c(application, ih2Var);
            return;
        }
        d = application;
        e = ih2Var;
        qy2 qy2Var = new qy2(application);
        if (i != null) {
            p40 p40Var = null;
            File externalFilesDir = application.getExternalFilesDir(null);
            if (externalFilesDir == null) {
            }
            if (qn2Var == null) {
            }
            if (qn2Var instanceof qn2) {
            }
            String str = (String) qn2Var;
            fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
            }
            qn2Var2 = Integer.valueOf(Log.d("RaksampInstanceManager", "Cleared previous RAKSAMP logs"));
            thA = rn2.a(qn2Var2);
            if (thA != null) {
            }
            RaksampNativeBridge.INSTANCE.setStoragePath(str);
            qn2Var3 = dm3.a;
            thA2 = rn2.a(qn2Var3);
            if (thA2 != null) {
            }
            ur.y(application);
            qn2Var4 = dm3.a;
            thA3 = rn2.a(qn2Var4);
            if (thA3 != null) {
            }
            cl3.t(h, null, new hd1(qy2Var, application, p40Var, 11), 3);
            f = true;
            c(application, ih2Var);
            return;
        }
        th2 th2Var = new th2();
        try {
            n92.z(application, th2Var, new IntentFilter("top.th1nk.samp.action.RAKSAMP_DISCONNECT"), 4);
            i = th2Var;
            qn2Var5 = dm3.a;
        } catch (Throwable th) {
            qn2Var5 = new qn2(th);
        }
        Throwable thA4 = rn2.a(qn2Var5);
        if (thA4 != null) {
            ti tiVar = ui.a;
            ui.c(ti.i, "RaksampInstanceManager", "Unable to register RAKSAMP notification receiver", thA4);
        }
        p40 p40Var2 = null;
        try {
            File externalFilesDir2 = application.getExternalFilesDir(null);
            qn2Var = externalFilesDir2 == null ? externalFilesDir2.getAbsolutePath() : null;
            if (qn2Var == null) {
                qn2Var = "";
            }
        } catch (Throwable th2) {
            qn2Var = new qn2(th2);
        }
        if (qn2Var instanceof qn2) {
            qn2Var = "";
        }
        String str2 = (String) qn2Var;
        try {
            fileArrListFiles = new File(str2).listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (fa3.e0(name, "raksamp_log", false)) {
                        String name2 = file.getName();
                        name2.getClass();
                        if (fa3.Y(name2, ".txt", false)) {
                            arrayList.add(file);
                        }
                    }
                }
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((File) obj).delete();
                }
            }
            qn2Var2 = Integer.valueOf(Log.d("RaksampInstanceManager", "Cleared previous RAKSAMP logs"));
        } catch (Throwable th3) {
            qn2Var2 = new qn2(th3);
        }
        thA = rn2.a(qn2Var2);
        if (thA != null) {
            ti tiVar2 = ui.a;
            ui.c(ti.i, "RaksampInstanceManager", "Unable to clear previous RAKSAMP logs", thA);
        }
        try {
            RaksampNativeBridge.INSTANCE.setStoragePath(str2);
            qn2Var3 = dm3.a;
        } catch (Throwable th4) {
            qn2Var3 = new qn2(th4);
        }
        thA2 = rn2.a(qn2Var3);
        if (thA2 != null) {
            ti tiVar3 = ui.a;
            ui.c(ti.i, "RaksampInstanceManager", "Unable to configure RAKSAMP storage path", thA2);
        }
        try {
            ur.y(application);
            qn2Var4 = dm3.a;
        } catch (Throwable th5) {
            qn2Var4 = new qn2(th5);
        }
        thA3 = rn2.a(qn2Var4);
        if (thA3 != null) {
            ti tiVar4 = ui.a;
            ui.c(ti.i, "RaksampInstanceManager", "Unable to create RAKSAMP notification channels", thA3);
        }
        cl3.t(h, null, new hd1(qy2Var, application, p40Var2, 11), 3);
        f = true;
        c(application, ih2Var);
        return;
    }
}
