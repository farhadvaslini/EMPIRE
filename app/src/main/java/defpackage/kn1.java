package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kn1 extends BaseAdapter {
    public final nn1 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public kn1(nn1 nn1Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = nn1Var;
        this.f = i;
        a();
    }

    public final void a() {
        nn1 nn1Var = this.a;
        wn1 wn1Var = nn1Var.v;
        if (wn1Var != null) {
            nn1Var.i();
            ArrayList arrayList = nn1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((wn1) arrayList.get(i)) == wn1Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wn1 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        nn1 nn1Var = this.a;
        if (z) {
            nn1Var.i();
            arrayListL = nn1Var.j;
        } else {
            arrayListL = nn1Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (wn1) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        nn1 nn1Var = this.a;
        if (z) {
            nn1Var.i();
            arrayListL = nn1Var.j;
        } else {
            arrayListL = nn1Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        ro1 ro1Var = (ro1) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        ro1Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
