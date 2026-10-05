package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class en extends xu1 {
    public final /* synthetic */ int e;

    public en(int i, boolean z) {
        this.e = i;
    }

    @Override // defpackage.xu1
    public final Object a(String str, Bundle bundle) {
        switch (this.e) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || g12.X(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                jo3.q(str);
                throw null;
            case 1:
                bundle.getClass();
                return Integer.valueOf(g12.K(str, bundle));
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                jo3.q(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || g12.X(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                jo3.q(str);
                throw null;
        }
    }

    @Override // defpackage.xu1
    public final String b() {
        switch (this.e) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return "long";
            default:
                return "string";
        }
    }

    @Override // defpackage.xu1
    public final Object d(String str) {
        int i;
        long j;
        boolean z = true;
        switch (this.e) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        c.p("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (fa3.e0(str, "0x", false)) {
                    String strSubstring = str.substring(2);
                    ur.r(16);
                    i = Integer.parseInt(strSubstring, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                String strSubstring2 = fa3.Y(str, "L", false) ? str.substring(0, str.length() - 1) : str;
                if (fa3.e0(str, "0x", false)) {
                    String strSubstring3 = strSubstring2.substring(2);
                    ur.r(16);
                    j = Long.parseLong(strSubstring3, 16);
                } else {
                    j = Long.parseLong(strSubstring2);
                }
                return Long.valueOf(j);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.xu1
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                long jLongValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, jLongValue);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putString(str, str2);
                }
                break;
        }
    }
}
