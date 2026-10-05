package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jd3 implements Iterable {
    public final ArrayList f = new ArrayList();
    public final Context g;

    public jd3(Context context) {
        this.g = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.g;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        try {
            for (Intent intentF = vr.F(context, componentName); intentF != null; intentF = vr.F(context, intentF.getComponent())) {
                arrayList.add(size, intentF);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            c.q("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.g.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f.iterator();
    }
}
