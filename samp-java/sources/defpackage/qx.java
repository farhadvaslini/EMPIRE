package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class qx extends vx {
    public static Comparable A0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object B0(ArrayList arrayList, Comparator comparator) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList C0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(rx.d0(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && s51.n(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList D0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            vx.f0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList E0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List F0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return N0(iterable);
        }
        List listP0 = P0(iterable);
        Collections.reverse(listP0);
        return listP0;
    }

    public static List G0(List list, Comparator comparator) {
        list.getClass();
        if (list.size() <= 1) {
            return N0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static int H0(Iterable iterable) {
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static List I0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            c.g(by1.h("Requested element count ", " is less than zero.", i));
            return null;
        }
        if (i == 0) {
            return ni0.f;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return N0(iterable);
            }
            if (i == 1) {
                return vr.K(p0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return vr.Q(arrayList);
    }

    public static List J0(int i, List list) {
        if (i < 0) {
            c.g(by1.h("Requested element count ", " is less than zero.", i));
            return null;
        }
        if (i == 0) {
            return ni0.f;
        }
        int size = list.size();
        if (i >= size) {
            return N0(list);
        }
        if (i == 1) {
            return vr.K(y0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] K0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void L0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] M0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List N0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return vr.Q(P0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ni0.f;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return vr.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList O0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List P0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        L0(iterable, arrayList);
        return arrayList;
    }

    public static Set Q0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        L0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set R0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(om1.X(collection.size()));
                    L0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                setSingleton.getClass();
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            L0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                setSingleton2.getClass();
                return setSingleton2;
            }
        }
        return si0.f;
    }

    public static final int k0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbM = nc2.m("Element index ", " must be in range [", i);
        sbM.append(new l41(0, list.size() - 1, 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public static final int l0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM = nc2.m("Position index ", " must be in range [", i);
        sbM.append(new l41(0, list.size(), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public static boolean m0(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : t0(iterable, obj) >= 0;
    }

    public static List n0(Iterable iterable) {
        iterable.getClass();
        return N0(Q0(iterable));
    }

    public static List o0(int i, List list) {
        if (i < 0) {
            c.g(by1.h("Requested element count ", " is less than zero.", i));
            return null;
        }
        if (i == 0) {
            return N0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return ni0.f;
        }
        if (size == 1) {
            return vr.K(y0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object p0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        c.m("Collection is empty.");
        return null;
    }

    public static Object q0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        c.m("List is empty.");
        return null;
    }

    public static Object r0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object s0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int t0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                vr.b0();
                throw null;
            }
            if (s51.n(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static LinkedHashSet u0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionN0 = iterable2 instanceof Collection ? (Collection) iterable2 : N0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionN0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void v0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ns0 ns0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            y02.e(sb, obj, ns0Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void w0(List list, StringBuilder sb, String str, s sVar, int i) {
        if ((i & 64) != 0) {
            sVar = null;
        }
        v0(list, sb, str, "", "", "...", sVar);
    }

    public static String x0(Iterable iterable, String str, String str2, String str3, ns0 ns0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            ns0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        v0(iterable, sb, str4, str5, str6, "...", ns0Var);
        return sb.toString();
    }

    public static Object y0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        c.m("List is empty.");
        return null;
    }

    public static Object z0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}
