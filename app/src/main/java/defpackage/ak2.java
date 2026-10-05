package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class ak2 implements xr2, uj3, n50 {
    public static ak2 g;
    public final /* synthetic */ int f;

    public ak2(ja jaVar) {
        this.f = 16;
    }

    public static final Inet4Address a(ak2 ak2Var, String str) throws SocketTimeoutException, UnknownHostException {
        ak2Var.getClass();
        InetAddress[] allByName = InetAddress.getAllByName(str);
        allByName.getClass();
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : allByName) {
            if (inetAddress instanceof Inet4Address) {
                arrayList.add(inetAddress);
            }
        }
        Inet4Address inet4Address = (Inet4Address) qx.r0(arrayList);
        if (inet4Address != null) {
            return inet4Address;
        }
        throw new SocketTimeoutException("No IPv4 address found");
    }

    public static final ad b(int i, String str) {
        WeakHashMap weakHashMap = qt3.w;
        return new ad(i, str);
    }

    public static final int c(int i, long j) {
        int i2 = nj3.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final po3 d(int i, String str) {
        WeakHashMap weakHashMap = qt3.w;
        return new po3(new q31(0, 0, 0, 0), str);
    }

    public static qt3 e(nv0 nv0Var) {
        View view = (View) nv0Var.j(x7.f);
        qt3 qt3VarI = i(view);
        boolean zH = nv0Var.h(qt3VarI) | nv0Var.h(view);
        Object objO = nv0Var.O();
        if (zH || objO == c20.a) {
            objO = new ik3(3, qt3VarI, view);
            nv0Var.j0(objO);
        }
        rn.g(qt3VarI, (ns0) objO, nv0Var);
        return qt3VarI;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ii3 f(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return ii3.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return ii3.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return ii3.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return ii3.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return ii3.SSL_3_0;
        }
        c.p("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static qp2 g(String str) {
        Object next;
        mj0 mj0Var = qp2.k;
        mj0Var.getClass();
        a0 a0Var = new a0(0, mj0Var);
        while (true) {
            if (!a0Var.hasNext()) {
                next = null;
                break;
            }
            next = a0Var.next();
            if (((qp2) next).f.equals(str)) {
                break;
            }
        }
        qp2 qp2Var = (qp2) next;
        return qp2Var == null ? qp2.i : qp2Var;
    }

    public static xy2 h(String str) {
        Object next;
        mj0 mj0Var = xy2.l;
        mj0Var.getClass();
        a0 a0Var = new a0(0, mj0Var);
        while (true) {
            if (!a0Var.hasNext()) {
                next = null;
                break;
            }
            next = a0Var.next();
            if (((xy2) next).f.equals(str)) {
                break;
            }
        }
        return (xy2) next;
    }

    public static qt3 i(View view) {
        qt3 qt3Var;
        WeakHashMap weakHashMap = qt3.w;
        synchronized (weakHashMap) {
            try {
                Object qt3Var2 = weakHashMap.get(view);
                if (qt3Var2 == null) {
                    qt3Var2 = new qt3(view);
                    weakHashMap.put(view, qt3Var2);
                }
                qt3Var = (qt3) qt3Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qt3Var;
    }

    public static long k(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static xy2 m(String str) {
        str.getClass();
        int iN0 = y93.n0(str, '-', 0, 6);
        if (iN0 != -1) {
            str = str.substring(0, iN0);
        }
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase.equals("zh")) {
            return xy2.i;
        }
        lowerCase.equals("ru");
        return xy2.j;
    }

    public static /* synthetic */ xy2 n(ak2 ak2Var) {
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        ak2Var.getClass();
        return m(language);
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    public vp2 l(sv2 sv2Var, Inet4Address inet4Address, char c, byte[] bArr) throws IOException {
        int i = sv2Var.b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 11);
        byteArrayOutputStream.write(new byte[]{83, 65, 77, 80});
        byteArrayOutputStream.write(inet4Address.getAddress());
        byteArrayOutputStream.write(i & 255);
        byteArrayOutputStream.write((i >> 8) & 255);
        byteArrayOutputStream.write(c);
        byteArrayOutputStream.write(bArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(3000);
            long jNanoTime = System.nanoTime();
            datagramSocket.send(new DatagramPacket(byteArray, byteArray.length, inet4Address, sv2Var.b));
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8192], 8192);
            datagramSocket.receive(datagramPacket);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            byte[] data = datagramPacket.getData();
            data.getClass();
            byte[] bArrCopyOf = Arrays.copyOf(data, datagramPacket.getLength());
            if (bArrCopyOf.length < 11 || !Arrays.equals(uj.M(bArrCopyOf, 0, 11), Arrays.copyOf(byteArray, 11))) {
                throw new IllegalArgumentException("Invalid SA-MP query response header");
            }
            vp2 vp2Var = new vp2(bArrCopyOf, jNanoTime2);
            datagramSocket.close();
            return vp2Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                uq.l(datagramSocket, th);
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.f) {
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int iHashCode = hashCode();
                ur.r(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return by1.i("CreationExtras.Key@", string, "<", rk2.a(wq2.class).c(), ">");
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                int iHashCode2 = hashCode();
                ur.r(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return by1.i("CreationExtras.Key@", string2, "<", rk2.a(cr3.class).c(), ">");
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                int iHashCode3 = hashCode();
                ur.r(16);
                String string3 = Integer.toString(iHashCode3, 16);
                string3.getClass();
                return by1.i("CreationExtras.Key@", string3, "<", rk2.a(Bundle.class).c(), ">");
            case 8:
                return "SharingStarted.Eagerly";
            case vr.g /* 9 */:
                return "SharingStarted.Lazily";
            case 11:
                return "ReusedSlotId";
            case 23:
                int iHashCode4 = hashCode();
                ur.r(16);
                String string4 = Integer.toString(iHashCode4, 16);
                string4.getClass();
                return by1.i("CreationExtras.Key@", string4, "<", rk2.a(Application.class).c(), ">");
            case 24:
                int iHashCode5 = hashCode();
                ur.r(16);
                String string5 = Integer.toString(iHashCode5, 16);
                string5.getClass();
                return by1.i("CreationExtras.Key@", string5, "<", rk2.a(String.class).c(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ak2(int i) {
        this.f = i;
    }

    @Override // defpackage.xr2
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.xr2
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
