package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.nn1;
import defpackage.pf2;
import defpackage.pi;
import defpackage.ro1;
import defpackage.wn1;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements ro1, AbsListView.SelectionBoundsAdjuster {
    public wn1 f;
    public ImageView g;
    public RadioButton h;
    public TextView i;
    public CheckBox j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public LinearLayout n;
    public final Drawable o;
    public final int p;
    public final Context q;
    public boolean r;
    public final Drawable s;
    public final boolean t;
    public LayoutInflater u;
    public boolean v;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        pi piVarH = pi.H(getContext(), attributeSet, pf2.r, i);
        this.o = piVarH.p(5);
        TypedArray typedArray = (TypedArray) piVarH.g;
        this.p = typedArray.getResourceId(1, -1);
        this.r = typedArray.getBoolean(7, false);
        this.q = context;
        this.s = piVarH.p(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, top.th1nk.samp.R.attr.dropDownListViewStyle, 0);
        this.t = typedArrayObtainStyledAttributes.hasValue(0);
        piVarH.J();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.u == null) {
            this.u = LayoutInflater.from(getContext());
        }
        return this.u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    @Override // defpackage.ro1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wn1 wn1Var) {
        boolean z;
        String string;
        this.f = wn1Var;
        boolean zIsVisible = wn1Var.isVisible();
        nn1 nn1Var = wn1Var.n;
        int i = 0;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(wn1Var.e);
        setCheckable(wn1Var.isCheckable());
        if (nn1Var.o()) {
            if ((nn1Var.n() ? wn1Var.j : wn1Var.h) != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        nn1Var.n();
        if (z) {
            wn1 wn1Var2 = this.f;
            nn1 nn1Var2 = wn1Var2.n;
            if (nn1Var2.o()) {
                if ((nn1Var2.n() ? wn1Var2.j : wn1Var2.h) == 0) {
                }
            } else {
                i = 8;
            }
        }
        if (i == 0) {
            TextView textView = this.k;
            wn1 wn1Var3 = this.f;
            nn1 nn1Var3 = wn1Var3.n;
            Context context = nn1Var3.a;
            char c = nn1Var3.n() ? wn1Var3.j : wn1Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(top.th1nk.samp.R.string.abc_prepend_shortcut_label));
                }
                int i2 = nn1Var3.n() ? wn1Var3.k : wn1Var3.i;
                wn1.c(sb, i2, 65536, resources.getString(top.th1nk.samp.R.string.abc_menu_meta_shortcut_label));
                wn1.c(sb, i2, 4096, resources.getString(top.th1nk.samp.R.string.abc_menu_ctrl_shortcut_label));
                wn1.c(sb, i2, 2, resources.getString(top.th1nk.samp.R.string.abc_menu_alt_shortcut_label));
                wn1.c(sb, i2, 1, resources.getString(top.th1nk.samp.R.string.abc_menu_shift_shortcut_label));
                wn1.c(sb, i2, 4, resources.getString(top.th1nk.samp.R.string.abc_menu_sym_shortcut_label));
                wn1.c(sb, i2, 8, resources.getString(top.th1nk.samp.R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(top.th1nk.samp.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(top.th1nk.samp.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(top.th1nk.samp.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.k.getVisibility() != i) {
            this.k.setVisibility(i);
        }
        setIcon(wn1Var.getIcon());
        setEnabled(wn1Var.isEnabled());
        setSubMenuArrowVisible(wn1Var.hasSubMenu());
        setContentDescription(wn1Var.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        rect.top = this.m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.ro1
    public wn1 getItemData() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.o);
        TextView textView = (TextView) findViewById(top.th1nk.samp.R.id.title);
        this.i = textView;
        int i = this.p;
        if (i != -1) {
            textView.setTextAppearance(this.q, i);
        }
        this.k = (TextView) findViewById(top.th1nk.samp.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(top.th1nk.samp.R.id.submenuarrow);
        this.l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.s);
        }
        this.m = (ImageView) findViewById(top.th1nk.samp.R.id.group_divider);
        this.n = (LinearLayout) findViewById(top.th1nk.samp.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.g != null && this.r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.h == null && this.j == null) {
            return;
        }
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(top.th1nk.samp.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
            view = this.j;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(top.th1nk.samp.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
            view = this.h;
        }
        if (z) {
            compoundButton.setChecked(this.f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(top.th1nk.samp.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(top.th1nk.samp.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v = z;
        this.r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility((this.t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        nn1 nn1Var = this.f.n;
        boolean z = this.v;
        if (z || this.r) {
            ImageView imageView = this.g;
            if (imageView == null && drawable == null && !this.r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(top.th1nk.samp.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.g = imageView2;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.r) {
                this.g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.g;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.i;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, top.th1nk.samp.R.attr.listMenuViewStyle);
    }
}
