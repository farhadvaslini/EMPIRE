package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sw extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ File k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sw(File file, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = file;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((sw) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new sw(this.k, p40Var, 0);
            case 1:
                return new sw(this.k, p40Var, 1);
            default:
                return new sw(this.k, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Object dv3Var;
        int i = this.j;
        File file = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                return Boolean.valueOf(file.delete());
            case 1:
                y02.Q(obj);
                return Boolean.valueOf(file.delete());
            default:
                y02.Q(obj);
                List list = xl2.a;
                file.getClass();
                try {
                    ZipFile zipFile = new ZipFile(file);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        enumerationEntries.getClass();
                        ArrayList list2 = Collections.list(enumerationEntries);
                        list2.getClass();
                        if (list2.isEmpty()) {
                            dv3Var = bv3.a;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int size = list2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj2 = list2.get(i2);
                                i2++;
                                if (!((ZipEntry) obj2).isDirectory()) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(rx.d0(arrayList, 10));
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj3 = arrayList.get(i3);
                                i3++;
                                String name = ((ZipEntry) obj3).getName();
                                name.getClass();
                                String strReplace = name.replace('\\', '/');
                                strReplace.getClass();
                                String lowerCase = strReplace.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                arrayList2.add(lowerCase);
                            }
                            Set setR0 = qx.R0(arrayList2);
                            String strA = xl2.a(setR0);
                            List list3 = xl2.a;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : list3) {
                                String lowerCase2 = ((String) obj4).toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                Set<String> set = setR0;
                                if (!(set instanceof Collection) || !set.isEmpty()) {
                                    for (String str : set) {
                                        if (!s51.n(str, strA + lowerCase2 + "/")) {
                                            if (fa3.e0(str, strA + lowerCase2 + "/", false)) {
                                            }
                                        }
                                        arrayList3.add(obj4);
                                    }
                                }
                            }
                            List list4 = xl2.b;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list4) {
                                String lowerCase3 = ((String) obj5).toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                Set set2 = setR0;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (s51.n((String) it.next(), strA + lowerCase3)) {
                                                arrayList4.add(obj5);
                                            }
                                        }
                                    }
                                }
                            }
                            dv3Var = (arrayList3.size() < 2 || arrayList4.size() < 2) ? new dv3(arrayList3.size(), arrayList4.size()) : ev3.a;
                        }
                        zipFile.close();
                        return dv3Var;
                    } finally {
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    return new cv3(message);
                }
        }
    }
}
