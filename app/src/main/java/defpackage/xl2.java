package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xl2 {
    public static final List a = vr.L("anim", "audio", "data", "fonts", "models", "texdb", "TEXT");
    public static final List b = vr.L("CINFO.BIN", "gta_sa.set", "stream.ini", "data/default.ide", "data/gta.dat", "data/handling.cfg", "data/peds.ide", "data/timecyc.dat", "data/vehicles.ide", "fonts/arial.ttf", "fonts/arial_bold.ttf", "fonts/tahoma.ttf", "SAMP/main.scm", "SAMP/script.img", "SAMP/gta.dat", "SAMP/SAMP.ide", "SAMP/handling.cfg", "SAMP/vehicles.ide", "SAMP/peds.ide", "TEXT/american.gxt");

    public static String a(Set set) {
        if (!set.isEmpty()) {
            Set<String> set2 = set;
            String str = (String) qx.p0(set2);
            str.getClass();
            int iO0 = y93.o0(str, "/", 0, false, 6);
            String strSubstring = iO0 == -1 ? "" : str.substring(0, iO0);
            if (strSubstring.length() != 0) {
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        if (fa3.e0(str2, strSubstring.concat("/"), false) || str2.equals(strSubstring)) {
                        }
                    }
                }
                return strSubstring.concat("/");
            }
        }
        return "";
    }
}
