package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ry2 {
    public static final /* synthetic */ a71[] a = {new zd2(ry2.class, "serverDataStore", "getServerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")};
    public static final dc2 b = w22.E("servers");
    public static final SecureRandom c = new SecureRandom();

    public static final String a(String str) {
        Object qn2Var;
        try {
            String str2 = Build.MODEL + "-" + Build.BOARD + "-" + str;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset charset = ys.a;
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            String strW = uj.W(Arrays.copyOf(bArrDigest, 16), "", new cr2(18), 30);
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
            byte[] bytes2 = strW.getBytes(charset);
            bytes2.getClass();
            byte[] bArrDigest2 = messageDigest2.digest(bytes2);
            int length = bArrDigest2.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = bArrDigest2[((i & (-4)) + 3) - (i & 3)];
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                byte b2 = bArr[i2];
                int i3 = b2 & 255;
                int i4 = (i3 >>> 4) & 3;
                int i5 = (i3 >>> 6) & 3;
                int i6 = b2 & 3;
                int i7 = (i3 >>> 2) & 3;
                arrayList.add(Byte.valueOf((byte) (Math.min(i6, i7) | (Math.max(i6, i7) << 2) | ((Math.min(i4, i5) | (Math.max(i4, i5) << 2)) << 4))));
            }
            String string = new BigInteger(1, qx.K0(arrayList)).multiply(BigInteger.valueOf(1001L)).toString(16);
            string.getClass();
            Locale locale = Locale.ROOT;
            locale.getClass();
            qn2Var = string.toUpperCase(locale);
            qn2Var.getClass();
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        return (String) (qn2Var instanceof qn2 ? "" : qn2Var);
    }
}
