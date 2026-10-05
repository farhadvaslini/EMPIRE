package top.th1nk.samp.feature.raksamp;

import android.util.Log;
import defpackage.bt;
import defpackage.by1;
import defpackage.e41;
import defpackage.gp3;
import defpackage.hb0;
import defpackage.hp3;
import defpackage.i93;
import defpackage.ig2;
import defpackage.k41;
import defpackage.kg2;
import defpackage.l41;
import defpackage.lg2;
import defpackage.lj1;
import defpackage.n72;
import defpackage.nc2;
import defpackage.ni0;
import defpackage.qx;
import defpackage.re3;
import defpackage.rx;
import defpackage.uj;
import defpackage.vi2;
import defpackage.vp;
import defpackage.wx;
import defpackage.xy2;
import defpackage.zx1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class RaksampNativeBridge {
    public static final int $stable = 0;
    private static final String TAG = "RaksampNativeBridge";
    private static boolean initialized;
    private static String loadError;
    public static final RaksampNativeBridge INSTANCE = new RaksampNativeBridge();
    private static final ConcurrentHashMap<Integer, vi2> viewModels = new ConcurrentHashMap<>();
    private static final AtomicInteger nextId = new AtomicInteger(1);

    static {
        try {
            System.loadLibrary("raksamp");
            initialized = true;
            Log.d(TAG, "libraksamp.so loaded");
        } catch (LinkageError e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getSimpleName();
            }
            loadError = message;
            Log.e(TAG, "Failed to load libraksamp.so: " + e.getMessage(), e);
        } catch (SecurityException e2) {
            String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = e2.getClass().getSimpleName();
            }
            loadError = message2;
            Log.e(TAG, "Failed to load libraksamp.so: " + e2.getMessage(), e2);
        }
    }

    private RaksampNativeBridge() {
    }

    private final native void nativeConnect(int i, String str, int i2, String str2, String str3, String str4, String str5, int i3, int i4, boolean z);

    private final native void nativeDisconnect(int i);

    private final native void nativeSendChat(int i, String str);

    private final native void nativeSendDialogResponse(int i, int i2, int i3, int i4, String str);

    private final native void nativeSetAfkState(int i, boolean z);

    private final native void nativeSetCustomKeys(int i, int i2);

    private final native void nativeSetLogLevel(int i);

    private final native void nativeSetStoragePath(String str);

    public static final void onChatLine(int i, String str, int i2) {
        Object value;
        str.getClass();
        Log.d(TAG, "onChatLine: instance=" + i + " " + str);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            bt btVar = new bt(str, vp.b(i2), System.currentTimeMillis());
            i93 i93Var = vi2Var.g;
            do {
                value = i93Var.getValue();
            } while (!i93Var.h(value, qx.J0(200, qx.E0((List) value, btVar))));
        }
    }

    public static final void onClearTab(int i) {
        Log.d(TAG, "onClearTab: instance=" + i);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.o;
            i93Var.getClass();
            i93Var.j(null, ni0.f);
        }
    }

    public static final void onConnectionFailed(int i, String str) {
        str.getClass();
        Log.d(TAG, "onConnectionFailed: instance=" + i + " " + str);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            vi2Var.k(new lg2(str));
        }
    }

    public static final void onConnectionSucceeded(int i, String str, String str2, int i2, int i3) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("onConnectionSucceeded: instance=");
        sb.append(i);
        sb.append(" ");
        nc2.w(sb, str, " ", str2, " ");
        sb.append(i2);
        sb.append("/");
        sb.append(i3);
        Log.d(TAG, sb.toString());
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            vi2Var.k(new ig2(i2, i3, str, str2));
            i93 i93Var = vi2Var.B;
            Integer numValueOf = Integer.valueOf(i3);
            i93Var.getClass();
            i93Var.j(null, numValueOf);
        }
    }

    public static final void onDialogShow(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        Log.d(TAG, "onDialogShow: instance=" + i + " id=" + i2 + " style=" + i3);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            hb0 hb0Var = new hb0(i2, i3, str, str2, str3, str4);
            i93 i93Var = vi2Var.m;
            i93Var.getClass();
            i93Var.j(null, hb0Var);
        }
    }

    public static final void onDisconnected(int i) {
        Log.d(TAG, "onDisconnected: instance=" + i);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            vi2Var.k(kg2.a);
        }
    }

    public static final void onHideTab(int i) {
        Log.d(TAG, "onHideTab: instance=" + i);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.D;
            Boolean bool = Boolean.FALSE;
            i93Var.getClass();
            i93Var.j(null, bool);
        }
    }

    public static final void onLocalPlayerStateChange(int i, float f, float f2, boolean z) {
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.y;
            lj1 lj1Var = new lj1(f, f2, z);
            i93Var.getClass();
            i93Var.j(null, lj1Var);
        }
    }

    public static final void onNearbyObjectsUpdate(int i, int[] iArr, int[] iArr2, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        iArr.getClass();
        iArr2.getClass();
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        fArr4.getClass();
        l41 l41VarS = uj.S(iArr);
        ArrayList arrayList = new ArrayList(rx.d0(l41VarS, 10));
        Iterator it = l41VarS.iterator();
        while (((k41) it).h) {
            int iNextInt = ((e41) it).nextInt();
            arrayList.add(new zx1(fArr[iNextInt], fArr2[iNextInt], fArr3[iNextInt], fArr4[iNextInt], iArr[iNextInt], iArr2[iNextInt]));
        }
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.u;
            i93Var.getClass();
            i93Var.j(null, arrayList);
        }
    }

    public static final void onNearbyPlayersUpdate(int i, int[] iArr, String[] strArr, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6) {
        iArr.getClass();
        strArr.getClass();
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        fArr4.getClass();
        fArr5.getClass();
        fArr6.getClass();
        l41 l41VarS = uj.S(iArr);
        ArrayList arrayList = new ArrayList(rx.d0(l41VarS, 10));
        Iterator it = l41VarS.iterator();
        while (((k41) it).h) {
            int iNextInt = ((e41) it).nextInt();
            arrayList.add(new n72(iArr[iNextInt], strArr[iNextInt], 0, 0, false, fArr2[iNextInt], fArr3[iNextInt], fArr[iNextInt], fArr4[iNextInt], fArr5[iNextInt], fArr6[iNextInt], 28));
        }
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.q;
            i93Var.getClass();
            i93Var.j(null, arrayList);
        }
    }

    public static final void onNearbyVehiclesUpdate(int i, int[] iArr, int[] iArr2, float[] fArr, float[] fArr2, boolean[] zArr, String[] strArr, float[] fArr3, float[] fArr4, float[] fArr5) {
        iArr.getClass();
        iArr2.getClass();
        fArr.getClass();
        fArr2.getClass();
        zArr.getClass();
        strArr.getClass();
        fArr3.getClass();
        fArr4.getClass();
        fArr5.getClass();
        l41 l41VarS = uj.S(iArr);
        ArrayList arrayList = new ArrayList(rx.d0(l41VarS, 10));
        Iterator it = l41VarS.iterator();
        while (it.hasNext()) {
            int iNextInt = ((e41) it).nextInt();
            arrayList.add(new gp3(iArr[iNextInt], iArr2[iNextInt], fArr[iNextInt], fArr3[iNextInt], fArr4[iNextInt], fArr5[iNextInt], fArr2[iNextInt], zArr[iNextInt], strArr[iNextInt]));
        }
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.s;
            i93Var.getClass();
            i93Var.j(null, arrayList);
        }
    }

    public static final void onServerInfo(int i, int i2, int i3) {
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            vi2Var.M = i3;
            i93 i93Var = vi2Var.B;
            Integer numValueOf = Integer.valueOf(i2);
            i93Var.getClass();
            i93Var.j(null, numValueOf);
        }
    }

    public static final void onSetPlayer(int i, int i2, String str, int i3, int i4) {
        str.getClass();
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            ArrayList arrayListO0 = qx.O0((Collection) vi2Var.p.getValue());
            int size = arrayListO0.size();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i5 = -1;
                    break;
                }
                Object obj = arrayListO0.get(i6);
                i6++;
                if (((n72) obj).a == i2) {
                    break;
                } else {
                    i5++;
                }
            }
            int i7 = i5;
            n72 n72Var = new n72(i2, str, i3, i4, i2 == vi2Var.M, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2016);
            boolean z = n72Var.e;
            if (i7 >= 0) {
                arrayListO0.set(i7, n72Var);
                if (z && i7 != 0) {
                    arrayListO0.remove(i7);
                    arrayListO0.add(0, n72Var);
                }
            } else {
                int i8 = 0;
                if (z) {
                    arrayListO0.add(0, n72Var);
                } else {
                    int size2 = arrayListO0.size();
                    int i9 = 0;
                    while (true) {
                        if (i8 >= size2) {
                            i9 = -1;
                            break;
                        }
                        Object obj2 = arrayListO0.get(i8);
                        i8++;
                        n72 n72Var2 = (n72) obj2;
                        if (!n72Var2.e && n72Var2.a > i2) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (i9 >= 0) {
                        arrayListO0.add(i9, n72Var);
                    } else {
                        arrayListO0.add(n72Var);
                    }
                }
            }
            i93 i93Var = vi2Var.o;
            i93Var.getClass();
            i93Var.j(null, arrayListO0);
        }
    }

    public static final void onShowTab(int i) {
        Log.d(TAG, "onShowTab: instance=" + i);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.D;
            Boolean bool = Boolean.TRUE;
            i93Var.getClass();
            i93Var.j(null, bool);
        }
    }

    public static final void onTextDrawHide(int i, int i2) {
        Log.d(TAG, "onTextDrawHide: instance=" + i + " id=" + i2);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            vi2Var.e(null, i2);
        }
    }

    public static final void onTextDrawSetString(int i, int i2, String str) {
        ArrayList arrayList;
        int i3 = i2;
        str.getClass();
        StringBuilder sb = new StringBuilder("onTextDrawSetString: instance=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" text=");
        String str2 = str;
        sb.append(str2);
        Log.d(TAG, sb.toString());
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var == null) {
            return;
        }
        i93 i93Var = vi2Var.i;
        while (true) {
            Object value = i93Var.getValue();
            List<re3> list = (List) value;
            ArrayList arrayList2 = new ArrayList(rx.d0(list, 10));
            for (re3 re3Var : list) {
                int i4 = re3Var.a;
                if (i4 == i3) {
                    arrayList = arrayList2;
                    re3Var = new re3(i4, str2, re3Var.c, re3Var.d, re3Var.e, re3Var.f, re3Var.g, re3Var.h, re3Var.i, re3Var.j, re3Var.k, re3Var.l, re3Var.m, re3Var.n, re3Var.o, re3Var.p, re3Var.q, re3Var.r);
                } else {
                    arrayList = arrayList2;
                }
                arrayList.add(re3Var);
                str2 = str;
                arrayList2 = arrayList;
                i3 = i2;
            }
            if (i93Var.h(value, arrayList2)) {
                return;
            }
            i3 = i2;
            str2 = str;
        }
    }

    public static final void onTextDrawShow(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, int i4, int i5) {
        str.getClass();
        Log.d(TAG, "onTextDrawShow: instance=" + i + " id=" + i2 + " text=" + str + " style=" + i4);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            vi2Var.e(new re3(i2, str, i4, vp.b(i3), wx.f, vp.c(2147483648L), false, i5 != 0, false, f, f2, 0, f3, f4, 0.0f, 0.0f, 0, 0), i2);
        }
    }

    public static final void onVehicleHealthChange(int i, int i2, float f) {
        Object value;
        ArrayList arrayList;
        Object value2;
        hp3 hp3Var;
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            i93 i93Var = vi2Var.s;
            do {
                value = i93Var.getValue();
                List<gp3> list = (List) value;
                list.getClass();
                arrayList = new ArrayList(rx.d0(list, 10));
                for (gp3 gp3Var : list) {
                    int i3 = gp3Var.a;
                    if (i3 == i2) {
                        int i4 = gp3Var.b;
                        float f2 = gp3Var.c;
                        float f3 = gp3Var.d;
                        float f4 = gp3Var.e;
                        float f5 = gp3Var.f;
                        boolean z = gp3Var.h;
                        String str = gp3Var.i;
                        str.getClass();
                        gp3Var = new gp3(i3, i4, f2, f3, f4, f5, f, z, str);
                    }
                    arrayList.add(gp3Var);
                }
            } while (!i93Var.h(value, arrayList));
            i93 i93Var2 = vi2Var.w;
            do {
                value2 = i93Var2.getValue();
                hp3Var = (hp3) value2;
                if (hp3Var.b == i2) {
                    hp3Var = new hp3(hp3Var.a, hp3Var.b, hp3Var.c, Float.valueOf(f));
                }
            } while (!i93Var2.h(value2, hp3Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onVehicleStateChange(int i, boolean z, int i2, int i3) {
        Object next;
        Float fValueOf;
        Log.d(TAG, "onVehicleStateChange: instance=" + i + " inVehicle=" + z + " veh=" + i2 + " pass=" + i3);
        vi2 vi2Var = viewModels.get(Integer.valueOf(i));
        if (vi2Var != null) {
            boolean z2 = i3 != 0;
            i93 i93Var = vi2Var.w;
            hp3 hp3Var = (hp3) i93Var.getValue();
            List list = (List) vi2Var.s.getValue();
            hp3Var.getClass();
            list.getClass();
            if (z) {
                if (hp3Var.b == i2) {
                    fValueOf = hp3Var.d;
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((gp3) next).a == i2) {
                                break;
                            }
                        }
                    }
                    gp3 gp3Var = (gp3) next;
                    fValueOf = gp3Var != null ? Float.valueOf(gp3Var.g) : null;
                }
            }
            i93Var.j(null, new hp3(z, i2, z2, fValueOf));
        }
    }

    public final void connect(int i, String str, int i2, String str2, xy2 xy2Var, boolean z, String str3, String str4, int i3, String str5) {
        str.getClass();
        str2.getClass();
        xy2Var.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (initialized) {
            try {
                nativeConnect(i, str, i2, str2, str5, str3, str4, i3, xy2Var.g, z);
            } catch (Throwable th) {
                vi2 vi2Var = viewModels.get(Integer.valueOf(i));
                if (vi2Var != null) {
                    vi2Var.k(new lg2(by1.g("nativeConnect failed: ", th.getMessage())));
                }
            }
        }
    }

    public final void destroyContext(int i) {
        if (initialized) {
            nativeDestroyContext(i);
        }
    }

    public final void disconnect(int i) {
        if (initialized) {
            nativeDisconnect(i);
        }
    }

    public final void enterVehicle(int i, int i2, boolean z) {
        if (initialized) {
            nativeEnterVehicle(i, i2, z);
        }
    }

    public final void exitVehicle(int i) {
        if (initialized) {
            nativeExitVehicle(i);
        }
    }

    public final boolean isCurrentInstance(int i, vi2 vi2Var) {
        vi2Var.getClass();
        return viewModels.get(Integer.valueOf(i)) == vi2Var;
    }

    public final native void nativeDestroyContext(int i);

    public final native void nativeEnterVehicle(int i, int i2, boolean z);

    public final native void nativeExitVehicle(int i);

    public final native void nativeInitJavaWrapper(int i, Object obj);

    public final native void nativeRefreshPlayerList(int i);

    public final native void nativeSendClickPlayer(int i, int i2);

    public final native void nativeSetNearbyScanEnabled(int i, boolean z);

    public final native void nativeSetPlayerPosition(int i, float f, float f2, float f3);

    public final native void nativeShutdownJavaWrapper(int i);

    public final int nextInstanceId() {
        return nextId.getAndIncrement();
    }

    public final void register(int i, vi2 vi2Var) {
        vi2Var.getClass();
        viewModels.put(Integer.valueOf(i), vi2Var);
        String str = loadError;
        if (str != null) {
            vi2Var.k(new lg2("Native library load failed: ".concat(str)));
        }
    }

    public final void sendChat(int i, String str) {
        str.getClass();
        if (initialized) {
            nativeSendChat(i, str);
        }
    }

    public final void sendDialogResponse(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        if (initialized) {
            nativeSendDialogResponse(i, i2, i3, i4, str);
        }
    }

    public final void setAfkState(int i, boolean z) {
        if (initialized) {
            nativeSetAfkState(i, z);
        }
    }

    public final void setCustomKeys(int i, int i2) {
        if (initialized) {
            nativeSetCustomKeys(i, i2);
        }
    }

    public final void setLogLevel(int i) {
        if (initialized) {
            nativeSetLogLevel(i);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setLogLevelByName(String str) {
        str.getClass();
        int i = 1;
        switch (str.hashCode()) {
            case 2283726:
                str.equals("Info");
                break;
            case 2688678:
                if (str.equals("Warn")) {
                    i = 2;
                }
                break;
            case 65906227:
                if (str.equals("Debug")) {
                    i = 0;
                }
                break;
            case 67232232:
                if (str.equals("Error")) {
                    i = 3;
                }
                break;
        }
        setLogLevel(i);
    }

    public final void setPlayerPosition(int i, float f, float f2, float f3) {
        if (initialized) {
            nativeSetPlayerPosition(i, f, f2, f3);
        }
    }

    public final void setStoragePath(String str) {
        str.getClass();
        if (initialized) {
            nativeSetStoragePath(str);
        }
    }

    public final void unregister(int i) {
        viewModels.remove(Integer.valueOf(i));
        if (initialized) {
            nativeShutdownJavaWrapper(i);
        }
    }
}
